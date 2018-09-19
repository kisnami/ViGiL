package com.example.lenovo.act;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

public class Async extends AsyncTask<String,String,String> {
ProgressDialog progressDialog;
Context context;
Async(Context context){
    this.context=context;
}

    @Override
    protected String doInBackground(String... strings) {

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        progressDialog.dismiss();
    }

    @Override
    protected void onPreExecute() {
        progressDialog=new ProgressDialog(context);
        progressDialog.setTitle("Loading");
        progressDialog.setMessage("Content Prepare... ");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
    }
}
