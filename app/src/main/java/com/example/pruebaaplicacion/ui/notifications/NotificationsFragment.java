package com.example.pruebaaplicacion.ui.notifications;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pruebaaplicacion.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.AuthResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;


import com.example.pruebaaplicacion.databinding.FragmentNotificationsBinding;
import com.google.firebase.auth.FirebaseUser;

public class NotificationsFragment extends Fragment {
    private FirebaseAuth mAuth;
    private EditText edit_user;
    private EditText edit_password;
    private Button btn_login;
    private Button btn_cerrar_sesion;

    private FragmentNotificationsBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View view;
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user==null) {

            view = binding.getRoot();

            edit_user = view.findViewById(R.id.edit_user);
            edit_password = view.findViewById(R.id.edit_password);
            btn_login = view.findViewById(R.id.btn_login);
            btn_cerrar_sesion= view.findViewById(R.id.btn_cerrar_sesion);
            mAuth = FirebaseAuth.getInstance();
            btn_login.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String email = edit_user.getText().toString().trim();
                    String password = edit_password.getText().toString().trim();

                    mAuth.signInWithEmailAndPassword(email, password)
                            .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        Navigation.findNavController(
                                                view
                                        ).navigate(R.id.action_navigation_notifications_to_user2);
                                    } else {
                                        Log.d("Tag",
                                                "Error al loguear",
                                                task.getException());
                                        Toast.makeText(getActivity(),
                                                "Error al loguear",
                                                Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            });

        }
        else{
            view = inflater.inflate(R.layout.fragment_user,container,false);
            btn_cerrar_sesion= view.findViewById(R.id.btn_cerrar_sesion);
            btn_cerrar_sesion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), "Cerrando sesion",Toast.LENGTH_SHORT).show();

                    FirebaseAuth.getInstance().signOut();
                    Navigation.findNavController(view).navigate(R.id.action_navigation_notifications_to_navigation_home);
                }
            });

        }


        return view;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;

    }

}