
// Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.


// strDist("catcowcat", "cat") → 9
// strDist("catcowcat", "cow") → 3
// strDist("cccatcowcatxx", "cat") → 9
public int strDist(String str, String sub) {
  if(str.length() < sub.length()){
    return 0;
  }
  if(str.startsWith(sub)){
    if(str.endsWith(sub)){
    return str.length();
  }
  else{
    return strDist(str.substring(0, str.length()-1), sub);
  }
  }
  else{
    return strDist(str.substring(1), sub);
  }
}
