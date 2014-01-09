package com.test.amnitest;

import com.test.amnitest.R;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.graphics.drawable.*;
import android.content.SharedPreferences;

public class MainActivity extends Activity {
	
	public static final String PREFS_NAME = "MyPrefsFile";  
    public static final String FIRST_RUN = "first";  
    private boolean first;  
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	     
		SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);  
        first = settings.getBoolean(FIRST_RUN, true);  
        
        if (first) {
        	Intent intent=new Intent();
		intent.setClass(MainActivity.this, GuideActivity.class);  
        startActivity(intent);  	   
        } 
        else {  
        	setContentView(R.layout.activity_main);
       	 ImageView imageview1 = (ImageView) findViewById(R.id.imageView1);
			 imageview1.setBackgroundResource(R.drawable.duola);
			 AnimationDrawable duolaAnimation;
			 duolaAnimation = (AnimationDrawable) imageview1.getBackground(); 
			 duolaAnimation.start();
			
			 Button Btn1 = (Button)findViewById(R.id.button1);//��ȡ��ť��Դ   
			 
			 Btn1.setOnClickListener(new Button.OnClickListener(){//��������    
		            public void onClick(View v) {   
		            	Intent intent=new Intent();
		        		intent.setClass(MainActivity.this, Mainmenu.class);  
		                startActivity(intent);  
		            }   
		        });   	
        	  
		            	  
		          		  
                
        }  

	   
		
				      
	}
	
	protected void onStop() {  
        super.onStop();  

        // We need an Editor object to make preference changes.  
        // All objects are from android.context.Context  
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);  
        SharedPreferences.Editor editor = settings.edit();  
        if (first) {  
                editor.putBoolean(FIRST_RUN, false);  
        }  
        // Commit the edits!  
        editor.commit();  
}  
	
	
	

}
