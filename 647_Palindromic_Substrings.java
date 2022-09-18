class Solution {
    public int countSubstrings(String k) {
        int c = 0;
    StringBuilder str = new StringBuilder ();
    for (int i = 0; i < k.length(); i++)
      {
	for (int j = i+1; j <=k.length(); j++)
	  {
	    str.append (k.substring (i, j));
	    String l = str.toString();
	    String s = (str.reverse()).toString();
	    if (l.equals(s))
	      c++;
	    str.setLength (0);
	  }
      }
        return c;
    }
}
