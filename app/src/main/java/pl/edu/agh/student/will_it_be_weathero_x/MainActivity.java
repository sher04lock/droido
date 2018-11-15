package pl.edu.agh.student.will_it_be_weathero_x;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(onButtonClick());
    }

    @NonNull
    private View.OnClickListener onButtonClick() {
        return new View.OnClickListener() {
            public void onClick(View v) {
                final EditText inputField = findViewById(R.id.editText);
                showToastMessage(inputField.getText());
            }
        };
    }

    protected void showToastMessage(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
