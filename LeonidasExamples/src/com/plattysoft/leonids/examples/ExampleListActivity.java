package com.plattysoft.leonids.examples;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ExampleListActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String sampleList[] = new String [] {"One Shot Simple", "One Shot Advanced", 
				"Emiter Simple", "Emiter Intermediate", "Emiter Time Limited"
				, "Animated particles"
				, "Fireworks"
				, "Confetti [Rabbit and Eggs]"
				, "Dust [Rabbit and Eggs]"
				, "Stars [Rabbit and Eggs]"
//				, "Animated Particles"
				};
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sampleList));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		switch (position) {
		case 0:
			startActivity(new Intent(this, OneShotSimpleExampleActivity.class));
			break;
		case 1:
			startActivity(new Intent(this, OneShotAdvancedExampleActivity.class));
			break;
		case 2:
			startActivity(new Intent(this, EmiterSimpleExampleActivity.class));
			break;
		case 3:
			startActivity(new Intent(this, EmiterIntermediateExampleActivity.class));
			break;
		case 4:
			startActivity(new Intent(this, EmiterTimeLimitedExampleActivity.class));
			break;
		case 5:
			startActivity(new Intent(this, AnimatedParticlesExampleActivity.class));
			break;
		case 6:
			startActivity(new Intent(this, FireworksExampleActivity.class));
			break;
		case 7:
			startActivity(new Intent(this, ConfettiExampleActivity.class));
			break;
		case 8:
			startActivity(new Intent(this, DustExampleActivity.class));
			break;
		case 9:
			startActivity(new Intent(this, StarsExampleActivity.class));
			break;
		}
	}

}
