// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char symb;
	int amou;
	char vhd;
	int pos1;
	int pos2 = 5;
	int count = 0;
	cout<<"Enter symbol: ";
	cin>>symb;
	cout<<"Enter amount in number: ";
	cin>>amou;
	cout<<"Enter if v, h, or d: ";
	cin>>vhd;
	if(vhd=='v'){
		while(true){
			cout<<symb<<endl;
			count = count + 1;
			if(count==amou){
				break;
			}
		}
	}
	if(vhd=='h'){
		while(true){
			cout<<symb;
			count = count + 1;
			if(count==amou){
				break;
			}
		}
	}
	if(vhd=='d'){
		while(true){
			pos1 = pos1 + 1;
			pos2 = pos2 + 1;
			gotoxy(pos1, pos2);
			cout<<symb<<endl;
			count = count + 1;
			if(count==amou){
				break;
			}
		}
	}

}
