package com.qty.cpuinfo;

import android.content.Context;
import android.content.res.Resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by user on 16-11-10.
 */

public class CpuHelper {

    private static final String TAG = "CpuHelper";

    private Context mContext;
    private Resources mResources;

    public CpuHelper(Context context) {
        mContext = context;
        mResources = mContext.getResources();
    }

    public long[] getCpuAvailableFrequencies() {
        long[] availablFreqs = null;
        String fileName = mResources.getResourceName(R.string.cpu_available_frequencies_path);
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {
            }
            reader.close();
        } catch (IOException e) {
            Log.e(TAG, "getCpuAvailable")
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }

}
