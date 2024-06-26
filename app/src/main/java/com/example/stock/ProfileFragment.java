package com.example.stock;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.test.R;

public class ProfileFragment extends Fragment {
    private Button changePasswordButton;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        changePasswordButton = view.findViewById(R.id.change_password_button);
        changePasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showChangePasswordDialog();
            }
        });

        return view;
    }

    private void showChangePasswordDialog() {
        Dialog dialog = new Dialog(getActivity());
        dialog.setContentView(R.layout.dialog_changepass);

        // Set background drawable to rounded corner background
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.rounded_corner_background);

        EditText currentPasswordEditText = dialog.findViewById(R.id.current_password);
        EditText newPasswordEditText = dialog.findViewById(R.id.new_password);
        EditText confirmNewPasswordEditText = dialog.findViewById(R.id.confirm_new_password);
        Button confirmButton = dialog.findViewById(R.id.confirm_button);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle confirm button click
                String currentPassword = currentPasswordEditText.getText().toString();
                String newPassword = newPasswordEditText.getText().toString();
                String confirmNewPassword = confirmNewPasswordEditText.getText().toString();

                // Validate input and update password
                //...
            }
        });

        dialog.show();
    }
}