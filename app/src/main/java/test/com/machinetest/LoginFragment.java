package test.com.machinetest;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class LoginFragment extends Fragment {

    final VVPager viewPager = MainActivity.getViewPager();
    ImageButton goToSignUp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the view for the fragment based on layout XML
        LinearLayout mainLayout = (LinearLayout)  inflater.inflate(R.layout.login_fragment, container, false);

        goToSignUp=(ImageButton) mainLayout.findViewById(R.id.go_to_signup);


        goToSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCurrentItem(1);
            }
        });

        return  mainLayout;
    }

    // set the current item (fragment)
    private void setCurrentItem(final int item) {
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                viewPager.setCurrentItem(item, true);
            }
        });
    }


}

