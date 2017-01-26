package io.github.gitwebx.hubiitism;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.SimpleCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.Util;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private BoomMenuButton bmb;
    int arr[]={
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.calendar
    };
    int arrc[]= {
            R.color.green,
            R.color.blue,
            R.color.colorAccent,
            R.color.colorPrimaryDark,
            R.color.black,
            R.color.white,
            R.color.pink,
            R.color.green,
            R.color.white2
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       ImageView imageView=new ImageView(this);
        imageView.setImageResource(R.drawable.ic_menu_share);
        com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton actionButton=new com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton.Builder(this)
        //FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
                .setContentView(imageView)
                .build();
        ImageView imageView1=new ImageView(this);
        imageView1.setImageResource(R.drawable.fb);
        ImageView imageView2=new ImageView(this);
        imageView2.setImageResource(R.drawable.guthub);
        ImageView imageView3=new ImageView(this);
        imageView3.setImageResource(R.drawable.whatsapp);
        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);
// repeat many times:

        SubActionButton button1 = itemBuilder.setContentView(imageView1).build();
        SubActionButton button2 = itemBuilder.setContentView(imageView2).build();
        SubActionButton button3 = itemBuilder.setContentView(imageView3).build();


        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(button1)
                .addSubActionView(button2)
                .addSubActionView(button3)

                // ...
                .attachTo(actionButton)
                .build();

        bmb = (BoomMenuButton)findViewById(R.id.bmb);

        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            SimpleCircleButton.Builder builder = new SimpleCircleButton.Builder()
                    .listener(new OnBMClickListener() {
                        @Override
                        public void onBoomButtonClick(int index) {
                            // When the boom-button corresponding this builder is clicked.
                            switch(index){
                                case 0:

                                    seca a=new seca();
                                    FragmentManager manager= getSupportFragmentManager();
                                    manager.beginTransaction().replace(R.id.content_main, a).commit();
                                    break;

                                case 1:

                                    secb b=new secb();
                                    FragmentManager managerr= getSupportFragmentManager();
                                    managerr.beginTransaction().replace(R.id.content_main, b).commit();
                                    break;

                                case 2:
                                    secc c=new secc();
                                    FragmentManager manager3= getSupportFragmentManager();
                                    manager3.beginTransaction().replace(R.id.content_main, c).commit();
                                    break;

                                case 3:
                                    secd d=new secd();
                                    FragmentManager manager4= getSupportFragmentManager();
                                    manager4.beginTransaction().replace(R.id.content_main, d).commit();
                                    break;

                                case 4:
                                    sece e=new sece();
                                    FragmentManager manager5= getSupportFragmentManager();
                                    manager5.beginTransaction().replace(R.id.content_main, e).commit();
                                    break;

                                case 5:
                                    secf f=new secf();
                                    FragmentManager manager6= getSupportFragmentManager();
                                    manager6.beginTransaction().replace(R.id.content_main, f).commit();
                                    break;

                                case 6:
                                    secg g=new secg();
                                    FragmentManager manager7= getSupportFragmentManager();
                                    manager7.beginTransaction().replace(R.id.content_main, g).commit();
                                    break;

                                case 7:
                                    sech h=new sech();
                                    FragmentManager manager8= getSupportFragmentManager();
                                    manager8.beginTransaction().replace(R.id.content_main, h).commit();
                                    break;

                                case 8:
                                    calendar ca=new calendar();
                                    FragmentManager manager9= getSupportFragmentManager();
                                    manager9.beginTransaction().replace(R.id.content_main, ca).commit();
                                    break;

                            }
                        }
                    })

                    // Whether the image-view should rotate.
                    .rotateImage(true)

                    // Whether the boom-button should have a shadow effect.
                    .shadowEffect(true)

                    // Set the horizontal shadow-offset of the boom-button.
                    .shadowOffsetX(5)

                    // Set the vertical shadow-offset of the boom-button.
                    .shadowOffsetY(0)

                    // Set the radius of shadow of the boom-button.
                    .shadowRadius(Util.dp2px(5))

                    // Set the color of the shadow of boom-button.
                    .shadowColor(Color.parseColor("#ee000000"))

                    // Set the image resource when boom-button is at normal-state.
                    .normalImageRes(arr[i])

                    // Set the image drawable when boom-button is at normal-state.
                    .normalImageDrawable(getResources().getDrawable(arr[i], null))

                    // Set the image resource when boom-button is at highlighted-state.
                    .highlightedImageRes(arr[i])

                    // Set the image drawable when boom-button is at highlighted-state.
                    //.highlightedImageDrawable(getResources().getDrawable(R.drawable.bat, null))

                    // Set the image resource when boom-button is at unable-state.
                    //  .unableImageRes(R.drawable.butterfly)

                    // Set the image drawable when boom-button is at unable-state.
                    //.unableImageDrawable(getResources().getDrawable(R.drawable.butterfly, null))

                    // Set the rect of image.
                    // By this method, you can set the position and size of the image-view in boom-button.
                    // For example, builder.imageRect(new Rect(0, 50, 100, 100)) will make the
                    // image-view's size to be 100 * 50 and margin-top to be 50 pixel.
                    .imageRect(new Rect(Util.dp2px(10), Util.dp2px(10), Util.dp2px(70), Util.dp2px(70)))

                    // Set the padding of image.
                    // By this method, you can control the padding in the image-view.
                    // For instance, builder.imagePadding(new Rect(10, 10, 10, 10)) will make the
                    // image-view content 10-pixel padding to itself.
                    .imagePadding(new Rect(0, 0, 0, 0))

                    // Whether the boom-button should have a ripple effect.
                    .rippleEffect(true)

                    // The color of boom-button when it is at normal-state.
                    .normalColor(Color.RED)

                    // The resource of color of boom-button when it is at normal-state.
                    .normalColorRes(arrc[i])

                    // The color of boom-button when it is at highlighted-state.
                    .highlightedColor(arrc[i])

                    // The resource of color of boom-button when it is at highlighted-state.
                    .highlightedColorRes(R.color.blue)

                    // The color of boom-button when it is at unable-state.
                    .unableColor(Color.BLACK)

                    // The resource of color of boom-button when it is at unable-state.
                    .unableColorRes(R.color.white)

                    // The color of boom-button when it is just a piece.
                    .pieceColor(Color.BLACK)

                    // The resource of color of boom-button when it is just a piece.
                    .pieceColorRes(arrc[i])

                    // Whether the boom-button is unable, default value is false.
                    .unable(false)

                    // The radius of boom-button, in pixel.
                    .buttonRadius(Util.dp2px(40));
            bmb.addBuilder(builder);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.aboutus) {
            abtus contacts12=new abtus();
            FragmentManager manager=getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content_main,contacts12).commit();

        }
        if (id == R.id.mis) {
            mis contacts122=new mis();
            FragmentManager manager=getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content_main,contacts122).commit();

        }
        if (id == R.id.abt) {
            Abt contacts1223=new Abt();
            FragmentManager manager=getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content_main,contacts1223).commit();

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Dashboard) {


            // Handle the camera action
        } else if (id == R.id.Club) { clubs contacts1=new clubs();
            FragmentManager manager=getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content_main,contacts1).commit();

        } else if (id == R.id.Map) {
            Intent intent=new Intent(MainActivity.this,Campus_Map.class);
            startActivity(intent);

        } else if (id == R.id.Contacts) {
            Intent intent=new Intent(MainActivity.this,Contacts.class);
            startActivity(intent);

        } else if (id == R.id.Admi) {
            DashBoard contacts=new DashBoard();
            FragmentManager manager=getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content_main,contacts).commit();

        }
        else if (id == R.id.rep_bug) {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("message/rfc822");
            i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"abhinavbajpai2012@gmail.com"});
            i.putExtra(Intent.EXTRA_SUBJECT, "subject of email");
            i.putExtra(Intent.EXTRA_TEXT   , "body of email");
            try {
                startActivity(Intent.createChooser(i, "Send mail..."));
            } catch (android.content.ActivityNotFoundException ex) {

                Toast.makeText(MainActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
