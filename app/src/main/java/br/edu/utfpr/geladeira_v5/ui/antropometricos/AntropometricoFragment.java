package br.edu.utfpr.geladeira_v5.ui.antropometricos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import br.edu.utfpr.geladeira_v5.R;

public class AntropometricoFragment extends Fragment {

    private AntropometricoViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(AntropometricoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_antropometrico, container, false);
        final TextView textView = root.findViewById(R.id.text_antropometrico);
        dashboardViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}