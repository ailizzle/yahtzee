
package yahtzee;

public class Actions
{
    
    int[] diceNumbers = new int[5];
    
    int fullHouseNumberOne;
    int fullHouseNumberTwo;
    
    int ones;
    int twos;
    int threes;
    int fours;
    int fives;
    int sixes;
    int bonus;
    int threeOfAKind;
    int fourOfAKind;
    int fullHouse;
    int smallStraight;
    int largeStraight;
    int chance;
    int yahtzee;
    
    int onesBill;
    int twosBill;
    int threesBill;
    int foursBill;
    int fivesBill;
    int sixesBill;
    int bonusBill;
    int threeOfAKindBill;
    int fourOfAKindBill;
    int fullHouseBill;
    int smallStraightBill;
    int largeStraightBill;
    int chanceBill;
    int yahtzeeBill;
    
    int youOnesFinalCheck = 0;
    int youTwosFinalCheck = 0;
    int youThreesFinalCheck = 0;
    int youFoursFinalCheck = 0;
    int youFivesFinalCheck = 0;
    int youSixesFinalCheck = 0;
    
    int billOnesFinalCheck = 0;
    int billTwosFinalCheck = 0;
    int billThreesFinalCheck = 0;
    int billFoursFinalCheck = 0;
    int billFivesFinalCheck = 0;
    int billSixesFinalCheck = 0;
    
    int youThreeOfAKindFinalCheck = 0;
    int youFourOfAKindFinalCheck = 0;
    int youFullHouseFinalCheck = 0;
    int youSmallStraightFinalCheck = 0;
    int youLargeStraightFinalCheck = 0;
    int youChanceFinalCheck = 0;
    int youYahtzeeFinalCheck = 0;
    
    int billThreeOfAKindFinalCheck = 0;
    int billFourOfAKindFinalCheck = 0;
    int billFullHouseFinalCheck = 0;
    int billSmallStraightFinalCheck = 0;
    int billLargeStraightFinalCheck = 0;
    int billChanceFinalCheck = 0;
    int billYahtzeeFinalCheck = 0;

