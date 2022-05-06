package Recursion;

import java.util.*;

public class LetterCombinations1
{
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		
//		List<String> list = new ArrayList<String>();
//		
//		list = findAllCombinations(str);
//		
//		System.out.println(list);
//		sc.close();
//	}
//
//	static List<String> findAllCombinations(String str)
//	{
//      List<String> ans = new ArrayList<String>();
//      if(str.equals(""))
//      {
//          return ans;
//      }
//      char arr2[] = {'a', 'b', 'c'};
//		char arr3[] = {'d', 'e', 'f'};
//		char arr4[] = {'g', 'h', 'i'};
//		char arr5[] = {'j', 'k', 'l'};
//		char arr6[] = {'m', 'n', 'o'};
//		char arr7[] = {'p','q', 'r', 's'};
//		char arr8[] = {'t','u', 'v'};
//		char arr9[] = {'w','x', 'y', 'z'};
		
//		HashMap<Character, char[]> list = new HashMap<Character, char[]>();
//		list.put('2', arr2);
//		list.put('3', arr3);
//		list.put('4', arr4);
//		list.put('5', arr5);
//		list.put('6', arr6);
//		list.put('7', arr7);
//		list.put('8', arr8);
//		list.put('9', arr9);
		
		
						
//		return letterComb(str, list, 0, "", ans);
//	}

//	static List<String> letterComb(String str, HashMap<Character, char[]> list, int i, String comb, List<String> ans)
//	{
//		if(i == str.length())
//		{
//			ans.add(comb);
//			return ans;
//		}
//		for(int j = 0; j < list.get(str.charAt(i)).length; j++)
//		{
//			letterComb(str , list, i + 1, comb + list.get(str.charAt(i))[j], ans);
//		}
//		return ans;
//	}
     
//     ArrayList<String> ans = new ArrayList<String>();
//     if(str.equals(""))
//     {
//         return ans;
//     }
//     
//     char arr2[] = {'a', 'b', 'c'};
//		char arr3[] = {'d', 'e', 'f'};
//		char arr4[] = {'g', 'h', 'i'};
//		char arr5[] = {'j', 'k', 'l'};
//		char arr6[] = {'m', 'n', 'o'};
//		char arr7[] = {'p','q', 'r', 's'};
//		char arr8[] = {'t','u', 'v'};
//		char arr9[] = {'w','x', 'y', 'z'};
//		
//		HashMap<Character, char[]> list = new HashMap<Character, char[]>();
//		list.put('2', arr2);
//		list.put('3', arr3);
//		list.put('4', arr4);
//		list.put('5', arr5);
//		list.put('6', arr6);
//		list.put('7', arr7);
//		list.put('8', arr8);
//		list.put('9', arr9);
//		
//		
//
//		return letterComb(str, list, 0, new StringBuilder(), ans);
//	}
//
//	static ArrayList<String> letterComb(String str, HashMap<Character, char[]> list, int i, StringBuilder comb, ArrayList<String> ans)
//	{
//		if(i == str.length())
//		{
//			ans.add(comb.toString());
//			return ans;
//		}
//		for(int j = 0; j < list.get(str.charAt(i)).length; j++)
//		{
//			letterComb(str , list, i + 1, comb.append(list.get(str.charAt(i))[j]), ans);
//			comb.deleteCharAt(comb.length() - 1);
//		}
//		return ans;
//	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String digits = sc.next();
		
		List<String> list = new ArrayList<String>();
		
		list = findAllCombinations(digits);
		
		System.out.println(list);
		sc.close();
	}

	static List<String> findAllCombinations(String digits)
	{
		ArrayList<String> ans = new ArrayList<String>();
		
		if(digits.length() == 0)
			return ans;
		
		HashMap<Character, String> hash = new HashMap<Character, String>();
		hash.put('0', " ");
		hash.put('1', "");
		hash.put('2', "abc");
		hash.put('3', "def");
		hash.put('4', "ghi");
		hash.put('5', "jkl");
		hash.put('6', "mno");
		hash.put('7', "pqrs");
		hash.put('8', "tuv");
		hash.put('9', "wxyz");
		
		letterComb(new StringBuilder(), digits, 0, hash, ans);
		return ans;
	}
	
	static List<String> letterComb(StringBuilder sb, String digits, int i, HashMap<Character, String> hash, ArrayList<String> ans )
	{
		if(sb.length() == digits.length())
		{
			ans.add(sb.toString());
			return ans;
		}
		
		for(int j = 0; j < hash.get(digits.charAt(i)).length(); j++)
		{
			letterComb(sb.append(hash.get(digits.charAt(i)).charAt(j)), digits, i + 1, hash, ans);
			sb.deleteCharAt(sb.length() - 1);
		}
		
		return ans;
	}
}