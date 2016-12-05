/**
 * 
 */
package inputcells;




import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author Administrator
 *
 */
public class SimpleTextInputCell extends Fragment {
	//WeakReference <TextView> label;
	//WeakReference <EditText> edit;
	TextView label;
	EditText edit;
	
	@Override
	public View  onCreateView(LayoutInflater inflater, ViewGroup container, Bundle stt){
		View view = inflater.inflate(com.example.hello.R.layout.fragment_inputcell_simpletext, container);
		/*label = (TextView) view.findViewById();*/
		
		edit = (EditText) view.findViewById(com.example.hello.R.id.edit);
		label = (TextView) view.findViewById(com.example.hello.R.id.name);
		
		return view;
		
	}
	
	public void setLabelText(String labelText){
		label.setText(labelText);
	}

	public void setHintText(String hintText){
		edit.setHint(hintText);
	}
	
	public void setIsPsw(boolean isPassword){
		if(isPassword){
			edit.setInputType( EditorInfo.TYPE_CLASS_TEXT|EditorInfo.TYPE_TEXT_VARIATION_PASSWORD);
		}else{
			edit.setInputType(EditorInfo.TYPE_CLASS_TEXT);
		}
	}

}
