package com.example.acara15;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.acara15.Mahasiswa;
import com.example.acara15.MahasiswaAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private MahasiswaAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Huda", "E41211492", "08123456769"));
        mahasiswaArrayList.add(new Mahasiswa("Nurul Hudi", "E41211493", "08123457789"));
        mahasiswaArrayList.add(new Mahasiswa("Nurul ", "E41211494", "08123456489"));
        mahasiswaArrayList.add(new Mahasiswa("Salwi", "E41211495", "08123456289"));
        mahasiswaArrayList.add(new Mahasiswa("Basuki", "E41211496", "08123451496"));
        mahasiswaArrayList.add(new Mahasiswa("Reza", "E41211497", "08123451497"));
        mahasiswaArrayList.add(new Mahasiswa("Susanti", "E41211498", "08123451498"));
        mahasiswaArrayList.add(new Mahasiswa("Eko", "E41211499", "08123451499"));
        mahasiswaArrayList.add(new Mahasiswa("Raka", "E41211500", "08123451500"));
        mahasiswaArrayList.add(new Mahasiswa("Anton", "E41211501", "08123451501"));
        mahasiswaArrayList.add(new Mahasiswa("Ali", "E41211502", "08123451502"));
        mahasiswaArrayList.add(new Mahasiswa("Agil", "E41211503", "08123451503"));
        mahasiswaArrayList.add(new Mahasiswa("Andre", "E41211504", "08123451504"));
        mahasiswaArrayList.add(new Mahasiswa("Adit", "E41211505", "08123451505"));
        mahasiswaArrayList.add(new Mahasiswa("Ammar", "E41211506", "08123451506"));
        mahasiswaArrayList.add(new Mahasiswa("Rayhan", "E41211507", "08123451507"));
        mahasiswaArrayList.add(new Mahasiswa("Ikhwan", "E41211508", "08123451508"));
        mahasiswaArrayList.add(new Mahasiswa("Karim", "E41211509", "08123451509"));
        mahasiswaArrayList.add(new Mahasiswa("Irhas", "E41211510", "08123451510"));
        mahasiswaArrayList.add(new Mahasiswa("Ibrahim", "E41211511", "08123451511"));
        mahasiswaArrayList.add(new Mahasiswa("Freda", "E41211512", "08123451512"));
        mahasiswaArrayList.add(new Mahasiswa("Muna", "E41211513", "08123451513"));
        mahasiswaArrayList.add(new Mahasiswa("Siska", "E41211514", "08123451514"));
        mahasiswaArrayList.add(new Mahasiswa("Irus", "E41211515", "08123451515"));
        mahasiswaArrayList.add(new Mahasiswa("Almira", "E41211516", "08123451516"));
        mahasiswaArrayList.add(new Mahasiswa("Farryn", "E41211517", "08123451517"));
        mahasiswaArrayList.add(new Mahasiswa("Salma", "E41211518", "08123451518"));
        mahasiswaArrayList.add(new Mahasiswa("Shabrina", "E41211519", "08123451519"));
    }
}