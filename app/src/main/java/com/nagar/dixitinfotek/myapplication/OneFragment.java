package com.nagar.dixitinfotek.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;


import de.hdodenhof.circleimageview.CircleImageView;

import static android.app.Activity.RESULT_OK;


public class OneFragment extends Fragment {


    private EditText fname, mname, lname;
    private EditText hno, hname, loc, lan, cit, pc;
    String f = "", m = "", l = "",num;
    String no = "", nm = "", lo = "", la = "", ci = "", pi = "";

    CircleImageView setimg;
    private static final int GALLERY_REQUEST = 1;
    private Uri mImage = null;
    TextView fulln;
    EditText e1, add,fno;


    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_one, container, false);


        //  final TextView text = (TextView) getActivity().findViewById(R.id.full);


        fname = view.findViewById(R.id.fname);
        mname = view.findViewById(R.id.mname);
        lname = view.findViewById(R.id.lname);

        hno = view.findViewById(R.id.hno);
        hname = view.findViewById(R.id.housen);
        loc = view.findViewById(R.id.location);
        lan = view.findViewById(R.id.landmark);
        cit = view.findViewById(R.id.city);
        pc = view.findViewById(R.id.pin);



       // remove = view.findViewById(R.id.delete_button);





        add = view.findViewById(R.id.address);

        setimg = (CircleImageView) view.findViewById(R.id.uimage);
        fulln = view.findViewById(R.id.full);

        setimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gallery = new Intent();
                gallery.setAction(Intent.ACTION_GET_CONTENT);
                gallery.setType("image/*");
                startActivityForResult(gallery, GALLERY_REQUEST);

            }
        });


        hno.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                no = hno.getText().toString();
                add.setText(no + nm + lo + la + ci + pi);
            }
        });

        hname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                nm = hname.getText().toString();
                add.setText(no + ", " + nm + lo + la + ci + pi);
            }
        });

        loc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                lo = loc.getText().toString();
                add.setText(no + ", " + nm + ", " + lo + la + ci + pi);
            }
        });

        lan.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                la = lan.getText().toString();
                add.setText(no + ", " + nm + ", " + lo + ", " + la + ci + pi);
            }
        });

        cit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                ci = cit.getText().toString();
                add.setText(no + ", " + nm + ", " + lo + ", " + la + ", " + ci + pi);
            }
        });

        pc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                pi = pc.getText().toString();
                add.setText(no + ", " + nm + ", " + lo + ", " + la + ", " + ci + ", " + pi);
            }
        });


        fname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                f = fname.getText().toString();
                fulln.setText(f + " " + m + " " + l);
            }
        });

        mname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                m = mname.getText().toString();
                fulln.setText(f + " " + m + " " + l);
            }
        });

        lname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                l = lname.getText().toString();
                fulln.setText(f + " " + m + " " + l);
            }
        });


        return view;


    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == GALLERY_REQUEST && resultCode == RESULT_OK) {
            Uri image = data.getData();
            CropImage.activity(image)
                    .setAspectRatio(150, 150)
                    .setGuidelines(CropImageView.Guidelines.ON)
                    .setCropShape(CropImageView.CropShape.OVAL)
                    .setFixAspectRatio(true)
                    .start(getContext(), this);
        }

        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if (resultCode == RESULT_OK) {
                mImage = result.getUri();
                setimg.setImageURI(mImage);
            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                Exception error = result.getError();
                Toast.makeText(getActivity(), String.valueOf(error), Toast.LENGTH_SHORT).show();
            }
        }
    }



}
