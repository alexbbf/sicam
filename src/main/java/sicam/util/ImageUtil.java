package sicam.util;

import java.io.ByteArrayInputStream;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

public class ImageUtil {
	
	public static StreamedContent byteParaImagem(byte[] bytea){
		StreamedContent imagem;
		
		imagem = new DefaultStreamedContent(new ByteArrayInputStream(bytea));
		return imagem;
		
	}

}
