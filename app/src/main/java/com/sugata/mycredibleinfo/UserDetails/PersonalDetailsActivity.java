package com.sugata.mycredibleinfo.UserDetails;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.sugata.mycredibleinfo.R;
import com.sugata.mycredibleinfo.remote.APIUtils;
import com.sugata.mycredibleinfo.remote.UserService;

import static com.sugata.mycredibleinfo.LoginActivity.MY_PREF;

public class PersonalDetailsActivity extends AppCompatActivity {

    final private String imageUri = "content://media/internal/images/media";
    final private String imageUrl = "http://139.59.65.145:9090/user/personaldetail/profilepic/";

    private String name,email,mobile,location,links,skills;
    private int userId;

    private EditText nameEditText,emailEditText,mobileEditText,locationEditText,linksEditText,skillsEditText;
    private ImageView ProfilePic;
    private Button saveButton;

    UserService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details);

        nameEditText = findViewById(R.id.full_name_edit_text);
        mobileEditText = findViewById(R.id.mobile_edit_text);
        locationEditText = findViewById(R.id.location_edit_text);
        linksEditText = findViewById(R.id.links_edit_text);
        skillsEditText = findViewById(R.id.skills_edit_text);

        ProfilePic = findViewById(R.id.user_profile_pic);
        ProfilePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, Uri.parse(imageUri));
                startActivityForResult(intent, 1);
            }
        });

        userService = APIUtils.getUserService();

        SharedPreferences prefs = getSharedPreferences(MY_PREF, MODE_PRIVATE);
        userId = prefs.getInt("id", 0);
    }

}
