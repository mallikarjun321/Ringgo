import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class test12 {

	public static void main(String[] args) {
		 Collection<File> all = new ArrayList<File>();
		    addTree(new File("C:\\Repository"), all);
		    System.out.println(all.size());
		}

		static void addTree(File file, Collection<File> all) {
		    File[] children = file.listFiles();
		    if (children != null) {
		        for (File child : children) {
		            all.add(child);
		            addTree(child, all);
		           
		    }

	}}}


