class Valid_Word 
{
    public boolean isValid(String word) 
    {
        int len=word.length();
        word=word.toLowerCase();
        if(len>=3)
        {
            int vowel=0,consonant=0;
            for(int i=0;i<len;i++)
            {
                char ch=word.charAt(i);
                if(Character.isLetter(ch))
                {
                    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                    vowel++;
                    else
                    consonant++;
                }
                else if(ch>=48 && ch<=57){}
                else return false;
            }
            return vowel>0 && consonant>0;
        }
        return false;
    }
}
