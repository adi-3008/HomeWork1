package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {

    private RecyclerView booksRecView;

    private BookRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);
        adapter = new BookRecViewAdapter(this);
        booksRecView = findViewById(R.id.booksRecView);
        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Books> books = new ArrayList<>();
        books.add(new Books(812,"The Wings of Fire","A.P.J.Abdul Kalam",180,"https://fatehnama.com/wp-content/uploads/2020/05/Wings-of-Fire.jpg",
                "Story of Missile Man","Long Description"));

        books.add(new Books(978,"A Brief History of Time - From Big Bang To Black Hole","Stephen Hawking",256,"https://images-na.ssl-images-amazon.com/images/I/5152J9Z956L._SX310_BO1,204,203,200_.jpg",
                "History of Time","Much like his fellow Simpsons voice actor Stephen Jay Gould, Stephen Hawking is equal parts great scientist and great communicator of scientific discovery, which is particularly amazing when you consider just how fiendishly technical a lot of his research is. A Brief History of Time isn't the only book Hawking has written, but it's the first and the best known, remaining on the bestseller lists for an astonishing 237 straight weeks. For anyone who hasn't yet picked up his grand tour of the cosmos, this is one journey most definitely worth taking."));

        books.add(new Books(782,"The Origin of Species by Charles Darwin","Charles Darwin",502,"https://kbimages1-a.akamaihd.net/933673e8-6797-4526-92cc-92986d03bf84/1200/1200/False/on-the-origin-of-species-64.jpg",
                "Origin Of Humans","Darwin is obviously recognized as the father of evolution and one of the towering figures of 19th century science, but it's often forgotten that he was also a talented communicator of ideas. The Origin of Species remains surprisingly readable more than 150 years after its initial publication, and this is one of the few times where it's actually fun to read a book that completely altered the course of human history."));

        books.add(new Books(439,"Radioactive Substances by Marie Curie (1904)","Marie Curie",97,"https://images-na.ssl-images-amazon.com/images/I/514BHF4Y2AL._AC_SY780_.jpg",
                "Study of Radioactive Substances","This book can't really be considered a work of popular science - it's actually her doctoral dissertation translated into English - but it's hard to ignore the work of this two-time Nobel Prize winner. In these pages, Curie proves beyond a shadow of a doubt the existence of radioactive elements, describing the newly-discovered polonium and radium, not to mention the various properties of radioactivity."));

        books.add(new Books(145,"The Selfish Gene by Richard Dawkins","Richard Dawkins",224,"https://media.karousell.com/media/photos/products/2017/09/05/the_selfish_gene_dawkins_r_40th_anni_1504604195_04747eca.jpg",
                "The Selfish Gene","First published 35 years ago, The Selfish Gene helped make Richard Dawkins the most important evolutionary biologist since Charles Darwin. Introducing the idea that genes are the real drivers of evolution and we organisms are just along for the ride, Dawkins both turned evolutionary theory upside down and resolved many of the field's most stubborn mysteries. And, as an added bonus, Dawkins's book also introduced the term \"meme\" as a unit of human cultural evolution, making him responsible for a good 70% of what's currently wrong with the internet."));

        books.add(new Books(768,"The Double Helix by James Watson","James Watson",180,"https://d28hgpri8am2if.cloudfront.net/book_images/cvr9781476715490_9781476715490_hr.jpg",
                "Helix of DNA","The co-discoverer of DNA kept a running diary of the team's search for the secrets of life, and those first impressions became The Double Helix. It's an intensely personal account, and anyone familiar with some of Watson's more recent statements will be unsurprised to learn that he's candid to a fault here, openly talking about his conflicted feelings towards his research partner Francis Crick, not to mention the constant backstabbing and intriguing with his colleagues. It's a rollicking read that offers a warts-and-all look at the search for truth, even if " +
                "the book itself is itself full of some crucial distortions and glaring omissions. Keep an open mind while " +
                "reading this book, and then pick up a biography on their colleague Rosalind Franklin - and, if you have time, " +
                "their often forgotten fourth team member Maurice Wilkins, who I admit I sympathize with for surname-related " +
                "reasons."));
        adapter.setBooks(books);


    }
}