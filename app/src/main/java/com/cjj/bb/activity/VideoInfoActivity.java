package com.cjj.bb.activity;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cjj.bb.R;
import com.cjj.bb.fragment.VideoInfoFragment;

public class VideoInfoActivity extends ActionBarActivity{
	private View backButton;
	private TextView titleText;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
		 requestWindowFeature(Window.FEATURE_NO_TITLE); // 无标题
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_video_info);
 
	        if (savedInstanceState == null) {
	            getSupportFragmentManager().beginTransaction()
	                    .add(R.id.container, new VideoInfoFragment())
	                    .commit();
	        }
	        backButton = findViewById(R.id.logobutton);
			titleText = (TextView) findViewById(R.id.textViewTitle);
			titleText.setText("视频详情");
			backButton.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					finish();
				}
			});

         getSupportActionBar().hide();
	              
	    }


	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }

}
