#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void choice(int);

int main()
{
	int user, comp;
	//rock paper scisccor
	//0 1 2

	while(1 < 2)
    {
		printf("1. rock \t2. paper\n3. scicsor\t4. end\n");
        printf("Select anything you want:");
		scanf("%d",&user);

		if(user < 1 || user > 4)
        {
			printf("Enter correct choice\n");
            printf("\n");
			continue;
		}

		if(user == 4)
		break;

		printf("player chose ");
		choice(user);

		comp = (rand()%3)+1;
		printf("computer chose ");
		choice(comp);

		user = pow(2,user-1);
		comp = pow(2,comp-1);

		//process
		if(user == comp)
        {
			printf("draw!, try again\n");
            printf("\n");
			continue;
		}
		else
		 {
			if(user+comp != 5)
            {
				if(user > comp)
				   printf("user won!\n");
				else
				   printf("computer won!\n");
            }
            else
			{
				if(user < comp)
                   printf("user won!\n");
				else
				   printf("computer won!\n");
            }
         }
		printf("\n");
	}
	printf("End.\nSee you later:)");
}

void choice(int n)
 {

	switch(n)
    {
		case 1:
			printf("rock\n");
			break;
		case 2:
			printf("paper\n");
			break;
		case 3:
			printf("scissor\n");
			break;
	}

 }