def isFactorial(n) : 
    i = 1; 
    while(True) : 
          
        if (n % i == 0) : 
            n //= i; 
              
        else : 
            break;  
              
        i += 1; 
  
    if (n == 1) : 
        return True;  
      
    else : 
        return False;  
  
if __name__ == "__main__" :  
    n=int(input())
    ans = isFactorial(n);  
      
    if (ans == 1) : 
        print("Yes");  
  
    else : 
        print("No");  
  