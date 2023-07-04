package Day08;

public class 연습장08_3 {
	
	public String getInitialSound(String text) {
		String[] chs = { "ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ",
				"ㅎ" };
		if (text.length() > 0) {
			char chName = text.charAt(0);
			if (chName >= 0xAC00) {
				int uniVal = chName - 0xAC00;
				int cho = ((uniVal - (uniVal % 28)) / 28) / 21;

				return chs[cho];
			}
		}
		return null;
	}
}