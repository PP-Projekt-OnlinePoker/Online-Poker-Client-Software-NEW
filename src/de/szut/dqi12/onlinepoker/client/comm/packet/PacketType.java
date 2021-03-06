
package de.szut.dqi12.onlinepoker.client.comm.packet;

public enum PacketType {
	//Tischaktionen
	FOLD,
	BET,
	RAISE,
	CHECK,
	CALL,
	ALLIN,

	GETTABLELIST,

	//Usersystem-Prozess
	LOGIN,
	REGISTER,
	LOGOUT,

	//Tisch
	JOINTABLE,
	CREATETABLE,
	LEAVETABLE,
	STATUS,

	RESPONSE_LOGIN, REGISTER_RESPONSE,
}
