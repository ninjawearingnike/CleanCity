package chukuzoegwu.cleancity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class Claimed extends AppCompatActivity {

    protected Button releaseButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claimed);
        releaseButton = (Button) findViewById(R.id.releaseButton);

        // Changes the dimensions of the window
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * 1), (int) (height * .40));
        setTitle("Area Claimed");

        releaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                MapView_Activity.releaseArea();
            }
        });



    }
}
