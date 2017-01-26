package io.github.gitwebx.hubiitism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
public class Contacts extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<Album> albumList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //initCollapsingToolbar();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        albumList = new ArrayList<>();
        adapter = new AlbumsAdapter(this, albumList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareAlbums();

//        try {
//            Glide.with(this).load(R.drawable.phone).into((ImageView) findViewById(R.id.backdrop));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
//    private void initCollapsingToolbar() {
//        final CollapsingToolbarLayout collapsingToolbar =
//                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
//        collapsingToolbar.setTitle(" ");
//        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
//        appBarLayout.setExpanded(true);
//
//        // hiding & showing the title when toolbar expanded & collapsed
//        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
//            boolean isShow = false;
//            int scrollRange = -1;
//
//            @Override
//            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
//                if (scrollRange == -1) {
//                    scrollRange = appBarLayout.getTotalScrollRange();
//                }
//                if (scrollRange + verticalOffset == 0) {
//                    collapsingToolbar.setTitle(getString(R.string.app_name));
//                    isShow = true;
//                } else if (isShow) {
//                    collapsingToolbar.setTitle(" ");
//                    isShow = false;
//                }
//            }
//        });
//    }

    /**
     * Adding few albums for testing
     */
    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.c1,
                R.drawable.c2,
                R.drawable.c3,
                R.drawable.c4,
                R.drawable.c5,
                R.drawable.c6,
                R.drawable.c7,
                R.drawable.c8,
                R.drawable.c9,
                R.drawable.c10,
                R.drawable.c11,
                R.drawable.c12,
                R.drawable.c13,
                R.drawable.c14,
                R.drawable.c15,
                R.drawable.c16,
                R.drawable.c17,
                R.drawable.c18,
                R.drawable.c19,
                R.drawable.c20,
                R.drawable.c21,
                R.drawable.c22,
                R.drawable.c23,
                R.drawable.c24,
                R.drawable.c25,
                R.drawable.c26,
                R.drawable.c27,
                R.drawable.c28,
                R.drawable.c29,
                R.drawable.c30,
                R.drawable.c31,
                R.drawable.c32,
                R.drawable.c33,
                R.drawable.c34,
                R.drawable.c35,
                R.drawable.c36,
                R.drawable.c37,
                R.drawable.c38,
                R.drawable.c39,
                R.drawable.c40,
                R.drawable.c41,
                R.drawable.c42,
                R.drawable.c43,
                R.drawable.c44,
                R.drawable.c45,
                R.drawable.c46,
                R.drawable.c47,
                R.drawable.c48,
                R.drawable.c49,
                R.drawable.c50,
                R.drawable.c51,
                R.drawable.c52,
                R.drawable.c53,
                R.drawable.c54,
                R.drawable.c55,
                R.drawable.c56,
                R.drawable.c57,
                R.drawable.c58,
                R.drawable.c59,
                R.drawable.c60,
                R.drawable.c61,
                R.drawable.c62,
                R.drawable.c63,
                R.drawable.c64,
                R.drawable.c65,
                R.drawable.c66,
                R.drawable.c67,
                R.drawable.c68,
                R.drawable.c69,
                R.drawable.c70,
                R.drawable.c71,
                R.drawable.c72,
                R.drawable.c73,
                R.drawable.c74,
                R.drawable.c75,
                R.drawable.c76,
                R.drawable.c77,
                R.drawable.c78,
                R.drawable.c79,
                R.drawable.c80,
                R.drawable.c81,
                R.drawable.c82,
                R.drawable.c83,
                R.drawable.c84,
                R.drawable.c85,
                R.drawable.c86,
                R.drawable.c87,
                R.drawable.c88,
                R.drawable.c89,
                R.drawable.c90,
                R.drawable.c91,
                R.drawable.c92,
                R.drawable.c93,
                R.drawable.c94,
                R.drawable.c95,
                R.drawable.c96,
                R.drawable.c97,
                R.drawable.c98,
                R.drawable.c99,
                R.drawable.c100,
                R.drawable.c101,
                R.drawable.c102,
                R.drawable.c103,
                R.drawable.c104,
                R.drawable.c105,
                R.drawable.c106,
                R.drawable.c107,
                R.drawable.c108,
                R.drawable.c109,
                R.drawable.c110,
                R.drawable.c111,
                R.drawable.c112,
                R.drawable.c113,
                R.drawable.c114,
                R.drawable.c115,
                R.drawable.c116,
                R.drawable.c117,
                R.drawable.c118,
                R.drawable.c119,
                R.drawable.c120,
                R.drawable.c121,
                R.drawable.c122,
                R.drawable.c123,
                R.drawable.c124,
                R.drawable.c125,
                R.drawable.c126,
                R.drawable.c127,
                R.drawable.c128,
                R.drawable.c129,
                R.drawable.c130,
                R.drawable.c131,
                R.drawable.c132,
                R.drawable.c133,
                R.drawable.c134,
                R.drawable.c135,
                R.drawable.c136,
                R.drawable.c137,
                R.drawable.c138,
                R.drawable.c139,
                R.drawable.c140,
                R.drawable.c141,
                R.drawable.c142,
                R.drawable.c143,
                R.drawable.c144,
                R.drawable.c145,
                R.drawable.c146,
                R.drawable.c147,
                R.drawable.c148,
                R.drawable.c149,
                R.drawable.c150,
                R.drawable.c151,
                R.drawable.c152,
                R.drawable.c153,
                R.drawable.c154,
                R.drawable.c155,
                R.drawable.c156,
                R.drawable.c157,
                R.drawable.c158,
                R.drawable.c159,
                R.drawable.c160,
                R.drawable.c161,
                R.drawable.c162,
                R.drawable.c163,
                R.drawable.c164,
                R.drawable.c165,
                R.drawable.c166,
                R.drawable.c167,
                R.drawable.c168,
                R.drawable.c169,
                R.drawable.c170,
                R.drawable.c171,
                R.drawable.c172,
                R.drawable.c173,
                R.drawable.c174,
                R.drawable.c175,
                R.drawable.c176,
                R.drawable.c177,
                R.drawable.c178,
                R.drawable.c179,
                R.drawable.c180,
                R.drawable.c181,
                R.drawable.c182,
                R.drawable.c183,
                R.drawable.c184,
                R.drawable.c185,
                R.drawable.c186,
                R.drawable.c187,
                R.drawable.c188,
                R.drawable.c189,
                R.drawable.c190,
                R.drawable.c191,
                R.drawable.c192,
                R.drawable.c193,
                R.drawable.c194,
                R.drawable.c195,
                R.drawable.c196,
                R.drawable.c197,
                R.drawable.c198,
                R.drawable.c199,
                R.drawable.c200,
                R.drawable.c201,
                R.drawable.c202,
                R.drawable.c203,
                R.drawable.c204,
                R.drawable.c205,
                R.drawable.c206,
                R.drawable.c207,
                R.drawable.c208,
                R.drawable.c209,
                R.drawable.c210,
                R.drawable.c211,
                R.drawable.c212,
                R.drawable.c213,
                R.drawable.c214,
                R.drawable.c215,
                R.drawable.c216,
                R.drawable.c217,
                R.drawable.c218,
                R.drawable.c219,
                R.drawable.c220,
                R.drawable.c221,
                R.drawable.c222,
                R.drawable.c223,
                R.drawable.c224,
                R.drawable.c225,
                R.drawable.c226,
                R.drawable.c227,
                R.drawable.c228,
                R.drawable.c229,
                R.drawable.c230,
                R.drawable.c231,
                R.drawable.c232,
                R.drawable.c233,
                R.drawable.c234,
                R.drawable.c235,
                R.drawable.c236,
                R.drawable.c237,
                R.drawable.c238,
                R.drawable.c239,
                R.drawable.c240,
                R.drawable.c241,
                R.drawable.c242,
                R.drawable.c243,
                R.drawable.c244,
                R.drawable.c245,
                R.drawable.c246,
                R.drawable.c247,
                R.drawable.c248,
                R.drawable.c249,
                R.drawable.c250,
                R.drawable.c251,
                R.drawable.c252,
                R.drawable.c253,
                R.drawable.c254,
                R.drawable.c255,
                R.drawable.c256,
                R.drawable.c257,
                R.drawable.c258,
                R.drawable.c259,
                R.drawable.c260,
                R.drawable.c261,
                R.drawable.c262,
                R.drawable.c263,
                R.drawable.c264,
                R.drawable.c265,
                R.drawable.c266,
                R.drawable.c267,
                R.drawable.c268,
                R.drawable.c269,
                R.drawable.c270,
                R.drawable.c271,
                R.drawable.c272,
                R.drawable.c273,
                R.drawable.c274,
                R.drawable.c275,
                R.drawable.c276,
                R.drawable.c277,
                R.drawable.c278,
                R.drawable.c279,
                R.drawable.c280,
                R.drawable.c281,
                R.drawable.c282,
                R.drawable.c283,
                R.drawable.c284,
                R.drawable.c285,
                R.drawable.c286,
                R.drawable.c287,
                R.drawable.c288
                };

        Album a = new Album("AK Mukhopadhyay", "+913262296563", covers[0]);
        albumList.add(a);
        a = new Album("AK Pathak", "+913262206312", covers[1]);
        albumList.add(a);
        a = new Album("AS Venkatesh", "+919431125801", covers[2]);
        albumList.add(a);
        a = new Album("A Sarkar", "+919430335255", covers[3]);
        albumList.add(a);
        a = new Album("A tarachand", "+919471191420", covers[4]);
        albumList.add(a);
        a = new Album("AK Mishra", "+913262235452", covers[5]);
        albumList.add(a);
        a = new Album("AK Samanta", "+913262235087", covers[6]);
        albumList.add(a);
        a = new Album("Abhi Rani", "+913262235492", covers[7]);
        albumList.add(a);
        a = new Album("Abhay Kumar Singh", "+913262235670", covers[8]);
        albumList.add(a);
        a = new Album("Abhishek Kumar Singh", "+913262235118", covers[9]);
        albumList.add(a);
        a = new Album("Ajay Mandal", "+919431711017", covers[10]);
        albumList.add(a);
        a = new Album("Ajit Kumar", "+919471192264", covers[11]);
        albumList.add(a);
        a = new Album("Ajit Kumar Behura", "9234604362", covers[12]);
        albumList.add(a);
        a = new Album("Ajoy Kumar Bhaumik", "3262296616", covers[13]);
        albumList.add(a);
        a = new Album("Aju Aravind", "9431121114", covers[14]);
        albumList.add(a);
        a = new Album("Akhilesh Prasad", "9431711231	", covers[15]);
        albumList.add(a);
        a = new Album("Alok Kumar Das", "9471191234", covers[16]);
        albumList.add(a);
        a = new Album("Alok Sinha", "9471518560", covers[17]);
        albumList.add(a);
        a = new Album("Alok Sinha", "9471518560", covers[18]);
        albumList.add(a);
        a = new Album("Amares Chaudhary", "9431121859", covers[19]);
        albumList.add(a);
        a = new Album("Amit Kumar Verma", "7781012407", covers[20]);
        albumList.add(a);
        a = new Album("Amit Rai Dixit", "9430133003", covers[21]);
        albumList.add(a);
        a = new Album("Amitava mandal", "9471191826", covers[22]);
        albumList.add(a);
        a = new Album("Amitesh Kumar", "3262235759", covers[23]);
        albumList.add(a);
        a = new Album("Anand Anupam", "3262235922", covers[24]);
        albumList.add(a);
        a = new Album("Ananda Shankar Hati", "9471191571", covers[25]);
        albumList.add(a);
        a = new Album("Anil Kumar Nirala", "9431125123", covers[26]);
        albumList.add(a);
        a = new Album("Annavarpu Chandra Sekhara Rao", "3262235420", covers[27]);
        albumList.add(a);
        a = new Album("Anshumali", "9934556176", covers[28]);
        albumList.add(a);
        a = new Album("Anup Krishna Prasad", "9471192451", covers[29]);
        albumList.add(a);
        a = new Album("Anurag Jayaswal", "9431122002", covers[30]);
        albumList.add(a);
        a = new Album("Archana", "9471191527", covers[31]);
        albumList.add(a);
        a = new Album("Arijit Barpal", "3262235151	", covers[32]);
        albumList.add(a);
        a = new Album("Arup Kumar Pal", "9470985812", covers[33]);
        albumList.add(a);
        a = new Album("Ashis Mallick", "9471192246", covers[34]);
        albumList.add(a);
        a = new Album("Ashok Kumar Singh", "8130733447", covers[35]);
        albumList.add(a);
        a = new Album("Ashutosh Kumar", "9430109007", covers[36]);
        albumList.add(a);
        a = new Album("Asim Kumar Pal", "9939160256", covers[37]);
        albumList.add(a);
        a = new Album("Asit Kumar Kar", "3262234503", covers[38]);
        albumList.add(a);
        a = new Album("Atul K.Varma", "3262235449", covers[39]);
        albumList.add(a);
        a = new Album("B. Krishna Naick", "326223654", covers[40]);
        albumList.add(a);
        a = new Album("Badam Singh Kushvah", "3265765 (I)", covers[41]);
        albumList.add(a);
        a = new Album("Bani Mukherjee", "9431125407		", covers[42]);
        albumList.add(a);
        a = new Album("Barun Kumar Nandi", "9471192317", covers[43]);
        albumList.add(a);
        a = new Album("Bhabesh C. Sakar", "9431121653", covers[44]);
        albumList.add(a);
        a = new Album("Bhanwar S. Choudhary", "9471191374", covers[45]);
        albumList.add(a);
        a = new Album("Bibhas Chandra", "7766907803", covers[46]);
        albumList.add(a);
        a = new Album("Binata Panda", "8877169589", covers[47]);
        albumList.add(a);
        a = new Album("Biplab Bhattacharya", "3262235418", covers[48]);
        albumList.add(a);
        a = new Album("Biswajit Paul", "9431125959", covers[49]);
        albumList.add(a);
        a = new Album("Bobby Antony", "9470194795", covers[50]);
        albumList.add(a);
        a = new Album("Brijesh Kumar Mishra", "3262235752", covers[51]);
        albumList.add(a);
        a = new Album("ChanchalHalder", "9471192182", covers[52]);
        albumList.add(a);
        a = new Album("Chandan Bhar", "3262235434", covers[53]);
        albumList.add(a);
        a = new Album("Chandan Guria", "9431326774", covers[54]);
        albumList.add(a);
        a = new Album("Chirajeev Kumar", "9431125793", covers[55]);
        albumList.add(a);
        a = new Album("Chiranjib Banerjee", "9955005111", covers[56]);
        albumList.add(a);
        a = new Album("D N V V Konda Lutukurthi", "3262235907", covers[57]);
        albumList.add(a);
        a = new Album("D. C. Panigrahi", "3262235235", covers[58]);
        albumList.add(a);
        a = new Album("D. D. Pathak", "3262235459", covers[59]);
        albumList.add(a);
        a = new Album("D. Krishna Sandilya", "3262235066", covers[60]);
        albumList.add(a);
        a = new Album("D. P. Mishra", "9430191673", covers[61]);
        albumList.add(a);
        a = new Album("Debjani Mitra", "3262206866", covers[62]);
        albumList.add(a);
        a = new Album("Deepak Kumar Mandal", "3262235058", covers[63]);
        albumList.add(a);
        a = new Album("Deepanker Asthana", "3262235424", covers[64]);
        albumList.add(a);
        a = new Album("Devendra Chack", "9471191821", covers[65]);
        albumList.add(a);
        a = new Album("Dharvath Ramesh", "9471191814", covers[66]);
        albumList.add(a);
        a = new Album("Dheeraj Kumar", "9431711199", covers[67]);
        albumList.add(a);
        a = new Album("Dinabandhu Pradhan", "7070996650", covers[68]);
        albumList.add(a);
        a = new Album("Dinkar Brajeshkumar Kishorilal", "9471191871", covers[69]);
        albumList.add(a);
        a = new Album("Partha Sarati Gupta", "3262235236", covers[70]);
        albumList.add(a);
        a = new Album("Basanta Bandhuri", "3262235181", covers[71]);
        albumList.add(a);
        a = new Album("Biswajit Chowdhary", "9470194350", covers[72]);
        albumList.add(a);
        a = new Album("P.M.Sarun", "9471191816", covers[73]);
        albumList.add(a);
        a = new Album("Prashant Kumar Sharma", "9471191339", covers[74]);
        albumList.add(a);
        a = new Album("B. Thangvel", "9471191337", covers[75]);
        albumList.add(a);
        a = new Album("Ram Bilash Choudhary", "2362235881", covers[76]);
        albumList.add(a);
        a = new Album("S.K. Padhi", "3262235114", covers[77]);
        albumList.add(a);
        a = new Album("Sagar Pal", "9471191529", covers[78]);
        albumList.add(a);
        a = new Album("Umakanta Tripathy", "9471192489", covers[79]);
        albumList.add(a);
        a = new Album("Vinod Kumar Singh", "9471191037", covers[80]);
        albumList.add(a);
        a = new Album("G Srinivasa Rao", "", covers[81]);
        albumList.add(a);
        a = new Album("G.N. Singh", "9431711004", covers[82]);
        albumList.add(a);
        a = new Album("G.P. Biswas", "9431124198", covers[83]);
        albumList.add(a);
        a = new Album("G. UdayaBhanu", "3262235461	", covers[84]);
        albumList.add(a);
        a = new Album("Gajendra Kumar Vishwakarma", "9471191338", covers[85]);
        albumList.add(a);
        a = new Album("Ganesh Chandra NAyak", "3262235934", covers[86]);
        albumList.add(a);
        a = new Album("Gauri Shankar", "3262235633", covers[87]);
        albumList.add(a);
        a = new Album("Gaur Shanker Seth", "9006482450", covers[88]);
        albumList.add(a);
        a = new Album("Gyananadh Budi", "9471191408", covers[89]);
        albumList.add(a);
        a = new Album("Govind Murmu", "3262296622", covers[90]);
        albumList.add(a);
        a = new Album("Govind Swaroop Pathak", "3262235481", covers[91]);
        albumList.add(a);
        a = new Album("Gurdeep Singh", "2362296624", covers[92]);
        albumList.add(a);
        a = new Album("Gyan Prakash", "9771439583	", covers[93]);
        albumList.add(a);
        a = new Album("Haider Banka", "9471191233", covers[94]);
        albumList.add(a);
        a = new Album("Hari Om", "3262235638", covers[95]);
        albumList.add(a);
        a = new Album("Hari Pada Nayek", "3262235756", covers[96]);
        albumList.add(a);
        a = new Album("Hemant Kumae", "9431964128", covers[97]);
        albumList.add(a);
        a = new Album("Indra MAni Mishra", "no. mb", covers[98]);
        albumList.add(a);
        a = new Album("J.K. Pattnayak", "9431122309", covers[99]);
        albumList.add(a);
        a = new Album("Jairam Manam ", "9471192138", covers[100]);
        albumList.add(a);
        a = new Album("Jaisingh T", "9471191822", covers[101]);
        albumList.add(a);
        a = new Album("Jayanta Das", "9471191639", covers[102]);
        albumList.add(a);
        a = new Album("Jhasketan Nayak", "8051154726", covers[103]);
        albumList.add(a);
        a = new Album("Jitendra Kumar", "9470194837", covers[104]);
        albumList.add(a);
        a = new Album("K.C. Janak", "3262235902", covers[105]);
        albumList.add(a);
        a = new Album("k. Priya Ajit", "9471191850", covers[106]);
        albumList.add(a);
        a = new Album("K.S. Thayagaraj", "8888887308", covers[107]);
        albumList.add(a);
        a = new Album("Kabir Dasgupta", "3262235443", covers[108]);
        albumList.add(a);
        a = new Album("Kailash Jha", "3262235436", covers[109]);
        albumList.add(a);
        a = new Album("Kalyan Chatterjee", "9431126489", covers[110]);
        albumList.add(a);
        a = new Album("Kalyan Kumar Singh", "9546385852", covers[111]);
        albumList.add(a);
        a = new Album("Kashinath Pal", "9471191821", covers[112]);
        albumList.add(a);
        a = new Album("Kaushal Kumar", "9471191739", covers[113]);
        albumList.add(a);
        a = new Album("Kaushik Muzumdar", "9771420587", covers[114]);
        albumList.add(a);
        a = new Album("Keka Ojha", "3262235484", covers[115]);
        albumList.add(a);
        a = new Album(" Kironmala Chanda", "9430351290", covers[116]);
        albumList.add(a);
        a = new Album("Kripamoy Sarkar", "9570145254", covers[117]);
        albumList.add(a);
        a = new Album("Krishnendu Shaw", "3262235166", covers[118]);
        albumList.add(a);
        a = new Album("L.A. Kumarswamidhas", "9471191647", covers[119]);
        albumList.add(a);
        a = new Album("Lohitkumar Naingeli ", "9471192372", covers[120]);
        albumList.add(a);
        a = new Album("M.Jawed", "9431122638", covers[121]);
        albumList.add(a);
        a = new Album("Madan Lal Chandravanshi", "9471191089", covers[122]);
        albumList.add(a);
        a = new Album("Mahendra Yadav", "9430101387", covers[123]);
        albumList.add(a);
        a = new Album("Manish Kumar Jain", "9431711095", covers[124]);
        albumList.add(a);
        a = new Album("Mo. Mojbhur Rahman", "3262235490", covers[125]);
        albumList.add(a);
        a = new Album("Mo. Sayeb Alam", "9470372048", covers[126]);
        albumList.add(a);
        a = new Album("Mihir Kr. Sinha", "6097998789(US)", covers[127]);
        albumList.add(a);
        a = new Album("Mohammed Sikander Azam", "9471191569", covers[128]);
        albumList.add(a);
        a = new Album("Mohd Irfan", "9471192466", covers[129]);
        albumList.add(a);
        a = new Album("Mohit Agrawal", "8824172323", covers[130]);
        albumList.add(a);
        a = new Album("Moirangthem Rakesh Singh", "8877168602", covers[131]);
        albumList.add(a);
        a = new Album("Mrinal Kanti Mukherjee", "9431711148", covers[132]);
        albumList.add(a);
        a = new Album("Mrinal Sen", "2362235657", covers[133]);
        albumList.add(a);
        a = new Album("Mrinalini Pandey", "9430136446", covers[134]);
        albumList.add(a);
        a = new Album("Mritunjay Kumar Singh", "9431125817", covers[135]);
        albumList.add(a);
        a = new Album("Mukul Kumar Das", "9470194846", covers[136]);
        albumList.add(a);
        a = new Album("N R Mandre", "3262235556", covers[137]);
        albumList.add(a);
        a = new Album("N.K. Singh", "9431711359", covers[138]);
        albumList.add(a);
        a = new Album("Neetish Kumar Maurya", "9771458839", covers[139]);
        albumList.add(a);
        a = new Album("Nikkam Suresh", "3262235442", covers[140]);
        albumList.add(a);
        a = new Album("Niladri Das", "9430136495", covers[141]);
        albumList.add(a);
        a = new Album("Nirajan Kumar", "9471191827", covers[142]);
        albumList.add(a);
        a = new Album("Nirban Manna", "7549022324", covers[143]);
        albumList.add(a);
        a = new Album("Nirupama Mandal", "3262235124", covers[144]);
        albumList.add(a);
        a = new Album("Nitai Pal", "9471154739", covers[145]);
        albumList.add(a);
        a = new Album("P K Behera", "9835176018", covers[146]);
        albumList.add(a);
        a = new Album("P R Mohanty", "3262207152", covers[147]);
        albumList.add(a);
        a = new Album(" Padinaidu Paluri", "3262235933", covers[148]);
        albumList.add(a);
        a = new Album("Pankaj Kumar Jain", "3262235094", covers[149]);
        albumList.add(a);
        a = new Album("Pankaj Mishra", "3262235669", covers[150]);
        albumList.add(a);
        a = new Album("Paresh Kumar Nayak", "9471192452", covers[151]);
        albumList.add(a);
        a = new Album("Paresh Nath Singh Roy", "3262235469", covers[152]);
        albumList.add(a);
        a = new Album("Partha Sarthi Paul", "9430384494", covers[153]);
        albumList.add(a);
        a = new Album("Patitapaban Sahu", "8987419603", covers[154]);
        albumList.add(a);
        a = new Album("Pawan Kumar Singh", "3262235135", covers[155]);
        albumList.add(a);
        a = new Album("Pentyala Srinivasa Rao", "3262235480", covers[156]);
        albumList.add(a);
        a = new Album("Phalguni Sen", "3262235238", covers[157]);
        albumList.add(a);
        a = new Album("Prabin Kumar Sarkar", "3262233527", covers[158]);
        albumList.add(a);
        a = new Album("Prabhodha Ranjan Sahoo", "7549200242", covers[159]);
        albumList.add(a);
        a = new Album("Pradip Kumar Sadhu", "9431126076", covers[160]);
        albumList.add(a);
        a = new Album("Pramod Kumar Kewat", "3262235921", covers[161]);
        albumList.add(a);
        a = new Album("Pramod PAthak", "3262235435", covers[162]);
        albumList.add(a);
        a = new Album("PRANAB dAS", "9471191892", covers[163]);
        albumList.add(a);
        a = new Album("Prashant K. Jana", "3262235473", covers[164]);
        albumList.add(a);
        a = new Album("Prashant Kr. Mahato", "3262235646", covers[165]);
        albumList.add(a);
        a = new Album("Prasoon Kumar Singh", "9431711057", covers[166]);
        albumList.add(a);
        a = new Album("Prasun Jana", "3262235054", covers[167]);
        albumList.add(a);
        a = new Album("Prosanta Kumar Khan", "3262235465", covers[168]);
        albumList.add(a);
        a = new Album("R. Anand", "7631704704", covers[169]);
        albumList.add(a);
        a = new Album("R. R Das", "8895556016", covers[170]);
        albumList.add(a);
        a = new Album("R. Venugopal", "9334003523", covers[171]);
        albumList.add(a);
        a = new Album("Rabindra Nath Hota", "3262235122", covers[172]);
        albumList.add(a);
        a = new Album("Radhakanta Koner", "3262235739", covers[173]);
        albumList.add(a);
        a = new Album(" Raghvendra Kumar Chaudhary", "3262235127", covers[174]);
        albumList.add(a);
        a = new Album("Rahul Bhattacharya", "7763811074", covers[175]);
        albumList.add(a);
        a = new Album("Rajeev Kumar Ranjan", "9471191517", covers[176]);
        albumList.add(a);
        a = new Album("Rajeev Updhyay", "9430351877", covers[177]);
        albumList.add(a);
        a = new Album("Rajendra k. Dubey", "9431711058", covers[178]);
        albumList.add(a);
        a = new Album(" Rajendra Pamula", "9471191419", covers[179]);
        albumList.add(a);
        a = new Album("Rajib Sarkar", "9430351282", covers[180]);
        albumList.add(a);
        a = new Album("Rajni SIngh", "3262235447", covers[181]);
        albumList.add(a);
        a = new Album("Rakesh Kumar", "9471191668", covers[182]);
        albumList.add(a);
        a = new Album("Ram Krishna Singh", "3262235223", covers[183]);
        albumList.add(a);
        a = new Album("Ram Pravesh Bhagat", "9470987236", covers[184]);
        albumList.add(a);
        a = new Album("Ramanbabu Kaligatla", "3262235183", covers[185]);
        albumList.add(a);
        a = new Album("Randip K. Das", "3262235479", covers[186]);
        albumList.add(a);
        a = new Album("Ranjit Kumar Upadhyay", "3262235482", covers[187]);
        albumList.add(a);
        a = new Album("Rashmi Madhuri", "9471191640", covers[188]);
        albumList.add(a);
        a = new Album("Ravi Kumar Gangwar", "9771457994", covers[189]);
        albumList.add(a);
        a = new Album("Rima Chaterjee", "3262235493", covers[190]);
        albumList.add(a);
        a = new Album("Rothith P. John", "3262235665", covers[191]);
        albumList.add(a);
        a = new Album("S.K. Panda", "3262235091", covers[192]);
        albumList.add(a);
        a = new Album("S. Bhattacharya", "3262235457", covers[193]);
        albumList.add(a);
        a = new Album("S. Bhattacharya", "3262235440", covers[194]);
        albumList.add(a);
        a = new Album("S. Chaudhari", "3262235279", covers[195]);
        albumList.add(a);
        a = new Album("S.K. Paul", "3262235244", covers[196]);
        albumList.add(a);
        a = new Album("S. Mohanty", "9431122457", covers[197]);
        albumList.add(a);
        a = new Album("S. Mukhopadhyaya", "3262235422", covers[198]);
        albumList.add(a);
        a = new Album("S. Narayan", "3262235197", covers[199]);
        albumList.add(a);
        a = new Album("S.P. Tiwari", "9431711226", covers[200]);
        albumList.add(a);
        a = new Album("S.S. Mohapatra", "9861443377", covers[201]);
        albumList.add(a);
        a = new Album("Sachin Kumar Singh", "9102991041", covers[202]);
        albumList.add(a);
        a = new Album("Sachin Tripathi", "9471191359", covers[203]);
        albumList.add(a);
        a = new Album("Sahendra SIngh", "9471191375", covers[204]);
        albumList.add(a);
        a = new Album("Sandeep Mondal", "9430352782", covers[205]);
        albumList.add(a);
        a = new Album("Sanjeev Anand Sahu", "3262235917", covers[206]);
        albumList.add(a);
        a = new Album("Sanjeev Kumar Raghuwanshi", "9471191354", covers[207]);
        albumList.add(a);
        a = new Album("Sanjit Kumar Pal", "9471191852", covers[208]);
        albumList.add(a);
        a = new Album("Sanjoy K. Ghoshal", "9431711283", covers[209]);
        albumList.add(a);
        a = new Album("Sanjoy Mondal", "3262235405", covers[210]);
        albumList.add(a);
        a = new Album("sanket NAyak", "3262235143", covers[211]);
        albumList.add(a);
        a = new Album("Sanatanu Dwari", "9431538392", covers[212]);
        albumList.add(a);
        a = new Album("Santimony Kundu", "9471191592", covers[213]);
        albumList.add(a);
        a = new Album("Sarvanan Pichiah", "no. mb", covers[214]);
        albumList.add(a);
        a = new Album("Sarita Kar", "9204556362", covers[215]);
        albumList.add(a);
        a = new Album("Saumen MAti", "9471192208", covers[216]);
        albumList.add(a);
        a = new Album("Saumya SIngh", "3262235497", covers[217]);
        albumList.add(a);
        a = new Album("Sauabh Dutta Gupta", "3262235072", covers[218]);
        albumList.add(a);
        a = new Album("Seekhar Chandra Dutta", "7894407830", covers[219]);
        albumList.add(a);
        a = new Album("Shailendra Kumar Sharma", "9431121600", covers[220]);
        albumList.add(a);
        a = new Album("Shailendra Narayan SIngh", "9471191153", covers[221]);
        albumList.add(a);
        a = new Album("Shalini Gautam", "3262235650", covers[222]);
        albumList.add(a);
        a = new Album("Shalivanthan", "3262235475", covers[223]);
        albumList.add(a);
        a = new Album("Shatrughan Soren", "3262235652", covers[224]);
        albumList.add(a);
        a = new Album("Seeja Jagadevan", "3262235162", covers[225]);
        albumList.add(a);
        a = new Album("Shibyan Sarkar", "9471191818", covers[226]);
        albumList.add(a);
        a = new Album("Shishir Gupta", "3262235464", covers[227]);
        albumList.add(a);
        a = new Album("Sharvan Kumar", "9771421510", covers[228]);
        albumList.add(a);
        a = new Album("Shushanta Sarangi", "3262235763", covers[229]);
        albumList.add(a);
        a = new Album("Shweta R. Malwe", "9471192142", covers[230]);
        albumList.add(a);
        a = new Album("Siddharta SenGupta", "3262235155", covers[231]);
        albumList.add(a);
        a = new Album("Somanath Chattopadhyay", "9431122518", covers[232]);
        albumList.add(a);
        a = new Album("Somnath Pan", "9431124647", covers[233]);
        albumList.add(a);
        a = new Album("Somnath Yadav", "3262235880", covers[234]);
        albumList.add(a);
        a = new Album("Soumitra Kumar Bhaumik", "3262235156", covers[235]);
        albumList.add(a);
        a = new Album("Soumen Bag", "3262235168", covers[236]);
        albumList.add(a);
        a = new Album("Soumitra Maity", "3262235185", covers[237]);
        albumList.add(a);
        a = new Album("Sowmiya Chawla", "9990907710", covers[238]);
        albumList.add(a);
        a = new Album("Sridhar Sahu", "3262235919", covers[239]);
        albumList.add(a);
        a = new Album("Srinivas Pasupaleti", "9471192234	", covers[240]);
        albumList.add(a);
        a = new Album("Shubhankar Sen", "3262235188", covers[241]);
        albumList.add(a);
        a = new Album("Subhasis Chatterjee", "9431126486", covers[242]);
        albumList.add(a);
        a = new Album("Subindu Kumar", "9471191160", covers[243]);
        albumList.add(a);
        a = new Album("Subodh Kumar Maiti", "9471191278", covers[244]);
        albumList.add(a);
        a = new Album("Subrata Kumar Ghosh", "9430187029", covers[245]);
        albumList.add(a);
        a = new Album("Sukanta Chakraborty", "3262235194", covers[246]);
        albumList.add(a);
        a = new Album("Sukanta Das", "3262235653", covers[247]);
        albumList.add(a);
        a = new Album("Sukanta Dey", "9431503788", covers[248]);
        albumList.add(a);
        a = new Album("Sukha Ranjan Samadder", "9471191823", covers[249]);
        albumList.add(a);
        a = new Album("Sukha Ranjan Samadder", "9471191823", covers[250]);
        albumList.add(a);
        a = new Album("Sukumar Laik", "3262200274", covers[251]);
        albumList.add(a);
        a = new Album("Suman Dutta", "3262235065", covers[252]);
        albumList.add(a);
        a = new Album("Sumanta Kumar Gupta", "7631042241", covers[253]);
        albumList.add(a);
        a = new Album("Sunil Kumar Gupta", "3262235474", covers[254]);
        albumList.add(a);
        a = new Album("Sunil Kumar Gupta", "9431126495", covers[255]);
        albumList.add(a);
        a = new Album("Suresh Kumar Yatirajula", "3262235906", covers[256]);
        albumList.add(a);
        a = new Album("Suresh Pandian E", "3262235753", covers[257]);
        albumList.add(a);
        a = new Album("Sushila Vikas Maheshkar", "3262295797", covers[258]);
        albumList.add(a);
        a = new Album("Sushrut Das", "9430374392", covers[259]);
        albumList.add(a);
        a = new Album("Swapan Dey", "3262235607", covers[260]);
        albumList.add(a);
        a = new Album("T.K. Chatterjee", "3262235437", covers[261]);
        albumList.add(a);
        a = new Album("Tajdarul Hassan Syed", "3262235408", covers[262]);
        albumList.add(a);
        a = new Album("Tanish Dey", "9471192447", covers[263]);
        albumList.add(a);
        a = new Album("Tanmoy Maity", "9471191126", covers[264]);
        albumList.add(a);
        a = new Album("Tanushree Kaibartta", "3262235273", covers[265]);
        albumList.add(a);
        a = new Album("Tanweer Alam", "9471191849", covers[266]);
        albumList.add(a);
        a = new Album("Tarkeshwar Kumar", "8051088444", covers[267]);
        albumList.add(a);
        a = new Album("Tarun Kumar Naiya", "3262235879", covers[268]);
        albumList.add(a);
        a = new Album("U.K. Singh", "3262235222", covers[269]);
        albumList.add(a);
        a = new Album("Upama Dutta", "3262235070", covers[270]);
        albumList.add(a);
        a = new Album("Upendra Kumar Singh", "9470194998", covers[271]);
        albumList.add(a);
        a = new Album("V.K. Saxena", "9431124410", covers[272]);
        albumList.add(a);
        a = new Album("V. Kumar ", "9431122030", covers[273]);
        albumList.add(a);
        a = new Album("V. M. S. R. Murthy", "3262235445", covers[274]);
        albumList.add(a);
        a = new Album("V.P. Sharma", "3262206232", covers[275]);
        albumList.add(a);
        a = new Album("V.V. Govind Kumar", "9471192205", covers[276]);
        albumList.add(a);
        a = new Album("Vijaya Bhaskar", "3262235911", covers[277]);
        albumList.add(a);
        a = new Album("Vikas Mahto", "9431711023", covers[278]);
        albumList.add(a);
        a = new Album("Vinay Kumar Rajak", "8051101110", covers[279]);
        albumList.add(a);
        a = new Album("Vinayak Ranjan ", "9470383975", covers[280]);
        albumList.add(a);
        a = new Album("Vineet Kumar", "3262235216", covers[281]);
        albumList.add(a);
        a = new Album("Vineet Kumar Rai", "3262235282", covers[282]);
        albumList.add(a);
        a = new Album("Vinod Kumar Saxena", "I", covers[283]);
        albumList.add(a);
        a = new Album("Vipin Kumar", "9471191352", covers[284]);
        albumList.add(a);
        a = new Album("Vishnu Priye", "9431125155", covers[285]);
        albumList.add(a);
        a = new Album("Vivek Bajpai", "9430351330", covers[286]);
        albumList.add(a);
        a = new Album("Vivekananda Mukherjee", "3262235644		", covers[287]);
        albumList.add(a);

        adapter.notifyDataSetChanged();
    }

    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}
