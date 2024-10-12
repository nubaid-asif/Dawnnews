package com.example.assignment2

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       val recyclerView: RecyclerView =findViewById(R.id.recyclerView)
        val adaptar= ArticlesAdaptar(getArticles())
        recyclerView.adapter=adaptar
        recyclerView.layoutManager= LinearLayoutManager(this)

    }

    fun getArticles(): List<Article>{
        return listOf(
            Article(R.drawable.img1, "‘Year of suffering’: Gazans weary of war on October 7 anniversary", "GAZA STRIP: One year after Israel unleashed war on Gaza, the Palestinian territory is unrecognisable","GAZA STRIP: One year after Israel unleashed war on Gaza, the Palestinian territory is unrecognisable, its residents are exhausted by displacement and shortages, with no end in sight.\n" +
                    "\n" +
                    "“It felt like the first day of the war all over again”, said Khaled al-Hawajri, 46, as the Israeli forces bombarded his Gaza neighbourhood on Monday, even as Israel marked the anniversary of Hamas’ Oct 7 raid.\n" +
                    "\n" +
                    "“Last night, we were terrorised by the bombardments from quadcopters and tank shells,” said Hawajri, who has been displaced 10 times with his family of seven in the past year.\n" +
                    "\n" +
                    "On Monday, Gaza City was barely recognisable, ravaged by relentless air strikes and fighting."),


            Article(R.drawable.img2, "Full court reference for outgoing CJP Qazi Faez Isa set for Oct 25", "The full court reference for outgoing Chief Justice of Pakistan (CJP) Qazi Faez Isa has been scheduled for October 25, according to a letter from the Supreme Court registrar..","The development emerged in a letter, a copy of which is available with Dawn.com, from Supreme Court Registrar Jazeela Aslam dated today, written to Supreme Court Bar Association President Shahzad Shaukat.\n" +
                    "\n" +
                    "Justice Mansoor Ali Shah is next in line to be the country’s top judge after CJP Isa’s retirement.\n" +
                    "\n" +
                    "An invitation to Attorney General of Pakistan Mansoor Awan said that it was a practice for a farewell dinner to be arranged on the occasion but CJP Isa said that he did not want one since it would cost about Rs2 million."),


            Article(R.drawable.img3, "Two terrorists behind 2021 Dasu Dam attack killed in Sahiwal: CTD", "Two terrorists, involved in the 2021 Dasu Dam attack, were killed on Friday by their accomplices as they were being transferred..","Two terrorists, involved in the 2021 Dasu Dam attack, were killed on Friday by their accomplices as they were being transferred from Sahiwal Jail because of a threat alert, a statement from the Punjab Counter-Terrorism Department (CTD) said.\n" +
                    "\n" +
                    "In 2021, 13 people, including nine Chinese engineers and four Pakistani nationals, were killed in a bus attack near the Dasu hydropower plant in the Upper Kohistan district of Khyber Pakhtunkhwa.\n" +
                    "\n" +
                    "According to the statement, a total of five terrorists — including the masterminds of the Dasu attack Muhammad Hussain and Ayaz — were being transferred from the jail to another location in two police vans due to security concerns amid a threat alert issued by the interior ministry."),


            Article(R.drawable.img4, "President Zardari calls for improved railroad link between Pakistan, Turkiye", "President Zardari, who arrived in Turkmenistan on Thursday for a two-day visit, also delivered..","President Zardari, who arrived in Turkmenistan on Thursday for a two-day visit, also delivered an address at the event. He emphasised the need for stronger regional connectivity and deeper cultural and economic cooperation among neighbouring states.\n" +
                    "\n" +
                    "In a meeting with the speaker of the Turkish Parliament, Numan Kurtulmus, President Zardari called for improved railroad link between Pakistan and Turkiye to enhance trade and economic cooperation..\n" +
                    "\n" +
                    "Mr Zardari underscored the importance of further deepening bilateral relations and increasing exchanges between the two nations.\n" +
                    "\n" +
                    "The meeting, held on the sidelines of the Ashgabat forum, was also attended by Deputy Prime Minister and Foreign Minister Ishaq Dar and Balochistan Chief Minister Sarfraz Bugti."),
        )
    }
}