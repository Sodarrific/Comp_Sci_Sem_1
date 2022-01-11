// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char symb;
	int amou;
	char vhd;
	int startx = 0;
	int starty = 0;
	cout<<"Start X"<<endl;
	cin>>startx;
	cout<<"Start Y"<<endl;
	cin>>starty;
	int pos1 = 0 + startx;
	int pos2 = 10 + starty;
	int count = 0;
	
	cout<<"Enter symbol: "<<endl;
	cin>>symb;
	cout<<"Enter amount in number: "<<endl;
	cin>>amou;
	cout<<"Enter if v, h, or d: "<<endl;
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
