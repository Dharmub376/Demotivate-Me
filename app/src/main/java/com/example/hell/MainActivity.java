package com.example.hell;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView quoteTextView;
    private Button nextQuoteButton;
    private String[] demotivatingQuotes = {
            "Why try? Failure is inevitable.",
            "Dreams are just fantasies that won't come true.",
            "Effort is overrated, just give up.",
            "The best way to avoid disappointment is to expect nothing.",
            "Nothing really matters in the end.",
            "Don't aim high, you’ll fall harder.",
            "Your potential is probably overestimated.",
            "Success is for others, not you.",
            "Even if you succeed, someone will do it better.",
            "The grass is always brown on both sides."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quoteTextView);
        nextQuoteButton = findViewById(R.id.nextQuoteButton);

        // Set a random quote on launch
        showRandomQuote();

        nextQuoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandomQuote();
            }
        });
    }

    private void showRandomQuote() {
        Random random = new Random();
        int index = random.nextInt(demotivatingQuotes.length);
        quoteTextView.setText(demotivatingQuotes[index]);
    }
}