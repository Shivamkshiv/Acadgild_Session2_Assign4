package mr_auspicious.shivam_kr_shiv.com.myapp2;


import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);



            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView img = (ImageView) findViewById(R.id.img);
                    img.setVisibility(View.INVISIBLE);

                    b1.setVisibility(View.GONE);

                    b2.setVisibility(View.VISIBLE);

                }
            });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img = (ImageView) findViewById(R.id.img);
                img.setVisibility(View.VISIBLE);

                b2.setVisibility(View.GONE);
                b1.setVisibility(View.VISIBLE);
            }
        });










    }
}
