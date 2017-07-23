# FragmentManagerAnnotation

FragmentManagerAnnotation is a simple library for confirm whether Fragment is added to correct FragmentManger.

## Sample usage

Add an annotation to Fragment indicating which FragmentManager to use.

    @SupportChildFragmentManager
    public class MainFragment extends Fragment {

Confirm whether Fragment is added to correct FragmentManger.
Checks with specified id.

    //throw IllegalArgumentException due to MainFragment with SupportChildFragmentManager annotation
    LookupFragmentManager.supportFragmentManager(this, R.id.fragment);

Or specified tag.

    LookupFragmentManager.supportFragmentManager(this, "tag");

Or all Fragments in FragmentManager.

    LookupFragmentManager.supportFragmentManager(this);

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

