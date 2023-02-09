package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class BookActivity extends AppCompatActivity {

    private TextView txtBookName, txtAuthor, txtPages, txtDescription;

    private Button btnAddToCurrentlyReading, btnAddToWantToRead, btnAddToAlreadyRead, btnAddToFav;

    private ImageView bookImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

       initViews();

       Books book = new Books(768,"The Double Helix by James Watson","James Watson",180,"https://d28hgpri8am2if.cloudfront.net/book_images/cvr9781476715490_9781476715490_hr.jpg",
               "Helix of DNA","The co-discoverer of DNA kept a running diary of the team's search for the secrets of life, and those first impressions became The Double Helix. It's an intensely personal account, and anyone familiar with some of Watson's more recent statements will be unsurprised to learn that he's candid to a fault here, openly talking about his conflicted feelings towards his research partner Francis Crick, not to mention the constant backstabbing and intriguing with his colleagues. It's a rollicking read that offers a warts-and-all look at the search for truth, even if " +
               "the book itself is itself full of some crucial distortions and glaring omissions. Keep an open mind while " +
               "reading this book, and then pick up a biography on their colleague Rosalind Franklin - and, if you have time, " +
               "their often forgotten fourth team member Maurice Wilkins, who I admit I sympathize with for surname-related " +
               "reasons.");

       setData(book);

    }

    private void setData(Books book) {
        txtBookName.setText(book.getName());
        txtAuthor.setText(book.getAuthor());
        txtPages.setText(String.valueOf(book.getPages()));
        txtDescription.setText(book.getShortDesc());

        Glide.with(this)
                .asBitmap()
                .load(book.getImgUrl())
                .into(bookImage);
    }

    private void initViews() {
        txtAuthor = findViewById(R.id.txtAuthorName);
        txtBookName = findViewById(R.id.txtBookName);
        txtPages = findViewById(R.id.txtPages);
        txtDescription = findViewById(R.id.txtDescription);

        bookImage = findViewById(R.id.imgBook);

        btnAddToCurrentlyReading = findViewById(R.id.btnAddToCurrentlyReading);
        btnAddToAlreadyRead = findViewById(R.id.btnAddToAlreadyRead);
        btnAddToWantToRead = findViewById(R.id.btnAddToWantToRead);
        btnAddToFav = findViewById(R.id.btnAddToFav);
    }
}