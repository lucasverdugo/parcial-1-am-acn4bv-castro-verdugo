package com.example.parcial_1_am_acn4bv_castro_verdugo;

import static com.example.parcial_1_am_acn4bv_castro_verdugo.R.drawable.bienvenida1;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public void onClickCentral(View view){

        LinearLayout layoutEscudo = findViewById(R.id.layoutEscudo);
        ImageView logoCentral = new ImageView(this);
        logoCentral.setImageResource(R.drawable.centralcordoba);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(400, 400);
        logoCentral.setLayoutParams(layoutParams);
        layoutEscudo.removeAllViews();
        layoutEscudo.addView(logoCentral);
        layoutEscudo.setGravity(Gravity.CENTER);

        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        ImageView imagenNoticia = findViewById(R.id.image1);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaCentral);
        contenido1.setText(R.string.contenido1Central);
        imagenNoticia.setImageResource(R.drawable.centralimg);
        contenido2.setText(R.string.contenido2Central);
    }
    public void onClickBoca(View view){

        LinearLayout layoutEscudo = findViewById(R.id.layoutEscudo);
        ImageView logoBoca = new ImageView(this);
        logoBoca.setImageResource(R.drawable.boca);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(400, 400);
        logoBoca.setLayoutParams(layoutParams);
        layoutEscudo.removeAllViews();
        layoutEscudo.addView(logoBoca);
        layoutEscudo.setGravity(Gravity.CENTER);

        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        ImageView imagenNoticia = findViewById(R.id.image1);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaBoca);
        contenido1.setText(R.string.contenido1Boca);
        imagenNoticia.setImageResource(R.drawable.bocaimg);
        contenido2.setText(R.string.contenido2Boca);
    }
    public void onClickRiver(View view){

        LinearLayout layoutEscudo = findViewById(R.id.layoutEscudo);
        ImageView logoRiver = new ImageView(this);
        logoRiver.setImageResource(R.drawable.river);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(400, 400);
        logoRiver.setLayoutParams(layoutParams);
        layoutEscudo.removeAllViews();
        layoutEscudo.addView(logoRiver);
        layoutEscudo.setGravity(Gravity.CENTER);

        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        ImageView imagenNoticia = findViewById(R.id.image1);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaRiver);
        contenido1.setText(R.string.contenido1River);
        imagenNoticia.setImageResource(R.drawable.riverimg);
        contenido2.setText(R.string.contenido2River);
    }
    public void onClickRosario(View view){

        LinearLayout layoutEscudo = findViewById(R.id.layoutEscudo);
        ImageView logoRosario = new ImageView(this);
        logoRosario.setImageResource(R.drawable.rosariocentral);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(400, 400);
        logoRosario.setLayoutParams(layoutParams);
        layoutEscudo.removeAllViews();
        layoutEscudo.addView(logoRosario);
        layoutEscudo.setGravity(Gravity.CENTER);

        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        ImageView imagenNoticia = findViewById(R.id.image1);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaRosario);
        contenido1.setText(R.string.contenido1Rosario);
        imagenNoticia.setImageResource(R.drawable.rosarioimg);
        contenido2.setText(R.string.contenido2Rosario);
    }
    public void onClickDefensa(View view){

        LinearLayout layoutEscudo = findViewById(R.id.layoutEscudo);
        ImageView logoDefensa = new ImageView(this);
        logoDefensa.setImageResource(R.drawable.defensa);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(400, 400);
        logoDefensa.setLayoutParams(layoutParams);
        layoutEscudo.removeAllViews();
        layoutEscudo.addView(logoDefensa);
        layoutEscudo.setGravity(Gravity.CENTER);

        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        ImageView imagenNoticia = findViewById(R.id.image1);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaDefensa);
        contenido1.setText(R.string.contenido1Defensa);
        imagenNoticia.setImageResource(R.drawable.defensaimg);
        contenido2.setText(R.string.contenido2Defensa);
    }

    public void onClickIndependiente(View view){

        LinearLayout layoutEscudo = findViewById(R.id.layoutEscudo);
        ImageView logoIndependiente = new ImageView(this);
        logoIndependiente.setImageResource(R.drawable.independiente);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(400, 400);
        logoIndependiente.setLayoutParams(layoutParams);
        layoutEscudo.removeAllViews();
        layoutEscudo.addView(logoIndependiente);
        layoutEscudo.setGravity(Gravity.CENTER);

        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        ImageView imagenNoticia = findViewById(R.id.image1);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaIndependiente);
        contenido1.setText(R.string.contenido1Independiente);
        imagenNoticia.setImageResource(R.drawable.independientenoticia);
        contenido2.setText(R.string.contenido2Independiente);
    }

    public void onClickRacing(View view){

        LinearLayout layoutEscudo = findViewById(R.id.layoutEscudo);
        ImageView logoRacing = new ImageView(this);
        logoRacing.setImageResource(R.drawable.racing);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(400, 400);
        logoRacing.setLayoutParams(layoutParams);
        layoutEscudo.removeAllViews();
        layoutEscudo.addView(logoRacing);
        layoutEscudo.setGravity(Gravity.CENTER);

        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        ImageView imagenNoticia = findViewById(R.id.image1);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaRacing);
        contenido1.setText(R.string.contenido1Racing);
        imagenNoticia.setImageResource(R.drawable.racingnoticia);
        contenido2.setText(R.string.contenido2Racing);
    }

    public void onClickNewells(View view){

        LinearLayout layoutEscudo = findViewById(R.id.layoutEscudo);
        ImageView logoNewells = new ImageView(this);
        logoNewells.setImageResource(R.drawable.newells);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(400, 400);
        logoNewells.setLayoutParams(layoutParams);
        layoutEscudo.removeAllViews();
        layoutEscudo.addView(logoNewells);
        layoutEscudo.setGravity(Gravity.CENTER);

        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        ImageView imagenNoticia = findViewById(R.id.image1);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);

        tituloNoticia.setText(R.string.tituloNoticiaNewells);
        contenido1.setText(R.string.contenido1Newells);
        imagenNoticia.setImageResource(R.drawable.newellsnoticia);
        contenido2.setText(R.string.contenido2Newells);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tituloNoticia = findViewById(R.id.tituloNoticia);
        ImageView imagenNoticia = findViewById(R.id.image1);
        TextView contenido1 = findViewById(R.id.content1);
        TextView contenido2 = findViewById(R.id.content2);;
        tituloNoticia.setText(R.string.tituloNoticia);
        imagenNoticia.setImageResource(R.drawable.chiquimafia);
        contenido1.setText(R.string.content1);
        contenido2.setText(R.string.content2);
        LinearLayout layoutEscudo = findViewById(R.id.layoutEscudo);
        layoutEscudo.removeAllViews();




    }
}