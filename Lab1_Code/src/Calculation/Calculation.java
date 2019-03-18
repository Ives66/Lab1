package Calculation;

import java.util.*;

public class Calculation {
    private int coins[]={50,20,5,5,1,1,1};
    private boolean dfs(Stack <Integer>state,int remains)
    {
        boolean flag=false;
        if(remains==0)
        {
            flag=true;
        }

        int pos=state.peek();
        System.out.println(state+" "+remains);
        for(int i=pos+1;i<coins.length;i++)
        {
            if(flag)
            {
                break;
            }
            Stack <Integer>state2=(Stack<Integer>)state.clone();
            if(remains-coins[i]>=0)
            {
                state2.push(i);
                flag=dfs(state2,remains-coins[i]);
            }

        }

        state.pop();
        return flag;
    }

    public boolean isFound(int x)
    {
        boolean is=false;
        for(int i=0;i<coins.length;i++)
        {
            Stack<Integer> state=new Stack<>();
            state.push(i);
            System.out.println("stack: " + state);
            boolean flag=dfs(state,x-coins[i]);
            if(flag)
            {
                is=true;
                break;
            }
        }
        System.out.println(is);
        return is;
    }

}
