/**
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.twigtotree.lingayatmatrimony.auth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.quickstart.auth.R;

/**
 * Simple list-based Activity to redirect to one of the other Activities. This Activity does not
 * contain any useful code related to Firebase Authentication. You may want to start with
 * one of the following Files:
 *     {@link GoogleSignInActivity}
 *     {@link TwitterLoginActivity}
 *     {@link EmailPasswordActivity}
 *     {@link AnonymousAuthActivity}
 *     {@link CustomSignInActivity}
 */
public class ChooserActivity extends AppCompatActivity {

    private static final Class[] CLASSES = new Class[]{

            CustomSignInActivity.class
    };

    private static final int[] DESCRIPTION_IDS = new int[] {
            R.string.desc_custom_auth,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Class clicked = CLASSES[0];
        startActivity(new Intent(this, clicked));
    }


}
