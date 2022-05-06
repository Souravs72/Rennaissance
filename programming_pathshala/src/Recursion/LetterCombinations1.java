package Recursion;

import java.util.*;

public class LetterCombinations1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		List<String> list = new ArrayList<String>();
		
		list = findAllCombinations(str);
		
		System.out.println(list);
		sc.close();
	}

	static List<String> findAllCombinations(String str)
	{
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
     
     ArrayList<String> ans = new ArrayList<String>();
     if(str.equals(""))
     {
         return ans;
     }
     
     char arr2[] = {'a', 'b', 'c'};
		char arr3[] = {'d', 'e', 'f'};
		char arr4[] = {'g', 'h', 'i'};
		char arr5[] = {'j', 'k', 'l'};
		char arr6[] = {'m', 'n', 'o'};
		char arr7[] = {'p','q', 'r', 's'};
		char arr8[] = {'t','u', 'v'};
		char arr9[] = {'w','x', 'y', 'z'};
		
		HashMap<Character, char[]> list = new HashMap<Character, char[]>();
		list.put('2', arr2);
		list.put('3', arr3);
		list.put('4', arr4);
		list.put('5', arr5);
		list.put('6', arr6);
		list.put('7', arr7);
		list.put('8', arr8);
		list.put('9', arr9);
		
		

		return letterComb(str, list, 0, new StringBuilder(), ans);
	}

	static ArrayList<String> letterComb(String str, HashMap<Character, char[]> list, int i, StringBuilder comb, ArrayList<String> ans)
	{
		if(i == str.length())
		{
			ans.add(comb.toString());
			return ans;
		}
		for(int j = 0; j < list.get(str.charAt(i)).length; j++)
		{
			letterComb(str , list, i + 1, comb.append(list.get(str.charAt(i))[j]), ans);
			comb.deleteCharAt(comb.length() - 1);
		}
		return ans;
	}


}