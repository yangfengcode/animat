package com.test.amnitest;

import com.test.amnitest.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mainmenu extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainmenu);
		
		Button Btn1 = (Button)findViewById(R.id.button1);//获取按钮资源    
        Btn1.setOnClickListener(new Button.OnClickListener(){//创建监听    
            public void onClick(View v) {   
            	Intent intent=new Intent();
        		intent.setClass(Mainmenu.this, BooklistActivity.class);  
                startActivity(intent);  
                
            	
            }   
        });  
        
        Button Btn2 = (Button)findViewById(R.id.button2);//获取按钮资源    
        Btn2.setOnClickListener(new Button.OnClickListener(){//创建监听    
            public void onClick(View v) {   
            	Intent intent=new Intent();
        		intent.setClass(Mainmenu.this, CatalogActivity.class);  
                startActivity(intent);  
               
            	
            }   
        });   
        
        Button Btn3 = (Button)findViewById(R.id.button3);//获取按钮资源    
        Btn3.setOnClickListener(new Button.OnClickListener(){//创建监听    
            public void onClick(View v) {   
            	Intent intent=new Intent();
        		intent.setClass(Mainmenu.this, BookrecordActivity.class);  
                startActivity(intent);  
                 
            	
            }   
        });   
        
        
        Button Btn4 = (Button)findViewById(R.id.button4);//获取按钮资源    
        Btn4.setOnClickListener(new Button.OnClickListener(){//创建监听    
            public void onClick(View v) {   
            	Intent intent=new Intent();
        		intent.setClass(Mainmenu.this, BookmarkActivity.class);  
                startActivity(intent);  
                  
            	
            }   
        });   
        
        Button Btn5 = (Button)findViewById(R.id.button5);//获取按钮资源    
        Btn4.setOnClickListener(new Button.OnClickListener(){//创建监听    
            public void onClick(View v) {   
            	
            	
            }   
        });   
		
		
}
}