    public int countOnes()
    {
        if(youOnesFinalCheck == 0)
        {
            int count = 0;
            for(int i = 0; i<diceNumbers.length; i++)
            {
                if(diceNumbers[i] == 0) count+=1;
            }
            return count;  
        }
        else
        {
            return ones;
        }
    }
    public int countOnesBill()
    {
        if(billOnesFinalCheck == 0)
        {
            int count = 0;
            for(int i = 0; i<diceNumbers.length; i++)
            {
                if(diceNumbers[i] == 0) count+=1;
            }
            return count;  
        }
        else
        {
            return ones;
        }
    }
    public int countOnes1()
    {
        int count = 0;
        for(int i = 0; i<diceNumbers.length; i++)
        {
            if(diceNumbers[i] == 0) count+=1;
        }
        return count;
    }
    public int countTwos()
    {
        if(youTwosFinalCheck == 0)
        {
            int count = 0;
            for(int i = 0; i<diceNumbers.length; i++)
            {
                if(diceNumbers[i] == 1) count+=2;
            }
            return count;    
        }
        else
        {
            return twos;
        }
    }
    public int countTwosBill()
    {
        if(billTwosFinalCheck == 0)
        {
            int count = 0;
            for(int i = 0; i<diceNumbers.length; i++)
            {
                if(diceNumbers[i] == 1) count+=2;
            }
            return count;    
        }
        else
        {
            return twos;
        }
    }
    public int countTwos1()
    {
        int count = 0;
        for(int i = 0; i<diceNumbers.length; i++)
        {
            if(diceNumbers[i] == 1) count+=2;
        }
        return count;
    }
    public int countThrees()
    {
        if(youThreesFinalCheck == 0)
        {
            int count = 0;
            for(int i = 0; i<diceNumbers.length; i++)
            {
                if(diceNumbers[i] == 2) count+=3;
            }
            return count;      
        }
        else
        {
            return threes;
        }
    }
    public int countThreesBill()
    {
        if(billThreesFinalCheck == 0)
        {
            int count = 0;
            for(int i = 0; i<diceNumbers.length; i++)
            {
                if(diceNumbers[i] == 2) count+=3;
            }
            return count;      
        }
        else
        {
            return threes;
        }
    }
    public int countThrees1()
    {
        int count = 0;
        for(int i = 0; i<diceNumbers.length; i++)
        {
            if(diceNumbers[i] == 2) count+=3;
        }
        return count;
    }
    public int countFours()
    {
        if(youFoursFinalCheck == 0)
        {
            int count = 0;
            for(int i = 0; i<diceNumbers.length; i++)
            {
                if(diceNumbers[i] == 3) count+=4;
            }
            return count; 
        }
        else
        {
            return fours;
        }
    }
    public int countFoursBill()
    {
        if(billFoursFinalCheck == 0)
        {
            int count = 0;
            for(int i = 0; i<diceNumbers.length; i++)
            {
                if(diceNumbers[i] == 3) count+=4;
            }
            return count; 
        }
        else
        {
            return fours;
        }
    }
    public int countFours1()
    {
        int count = 0;
        for(int i = 0; i<diceNumbers.length; i++)
        {
            if(diceNumbers[i] == 3) count+=4;
        }
        return count;
    }
    public int countFives()
    {
        if(youFivesFinalCheck == 0)
        {
            int count = 0;
            for(int i = 0; i<diceNumbers.length; i++)
            {
                if(diceNumbers[i] == 4) count+=5;
            }
            return count;
        }
        else
        {
            return fives;
        }
    }
    public int countFivesBill()
    {
        if(billFivesFinalCheck == 0)
        {
            int count = 0;
            for(int i = 0; i<diceNumbers.length; i++)
            {
                if(diceNumbers[i] == 4) count+=5;
            }
            return count;
        }
        else
        {
            return fives;
        }
    }
    public int countFives1()
    {
        int count = 0;
        for(int i = 0; i<diceNumbers.length; i++)
        {
            if(diceNumbers[i] == 4) count+=5;
        }
        return count;
    }
    public int countSixes()
    {
        if(youSixesFinalCheck == 0)
        {
            int count = 0;
            for(int i = 0; i<diceNumbers.length; i++)
            {
                if(diceNumbers[i] == 5) count+=6;
            }
            return count;       
        }
        else
        {
            return sixes;
        }
    }
    public int countSixesBill()
    {
        if(billSixesFinalCheck == 0)
        {
            int count = 0;
            for(int i = 0; i<diceNumbers.length; i++)
            {
                if(diceNumbers[i] == 5) count+=6;
            }
            return count;       
        }
        else
        {
            return sixes;
        }
    }
    public int countSixes1()
    {
        int count = 0;
        for(int i = 0; i<diceNumbers.length; i++)
        {
            if(diceNumbers[i] == 5) count+=6;
        }
        return count;
    }
    public boolean checkIfTwoOfAKind()
    {
        if(countOnes1() == 2) 
        {
            fullHouseNumberTwo = 1;
            return true;
        }
        else if(countTwos1() == 4) 
        {
            fullHouseNumberTwo = 2;
            return true;
        }
        else if(countThrees1() == 6) 
        {
            fullHouseNumberTwo = 3;
            return true;
        }
        else if(countFours1() == 8) 
        {
            fullHouseNumberTwo = 4;
            return true;
        }
        else if(countFives1() == 10) 
        {
            fullHouseNumberTwo = 5;
            return true;
        }
        else if(countSixes1() == 12)
        {
            fullHouseNumberTwo = 6;
            return true;
        }
        return false;
    }
    public boolean checkIfThreeOfAKind1()
    {
        if(countOnes1() == 3)
        {
            fullHouseNumberOne = 1;
            return true;
        }
        else if(countTwos1() == 6) 
        {
            fullHouseNumberOne = 2;
            return true;
        }
        else if(countThrees1() == 9) 
        {
            fullHouseNumberOne = 3;
            return true;
        }
        else if(countFours1() == 12) 
        {
            fullHouseNumberOne = 4;
            return true;
        }
        else if(countFives1() == 15) 
        {
            fullHouseNumberOne = 5;
            return true;
        }
        else if(countSixes1() == 18) 
        {
            fullHouseNumberOne = 6;
            return true;
        }
        return false;
    }
    public boolean checkIfThreeOfAKind()
    {
        if(countOnes1() >= 3)
        {
            fullHouseNumberOne = 1;
            return true;
        }
        else if(countTwos1() >= 6) 
        {
            fullHouseNumberOne = 2;
            return true;
        }
        else if(countThrees1() >= 9) 
        {
            fullHouseNumberOne = 3;
            return true;
        }
        else if(countFours1() >= 12) 
        {
            fullHouseNumberOne = 4;
            return true;
        }
        else if(countFives1() >= 15) 
        {
            fullHouseNumberOne = 5;
            return true;
        }
        else if(countSixes1() >= 18) 
        {
            fullHouseNumberOne = 6;
            return true;
        }
        return false;
    }
    public int countThreeOfAKind()
    {
        if(youThreeOfAKindFinalCheck == 0)
        {
            int count = 0;
            if(checkIfThreeOfAKind())
            {
                count = (countOnes1() + countTwos1() + countThrees1() + countFours1() + countFives1() + countSixes1());
            }
            return count;
        }
        else
        {
            return threeOfAKind;
        }
    }    
    public int countThreeOfAKindBill()
    {
        if(billThreeOfAKindFinalCheck == 0)
        {
            int count = 0;
            if(checkIfThreeOfAKind())
            {
                count = (countOnes1() + countTwos1() + countThrees1() + countFours1() + countFives1() + countSixes1());
            }
            return count;
        }
        else
        {
            return threeOfAKindBill;
        }
    }    
    public boolean checkIfFourOfAKind()
    {
        if(countOnes1() >= 4) return true;
        else if(countTwos1() >= 8) return true;
        else if(countThrees1() >= 12) return true;
        else if(countFours1() >= 16) return true;
        else if(countFives1() >= 20) return true;
        else if(countSixes1() >= 24) return true;
        return false;
    }
    public int countFourOfAKind()
    {
        if(youFourOfAKindFinalCheck == 0)
        {
            int count = 0;
            if(checkIfFourOfAKind())
            {
                count = (countOnes1() + countTwos1() + countThrees1() + countFours1() + countFives1() + countSixes1());
            }
            return count;
        }
        else
        {
            return fourOfAKind;
        }
    }
    public int countFourOfAKindBill()
    {
        if(billFourOfAKindFinalCheck == 0)
        {
            int count = 0;
            if(checkIfFourOfAKind())
            {
                count = (countOnes1() + countTwos1() + countThrees1() + countFours1() + countFives1() + countSixes1());
            }
            return count;
        }
        else
        {
            return fourOfAKindBill;
        }
    }
    public boolean checkIfFullHouse()
    {
        return (checkIfTwoOfAKind() && checkIfThreeOfAKind1() && (fullHouseNumberOne != fullHouseNumberTwo));
    }
    public int countFullHouse()
    {
        if(youFullHouseFinalCheck == 0)
        {
            if(checkIfFullHouse()) return 25;
            return 0;
        }
        else
        {
            return fullHouse;
        }
    }
    public int countFullHouseBill()
    {
        if(billFullHouseFinalCheck == 0)
        {
            if(checkIfFullHouse()) return 25;
            return 0;
        }
        else
        {
            return fullHouseBill;
        }
    }
    public boolean checkIfSmallStraight()
    {
        if(countOnes1() >= 1 && countTwos1() >= 1 && countThrees1() >= 1 && countFours1() >= 1) return true;
        else if(countTwos1() >= 1 && countThrees1() >= 1 && countFours1() >= 1 && countFives1() >= 1) return true;
        else if(countThrees1() >= 1 && countFours1() >= 1 && countFives1() >= 1 && countSixes1() >= 1) return true;
        return false;
    }
    public boolean checkIfLargeStraight()
    {
        if(countOnes1() >= 1 && countTwos1() >= 1 && countThrees1() >= 1 && countFours1() >= 1 && countFives1() >= 1) return true;
        else if(countTwos1() >= 1 && countThrees1() >= 1 && countFours1() >= 1 && countFives1() >= 1 && countSixes1() >= 1) return true;
        return false;
    }
    public int countLargeStraight()
    {
        if(youLargeStraightFinalCheck == 0)
        {
            if(checkIfLargeStraight()) return 40;
            return 0;
        }
        else
        {
            return largeStraight;
        }
    }
    public int countLargeStraightBill()
    {
        if(billLargeStraightFinalCheck == 0)
        {
            if(checkIfLargeStraight()) return 40;
            return 0;
        }
        else
        {
            return largeStraightBill;
        }
    }
    public int countSmallStraight()
    {
        if(youSmallStraightFinalCheck == 0)
        {
            if(checkIfSmallStraight()) return 30;
            return 0;
        }
        else
        {
            return smallStraight;
        }
    }
    public int countSmallStraightBill()
    {
        if(billSmallStraightFinalCheck == 0)
        {
            if(checkIfSmallStraight()) return 30;
            return 0;
        }
        else
        {
            return smallStraightBill;
        }
    }
    public int countChance()
    {
        if(youChanceFinalCheck == 0)
        {
            return (countOnes1() + countTwos1() + countThrees1() + countFours1() + countFives1() + countSixes1());
        }
        else
        {
            return chance;
        }
    }
    public int countChanceBill()
    {
        if(billChanceFinalCheck == 0)
        {
            return (countOnes1() + countTwos1() + countThrees1() + countFours1() + countFives1() + countSixes1());
        }
        else
        {
            return chanceBill;
        }
    }
    public boolean checkIfYahtzee()
    {
        if(countOnes1() == 5) return true;
        else if(countTwos1() == 10) return true;
        else if(countThrees1() == 15) return true;
        else if(countFours1() == 20) return true;
        else if(countFives1() == 25) return true;
        else if(countSixes1() == 30) return true;
        return false;
    }
    public int countYahtzee()
    {
        if(youYahtzeeFinalCheck == 0)
        {
            if(checkIfYahtzee()) return 50;
            return 0;
        }
        else
        {
            return yahtzee;
        }
    }  
    public int countYahtzeeBill()
    {
        if(billYahtzeeFinalCheck == 0)
        {
            if(checkIfYahtzee()) return 50;
            return 0;
        }
        else
        {
            return yahtzeeBill;
        }
    }  
    public void bonus()
    {
        if(calculateSum() >= 63) bonus = 35;
        else bonus = 0;
    } 
    public int calculateSum()
    {
        return ones + twos + threes + fours + fives + sixes;
    }
    public int calculateBonus()
    {
        return bonus;
    }
    public int calculateSumOfBottom()
    {
        return threeOfAKind + fourOfAKind + fullHouse + smallStraight + largeStraight + chance + yahtzee;
    } 
    public int findFinalScore()
    {
        return calculateSum() + calculateSumOfBottom();
    }
    public void bonusBill()
    {
        if(calculateSumBill() >= 63) bonusBill = 35;
        else bonusBill = 0;
    } 
    public int calculateSumBill()
    {
        return onesBill + twosBill + threesBill + foursBill + fivesBill + sixesBill;
    }
    public int calculateBonusBill()
    {
        return bonusBill;
    }
    public int calculateSumOfBottomBill()
    {
        return threeOfAKindBill + fourOfAKindBill + fullHouseBill + smallStraightBill + largeStraightBill + chanceBill + yahtzeeBill;
    } 
    public int findFinalScoreBill()
    {
        return calculateSumBill() + calculateSumOfBottomBill();
    }
}
