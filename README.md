# FragmentManagerAnnotation

FragmentManagerAnnotation is a simple library for confirm whether Fragment is added to correct FragmentManger.

## Sample usage

Add an annotation to Fragment indicating which FragmentManager to use.

    @SupportChildFragmentManager
    public class MainFragment extends Fragment {

Confirm whether Fragment is added to correct FragmentManger.

    //throw IllegalArgumentException due to MainFragment with SupportChildFragmentManager annotation
    LookFragmentManager.supportFragmentManager(this, com.kyaracter.fragmentmanagerannotation.example.R.id.fragment);
    
## Binaries

    allprojects {
        repositories {
            maven { url "https://jitpack.io" }
        }
    }

and

	dependencies {
	        compile 'com.github.daisuke-nomura:FragmentManagerAnnotation:0.1.0'
	}

