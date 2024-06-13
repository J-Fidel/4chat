;userinfo

newRoom = StartNetGame()

If newRoom = 0 Then
	Print "Could not join or start."
	End
EndIf

If newRoom = 1 Then
	Print "Successfully joined the room"
EndIf

If newRoom = 2 Then
	Print "Successfully started the room"
EndIf

uname$ = Input("Username: ")

userID = CreateNetPlayer(uname$)

If userID = 0 Then
    Print "User could not be created."
Else
    Print "User " + uname$ + " was created and given the ID#" + userID
EndIf


c = Input("Color (type R(1),G(2),B(3), or M(4)): ")

Select c

Case 1
col$ = "255,000,000"

Case 2
col$ = "000,255,000"

Case 3
col$ = "000,255,255"

Case 4
col$ = "255,000,255"

End Select

s = Input("Select your PingPak! Default(1), Business(2), or Space(3): ")

Select s
Case 1
sendsound = LoadSound("sounds/default/msgsend.WAV")
recievesound = LoadSound("sounds/default/msgrecieve.WAV")
usrjoinsound = LoadSound("sounds/default/usrjoin.WAV")
Case 2
sendsound = LoadSound("sounds/business/msgsend.WAV")
recievesound = LoadSound("sounds/business/msgrecieve.WAV")
usrjoinsound = LoadSound("sounds/business/usrjoin.WAV")
Case 3
sendsound = LoadSound("sounds/space/msgsend.WAV")
recievesound = LoadSound("sounds/space/msgrecieve.WAV")
usrjoinsound = LoadSound("sounds/space/usrjoin.WAV")
End Select