package com.home.currency;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	private EditText etNTD;
	private TextView tvJPY;
	private TextView tvUSD;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		etNTD = findViewById(R.id.ntd);
		tvJPY = findViewById(R.id.jp);
		tvUSD = findViewById(R.id.us);
	}

	public void go(View view) {
		String ntd = etNTD.getText().toString();
		if (ntd.equals("")) {
			new AlertDialog.Builder(this)
					.setTitle("Problem")
					.setMessage("Please enter you NTD amount.")
					.setPositiveButton("OK", null)
					.show();
		} else {
			double us = Double.valueOf(ntd) / 30.9;
			new AlertDialog.Builder(this)
					.setTitle("Result")
					.setMessage("USD is " + String.format("%.2f", us))
					.setPositiveButton("OK", null)
					.show();
		}
	}
}
