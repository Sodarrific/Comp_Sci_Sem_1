// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int counter = 0;
	char clck;
	cout<<"Put in character"<<endl;
	cin>>clck;
	char eq;
	int num1 = 0;
	int num2 = 0;
	char huh;
	cout<<"Put in number"<<endl;
	cin>>num1;
	cout<<"Put in operation type symbol"<<endl;
	cin>>eq;
	cout<<"Put in number"<<endl;
	cin>>num2;
	if(eq=='+'){
		while(true){
			if(counter==18){
				cout<<endl;
				break;
			}
		cout<<clck;
		counter = counter + 1;
		}
		cout<<clck;
		cout<<"                ";
		cout<<clck<<endl;
		cout<<clck;
		cout<<"    ";
		cout<<num1;
		cout<<eq;
		cout<<num2;
		cout<<" = ";
		cout<<num1 + num2;
		cout<<"    ";
		cout<<clck<<endl;
		cout<<clck;
		cout<<"                ";
		cout<<clck<<endl;
		counter = 0;
		while(true){
			if(counter==18){
				cout<<endl;
				break;
			}
		cout<<clck;
		counter = counter + 1;
		}
	}
	if(eq=='*'){
		while(true){
			if(counter==18){
				cout<<endl;
				break;
			}
		cout<<clck;
		counter = counter + 1;
		}
		cout<<clck;
		cout<<"                ";
		cout<<clck<<endl;
		cout<<clck;
		cout<<"    ";
		cout<<num1;
		cout<<eq;
		cout<<num2;
		cout<<" = ";
		cout<<num1 * num2;
		cout<<"    ";
		cout<<clck<<endl;
		cout<<clck;
		cout<<"                ";
		cout<<clck<<endl;
		counter = 0;
		while(true){
			if(counter==18){
				cout<<endl;
				break;
			}
		cout<<clck;
		counter = counter + 1;
		}
	}
	if(eq=='-'){
		while(true){
			if(counter==18){
				cout<<endl;
				break;
			}
		cout<<clck;
		counter = counter + 1;
		}
		cout<<clck;
		cout<<"                ";
		cout<<clck<<endl;
		cout<<clck;
		cout<<"    ";
		cout<<num1;
		cout<<eq;
		cout<<num2;
		cout<<" = ";
		cout<<num1 - num2;
		cout<<"    ";
		cout<<clck<<endl;
		cout<<clck;
		cout<<"                ";
		cout<<clck<<endl;
		counter = 0;
		while(true){
			if(counter==18){
				cout<<endl;
				break;
			}
		cout<<clck;
		counter = counter + 1;
		}
	}
	if(eq=='/'){
		while(true){
			if(counter==18){
				cout<<endl;
				break;
			}
		cout<<clck;
		counter = counter + 1;
		}
		cout<<clck;
		cout<<"                ";
		cout<<clck<<endl;
		cout<<clck;
		cout<<"    ";
		cout<<num1;
		cout<<eq;
		cout<<num2;
		cout<<" = ";
		cout<<num1 / num2;
		cout<<"    ";
		cout<<clck<<endl;
		cout<<clck;
		cout<<"                ";
		cout<<clck<<endl;
		counter = 0;
		while(true){
			if(counter==18){
				cout<<endl;
				break;
			}
		cout<<clck;
		counter = counter + 1;
		}
	}
	if(eq=='%'){
		while(true){
			if(counter==18){
				cout<<endl;
				break;
			}
		cout<<clck;
		counter = counter + 1;
		}
		cout<<clck;
		cout<<"                ";
		cout<<clck<<endl;
		cout<<clck;
		cout<<"    ";
		cout<<num1;
		cout<<eq;
		cout<<num2;
		cout<<" = ";
		cout<<num1 % num2;
		cout<<"    ";
		cout<<clck<<endl;
		cout<<clck;
		cout<<"                ";
		cout<<clck<<endl;
		counter = 0;
		while(true){
			if(counter==18){
				cout<<endl;
				break;
			}
		cout<<clck;
		counter = counter + 1;
		}
	}

}
