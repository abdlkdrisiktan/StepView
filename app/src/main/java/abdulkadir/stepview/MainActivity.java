package abdulkadir.stepview;

import abdulkadir.stepview.ui.StepView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private StepView stepView;

    private Button nextButton;
    private Button previousButton;

    private List<String> notificationList = new ArrayList<>();
    private List<String> stepList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();



        notificationList.add("3");
        notificationList.add("6");
        notificationList.add(null);
        notificationList.add("1");
        stepView.setNotifications(notificationList);

        stepList.add(getResources().getString(R.string.step_first));
        stepList.add(getResources().getString(R.string.step_second));
        stepList.add(getResources().getString(R.string.step_third));
        stepList.add(getResources().getString(R.string.step_fourth));

        stepView.setSteps(stepList);
    }

    private void bindView() {
        stepView = findViewById(R.id.step_view);
        nextButton = findViewById(R.id.button_next);
        previousButton = findViewById(R.id.button_previous);

        setActionView();

    }

    private void setActionView() {
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        stepView.setOnStepClickListener(new StepView.OnStepClickListener() {
            @Override
            public void onStepClick(int step) {
                stepView.go(step,false,true);

            }
        });
    }
}
