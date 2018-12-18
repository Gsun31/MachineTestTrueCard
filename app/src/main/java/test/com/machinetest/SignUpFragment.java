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

public class SignUpFragment extends Fragment {

    final VVPager viewPager = MainActivity.getViewPager();
    ImageButton goToLoginFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the view for the fragment based on layout XML
        LinearLayout mainLayout =  (LinearLayout) inflater.inflate(R.layout.signup_fragment, container, false);

        goToLoginFragment=(ImageButton) mainLayout.findViewById(R.id.goto_login_button);


        goToLoginFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCurrentItem(0);
            }
        });


        return mainLayout;
    }
    private void setCurrentItem(final int item) {
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                viewPager.setCurrentItem(item, true);
            }
        });
    }
}