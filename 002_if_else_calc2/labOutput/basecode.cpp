// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
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
		cout<<num1 + num2<<endl;
	}
	if(eq=='*'){
		cout<<num1 * num2<<endl;
	}
	if(eq=='-'){
		cout<<num1 - num2<<endl;
	}
	if(eq=='/'){
		cout<<num1 / num2<<endl;
	}
	if(eq=='%'){
		cout<<num1 % num2<<endl;
	}
	if(eq=='$'){
		cout<<"🤑 GIvE MiE oKrOMer1!"<<endl;
		while(true){
			cin>>huh;
			while(true){
				cout<<"kromer";
				cout<<"Kromer";
				cout<<"kRomer";
				cout<<"krOmer";
				cout<<"kroMer";
				cout<<"kromEr";
				cout<<"kromeR";
				cout<<"KRomer";
				cout<<"kROmer";
				cout<<"krOMer";
				cout<<"KroMer";
				cout<<"krOmeR";
				cout<<"kRomEr";	
			}
		}
	}
	
	

}
