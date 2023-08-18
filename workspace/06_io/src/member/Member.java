package member;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface Member {
	
	public void execute(List<MemberDTO> list) throws IOException, FileNotFoundException, ClassNotFoundException, IOException;
}
