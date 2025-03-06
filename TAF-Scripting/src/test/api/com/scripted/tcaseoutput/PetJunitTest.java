package com.scripted.tcaseoutput;


import org.junit.Test;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

import io.restassured.http.Header;
import io.restassured.response.Response;

import org.cornutum.tcases.openapi.test.ResponseValidator;

import org.hamcrest.Matcher;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PetJunitTest {

    private ResponseValidator responseValidator = new ResponseValidator( getClass());

    @Test
    public void postPet_BodyDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[],\"name\":\"OmRT5(*F}_b2M}8DC?=w&lI});x{\\\"!?<P:)N\\\"zWip@j4Dl$j}nNQ}$aH\\\\Y5a,/i)]X<Y^OM\\\"EgL'lMxC|V/KmBA1X_WFf3RyeVd(M4T.6+^a%-SY]n+5dc0?B9'[1l{ Xn15};-j[@eqj<NOWE)1x4N72M+Y~qCe[~ibOdYs.\",\"id\":-3467548234785993233,\"category\":{},\"tags\":[],\"status\":\"available\",\"yiczic\":{}}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyMediaType_Is_ApplicationXml() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[],\"name\":\"5uFe1F+/h5t|M+J1AQ#[-Ob=&CYhnjwdD$P~afqZ7RMRd{yL/-<doP:,2Y:CD!n$ZD^lQ&?Fz\\\"',Wp-r=lamwSrvlLF=C;mr5m>+f.nxp71~4! c#*!EE[D>>s2FDkkrBpv&.8Q`!8NJOJ^?Nxe{F-\",\"id\":-1803295407916610763,\"category\":{},\"tags\":[],\"status\":\"available\",\"svsqognheakxzg\":[]}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesIdDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"F&'@y5zg`An#D?k[HE4YWY`/M@\\\\=<^K%<x?doDxHhK$wemsaGp|@vDiuil\\\"}y+&;#n-%r}_fK$0&&;d4!b(:Z&cfpU+]Il[s5WAJh=%teZ*!>A9c+Mq9.mRk-q{}VnV%$2+6+(Gw7Z>{(3DBaAoz;2(2 +V(aOv6Sf2:&t.gKt]i_nG\\\\c_QMn1A,Cznzt.2s11xERQf\"],\"name\":\"\"}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"Zj8NisZBS~s-H(ogZb\\\\FK'ggr/pM6oKSHT =@5l Uc8gx0OUl44YU7W*%,]@1llw^gHd1.dLTANwaA8_&CGjQY|jxhDdiA:\\\"t\\\"RB&Pow@gDurb!bP5[kz#p2sGP-&j!*MyaX;gD-\",\"ydQ$5E>|`)V\\\\J}m8!0,+&6!VA8wCGZGM=%8yUY-kO9?BJ*X&%^FKW-^.}@f+kgg+fLV~V?do{0bouGzRg>1GtJ\"],\"name\":\"8'(o&YHvQ{a)r%NI*|.Ot^(VEa4|a~YaT\\\\63H\\\"lJV|`^BO+'cIdRer]f/IkxVOgvp8Ki,mFnzP5BTe#CFJI$$A4q~+{3b^U00sU<dP?G$N/T/fsS@V.\",\"id\":0,\"category\":{\"name\":\"t{K1W^ce4#QYa+g9+i-XayIX1OVD`pG5(X[iuy4mIs?B#I`e:\\\"XmEP'x m5b*5d@'G@gGbc?<cW<kkHK`3[V1LlV2!p!@:LEkf0s\\\\SN[s}]')FV~nH0SwOL#K#{g``TYrq#$!J}/g;joW`p^H*GP@q?ko0>j5f\",\"id\":-2055514741169816164,\"qbbhpltfy\":748.0,\"myyherrf\":{\"shx\":[\"PO+-0R}\",\"I3\"],\"dxhetstcwyrcdlb\":641},\"mqjcnizre\":[]},\"tags\":[{}],\"status\":\"pending\",\"oroy\":\"j~/T\",\"ontcocultfrlzath\":118.0}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[],\"name\":\"\",\"id\":1967315823172121104}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesCategoryValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"vyP;VX;PmS=]c!v\\\"GaK]Z\\\"~!12AEzqm[d7(`</uN/avg<Qs r!YosR>XC`2S/u.K2*iq69oZ'FiRfFgO),yf[7%SM2L[ZnpK>W,MJu_4Ldtkn]OAseK)kzBc\"],\"name\":\"e8w5!BE=0_2wsqVUp9PuW[?xngCXTmBNK\\\" 'lD:bjR+G|/f}N\\\\p4YQcrc:%/eE\\\"J(KU)db#c;vH},xue<OdSgFWBrU]v=0_.(HXxOJ#Ns)czU-P-JzL9|u\\\\bn70v((2BWd4sHD(Y~\",\"category\":{\"id\":0},\"tags\":[{\"name\":\"R]wcu4{i4Fo7}xCJjXV74F^)A/YGb40>~nll$]M5=$v-.*5%g.{S%EN<\\\"JU4/L)8?@Yx!Cg]LKWe%NX{(my6&;_^e]=\\\" /0[GexJI?Y5{(oK17Zagpu/m^xqzZtdi3aI$RL,>k%K8\\\\%5Lws@Vr!i7AA})9<<c3m!)Hegz2a{AMmcm2+7\",\"id\":-3414469207923125425,\"ybxhlfdjn\":-492,\"nzxolhlth\":\"]S7M$9#\"},{\"name\":\";bw8j3=E8Hx}\\\\C@lxK\\\\MA3:-6r<~t>3S^x]5W!dCtDTC=M o5vdAFJ DCfqel1x{`nO*HQI@iip]2V,>U*Fj(moLsF3>-xg8L?ZZzt 29Uk?b`WiN e$/HS:jnX{I0_q#AD,hhcA}It%BzJ>;m?D;M(dXuVq#,ga2H79WI2HfbYjv#V7ZL+ jGBoKw%:H9EfJbYpAEJ5*@R1~n-m1~ZH6tSlC7Qd+ +Nek$'Hs<\\\"w0%/t {C\\\\4pmgVU7:V-*:r,\",\"id\":-855903008494472377,\"gvhb\":{\"ydlddkumsdhs\":625.9},\"k\":{\"ukskitstowmte\":893,\"aqblxx\":[\"w\"]}},{\"name\":\"~nRFfGmOAt99kk?ACa7y]z)jP*T$r 5.bMl}\",\"id\":-402962821746065063,\"nbevwqk\":true,\"qtk\":-914.5},{\"name\":\"?QJDP|V(X>;(U~+Gy1gl%,xE_-ilim /@,vH=D_bG8@tf:i`[Nuq~e<:#1B-H@>tzyg,o+ M!9KwJs!6;rs&j0]7_jxpm\\\\hiw~;},wnb86K\",\"id\":-3506321550766203770,\"bysgot\":817,\"hxkupgesqt\":734.1}],\"status\":\"sold\",\"bplugiqxm\":\"Ud+}1(\",\"nkhjafwdhbg\":\"^5ED+\"}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesCategoryValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"Uw'MRD!zEFm\\\\D_]~~{5?S|jw4z4O7Yrun*#95zJ2Y\\\"G{~Q2p1{l<wsl_QzlhR3d'JZ~HKc=l!~F8_\\\\s) @uh3e7NB,1{<IF-((SVHZ?H}jUIqwdDIk@:mps;?%*6tZqWK ^VdDKECYoJL-kK8P#$WeK_<AZI-9B~hELDYPT9zcC93T\",\"mqV\\\"]*Z1|%eue]sB daT)ACA;!>tvJ/D*f/B${EOyp$@r78Z;2=9<$l:.fN+l#b^~sABH@P<hLF-]!G<lb?pWvsM uCZ&\\\\53a2Zc\",\"0s0F;77]XNMb+yJHR;]L6xe{abMoYn(,$w7]+J5P6o\\\\}Rap\\\"o];z3^zQOx[<>49^Vq!AJ\\\\hdtnE46|D}ycO05b.;@Og|ZT\\\"ABnh6v*n06jLdj$4Cs0;f]5P*z<WvsIMDF9y#/A v[s`kF4% 3b\\\\0{24//lS\",\":l.=D:=(p*VS(d$^)h'\\\"|E^]j8fqjy:XLT\\\\v-?gToVvU~FR;Xs>UDQ{N\\\"w6BQzLq~=k$1W$ar#FX+$9|QEO 8XqIx%(T3bEU{@LE0p=}Ciy88`KXaS{p8cV6FqcgIkI1&f2Ee1:CG`eP}Z3*UN2g0QoDqWc.sKIv K# ~xN+5^[|9Ga7nxYp_+,/b43NC(/LEv?aNLyu[p0%0=\",\"N,BY >`2X7j3slJD'sAtw#Pze}2d3Cc gqM9|j&L ~SOo=c?4pby<\\\\'Li@|DP[u.\\\\.B{ l(d=oj\",\"2r0I#=4S8UiK(i!;t9Dxv&RiDr{Vm5`6>iZ`!Leap:1nDyX<?eEH@i$uch~/$J]'AFL;I2P}Vx,9Z9_Go[Fgd&Dfu&x_ge\\\\:hPX\",\"CEo{.8@|_m]?QF7)Kc2%p33;2[*mh,w7.U<rB)!wgpjh-:mD 6&Xxa~_]2r z2b#KTH>s`@4yS,,{c'^>m3.@j2\\\"f2hL1&G5}}E:v5P$Lvmi1AYxk~otuI(_TMh0CHTqM|)r1=BC&#\\\"F>;V!={d)wK&.@4BwX0y,`(#TQaVg8RR]O!3nd]I#V9l$q5A`.p(oU#]2mbMMU7R0]Ug@\",\"2r0I#=4S8UiK(i!;t9Dxv&RiDr{Vm5`6>iZ`!Leap:1nDyX<?eEH@i$uch~/$J]'AFL;I2P}Vx,9Z9_Go[Fgd&Dfu&x_ge\\\\:hPX\",\"!/%sH#47y@zYhyGF<0w>FNXDmvZ%0Bn}l]:j80eP?pY\\\\@}kywkyE\\\"HeV6|[)5T}FN (J9O='-IGz->[H{|3~5~Fa00~P iY\\\\8(_|bPg;U%XT-,*<y{q&#^.iwd-]2zS\\\\8+|$6tNX)6JpCEXI)^C>=ZhQzX{'hose*CpV>z!\",\",)eSN$I;82}.^CfefvDtB z2cWoHE84w UlrisfUqnd-*N>U;~w8r*3`d:!p4@lL}H6^H`9K0U%4byBK-;=W9HCPqQ`s*skypqJ-?Bpk? %8h~p*f@#-KaL'1^UR[[l34gdNF8wUt (F}>MP9H\\\\zL7Ps+l*a`\\\"\\\\*\\\\G,o((o2'N3}BVK~1(7GU\\\\\\\\UKx`)/KPAL1'SKd;[L \\\"wzWkI}fm9z4}v&h2!W:iL?CUCS(,hMe<m,lY>StHx\",\"D@oSP!ZJI8,E+.@N$kn<\",\"gL66he \"],\"name\":\"\",\"id\":-3913260866411425199,\"category\":{\"name\":\"\",\"id\":1114883674313220799,\"blhkbplbnsbwdyk\":{\"rzetyidjssiomb\":[\"W#\",\"F\",\"hz9s,v*g\"],\"jydouuzkdbfq\":391,\"eeppthbpuw\":121},\"xyakulfzuwy\":true}}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesTagsItemsContainsValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[],\"name\":\"50Yns4WolZY*TJ`~)K[HB);COF]p|7oT]tfKC*,){; P/g!r!,U3pRCKpx/RO^8w%YhNXHB%[H[4cqn~LHISac>y_zGwnO4r4\\\\X[A[bXhO7d;w9.6X*LiKW'I@c&m|_AqJ|)yi8CkD0-l;DSoyrS}@>66P5W(N!d<#@\\\"w~*emu|wR(,r}@\",\"tags\":[{\"id\":0}],\"status\":\"available\",\"tyzxnraepaxgl\":273.1}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesTagsItemsContainsValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"PFjF-uBU!RMBJ[InrI&nWbL1<C'P\\\"q Rk25V6.7kR n_\\\"V03oFC[W^:\\\\nG=e^fffE.b1abD~xc!]z_=V?J03F`tM[k1$wtBaimKS:lA<(0ZQ?6KE!\\\"]##6*DZOP.<848poQREB q\\\"n^hW^/KjK~bS}W`#.IQy1UCTV]}4U=m#pg`3N}m8Q;Sx*v#B@1ewSyZ\\\"&EBxm_[i$]]V'uQ\\\"5WW@?{kt^8H`wh4|}`q|^#Tltb7oc6&IIhFc)Ype\"],\"name\":\"\",\"id\":0,\"category\":{\"name\":\"x?VA':K$BhT'7N/RXk>Hl/\\\"@u(6J?'5;UIrDI^%Vb9ntp&E=Y\\\"A)WUAKCMw#m2xUuiP)o\\\"LAEGQ/ozOgFzZei<xv/2Toj=%05TJuxY+^fb;5<WWSl{O<%`*A/$a)0`M^]l_;8n\\\\Y8[/F4%'b,7R7Lg6<e<A$`Kv[#[{)`!+oZ A>2=vR+9WaTe]/&/WC<X|4Ea?ytxJ%t8Q|$X@VjV~[{j3JoEi\\\"=@Q!N7y+\"},\"tags\":[{\"name\":\"\",\"id\":2008751394281893125,\"ffyrymnpsrknuse\":true},{\"name\":\"\",\"id\":2008751394281893125,\"ffyrymnpsrknuse\":true}]}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesIdDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\" `O33qMnCs$;?$fmo8D^qXcL<*}~an.RUh)ZH)PGa8X&tYM;2n@7S*:9\\\\0}G1p7q}XoMY~LijcR5tNypA5,% 7nd}KPlcUPqMN6D*d2EIX8;Z*;:9s,\"],\"name\":\"\"}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"7KAayxfhvNCfOD0xkp%f.sV6(8?Ihh5\\\"G] }ZW)se_bo70rG`S$,7z'N]]]NP4%,w.Pvzn*LLJ?ojiQ_i\\\\OUr})XEk_CPr-4.\\\\B31~y\\\"2jn1JeT(+(vXkO7JQM|-x4V9;\\\\@!A#JxW:*m{^&TBWp %J+}Tg\\\" K}/W3TfQ\\\"2J^Ot'$cQNiqYjniQ_/KUQ$&w[ZZ\\\"}Ax03u<z4&t#>MRI)@Eh*v,$?BE}0X[s]k\",\"T5W\\\\}y>,9OP0o-EWw1PG`tNHrdY\\\\)h&t]V6>\\\\\\\\Nx2)]@x[CT7K8O+.i_0?l?{e>sN53Bd_3E!Ptvj}t\",\"-kQhi{a@m:O,'O:5G/m6{z_u#Ny)h||Mtbf(:2~H\\\"P~%%,9{UMpD.De6;W2x$Sx?L%9LT*=Qoh bakRz/tpXy4|Qkn>PuL^h_Uz>lY{klcUW\\\":kcpaQ.|g@BdM|_^ercglLq(TWKC-vmXfLtB$8ScRQ*y\",\"+:}JR,nlT>r%,Ih u,svoAXHUhWI(?T<\\\\{[GBN\"],\"name\":\".m8('0fuR!.ye|G!`dOsJL?&![[CLHB\",\"id\":0,\"category\":{\"name\":\"lhH/QzZ@92 yEb?3/0~wFIk|Q_8Z8ft>T\\\"6jtbr4&6*2c.v+DB?r%XJW_zU~~<D;k{>;d_juzj\\\\r#M_1z=g#i0+|-SpsQqw-9Znv{>'q-4cDE(k*mBGbr.[%i3tf0}[s~k\\\"rW9S9}zSD3&xn}otGiW!/2Xg<H'Nk2\\\\<#-`el^dC:21Wj9(Gs<vZ@Wgvpzy[)D6`J6rN&0 %^}%3Yo\\\"d+~u_?MA1#M`#dSv_k2mG@{n]%f]I(\\\\>f\\\\1PXD=yuz8Rl\\\"\",\"id\":-839509525397662291,\"kqmokfhv\":[\"=J|[M\"]},\"tags\":[{}],\"status\":\"pending\",\"qbpytvmcxrblmkk\":true}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[],\"name\":\"\",\"id\":550046567497382732}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesCategoryValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"uC8B)_T>ew>sm>yEmFqlNcz_%m+W6O\\\\}*F/,?\"],\"name\":\"xwc%e-NX=ev!L5;$(DC8ozWI]K8lc0\\\\kltgX3|-Wq(J4(e=3\\\"-f`B8~XqFrE:e>[=u7EEMKo-{)B94y3;dXD%0vu`qM>}%*Z?NS38$tY7<\\\"\\\"*hV4B|tn' pvG}]x,5,OWzys;*FF1,'`.\",\"category\":{\"id\":0},\"tags\":[{\"name\":\";k`rijPM4PBi'(-I`Eq,YX~/8Eck*UQ\\\\KuGALydENdcH\\\\#&aJBP6V:JdDK?>.lx>Z*_*Q[}}g #\",\"id\":-2775192800398960507,\"htu\":\">V *\",\"odfrzk\":\"H'hy\",\"kmfrpnobpnttqt\":187},{\"name\":\"SPir>]zGR3-EfvXnQ(/L 3PLf=)(lSwa~qrpu>O\\\"ul^)hX/(JH\\\"9+(Y<U'n@);7A6$Rq,a7N&[zW; lXdPq!z(@\\\".gTCxz:G|2^#|(7}%igpnP/OSDt6._;vQ/[<x|\\\\(F]2u-~v[%o4raNS!f+q]UX~|nh~]I)`h_F\\\">Ja1Mt2*R)y2<4)YMd(e`y?]D|@sP!bW&'o9|%Yg.Im<fisqXO$o#E=G$0\",\"id\":-884605399023071775,\"ekuaconlo\":91},{\"name\":\"Tirc;^T#mj,lw(V7},K}wj&~;g/\",\"id\":-749499063792701327,\"xahga\":\"lal]pR#x\",\"jomjgtynn\":{}},{\"name\":\"bVw8OAUiJ 4[H$XL_f9IhhI(`qyk2oro8:D2s/_G4MX*xVYyRxlj 3gx\\\\8a'x?%dOgq?rPApQoK<=F*A>%uO<E]7)\",\"id\":-722052159918683590,\"xynvrmhorwwqpya\":[],\"izuku\":42},{\"name\":\"5}n0\\\\Eey!n09uZ[SquxT_XB7BXsD'YbDn`]z'gtRQsvQmg7aDK0IEpybC%k;A@?LfeXtX9LNyfiizs']8U&S^!Mx6RQb)^\\\"P_\",\"id\":-179931735559913483,\"ghsvskbucmixn\":true,\"vlkuiatfazsrzt\":-637.1,\"guuk\":[\"?xC7-\"]},{\"name\":\"uE50j\\\"WJu`PvSF:Ea=j{isIEA.O\\\"ocC,JmK#f\\\\v02k^<+5=]M8\\\\sb*\\\\2gu;bR#NSj,UT`[N-d-{rbf~H%o}U\\\\N1EVc8I1)_u6\",\"id\":-3888046869055536692,\"niumpj\":-796,\"pfxdcvuxcqytqij\":215.5,\"lfv\":true},{\"name\":\"aY^;{aYrYRr XPBPsd\",\"id\":-4185317063611227387,\"se\":-366,\"ul\":true,\"gbo\":\"N1a7c.\"},{\"name\":\"{[bGC1eE\\\"VRLk*ORFJI!~zda~__*KcIYaJ]ub=i$6R}bU]f9s:#u&ruLlaL>1d^FJgX/ gN\\\\\",\"id\":-1542760299376183023,\"qtnbzoyid\":\">fM\"},{\"name\":\"B8yuemJ/]FdsY=I%Dfp8GRf'B 8_IY(}<vH|6*2aa5`cf*o}h,@(A:mp)vWCOpRe!\\\\{g2k}O~b^lbo,:}z#Oh3lD,>!'Vo)uWf?J<KEL T5@tMZB.+Z5PCLs`Nkn7O5W%oX'h^3J~=}D8uJ*q~Jl<[ 4Y^%;M'(9i&| kB6wR3b!;!MR~1KO}f+2qTfZ2L;[;}Kly/{O7Q#kxf%SuD`p#_sc\",\"id\":-4116712621359441154,\"iljtzxyp\":\">\\\\uxu&gC\"},{\"name\":\"dV*(DXt9K7AJ9F^_|hg4JeIdO&=G>ud&o4b\\\"\\\"sA6nl$wh&Uonca6\",\"id\":-727937809593385580,\"jfy\":true,\"tuxhgcshk\":true},{\"name\":\"8Q0wcc?3mit.&+JjM{jN@S'9!AZ:dEmKiu+`wkkL:?$b.~oz5%+(WKEI6S7;\\\\3iGqZzkV|}%rfI_T>3do1'\",\"id\":-2859281896349511583,\"m\":{\"ttfntkvfz\":612.0,\"afwbrmlyqsypfnjp\":true},\"ed\":{\"eotiksprpfm\":\"/nl8Q\"},\"fstozolsqvb\":true}],\"status\":\"sold\",\"bzratvbrlk\":\"9.ch\",\"vhixgoczuy\":\"SSO/\\\"S)\",\"smyajgtsvowrrqxu\":[\"'\",\"%.\\\"X\\\"Mc~\",\"Xs<0\"]}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesCategoryValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"@5'?q+8%j~#@\",\"'Wi^ie?OH}'-B[*x=xD\\\"E!+&{AZ'3Bm,\\\\pAa:MC-!E>qxu1DiSo&QY,Yga_sVU04vh(@(!@?6l2>R8`CvLCN/qaA$j=1L{}bQ\\\"d>$C7V\",\"\\\\kB`P5'b_n-QUv[Qm=|dpuP#FE:A'gv$p(W$5gqmVyajpb%UIe8w{tb:(@F/:Vtw%m\",\"\\\\bl3s<,Z$F!($k5hT/.<`#8^Y2<_&0\\\\v]41ySKmgfhSUmOWIP/^^i>Xl6FKUqU49dtE@c#Lg]+{R?[woz\\\"=D67m%Qaet7\",\"\\\\kB`P5'b_n-QUv[Qm=|dpuP#FE:A'gv$p(W$5gqmVyajpb%UIe8w{tb:(@F/:Vtw%m\"],\"name\":\"\",\"id\":-1834330708316771126,\"category\":{\"name\":\"\",\"id\":671623527359774726,\"kfzig\":\"Y\"}}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesTagsItemsContainsValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[],\"name\":\"0.p^_2UY;Ir1[S}B/vhRf:n#1)IEX';A]4c3/;BJGZ!u\\\"M<&4^-+$MOS/,F4.E$L:0LzQr#CL$\\\\C<kT[%![jU7?l~>-[`w%z[g=WRPyzMIr$F 8XCcadqEzpX9(\\\\e<Ia&4 O<X;,$~+7r6eZ\",\"tags\":[{\"id\":0}],\"status\":\"available\",\"fcwfim\":113.6,\"ouiuzvpzt\":686.8,\"zmsqvuyc\":550}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesTagsItemsContainsValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"G#?YE?}<T 2qf] ma5vnD_*i*';-m~G+F]Atygq`mikM\"],\"name\":\"\",\"id\":0,\"category\":{\"name\":\"uZ6=,6jMR>-Jl>o)zfTY'U5lo6`9*S{,j/W%]e|I*T28#\"},\"tags\":[{\"name\":\"\",\"id\":800029308069727550,\"dj\":true},{\"name\":\"\",\"id\":1164841666032389715,\"mme\":{\"y\":[\"irgmo\",\"!B\"],\"kwmpubteaxrb\":-133.0,\"bjmzzrbybm\":-968.1},\"yuooukbbrw\":{\"igyiovcfvwrsvenb\":\"@YpJygK\",\"suhsvy\":\"Iis\"},\"gavqgbu\":true},{\"name\":\"\",\"id\":219597040015772082,\"dxgyngdqn\":{\"qmtohtisvkbropx\":626},\"nqt\":[\"\",\"0Sl\"]},{\"name\":\"\",\"id\":1592998961475691859,\"sxjyjuqvxzayej\":{\"tkamxdpu\":\"wN\"}},{\"name\":\"\",\"id\":219597040015772082,\"dxgyngdqn\":{\"qmtohtisvkbropx\":626},\"nqt\":[\"\",\"0Sl\"]},{\"name\":\"\",\"id\":3596284317945975457,\"nnpw\":[\"g\",\"!~']M\"],\"zlvuozf\":\"!bW0gPg\"},{\"name\":\"\",\"id\":3289787866245588121,\"stfc\":[]},{\"name\":\"\",\"id\":2570258827341697954,\"uvunkiruonxfoy\":[]}]}")
            .when()
                .request( "POST", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyMediaType_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "text/xml")
                .request().body( "[\"^V>X=nL'\",\"I2:\\\"|\",\"sNQzi\"]")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.Media-Type=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "null")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "-825.9")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"#KCs&/YZCE+sdlO)6J-o4k>.N^a(&]Kn\\\\Q1sVD=g*jP\\\",_3 EPJVn8,E\\\\!dWve; t.&8q3Xe$jid0,+FM#ui;,nz7f\",\"[HY*s@5ae>:(hsH} R=Lj5erUsj*d]#=WZIy/+\",\"u6A;S<}Ao2l\\\".OBPC'iIxV'@\\\"0gg]neW:o-$k%|bM.W<F-|DYYaL3{K:Qsz^`>FVrT0MiH?=,<`ZILb]Ui M~Gi!zaa'Ks!sA/Z)(M{IHO7BAl9Ao7mL8v@8-\\\\58g:QjL-xC\\\\yRkF_@524Nh>$H^C0\\\\pOoYj*Wnf}2@9q?kkJNr^:ZDKMuuVqdT'=2%d.O;cn&&: 3|>qDvDS)I2\",\"wzg$|cAe>3|dVq8o$y.qcPk!-. 3.SLK/tTs1)f!Xf71.<_]fS-eqO[_F N_yiivy~bk1Q}]9c}8{Y)%;XFjM9nT|j(APnc3by~W$Y+CUOfDl<[s41;XsJC* DT *?h)ZMc;kZgDw*hGO[:rH&#4|OS\\\\c-B}OxYA ;'Bd`rQ?K+V%:28#oa1$ShJS5,t\",\"%aQC4YYs}9&dj_B=NSc8'w;J\\\\r]J:e.d^kw$N5M,5f<>0t1WXZD%F8@PPXZV?f,6F i^FX!S,[:>.?1gVb[}kL7H^NG00m N+!?9p*G':+~@:+gGI:hcCoWS[<_' 79@L;69\\\\s}il+T;!|-[j_drW DO9AN:B7~7l{)i?jt=`r1sL4}\",\">5G<-](p^cuxZ]Y@dEm}q$8v\\\\cGZQ[XCW*\\\"{)].8%O-RIId'1UN#*?u]d1!_YcR2?2AzLxS_kOdh%:!Oi-+Yi(]&Q~7n'7a{> \\\\=I6o[%1-8?<[[;9[=;G,G,.iR==]dxPl,%(VaK;F|hcC!]'jf>FE{X>t#v5lVkyw&|qt,T@A\\\\5ZC~y{X!!VS~.#IX?2Q(^d0?CF:QKtPx]\",\"r8wY=Jo<Vw+<z`8xvuz#26a-*p v{PH2!7`].QB%8!62nD g7a_y[~)%!15cs\\\\jZ)ZR.Ui\\\\Jx?!C\\\"pPuB;'f@5T7i5= X%nemnNq3/5Y[3D~[ao2o%b']]*5L0nMl?[YfCL~AZwuiu8bE\\\\'qXax@8>ah~PN`\\\"7%L~UE{/SS(`~SC-)Fr_{/[3HSOw6?;J`>q*u&cFkr >dzJ_\\\"u?i5J1aLz3Ix3\\\\fu_[)\",\"ZvqhiR_*F{gNlBtTb8\\\\aI\",\"p*QcG}K.O'(]BUo!},&&6da+j`E^:?Q:;gyI5`[L'bO+EVe6#Y'6%wc7Jzf=J!zDfihDrYZQ'-fs@$;LK0$}5D(QCQU\\\"yh5$Aw5d `.;;~BnL ?H8qg:zPGn{rOt[8lg\\\"W\",\"ZG|~DeC%$<?.5:t3XL%ICcituB{VVWd4zJpW~$Vr5puzwc)`B>2O>Az\\\"[|+}:]-QNkD9^YZF{87HKVGm8%%DV|j1LtkK][d2-?._M,jDT9(q$] 3'St2!&UpKzhL~4q#y>G[Y@CUp(3)&}dh{a_,cLRhPUKkwx  !}I5lmBoX.P! fmQU\",\"Za!8k>|GkX 7D+>|@C&)sWR5>!=z1?Z`^R/Ze^'G}^!bmw:S,X-r%O;6qr:V*!-<ByyTcyF%?7vm_!-G+5,C_F%xdW^5vC\",\"%Gt(_ib1$dKB[{IEQYy;&aUpf(f?L_V~^aN6ct+fWUl+6f+zK)SgH,.QZ@\"],\"name\":\"nRbNDt~R,4>BrW0^h-1s-TF42le0]?e0jmnL3]$k-w6{.aEaX:J_YjZ$o^^?(OO+;dprYjc&w7c1:I 9Wq\\\"N#Q}y$\",\"id\":null,\"status\":\"pending\",\"xajsvkvxowljee\":{\"uwqqqnysdoqm\":true,\"eopmeqj\":-191.3,\"fqnxhq\":540},\"otwpytswqbrquyy\":{\"z\":[]},\"txfemmozkxlufub\":-209}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"g_XuMi&yv%P8`;6K>i/Ktijo9;O$E(B5>Grd3kX1aT{I+%{5@%eUqbd3}X?m0mBI-aRc\\\\j</RB1E&^2p7\",\"#m\\\"3m5s@mn4E_V\\\"9S>Q&+Z}fu+\\\\r#l^FxyNBN9R4jd^Z\\\";9HqJy[s5YH[YFe)pNp'26?(fjwe_.&Y-#0-a#<`ydA@~nBbB-+]jtC=?PR\"],\"name\":\"IFWAoVXkhSV*3G.7w12WR5b6A5+<e'Bs7lU/8.v4]9$-zola;C|%m+HUZ)[Zlke,&e#c6y+$75l>&OgqK02b;^` fsI67N,lc+p.Ds$dLHL|g~K{j*=M=|}:APc=_n6eWC>7Dx-9unyoPuG%IC<NrGkm=\\\"6d(wLFyy+^I`M4x[a4qdU1~l6{XPvEHSKk}MBEdoct;HfL@R7#]?$Mr# 3'!Y:^#TJY8UtG4wN\",\"id\":[\"\\\"`v\\\"\"],\"status\":\"pending\",\"yavsr\":780.0}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesCategoryType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"hM*Be~;9Y%X+qEMNueP|q?'`v\",\".4\\\\9rL/D#Db2=d!,+J .#:;j\\\"r&7}Hi/G ]y~w3xZgP*g,c1qaNdQkwHUj8?AFtTfLfI|O!k&'Dc22Pp^: }rZJWfV(fJers/By-4*25)S9Z4S?cApfL_`EPZc9+\\\"L;pweKDd6j^iXJGoUdW?!?OJ)d`>MXe*<? _)o7mK2fg\\\"!!\"],\"name\":\"7^_YNk^Fs2xa1}[9_IJp0m7{4xO!VBrZ4T99] ZC{9E=bj+JMp~@;'FX+Ud?'6;pzZ}0I+A:){Rj5&Egs<n-J2&4#?q&{yKc6\\\\mCWK>fg}3?D/Lus|F1l\",\"category\":null,\"status\":\"pending\",\"hqomuzmqbsoy\":true,\"fmakki\":566,\"knedubzho\":true}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.category.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesCategoryType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"!peT` CjD{U,wS#9\\\\Y(x[>lq\\\\njQgyI;`XKsyAw63HpI^)%{TV`<P8+]f#c6{_bxiTs2<xI[^I6.4NgEA/Uin0MZ3S <8gFu>9sRa*`&woDsfdjhkS$2XJ[ x@#\\\\2(gSk2V?}zaal?MLVmEULgVxj\",\",:)ws)bq9|R#%cai#CfU39|5^m}!CDL7))Zyt.`B\\\\;b#zJ{|t49SS*:snr%c:@CtXpOG<rSZiX)F3!-YYRGJQ8,4cvY/fO?#&Z $*T$Az-xVR>H/%(7yki44$%'@?33>oo`J~m  `6td2PWzacXmrfHl|NC&~5yC&JDf=5;[C'P3F9Ex$#n}QJv`Oe>4#lh)8Y-B'+V5gqs|0X<u4#)!hx'R,'RbzGQ'-|s`JXSq,5B Jg]Bl}%w}\",\"C86Qw'p>J@aT!/m&puJ9v!$eJ[QlUJXf\\\\$\\\">`$USt)3%#TE7Mg3s@no#:OPk_nncl?n4c`mIEv~tp\\\"Yy`xlc0!Rr$PP;HX-UrG%XXM`/k 8c\",\"`yeY$@:?LiUtC\",\".IDa$'-v&3-!BokbAE<KwJ/L_U( ]`4,-fKV#^;,gZ3Z}WT/\\\\.pm-/sbo^DTzroio\\\\@x8`fjJX<)&JF-Knc1Dbyy Q37@r**kq.e@Jd>5k\",\"Nt{R7S[?:Rv<A`^?_gw!K~itq\\\"qY@t.]A{;KPh*sT>\\\"/D,{H\\\\S:w_SfqQNZmW'}&3C>fe )9TyP/C=eQN7t]cyOT|?+@#|Z\\\"x<YaTXrv%'wD2{i0M]\\\\\\\\#;%u_3C2urERN/rRf8Y0|?hz&O1owNq#T$#~d8\\\\k\\\\$</%Y7N*csHG<N863v-e!L_I($1hLc}<!*z*%E8AfPrt(\\\\M=^|KMU@~9~?W*HL)HWtu$Yyo3fkak;e40\",\"V|hrJ74U1n=*gd\\\\=8BX#(4z5AGKLp';,zR?>!1Z~*Z#>IFR6z+{yDS:3$5 6SQ#mx_Q']$CnH)En*'5[!LtrgPluP[f\\\\MaV 3I- @Pze]9K?aH]xG[!fmhbEr5+5b8wGWc|XL7&8E<7/r\\\"y}9EL>!l%,9M3Q.^/ boRRj'!(-N(Z<TnBKFjpY_E ~q+|:};>p&]Q6Ah<5W=3P:7q}znV*Idq%!LLmB%m+D7R|&PL J0\"],\"name\":\"-&dEL#6lUF{S!.+82--/loV7m%.L*4Gw6l+ZWcgiRe%n7IuPdGnC+F61G28&mjhw)dx<TZ4bg=pE\",\"category\":[\"--\",\"ev#\"],\"status\":\"pending\",\"uxjhwwazn\":[],\"u\":\"@|\",\"iqbnbqgafyybab\":874}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.category.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesCategoryValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"i-_c9I=fYsO'VMGnb;2B'K4-M(]Z6I9_J;n6U<T2z\\\"4|@rU'y/M?&bo({9`<Owt=nrIdBFqddegqdV.dw@HaBh*iNj!U1Uk0ZM\\\"27BEl7a`e8=CI^PAf}$=!@m~n9Fyd8SDeu>a:BBH$[aDOB\\\"M}x7W0X8usAiN0Ku}e*<cJSK9m>Ur8Z-Gbgx/qil7iusDL'6_GjG/i_SVOvD\",\"B%q<YCjN-H_:tEdJZ?^ft4W*\\\"ZaMT{*>:hvPoWIN}^%9M!nt84M]6!Q)65xmf[m[CsJ-[yi +V_&q^pF%D1ZL_8Q}D!'1d+7$2r,N4s:o_LM'H9X`/OD9lV18G!%.V.9||2m1>aAW,jsl9 v[&FaLH'OhMt@QKFdnP\\\\Y2bmyJ,]c\\\";l|SGZJibSk27.S!K}:@0h_p-O#*|Ay%&w`4K#>pZZ}<\\\\Y739~F)(xxmJ[f)7?k kC8@a1m]5YkB&wv(G.\",\"7//2\\\\%c89r8<e?L:yD/@Cmv~\",\"KC=f$UE&(<7R^'kS+KqV{xd8f<7IcS0%jXz*[[1f?bOst*d*JN&r;G ^&:h%r4wuH%.BrHxY888<yPkhG-=ndWjq94l*1?)\\\"<,! [wjm=`ZW5VCWSIM2.>$.l$WAUvd&@P{\\\\/WS@9E8_|jjro6b^*nin!gIvj/~p%(?c2?tTJdDvz.kNbh8\",\"0gy|=(*4$!lxRdN^W3D$+;yCw!3G;e3Q\\\"4B*8)<D6KA<*$u$;|9%s&#'KGIO2@B_F^.:X.%a%PS |\\\"x3[&m\",\"$i)iI*7dqw Tx}x(V]fafF.~#'@}@S[>?Go4d)TWzWxW{0'&t?PMd/of}V\\\\Y!Z6e6Oi'[jCk[;6a!A_6SB~GlI*3Ui4~Xk#VrS:ikamD~wA$BC O5tS0<Z!Sqh<*sv8RGnQ6Qb,z}%q7;Y3j.6m)iDg.\\\"#Lk6`7Y-pm$TxqAqTf'E\\\\lccqZ+YYxP Z8GP0vG{_}NN.3Jvd0cQn4!$wX_5@\\\"1Ma65xUKfUCmvaj@NeL^Drw<YMC_;,L@\",\" X-W/5=k#\\\"k{INkKv%+X_Oc5JlTEf>}_PgX]Ri3T/suwp<!|-g|]!VE)\\\\p&Wt UcOBa~:SUl57XWC@+4g'9t9p~_c=A} _sa$U1 /.pD6B%T<-AP_ x7b2&Ski097E@-R+vjj2d'!(A:DT/at]jAOmVvv*bt.65?bX>xF>ZVYT\",\"`G(vB9,u\\\">n|K9:lb3^rrz~G/gC4@1T$Bc~~whiiN ~U; .Vp(6Tqk$}BvccCp&xTjta78D\\\\]_Df88VC4_qECBm~[9qRrWH63vu[EY\\\"a<G%'|VH9xZwtdF$R{v6!o)DDOMEoq6eST+FDaR#gY16Q+!qSY^)hV%GS*k4,s:!Cof&)XhI(F({#!\\\"yA>\\\\mR,iB2\\\\JlW5e!T/!p{\\\"-#o0j}Kh.D*+^%(gkHOHxKz/aDk@E]F}R9x\",\" \\\\L$hvn}(ZWyci%\\\"/DLk@/m-QJ>uSP'z?cigEc;(@tfsb3Y5 CBR!%YG j,BtqYPBf7?d[Xy~(kAPK)ep+a0\\\"p.,GtX*hDX2`f'vc3n=^3yn9saN$^CyY:WX!/qE\"],\"name\":\"F^]Y.EXk]%C2WrRA9:TL!xzd{0PEs/!/fu!S/Bd<\\\"IFw=N'H@MQ#wf\\\"iaN}}im'|0B{E;4D6?yN &zIOX_b=B%e7x4[F[iS%EjO:R0H{R}Au%{N{5Fck]Ee8iqN_jY/+H#U?A5C6lZg%0ykiyHz\\\\+]H9f&0HM AvqOc.UNPKMhbZC|{f_]9'.krAFcbnCbW5YHN|#vd\",\"category\":{\"id\":null,\"hrd\":766,\"ibbxkdghnnauek\":true},\"status\":\"pending\",\"c\":-550,\"xpr\":[\"\"]}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.category.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesCategoryValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"f!khzXPmjy.pvjnlDhEMydn%<=aA92x(-8$)hVrDxL 4jIOFSWBTH{h,cmL^7[>j4uqwa84z6:CvuJ&nNaZw%:h>j0T  3F&[FY5iG9T0E#65{%*x/fT \\\"xz^)$SrG?JF9=Bz7A$[1|G&ay'?Bpx%*rkx#hFfz2_kfU[wbux2Eht4|\\\"Io?zkkYfJ'\",\"JJ2:*@$TAw}]nT|=N&DT2X@.KBW3eHot:(oFkxl5xNS;/dy\\\"_>jVwYIAo]+j 4)'/6=&CX9zMqp\\\\r oZm[=Ibc9:\\\\FVSmk}a<Xs378sWjR3HKOqmmMD{60B/;+?E-,\\\\lR\\\"OH:jvrduSe2qQ7.Bh/oG\",\"dDG]qP0Y_\\\"('2<F[kjJH0m-T)xY~OAW7(\"],\"name\":\"bLDAxKlhnw~a}7EBP7{u~y{^\\\\]jgN 1k5K\\\"Sup='bqeAaF?:Q/5':~<fb:Bzt8dAF{MT]WhQgc\",\"category\":{\"id\":true,\"rxncizfkngar\":-1016},\"status\":\"pending\",\"ebpows\":25,\"crzsjirysrryqh\":\",\",\"sx\":\"Z9(Q}\"}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.category.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesCategoryValuePropertiesNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"6aN;c&uPb'|y5F;dm:/'KSG}C0B^d!'Oqf8wUkPIJ@Ro)bj)EkU[?RgP5}]'L^@^cx?IP 8*\\\"<YptZ7dr_E0 uLF51fR%US&cG&N{hd{]1_KjBd\\\\d[Ha-;wKqB5(3hnN[3RjQ0P0^]M#}Bl45?A*j@e8pa{w 8`ANt?1Rx\",\"S9E78M0Oz=&Fb\\\"y}WP{Gu~s8oXlC:PslQQpT&TiHpv\",\"(ruf}hJM_T</YXD?1}jhYGJuyM>INR\\\"U|V];$)tf^p\\\"~5r7Z<tu5D~Ri7!~Fb\\\"J'e9=O\\\\&<64%s2V\\\"6*Da\\\\uDA? JvCgg~ vs_\\\\Ucxgf+9kK HO%}|+nP$E[Q{}.W'=x{h~>Q{:s&9okBhXDTK,kj@AJg78r^6={]^-$::V8X(<.IfjatHI8j*7:o;PZGHI%kzScVv\\\"YvirB[:%aXWr#9V-V[B*l;G,#uenMb^Hpley8]t+_-KzJF^pv^{=@\",\"K4_;}]\\\"<G%g=XNDae~C8O#XdQ.uBIz+X`n2UybwI 4 WG:o6li{JD _*.hru+Bq,yfa-T=^fPDFBK:HMp2L%wJdma3rfA|fFWi;](iuz'i\\\\p??'N6g,GmG9jU*s vxHcU&bgimQRX5P!`Virl(PVHxM00[tDPM]yBoPfI;bo6r/=IkO3H{,*}X0&h.<s`MO'iyL>ZCaBD\\\"0$/}r~a..R9(9|`-H)gd%Dl]|M,qw*1\",\"Um?$O=G7XfF08G[UxI*1uZl^=IBdQUFZJwciN+p9Cv/,y`bhihT5b}uj W;4D\\\\=J~]Nj8-8-'l[d?/|Yb %P|+2A3^Z)V'>wiFSp`NizS<su`@3wT0T;btN:}g, ,s\\\"*><R;Ycm1 :Xjk*\\\"q~G,\\\"4'\\\"8\\\\]'HKDwFEn)WHisx5\\\\@PT\\\\'tzL0T#|;C+(Plw'Jc3@yxRFSE6.h-C|nde|&Mhm+L4-*v\",\"5sHE~tC+61&g\\\"ac-h@^dGh9(.tk}\\\\IRO9=a*exeSXe~R6v>2iLwNwpDb*pf}d(N;rO1X8-x^j?KAv%&Ns4ZyF[8WSR\\\\_D2|t}3I% h<c,f3d6y?xOeFlxM;x{XjU6P\\\"&?lO}w}>K\\\\p_DS*n#Ro|\\\\0T\\\\WHI?g(?W}vj:t<t.K;rqVn}qO\\\"p4n3T\\\")X5U~}\\\\D+0Z7/RBl#ucN~L+S@m]\\\"k@X<-x&#*o:d>}qQ^qot'dxKVMk2`It':9bArk+$:`8\"],\"name\":\"^7J`>}*9TaxZkd.UDwf~[P\\\"4NB.~<Ozj8PkrJb|.'$h.-yJ38@a]Fc\\\\sFO{~p@j>\",\"category\":{\"name\":null,\"id\":-1877167181794430967,\"uzkuuezuoutpaob\":\"OC@6L5Qo\",\"egmo\":\"-Ui3;\",\"yinmnyjqga\":\"}/*K>:V\"},\"status\":\"pending\",\"cls\":[\"\",\"8i5;U9HC\",\"j6dFd\"],\"bixgkorc\":-900}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.category.Value.Properties.name.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesCategoryValuePropertiesNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"WYl$'RNG4/y-{J*VMm$poxTE~-UKU\\\\U-9Dhw}_'(pz:qfJV3E1Dh`>ehcg8u+sL+8:y,um5@9S\",\"\\\"2}<X+{)i3yr8.{~Og\\\\\\\\Md0!d5;XDy+<0it}I^]sM@U>FVIFTY2eU|'Af0(mFuH^D+QX,>v y\\\"T\\\"g(\\\"-=eVnRPYdP-,)3i:,~B=^)>723\\\\&S.!$*>7]Lrs!wg/-b<k7GR~tJ877'N~-u&d{gW\\\\EhrbL<O/~8rNkk%nZa=%p>;9t%Oy/9C;BLT\",\".#/M.}\\\"_i7|ShtH=+7{76p,(fh4~_umQV?Sx5B8p-P_:5O7`nC!kvB%~Kc#H\\\"qZ5HbY2j.jz6U3v`lw[q+=W47[Blx7,2?y**ZB!9_6e>1bHH3vR*[_rj, j}z\\\"(v?Fe@XhA*@Q/A%:c^L*|BnGb-wiYO,YdS]X>an7Q `SSE]TTMVeEf:S*5J8:)(Vrm8Jb:ea><CC\",\"#yyH 9>q eMqzqsG\\\\WSh+*yd'Cc7d}G!MgrqZ4r8J hxOJAQB$;9_P\\\"<aq\\\\2#Uc,nzi|;nYp[o2^c+d<`Wm4ACqn]J_n%{=._4qc\\\\{<hj&jt*46az3`O^|:8|ahEd5\\\";0nxkP0(1{jP9=:FUJ*ok,jVi[8[VH=w^MwRi2M]L~RT~nzM#-jQq\",\"%H[\\\"qSQA,J'Bl]Zt86h\\\"oER6e=I#9*9Ld0\\\"4iDe>#36DSKU,7joomS]t-Zi.6~}Q]>#aV$h5D6I9oW5>pr\\\"*T%kqUV< <r@ZQJM6=^,FU.Yi;V,6U(s~<TGWJ}5z*\",\"_>z*{r'gxA:hTlLjb^\",\"hRi%2^PCIAc\",\"7W%2.a^sCm?:>.rqO6{0Oq)`,@i<E<zj+a3.D\\\\Dv8IZ|N9+IL[g]\\\"F*/j#Jd/G(i<\",\"+r=Nh4f78#x]?y\",\"7aVR3yhn=36Y:(\\\"8)ZX;e`di~gWFgb-Y!.KT;EEdKCPzxFzWEY lbJ[zJ,=tCTMI('>Ro|A4!E+CY|%AW1(2e''7o}GVIrp*hgB^FwT2vkdIKQzl4mCK:SPwQj0V0ec;Zjk=XjeZUItN?Zc!2.T\",\".{s;4G])x\",\"Mt3{#%zr lA8F| 9bnYZbmVbgJ]cs;.o~er3u#}= ]'H5H8($N7tbnMcJyu9# lzIc-`\\\"'[vwG~#{`45Qjp+:\\\"jIg?hWAQC*?/)jM%-guCemw\\\\w]tx]s@ b3c{*p|opIuY]6c%dO/qXs[2z<egd+|vt-455XDhoJYoL6J\\\\%DeD!7}r>kve~VKyzA[3t{o.4A|5qcf/l{n1/=.B1DL8P?>F^zo$zQOJoJ`O[HW$8gjQ%CV%>/o\\\"`v\"],\"name\":\"{O-mA,hTB>|fh<GA*T9dnQjsA%5s>o>70q.FFUJcAI?.pu!Ip()[;NCEuw{\\\"TPhr+cF[`[S4nVZexs[:_!XELfN|g$TC^84HRxC-c2Msk'N|]@eIQ:5'9F.H>+=rp*tB{nb7UVnT?XVP;v^olad0j4}hCvW67R0WP]q9kimzZ|qWSKd43W%%y\",\"category\":{\"name\":-91,\"id\":-4299796013215945008,\"jqayngcl\":522.2,\"nzviyiwzqh\":[]},\"status\":\"pending\",\"v\":-440,\"npyyi\":408,\"svbalzxgv\":[\"[?M|lAx\",\"<h7\"]}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.category.Value.Properties.name.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesNameDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"O5\\\\5Wa3Y4uAX*1mot-jlUp.y5\\\"*\\\\H>z0\\\"9zz|9hy@WWNG~\\\\*rt1LaSn+ZuOY_z*D~+|_ds=1QwR 'RY{/(vEtwZJ0Lp1I;?j/OI\\\"l_Yq<hNoH5]p\\\\Odn5v_\",\"2yif+YuW=]ln_IjwMao2_EWbu*MyaZrGvn'Yi}__*.PatO;E]5Gx#KcOjU0Hi>_k{\\\\\\\\%L0b$I86BEuS<0NSv^^*A6~ilTX.Z{7FEBK-$,mRdX{>4u@8x9hCh@~rMI[kG`[dFw`d)j8$/,Nz<m^7.=?I]!h~j5VqczXden(Q*`k<ie83,s;$pw1C\",\"ae/r1Lli:l4h'a5e^>.zRl%LUz_wT*R<m2p-qg|[:\\\\3[Z%LzCTglG(\\\"6g\\\"{E)%e93@s,C^}UdM@D5p)\\\\H')rx~RI5?{|}NWP)H7JN)?ZHqn<7b,Pd8}[Aqh+9>4NP.x[L<i>mFuUg 3e1uxtl?~R%wPHRn 8G#O!c~L8uNN)}*kf%Ep'JTIa1\\\\SG<%SWOcT,Ww]@\\\\'OA==`<,S\\\"=?$O#[ 'GDs6}K$s{Yh3NU:FGW!\\\\M\\\"@4X_o\"],\"status\":\"pending\",\"p\":true,\"byoupufkaytf\":\"di2]y/\"}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.name.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"m.}=VjgW([QEQU3$ao\\\\MLt{!{7\\\")ij%BurJL*kYJH0DjqV Ti<]B^YZ^!f>Z6Ax*83<W!z3NBn@!+~iDuarvuvK:NyIfx3\\\\d@AC!FWA#0,]IFX%_~Ey,M@#,+yx?<u<_05^wvvtB'D:H=Rn~'=B.Od$4sIoA|bb@I#%!.o=3DR%$KOMIi_N4WlQ-~MGi^eSg7WC7X;f/p su%njN$8S!7v4Yb7b{2F,H>-EO}tLp~nPfDu[,<v(\",\"7Y>;P2S\\\\Z/TxImuLaoa_86\\\\.U^80wXo}ZM)Ce5Dsb!Z?\\\\QHR7 zTPv@4R1jC?VE@Vk'E>JJHLz+]!mPchSqC?Duu%i,@:%JyBUsprc|):Eu0G~Iq]X;!I8&aYa!rZ57N|'w&$uGTUF+M:%HQ<MtC*aQ|-[asIX.J@(ae+m\\\"vJz]\\\\f#:H&j>~XO{D(r@>cXccvZLx~{C,x!<}v\"],\"name\":null,\"status\":\"pending\",\"ehlgihovahuyjf\":257.1,\"olwes\":-42.0,\"tnewfuucawh\":{\"oqlztcyak\":694,\"ajxfpjnlqd\":true}}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.name.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"!Pf/KKN15u3dX3 d~-sst~\\\\k;aa|U%)J0]{:.\",\"x#Y)=d(8lo;K\\\\bzLkS}6t*(7G@.N1QDzJAq3n[Kn.Wsk/|D=a2As-[^L\\\\_EK53;.h16W!~uKm9t`^FjdICdB+r\\\"cZ~OJn`HtAefxD?`ko&UZ&CpJaH\\\"X:hM.TX~43mO~/ ~6o,;f_@\\\\-3\\\"%SH\",\"?HhC}Fj 9IwxnHc+(Pfsf9 ;V9D[oqX\\\"+a@@I+vdu&w5.}{)TK>iR&Cow+LD^xFcn}<[{.L{E/emr;(|ap&ZJyaxxE\\\\1hnC{rg~JW6Jhc(39\\\"21Cfk28IbX5cSF)U<x.mGP?U3)co86_HT<p_aRLx@M{'^F[%_xaR@-8FSG8t>}6PHd7d)4 [<[CeyF]V=OV,0[z6[7^.O\",\"=MGw~@L_:D#h=;z2GQ~0(p{NP0BpF$qK*1ow=0PqCd$~*HON|\",\"?)WtO*zu8;RAO!p.\\\\}NELEKRZq0~-!\\\\cGFy+di{*/ ${U NG;y%!1{T-MtAHVD#J^tYj&L#ND7BwD4wSZfy?#sno1X8gQ$2xKtD\\\"|q>:4&(=Cn_O?dexVf)Z|?<1:H)WN<2DF`+G3pX.&31RQ'L2%7tJt&X',f-<Vg{6IR';k.xzh6kq(y!ef!}b$}yo>+R,v-\\\",|5!;3iPyJ^muqdo?{m%&/g0rh^:u[1Iv>\\\":]C\",\"I>JuW[nB-K0^|gEtmC:FlH)?\\\\$&(|%tL)2(w_ez3djS4E4HX6fkCwQO^HXp<ZyVyl78`\\\"12>|zW<}o`q ,ygf[f=n5@Jb7ah`Ay?0*,HZMRDMQxmV#Xk8>!eb4 #ZlRV,hT:AJNffc>Ks1$X@.r#pJ\\\"\",\"t,=#LIG*BCP'{ma1M/nxSo'A1]y?E(t]<dXVMMIg`PC^Uv1vguEWfmN\\\\$JL\",\"?$JaUMAFn.Hl<\\\\0&HXVD)'[glf_2,Jty:@HoG?9CV9XEyxP&_8d B]Z^ZAjx8k|hh5/sq%[_rjZd[HlIkTjq>@7v:,dDcQ\\\\n6(mmyg@2xe51O5.&p~mI?c*oX B@:Ly[SpE^F2\\\\@`\\\"3wz;Ni!``/s3RWJN*ta<'hEJ9Al}2?'S'dU-@$ ]G~AzsW,1ddQRo1:ZA(ayhd'1*#/8k/Sfj{1t<j\",\"c.y.@}Ggs{h({X@,/n{4B2aboSPern[Ekx\",\"C#$b]n'P%2+uO47>-Hrw[ZW,O=IJyy[L,c%7#E[SnqTN-51t\\\\Yp'~r|N\\\\Krf7<O#\\\\xkL'mq9L5[t8SNQ0e>,[9yq>NMlb\\\"]({Ci3@8xA]9:+SmX]dn4WwJKD&#M\",\"ze.[d`pzD/P<nGT7xRHH:7`qjl73,cE$L`PnF+i/OSWw-&Ig70'LhfEL~dobbt*4u$M{cZtTuXG>@6r?1nd2p/v/#'GV0Ph'jVxbVJ65&RAbszXjDQ@Rk9sEiMhoHGNCZ_2V+4Y0Na8kGNB_U<PQ`k\"],\"name\":true,\"status\":\"pending\",\"ozesliwepp\":339,\"ozfs\":{\"oxnqplavi\":true,\"jrnolkoqofqodra\":68.1}}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.name.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesPhotoUrlsDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"name\":\"bFmWfo|5D.zSOaFZMQdWx;vT7L`mq!e9o8(X)-#gR*MMf;@l}lG\\\\,SnkzyNEQ(rh)&BAh=IAgYJ$H[b q/ __ 8p*>+lM0V}VH05?=\\\\\\\"w(}%v:5Z[\",\"status\":\"pending\",\"wk\":416.2}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.photoUrls.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesPhotoUrlsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":null,\"name\":\"\\\\'~Cm'\\\\7hu.}e3\\\"c~*I#*h1.7hA\",\"status\":\"pending\",\"myknunsrahzkjqei\":[\"6![\",\"v?@/\",\"<]\"],\"zid\":true,\"kuudstokkyekcjg\":\"Y!SP'\"}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.photoUrls.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesPhotoUrlsType_Is_NotArray() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":-176,\"name\":\"=B]BT)tkzCPBJXG<Q8<c4-o}0soG]J:THgik5u)WIHt\\\\G$G*t2Is1o)zYk\\\\,N<Ji='e6t4yx/_&3&p,\",\"status\":\"pending\",\"bfh\":\"N|&EnYk\",\"shpczvpm\":[]}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.photoUrls.Type=Not array
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesPhotoUrlsItemsContainsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[null,\"C[S>^@\\\"HO<J,\",\"'&yN|<U5&%lEH__\\\"tmHp5#&i<Y;:9o9_Y[caRZ <&>;rg;pg#EUqbx75?a;,ot<z]e+)!VW>\\\"19CXC44v\\\"!uDIOE&om1Q\\\\y\\\"A7fZLG,fD@k;`t}>RFTi-|K))Q%qqj-j|Cs{H! W@O#ThK&QYTIk>\\\"C[k+%WR./EmC#WvR/)4@mFz,5v'M4c!qw{Dv5~7WHpfg,+PXD8OoXkf5 2(a\\\"?@V+9P?#g%Knee/ML\",\"[17Qu5i~Lc;R\\\":wCz]W7:A$\\\\S[,'0K/iau~pB8gRI{|*b clz,bI=rqUa PR)$` dTX44u^{0,A{QcN9at2IwAZsE-ftf'kF{hW\",\",b%%zgwj/WkU1OtM&\\\\gjVf4u#-s]$UUYHc,)VMs\\\\nF\",\"BM%6,]kv%@F!NVTDb.>7$%BW'Y4x*vyy|q/8UquX3G@7\\\"1c,Ue3|\",\"A-=j%e)*$T_I%V;o|hT/2hD@ONz9N,l&ZS=U8=:5ywZdaDBxmo#? nkL}3!Qu7ypC}~A{6k[%V8Im;GsZKEj(&48dZAhpW^+X3{{TrYHfP^CQ9(iRQQC(aKp<2JhtRgx\\\\A0lxuNf+}i[loEUk`m5p},X5ndZb?Bs0^C))'w!f|Mc>Ts{:[x\\\"ydKAr]/6#TAs\",\"m;%H$#;o%8+OMh3W\\\"*aF\\\"5}`$~EwH)W/v`zrl)]7txp`\\\"OLxo7x=Oh!(4(0<.^7)$@%Z-0E(#hE<xGmIg9~UO {IX v$;d[a^(4vb=j.dos?M\\\\?o?j_9KmNp ;^FoS?O>S]0*o*jAhHhq+e'Ho%j&&<\\\"TQ)XLmft:h:4h2V`IJ]2e5T1jLsu\",\"6ww<pw+\",\"Zr]ax/sS _/4L`[)s[lE-Al([(Ogta#y6c!AuMu(ZiGQJ{:2\\\\u?|HgS1#>4wF8~It<s0QgsP\\\\m{HnjWfWhLvm_`VLYYJ;QABTB]*&WX%G%I&xY?5Iz^ZfR|#`ia;Aos_ilh.EQ_H&Y\",\"N3{k^$RU+I0s9/iJ#1cX!4dFC+L1;_J+Eq:06}PWE[X8&wL&G%2:OI+[+P>y*1#J{j8'@=w[]Pfv#W\\\\;(}O%MK@VS_*TOy>TWS(z]f6e3^K:uC:D\",\"PIM=@%9o'C0?VLsy~E gm}i~QIx:E<^Htw,!u-F1\",\"p%$\\\"$tTgonHOBCpOE/1l?'9vC>kxso8}[kF2hxtCSV^YUbne;f\\\"2{\\\\#226k!1$D?kM/]bG'K3fJ%,DNQfA*-.~1!)_Df5~>_t:tu49r>ki.e1[lK>,lU1V<Wcvp;wMi;P2!o34MYCr^ye}/,9HBJY+;$^|Y[}OCyS!3\\\\+gVR1n8xRo4G|4+WZ`Vt.Af%Z*L 5\\\\C~Ae\",\"9pM~a80\\\\itfB=e\\\"se-&-FyYJS;]NU4f:Co6+kO*SX?*uFfHtzq(u8%tb8`u:tW$JxK)qtF~7qKjr1{&fTo1QFn:5BEZgWn;5_RJ)iUoFv=2TGnV!pHx h9M!;{[?&Pw5@e#\\\\3_YL<)6DYWAX=rJymY+jIsw<,a(2Z+FBe+n`q=yl-Z~[8c/cS',X_y7NL>Ut~VhfcRw5rArOgVJ]zk/=_4&%h90=\",\"h{91qmNY/}%Pjj<uG@y2erKV,(|uID.HM&6Xd|OK?.q20(`64tHSi}FR$m~j7|z5HHz;31aVVYROUPn?M7Jn8voQu}Wy@DJRnqY(8ZaNu&}^RB/;e:+^YZc9;wc]z66DfbZvSPk|z]LptK[RPWgnAWu,:n:..Q_9tU[YRC,Vvp\\\"|o6BpBA_kLKz'wp'433[L>j`fgs#\\\"NB[9$\\\\(\\\"P.+M8zoB/y@=Vg*E9k0 .\"],\"name\":\"V#s$IL!9~=IZdHNxCZ_S2v.;WOzq!b-PIAA*eN18;@%9gjL3{AE;B<dS--ShbA7=br1yr-ZP/=zu6^yKstG!i$\\\"UZR~vK(\\\\*/-$[}(?DKU07a{9Vyyx(gB 3C ,LDh-/\\\\z\\\\jo_2#{f$Gmx2DbQQ8uAI+.XSiRaA?P/100>S\\\"#PO>dy%v <@P><!!;7mk-Q+ Moij?c$o( Bv|2TV%DrMzdM\\\"=}B$iL\\\"@XITFSHd7HZUXbNb8yk@n'Dg;zYt6C\\\\\",\"status\":\"pending\",\"zbspqmwgmtoscuyz\":625.1,\"c\":-184.0}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.photoUrls.Items.Contains.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesPhotoUrlsItemsContainsType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[true,\"]d}64rf;zY &c_b=K%8+#h2p`Cx,p\\\"'A=:*c{~+a?gRiN@O>e/S/_po<Go6xV)<5HldHmIj6rFmH<j4.5Z9)n+($Q@oiT.|T*2*T~!42fB$+x#qGh~Tn+)<s[TB57@kB,}!FTp<}XmQ:@na_rFG_ALG|d6TeG<Ra$Hg/=ZKp+1wZ99_5=YC2,wJ\\\"pQgGV&zu@uftz,OU\\\"<3WQ^RE)-e(W$W{5[!!Wj56j$uX.*nnnvDdNGhbvrF_W~cIbD8WPHc\",\")(vit'os|gS6ZfczsX-t7LDq87Bnu~yi_49!{Xcpic Ym{V||.=kz(-:7+sc{y*lKfqzSR'\\\"Th^Ez8*6_R;IT=]mMS4NB mr)Rg7^]6)n{My8*K0.R;=,keb'z~v$<*FF:4%3G;:F|}Sh<~=eEk9}.X-/!|,@hxWOv+WmimBiu72_<Z?*!Kq(0jg>3@U>zz!uhXrqJLeBdX0ybZl`~W6gR-Zw\",\"N>I-W_~5goP<}1#hppQJ'ZHI!S\\\"}x46jv%B_QlKn,W6c7pAzJLyZ(F<XfQuhYc<Sr&)iNe.nuk#N^m3\\\"v8Yk4gv%q,Uot3b5;YCU@q`Ui[!gllITCK9ursi\\\"-$C0ML'lqv0QXi~lqQ&$0d< (IDh~au}2,^s'HGz%>U\\\"400\",\",NQc)54J](R'dwnGv|\\\\Dt6>\\\\teqbh!<bkM.L1#XNV7w;(e.3rBtKi/fehV|FuX^/<%,$I5N\\\\a)VEs_Gd]n$9V!(\\\\# r;0p(P></16TW&?my0\\\\QU_Ej!A23K?bXPH4\",\"KL;sfu}\\\\ m{B.,Z(Sv5>7U{a6<_5uL:(CryBIP5j>,J6Evy^dfe@{uG;,\",\"@?C0&t%?CzRR|=b_-DE4e-E)T(zCg}Dded-Au[CN,*P,7:fVZ@^PT;\\\"]rB\\\\dWP@xbO5591(ixbu5c<y>i0~)aHS6!|`<8&8z$SC+b!El.0}V]?]U\\\"$jsZ4ZX&}SGR7Z#B N7{MB\\\"4,v!1?Exa.BcZwaTQ+/Bf\\\"C%)f|/YZk#\\\\$e2Tl@UI\",\"=+Hr0nzu%`U!$>-Mq3pKBKr0S1bCMW,P' u3A}Y\\\"an*wU{_iPatmJ<'g%?0-6RJ:tH%!Cv5LLOI$kj\\\\&)l=ko[8\",\"eQz|v[zfVBf[)$qvmBc|:)<@)N0Yx'k2\\\\Qxv-j1JSim9|LGgr|aV3uXh*.#4jX.P#C&0bn#MAQ4)f\\\\\\\\C9NbxihD2f\\\"q/_wt//8?=\\\"?}Tq\",\".7|(q;]d'mnMeJ)SWHHFp=8<;5(@w=i[?]!W{=8G,fg1}Q$K`4XDj&UnM\\\"$:\\\\PjANO-@([|CRst1bd=kUrr/;;ZWM$0=zG!a^hBn`vf]$U|D]>$T\",\"vg=b`C@R?kyRM:bn7X?AHUOz8%VNSY\",\"ivHeX{pX:Y5=8cGu\\\\U*Mt-FRsf\\\\o^)R*=]Y%PCI@aWcOI^Zv\",\"vq.;_\",\"Ki.6<d]c]i(oSpOnP/ghQE!dm)MXXYE/>\\\"R7e0{,=e[qRz)Y!%Z|X&bP*y(&z5<<#2Hq^XK=gP%,VrE5H$'Tcpf)/mz'dh:o@~L\\\\/1iOVC&Pey@$X9k<bM]\\\"9'nLt1elR/T54j(fqS28fqMXWw<*g4IjCK]0~,h5>5WDw/NZ\"],\"name\":\"-=+E\\\"YUun!A#'-z0<(z`f#k,@&7wsuYlztV\",\"status\":\"pending\",\"obokzdgvqfp\":[\">.\"],\"wjdkokkudsnhol\":true}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.photoUrls.Items.Contains.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesTagsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"83.+HLrM.'@:)L.#BGwG0Zo)+:sru?1Kt}7]17>;iQQs,1,l\",\"'ybV!d3w8{VrYx@_\\\\Rhm*#$KXZ!\\\"<E-~NKcJtNuemwBr-hp^U0_p#f:Az$kbi[rI1\",\"oq4/l_kx/h1l<&c\\\"L]IS?aL]2AY.}&0;Rvd$(>{`7Ed3n (Q'F]xV-yW?bLu!.Z}f7W,%mD)a@)Z=!rtrf/zdRBIx[s~b03qlRFf^O2v4mrH~%RPo&UR)EfUJx_^43^2N1X]fWiT.JncqU9><6}{nYIlJIFiS\\\"*XF.+>l[xfSGEm5i\"],\"name\":\" 0gC:,C7J`7tmB7[jvjiuwejC9~<iS?d}m%4~Kq&O1SR@C9L,}&g)sZjHrmWG0r_[EJ,h~:z;7+|jhC:wXiYneS:lxYa>D{C s8!;Vn!6EkX!1[l%Vgdm>/&3**\\\"6L6]zRUf*&ge+>\",\"tags\":null,\"status\":\"pending\",\"lojjxnhaf\":[\"9!/_\",\"w\\\\wfy \"],\"wlmeyruzhgzfzr\":\"3(\",\"eksjyedradjwudnm\":-114}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesTagsType_Is_NotArray() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\",L{p4y2V%<_uF3G{JD9$k`WD'yKF*G*x\\\"r=(X{o@_AxqU F,1Op?_e6Po06{JrX3[^Y'F 3raZZ\\\\&U>^oqLJvNW{ei`A^%@4M9hR=L^!JiYv#y))>o4hy\\\\T@|MY%6#^CLt;:])R*~1%p6~_z`a+|=>X(gM.@8A3RDQ\",\"Pn2@?|CCE,>QmdfB|hH\",\"+z-Gn<\\\\P5}l~YpP7EREpF x},4qCOZ[cw' 488<0VN5w3c^g7wtp\\\\~I+\\\\x}4MGTf*N[d8O_'%anMvrOgv#|8UZOJ'@(v-qbY2=n2Lm=V)Z?(LQn}Lx<& ]2&U</$]U>'\",\"*jV-pgV4Tk !%&];7P,H:azG9cJdX2_l4HHU#FT1{jVK+5H+H|VNPb7O[.zXcH~:Na-mJnS`?ubQ71ad!~fm=!z(;^7z=%Y\\\"(<,;j5w!5\\\"hyZd8/WE74K/i<g4&KzZGpU'.d;D<\",\">atSh21jr.M/K4zp(p2(tTwen~-^*c=\\\\?>V72&(`VrrS%2R[`(fq~fFP]aaoH]8p2Zp/&ZM~@65wg2`MlaXiZcFvoa|clOa/~eG8c+yh-u;r-v4W`W m.\",\"(]':+qS@&X:N_S/ht@5sZy~T8Zu\\\"~:'rhKN`2o791% h^co+?KB([RAn:zt\\\"DD*0PzZDBdJ1R.nQ\\\\}c@M-HNvO8gxdmxGbbX\\\\@LJ*'6Mf|8\\\" i-4p{V4vrMZX5pI}BLuL1azAT,HwIt3IK}Ka+TTVz{1P.CGQk.dzaw\\\\P+hAbH[LVw#4](fc]_=F\",\"]pPK>b7\\\\N@N`g~gXk!'\\\"2J]bq?RkGhxfccQLMHt7S6^mt~&w%K2aq!hT'x|:\",\"NvDMc?|kLwoby/f2.5 k_zHb<K88eVYz3D7A;_`MWpWHZ/D.X-pxnODw)O'I$WuT$DtT]bLq~!u)W`h$9lEa:,0kN~iW~+jX\\\"<G%P3$6S]@\\\\E/5\\\\O>\\\"=Y0x^{d%Fv%?\",\"L13:fN&eoL&:FY\",\"??\\\\X\\\\F0I?^}X8 vV0;\\\"i+t,(f3Qb82~b#;8l?BebNJ(#,NIYxw6\\\"K.D |vGgBFn^D|;/s2]wRseR_w,zn?*AHL?#Bc?o#Ymibi!=GeZ}v?iO]<c'6l55q)hOQN}747P:`mGZ:vLi1woj:1,$1B~fNCh0$13#lu50-o;U;sfcqSZsfOqaRC<T\",\"Z\\\"-A~-qM[vP~;J2}$|kXV]jwPegZe(jvX&GJHH6u=;84D<5'E/e{'x 3McY/}w>t}k+*>2E-TtOi?nLY<zlAD6kQ\",\"Z^b2u(*;@Ax+=d!-OP kTsi10fh}wk:MTj{|0iQ#zI09 [y86jUy2^A5 EWAV&j[8:%hqC@}>0#$|54KD&i;8>U!G6Ba17MlGF@Xo@o&+Es>z=Zy\\\\Q\\\"'1cZU4o@Q''P=Z6D6`O\\\\4R<ypU$Dr\\\"],%W^0mU),ISGEt:]]DHL9^C?|Hb*e*PJq z.X]$J<i#4fvV@a[e'XF#fN`?YJb\"],\"name\":\"MNyQh`Z|ks3#25*m_lEb3G'0dJQ`1BtTjC^T_T}G\\\\d0iFUh5%pB$;o{$73Oc+S*lyo%`| JbU\\\"TBSn+'+D;.bvOQ;OZ=VX x@i. Nm:-,\\\\.b;cIuy;$+j&a.(i/\\\\gcxYpZ/h.Q{a1>-,vx:bEO#$@q,K\\\\^z}AY?G09!/FJWII*FgK})c|8&='19QzPD+_H>SV'[_^}OHSG!,zaZ4]NFRS9gazNMqASP22|57X{X#B:T'*;)0\",\"tags\":-158,\"status\":\"pending\",\"upmluzdqjza\":-199,\"xydthpw\":-849.4}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Type=Not array
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesTagsItemsContainsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"T`]85wW1C^&1Z<|B$5-H[25=[{9rN$_RoCeF@cN+)x>(.B\\\\a'xJFr9\\\"F;%.*C4zqQJ6MJNh<:KV^+)E);exxWgn1&=rhd1(1!vowhY`?PrE=v{,~VfR^cFK'_.E1pnV'*AeQe9\",\"f6^O[IKm!,*zd/:ET*M(*vsr^rg:FT6yC3D1GTk x9T`Y=tTYz1]L4\\\"88,~q}'4S7%YwD%l2[Oc}^tB*9XKH3$uvJ%L-Hyhm.JB1MJX:hJsl}K3&NF3.rt_>/LBS8\",\"b`>.`0.74x<NNu~^(\\\"<4Q(?:B!z3e__V);4UGk'M*T9p+`kg*a2O{J@}b^4F]TSss0)c7lY.]=eF0;V$3Ek\",\"},&]n8!E$JU:i9pz*|\\\":QHPD(I4g!L`_/.[yK|C\\\"LZnq|BfgBHOi}I~@;P}Nv`egYvNBxxG7Y`SbAO\\\"z!!]{#AI~RL|8<SIQ'Ptxc_y7w_K>&pxs-*dd^6Zf(j?8GNWCU`/+gOmpi+%dpG1FWzu^jFzd6E\",\"|-%Ds(p}XEY\",\"L\\\\J_Pf4xWyh]\\\\8'\\\"Vqm|.>'L\\\\Khdv%\\\"n?0aCQRQP-\\\\NG(mj9uzf3+7RVX|IO3=D[2*0^eP@9hF\\\"HCh#;6HCcx\\\\b-ozLGe0N<Bru!SvsA\\\"l0oAe}Jy\\\"&SlK~N(hRUhA]!75eG3yXMF,.t+\"],\"name\":\"-{@*KuK`lsA&i0uiy&3m&4~,y{fMjE%y~'~s8-td06afkJbH!}h>hO>Sc@Y\\\"AH{T'.)H;EdZ^n\",\"tags\":[null],\"status\":\"pending\",\"veublhsbzak\":[],\"pplczddxdho\":{\"jnmffeoivh\":493,\"gddeduwwtxfy\":\"b$\",\"mojwa\":-916.1},\"mn\":true}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Items.Contains.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesTagsItemsContainsType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"JeJ>Sf@Am(#UkpP;x&:|j`eN1v3upP~e,b#q!O&S^K`bk%CE<uIqw501=U$FE:.k D/%$S8GZ2CuXx:zyktKK@=VR+]mzTB3@s}w,#B:WDKt&M}!;a(Q_{5/.TddjBvNh\\\"BM?X(#j?4:@a `4b&W9:'2aj$;_roL-'X}$RoNQ|r];qS$r>|5f]WTmLiVVwA-Q/%#h[+eO4n(hM#Fe/Ck;oEcA=JvE4fdeOQz(2\\\\emXp 1*AC:Nf@!6Kd~X\",\"B}tH0WHVj|v@'g%eRf1`8\\\"{;f_]vvnILOj0\\\\v'NNu*#z<d/242guRK5IEq;% z2f?L<P),uK!?8]sA.e1<xv;a glbqDohh|>\\\"7K),I!~Vh+ zKtgXD=yVkfqY\\\"n77huR$xwABO$sa.\",\"1P<b\",\"t^~t>t{+ 8bmy\\\\63RG`YvUx\\\\WfAIJ\\\\H(>H)K^Ux[)^wj+tS$o3ITW{yRJ=a8'y9@uMspF~De.<'eB*19uhvg9'QqAF$ALjU-[p*%X`KSE`jEZ$'3q/-sV`!>q41${{'{6Y*= Q08&TgDIBqU&`SPL[cumq=JX;ISEZW%HBX7+w,x\",\"q7R.|p}@)?CF9mJgAzXT5oS%3Z.9<`On/5;al!tEw_;OM^3[ZLV<ix2btB:N70[tRPH{E(d|4k?mcmWKU^2; 91E]%6uG\\\\Cs_Bn$ae|ZRB_cB}2w67}`C ;D^_</2m;TM4PGj!Yj>Q?kEc?oc]X>A$MinnF@PGX0\",\"FaVLnj;BkT :m?h(k@.;S|STqry$_4=<Vz1#8%m%r<W8e'a;2<WX?27cfDfIX%<OHpIytsUV!^WNek8]{MyGmovG:+p#\\\\emy07f#&G@aLS1?m!QzX%(VV6j3B71Z#&{0|7bQwep]k&RH>\",\"97=8|{YO,%?lLpEWY0OzF9OQ#ZeCMzQ+:`(@1>7()V9Y`>0(AY<a/+Tj|'<*`yikhNjKoBUBS0TnaNG,G5)-1^M>l2<<r9\\\\)l,<C+@t#aVQOmJ-BR%Ak*Pl6w^+ 4<R%)x:4@y>1,u*[69.-M]@Q=V0$R_\\\"+xfQo\",\"I_ Y[OuEOZ6<7QtW6_@lVMp?]M8*2L7,Bm6u>TCy*O/!rHP=g:@JIW6KY*[Y@;dh_O>\\\"I,wbpP_(Tnd:$qhL8Q(m`kn95j=i^Mo[P_!.VMi?+'TWap3||a:A/E%6ROppIv}CoYupofPM(wPa.l-CG\\\"3!T?{G(vjgU3]0|1[?a*lSZ~-IK\",\">PG+*F8\\\"_<wx\\\\oq3M2$jbfYC?X={*^;kqP-}>>E@tivk2^>0%J.$\\\\r;Nzih&^nWMlc?&>v+I;'jwV]KMhpJXkP&D.'x9l[A?I!&lhT}'8@p@i&a*Xp%IsZb-42\\\"uV8LULH5O.b}2Rg)??yqU!k:~2lm'\\\"-Jn;^.OS4FUU'X`.>k666-)bP3`C.~0s'I1l]eG_mp>-2@e\",\"QaX$x$q iJDb!F*#`7USr}F6cT%Mz\\\\G%Z\\\\b<[TN^*eG7]q3}gDtqbz5\\\\&BFeQu\\\\gDp/#fVw*<K'4!cAVhFM)r\\\"*`#\\\\Ms`'6SoE'c6V8~Dy(;X(4k$Y/f0WHY'7~H In4R_ :C@ >:hAHqlDd:C>Pe2Pd~f'Af[NXMuxEK&;fen_0@ua`_E'PY(2pea=aZ7?|qN\\\\xnDm`6F)c\\\"_gt*K<7l3d3|w;%{Ssj6W.u}y4C(\",\"VMC8.-A<vgCJ 7j1Qp.R(:hTx1X~Xl<TcC\\\\g<|\\\"l+QErNwcmj`BDl.aV[\\\"/#<Zx5tT%=n4ZRO_jkYkxSj>4:0B}}r3%$es~t.r/&YFI@=ezb3W.@>S.?iq.~^|JPhot&b{`FB FHysK>*d2_i$e-vI4#f\",\"]puWUP-d.0m[wNv]:[X5b\\\\-x3G6XySD52)+L 8+m`(HXF9O,7WXL5<,?O~mH6AD*]]DbJu{0R~ph7Cw^2(=TS87^7@I^\\\\@Q>Y1\\\"d~Eek|Kis&2ojyhD<G6Wg8)>Q&{ztx\\\"aL':$Ue0QmR5c35O7|OqT! 1{wo};5&H*Y!~C~ue1\",\"UW;ZWNDgbXk;^1pK^uV+?/G_e!>RI:9Hqy%RqLSQc^N\\\\ onM{lrQWGG0>%)B}0-58Gi&t\\\\vn%J'vt69KCcc,eV=Ry`3vCvhri tkb|=0'ZQ5|!T{JVMJXbP|YV/yF#@J(2CW|f9|p_c?2$U.D]8xp`W;ugQ@J243Gcu5)%/BMLVg;?|j.8XMw{Wl-bs0.\\\"kqair72+:Ut)2iqFRuYR;%,@U`38&i#NMdSCfZ|Wbu]SsR~n\",\"x#'Lh&i-e]Wl:+umN2uvYQsFW7m Q13&9RXx[qqQnhxvTaBcl<04,y=4uk\\\"m:FFB_yikEdyK;o,70f)_uiAoogJXReg9{:2Oo_rJgOrg;;CGGni0YNeu@I$_,/BINr#QvtIgBPma{wDyNN,*P\\\"'E4N8~\\\\;W9j>L0-p5LoB#pZJt\"],\"name\":\"x\\\"Y@W\\\"dp=XS=Q11`p~RUI@t.*zA#z[`~i%fC'%k8QecA<~p>Pfk@+?]wgP<Qezl`5/4&Zfan=gq\\\\';&HCYC/Z{8+$qoB(\\\"N.0MP@Z@b}4H5*Ut7%+:^E?H]NZp$* 6\\\"6v;e>##5:Dhumggv37WzG<@tOs^5[:;>~z`^$I1_03\\\\lJGP8_-Fu|,+p&;L!$*xqO!,hm:\",\"tags\":[560.4],\"status\":\"pending\",\"jcwlvsjtil\":320,\"cqqjmqgokz\":[],\"xycbwsbizazte\":{\"w\":true,\"vssnykwkjusnvlzl\":175.8,\"mqtsqjxb\":true}}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Items.Contains.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesTagsItemsContainsValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"59f!=P`j>[>dV;yN{T(d40,2M9+,SmB$P(6L`eX^o(}VX],#yc*6\\\"f]/v%XI\",\"ZE~'5)+}NkI7Q\\\\@Eez}!;pL,\",\"3BS]cUOPQ_*xm<l ;)(] 81V0NN_41`Tb;uA'qJ!|vqzOru3\",\"/?.3}-?{`;_h+u-wm\\\":Tno${.@Z8d}K@zGkp<&;K']xd'F7{Vp5,-Y^}cShSXfUo`[\\\"L[zbdNz~eEG_?1+qn{_`|i.R*]u{8gZFpItix3\\\"R`c{N]*-IQ1F\\\"g+XNmXg/q.rMs1mc)`4c>%$:,\",\"qPAVvBDK}\",\"xYQ<jlr[tMLt]kGF>XpIWGyj4C=lNF2 KRD}w#@.smB-i?`_]>Y&0o-N)mM@t@Ytz,5T),5Hr(|+b(\\\\k`Ml2q<W{#G!2skFx:\\\\uynmY<B7WTP7e#K&%oO8WzCxl#{P=lk~]\\\\NzSQ4Yx'~8+hn+r,P'{tC PtC0vedpT|[5gTxZ&X10Jz^lo(Cb73{i^$f#EE`|@?-q91q3!%[B>jpH&m\\\\{?,D~~m]vf\",\"ULS)ONfhvI!=^jLw\\\\<33n.s V\\\"1lK/o-NP5+Op%{V~>o1Ns1S\\\\!&^n1s>O\\\\^*$Dt<dp.R!:H0b=xJeG\\\"O%&c8p}HRt$sk)2#e-Nf2#\\\"q# cYXEJ'~'>%x}\",\"X-Vm-qi#6J{e+84AsfWsjt{,lzT`+PVl>wy3%k?z4mY[V,,jOharRxwF+srO$JWSh9uGvup<.>esYiiq2ut/IB?p|n*'Wb&pwUOI>^4mjdb(j{j3rv>f\\\"g?1.?|y{$jssp~_K?fq8|TKPte^ BA)/}MipN\",\":B/+5ufkPID\\\\JqnyK&MJ)!L!<pO+KKk\\\\9aJ[%bt\",\"bF<``<<9twcJJl%O,cEg`E(/5|P?m8[oD@u,P*dwn6g5:9Z_Qv7xyiMho$.rXp(Z-}O\\\":\",\"PR9U5%Q8SMY}mg1A:bA 1Z&qW#p4(/e*vMJd\\\"6kCMNLjLe&1_|^Zv:7JHN/iat?d~Uf|L!(1QH8WCjafs[7q+[Z*)r+B[PFL!TKJ.~_?sK\\\"-Y8HQ^K;3~l,7XV?hq5Enw+:SY.T)Qp.xof5>@'V)M`_cL](uM2,cyg9o/?Dsh=:]+rtoQIC7A];ls.?W#a-ufu\",\"(UHFq(Ke6+,vrnQ6h,[\\\"t>n@+*GdiSyVBA)5v4AjsRAA5][p^@c?-?tDss8L-LlsOUhh_~x3+kP0s slzmN-pq=}OXsET>.Dm{cCSU<Ou.0Wp}54o9>U3~3A9:jCqH 8nG1y6]Hx&z}uKiW<n}RD4g3,g@83p\",\"ONN\\\"KY{t?VNF{K@ a(ze(y?TbX(=zCP(W_?H)W\"],\"name\":\"3g\\\\f9&%__&}lZRf.wc'=V#q8&wv#V:otMEd:480/QI#KW/p~?;f /:\\\"RQ-*-+'Q80L+]?l5YrKXdORa=y.Xc\\\\ILm`U&{mkO#$}FUn@(]*$VzsU]s$`!*terdK~;fmOO-+An02$|I4\\\\rxP?2>C_Iq%jzI eR!zPL(UcyeXXE^EAN{;wh'N/FvZ/:NB;n0\",\"tags\":[{\"id\":null}],\"status\":\"pending\",\"xpxnswrvnf\":97.0,\"esyzpxecglnjyhik\":307,\"fjovaukgev\":[]}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Items.Contains.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesTagsItemsContainsValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"NjUzqT:wK$p\\\"Z6*A6/<Mp6%^DMHuu{]m. EtK[,#9G@eT(/C5)aGdg7a+zSzU}x*&#3-cGkP\",\"c+&TjCIC9r7,50^s`t\",\"j1714PO)=Kp{={!Y|g[L@~xkx]#u]s6T_xKbiAC/<Yuz*WQ(\\\"gU4-p\\\\x`M&8*}sQ\\\\H6=Vr1o|I,5M`>c#ks&5\\\"t;\\\\t `&|yL7F[#Cy]#@c/)!b<`.|;;HCd;L##TqWr%B-[7\\\\4DlUa8Z,`_*b'Ba+Rp-G@:Xb;(\\\\n*n\\\\SYu0}!j1D0a#.W~`Fs!~qz~m#uRRIctfRyhdol9ml=.OifSm)A/\"],\"name\":\"M58\",\"tags\":[{\"id\":\"5\"}],\"status\":\"pending\",\"rgnvploiz\":true}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Items.Contains.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesTagsItemsContainsValuePropertiesNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"ZefBiuhWA#[Lg.@za(\\\"OY>=x2vRpu Bmpt,g4/NyV(pf;5Q%-N0|OaJ6t?t</pX3Zcj4Pwpk8hxA4v`|I8~(j[c=c7$%t^ t}.[fEw?Q{6SpDX;YTY`Qk>`gtw9.FH*DJnS=eJc%6Rgmx97vvP![=97pcp=zP)lGPPMJoF:M\",\"s=cJ^q:*Q(JGO&T[#_mV<SV>p@7?22x^`reM(\\\"fmi9)@}aMKx!P-c%:Qp#6s)Fj$C<*eUL!-Iapjow6(\\\"2VZD5CLj\\\\~:O/[w;S.Eyo(`-S9SZb^L~QPYz85HH~M4nB67E `[4>\\\"\\\\|U;f:[VvNYrWPPF~,T~rtmE*mf2ebv6XC7L,[ZHEcI}(:1r_.S.jN`VT:>_NH%YgbRrt'J2nFxrpRgdyW53b.3nLO+~Vb;OF]!>qk8KxYxjAUZJvo\",\"Ajqi(fPMjiT R'I`<,` a{%[jYB tlUU_QLxu:\\\\U&B0/ztU1%j/-[5\",\"*g}?7D&-a~>\",\"uj6WQI>wB9UPZYH4[pWug}iMPy,_3)Z0$W$@klhc]\\\"TCu`W'nQLJ\\\\q@rhO&EG'fAddq ^x+-t )]Se z:>uuZy G%}Ec{}01BJi@Z3N+Xg3U&mmm\\\\PI5UY\\\"!3}Ai{ihqZf:PDHu%T68M _O)D6Oq=^vtmY0JoI34oeZ?[!]_v~9W+Gt,Rp 4[qZW^>=l'/F8i/>i5[O>oB5!TVjr\",\"SGE{,Yc6{J7A,AoEWl*1s''s/\\\"r6yd=:'x+BdPc~_$\\\"%\\\"Ta%}u#B' %fbuqxGIv$s/WqD[DMoSC~L>:eU\\\\Z`(<Wzq1%bh2-ihul,y%{41A~<kGO[2k=%EPw_]Uy*S+\\\\@ZGR{AfVZ#W,o}@kj5{Pr$1@V,cQam:[vGr*Y$-vU(.CW%U/3Y+IN*n-x:G22za4J3:UlTS6k #Uc0szrJdMg`Q\",\"N]$3&A1J0SQZ7ORmE=fSAmut68UtmQj5 l^~q6!U\\\"]h4?3YOjrq.;2[]g4wc2D0v'N3H`;i$)=7fF4-pm%x+Cj7 c&JD]o8EoiV>`AK]kCDv8V_BW>=}_@wp:OSNXh%e.eWH\\\\83VGy~&80~0&2Z~Mtf|gh@%CL,n=*(R;16&:.+Q\\\\^<\\\"d:e$ 2y,wk+%r@y9\\\\\",\"Z^+W'a ri(DY]Y]+WYx)xJviYV4!uY+_F\\\"t^Ppj]WXFxR*#<dm^Yqos+;}UWmY3:#`2zCrJg}m2zw5'SJ3KXif@pit/iuInq.f.x9Lk]L7jR.LigU|0BL)6>W8L6\",\"+5B$z*Z,]P*O0*Zgbe. h(o&:^N>pI4N&,d6/8|d4C0:w\\\"C[!gTwh&YmWOPV>$r{Fpt\\\"NO[tQ5\\\\A*=CC0%[ebwN!\\\\GxNDn1w]Qyf9!2jf+4#~M0\\\"wj$Rv6(8)'oJ^dODQWj:s<lw]|RN@VWl.fzN?6o=OR(t]ra{Q~\",\"2.cX%rwHnmtnFr]4^V7!dWcF08lv=hs71\",\"P/->tDs(NA;~V{d y8x9A5SfUi*~.MyEXtdSY5ogfs=zmu2nAq3G(Ztl/TKG1VM<KJl#DhaLc~X.*xM. *sCT.$<|YnpSG|2-,~D%yD%>]Y=\\\"]Q,.cQuzYYG\\\\SKht^w~*3}SIg >hYa? v0zMcPB[P4j\\\\|\",\"R+8h>7<PvE`M+@sEQCH60&IDv0pkUH#RZ/B~`y]aI;#JGdHW&+W2`Rnb}?MZIM$7'5IX^rMO_cgJs[WLmMzSy\\\\jP'CNr@gM!e*[+cM<{a(yMraViHL4 '\",\"|]RbSl5nrrsRRuc]$G&J'w]4>^o,q:-On?kQ-=[mlMd=6vH!H@hY|HLew6-h'I0.S\\\\Gxc:7r,?)6O*T))St}.k O,sNpW#V%^MvyjA*/*m,FMs`M SPx:;s}LIjtb*#-U8.}h9({{J}!RFrs<MN@s!1{Sp1($Q(#J)FQ+inm1xl&H 0TlM|ly7H\"],\"name\":\"b Fqx:+Z8c=v|1sn/=^@k6YDu&-7-|8]0e 6\\\"7b^;rB4|8Z?p/G9|/A7v<b e$dnK,/uewcfJS/sqv =WY{z{G7=r,PJ#Q8K!8cE3Jl^0\\\\8j*@@HuYCKk49A#$~or()}ZgRvYlTmKBw1Gjhpbmzs;5w&S:O%&0g)U|7w7+k&(*CT&RgL%|m`o` Wl-j<M#TLdC\",\"tags\":[{\"name\":null}],\"status\":\"pending\",\"xmpqhvzdqh\":-74}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Items.Contains.Value.Properties.name.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesTagsItemsContainsValuePropertiesNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"~5fzNe4#:^iQG%[t?O<ZsTPxb!Ye3`7O*%_Q WLOF}aZfl%p[$#iB\\\"/Xh4gJ{MU jeNM\\\"rAy_&@t7kw\\\"GAH~3i)jep\",\"[!)4-7>MC#PeR{`[dKVZh#jh*'ieY<Y(NYh@x&2RM1&WNY`y=R:Nd[\",\"h7'AX0n) s\\\\54(r|'[{FuqNr\\\"V.Z}O-.6HfX26\\\\]&?Uy\\\"x-Ar?I4PS|$k^XtigU2J5[W,nm`Ow\\\\O~V,7C<?U-c{q`Pqj\\\\?V;z'`\\\\4%{[+Uc{BqynAjsZ*eiap)22A{T9,1[sG(F}%c:YGZAja]I:E-zTaR6d5tbYv'@//1CW+wq\\\\yV/\\\\UYti-M.xOgxGbyj.N/K*hnY'8n~6IT5&u\",\"YPs{x?\",\"Q{-Wa\\\"[;EMXE)fZ TEMfGtP*YQjzuBJc`}qG0?GK<WIb,RbVqYtI5&Y4saNWFd>GR8#E@mR%}v?MQeJ-uxG_5 |{\\\\asG>,T2z,aE;g}nS\\\"1Q%Co$0#FmxOpgzkZBb/QO=wTc>i\\\\/MNNrS77PTQ{V2X&;@s>9S0731vt\\\\YF+-H8:8[Z<xG7$c4+v{M>]e#yj; 5X)c LWw?'Xs'pGbj?>T\\\\,7^)-S!!y\\\"0+bonhX#J,Hw|X!p,LM\\\"7u!Z[\",\"/Zj NvJD9a]K]'f,:Ildv7E]<<l~jJqqqIV|{9m^rc8.8A*G0t#5shXIIf5(]\\\\._.c}dmQ5+!xJ>Rn#+1#WSbjIpls{_>&g^a%'fy 66]5xOn x-XW0tDet6DM);Lg{? Nmf\\\"cJ[GrJuRF0[Ks*!d6?;.Y6);v,cO!bNoJL|_1;dg`)akO4qEKE-@/So'gy&Y7uuFk8Fx]pN@.JidSkV'5M,>(f5-\\\"KRnbu)Q\\\\dSF/iqQ3iS-=fX\\\"A<m666\",\"DV.QxX0EdX>\\\";1yl_d3CU9c6QFdGK]swR9yQ+%N~Y]\\\\);U){@c;|4>Yj\",\"lN\\\\<h4Bo4|5DuQ*p-X:T3CJ!`#(O}vt9\\\\,kki=jHDUrE^rSJ^>.{o;mUL,4^2OyNUaRc-m|@5qo+FASe5AG$G!`qdB(Z!)[hAo^d.y,p&aVxxaKHeyxvCT\",\"t\\\\B^Hs@\\\"+Wobb^B]s(#Zx0^HOBe} vbM~c+K`eXBh1O@%kD&IVc(<YYsLF$]||`?ZS:`\",\"d*[c{TySra{+<g9kU+5vws@!+Ne7R}LZo6[\\\\kQdfLN-o:$YsYE0k}xM^=@;'qH(_)d~y,:z2I?TF%HhIg_;v\\\\/2|M%p4H:C P(k%&*|D58k]m69~k9B)TL?,~;+@[MZBoGj|S/-t'T$q0ExGdtfb1tP5vCVPKy8}#gEk=wakYka>\\\"]*2\\\\=\\\\Ymn5v=~|GYu\",\"'I0Qt\\\"X?2'yRv YZ.=G;_.uG|)Oo{HtLKYNko#_ mDzSagpQp1Z7iZn`Y#.H5\\\"H']#Uou7T1}N)'stp]Fc`O+8r}rEz3UXEg,L0xXd2EAGSvA,vkq?xK ?3LsX35?H(\\\" ![UAOo?:6^\\\\$azmysc*Ld8<{Yy>r? 8Z!r]h\\\"c.myV`X|=7dLCxedMUb6%'Vg1uyO7=I[u\",\"KpE|dXN)IeTvar>cjB-f`9I*g^/gpx6fLe\",\",:[_|wsf4QzbRyt(u+pzeRV[-X7@@e,v6d:I1^pH?|8OmiOOrrF{(3AH!SaFoU%=(D`2VD3IXu|he(Z_,Q$n!O0\\\"ag@MJo:\\\":')W6~@c)R\\\\hiqnWBJlr[Hx]hq=H*,;+SHIv[5;M/pvf?;9?P_%n@\\\"jb/Ks;|~y/szxKuk ^3tRasN%cL(.6lR,{&v&9_SDu-@\",\"W]  y)#/a M9|j $1jZp@1;k@=()7>i\\\\5^kXhw.h7\\\\V)z%^!v,!K4.QI<Uu{)<I\\\"P+^\\\\>6x!?M2[L/q8/mM#B4[NIT*PB5qM>&f[(Uo]?Q(LcA&p}sxhq!T-n_~:[Eo^r~UCZqREWayK><U@ICs3yf^nx#{(=in7kr=(\\\"fXd+^L~3SDmzD3L+3%V:G7m92vly6d%/gv!_l^F|E*U5,$sWGKFv?8nqnfx6eAb+bJa&\"],\"name\":\"hrRyD5xp9aC,\\\"E<U;mdR=O5nG+&\\\\MV{{K_f^XY($s~yc`'};XW[b/Rqe2-N16XeIPn^*tr1=t)c.,DF;.3KN]x~d|ziI(HqcftbyYAhLQpkBz\",\"tags\":[{\"name\":{\"kpjcy\":327,\"nahpmuvmlpysttkd\":true}}],\"status\":\"pending\",\"wobrmjj\":-204.5,\"eterhuqjudkqmzv\":[\"K-\",\"i\"],\"qojezchxnysmuvkw\":[\"gIDFZ&F\",\"\"]}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Items.Contains.Value.Properties.name.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesStatusType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"H qC)eMr1r>iJNJw~\\\"swk=.;og/}qdba4qcS@$6T_:R5* 1_FJN3QS>dtD_Fs\\\"Xa()KkDD~79t2c]Pp}[=EQb3k}>L]JCd@hArIF;QqEpb5Tx:I%#?i39|ZQ49#9Z-Z$\",\"CY_lDE{s8mTy(=|&@o,]}\\\\cA\\\\:?Jo)B!k|FW> MU8*MgZ]J(8H~ud45V5h 5^'R53{\\\"gzIpITZ)OMy1a8^k|f44`hZy/'P56mFx?&S]> %F4:8dFZ>BQeFK6`uhy.wznF*K`D :'XisJz!ad~V l]LJ-,|H;|&<\\\\!N 9#S4IDw^;Q8XSt*P~q(wfF?%ibOB9[Fd.FnXcn&9Yv<+szv@r\",\"knu>iL.ueErC9ja*vXj{N2&.Df+I?UaprYgSv{/a?nNPJ\\\\K\",\"a7gcxK<n))Q6`\\\\B)ss+Uq$F(W=r(Y5yDI{i80eP_/X'B<X(/S;lP_5S.<$2HW&B\\\\Y\\\\rTt=ih~\\\\ye28-T!|O!OlCE|\\\\t{:6l\\\\gLdlJ|TFI.bhpb'iT<[KiwU} Yl8sK%J\"],\"name\":\"~=4xWVyH|zvk^(<Y_[W-6&$Uf49\",\"status\":null,\"cn\":602,\"wmnhslnjjllvpybd\":[],\"vkduugfmdkgzrvsy\":{\"ugblgldbnktqpivb\":-742.7}}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.status.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesStatusType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"U<wU-2ip+x$?w{*{97BpPeDyPQ7p\\\\8t|=A)V&=/g#\\\\kie,Q#xs;pV:G{A3:[|6;;1tVXONKjYmR17u)uLp=RH,mu%l,\\\\_Hx.i^av5HjytiBh:m5bIh gpay%s+McVX<?\\\"noHh}-TL=Colc]K \\\\zy\",\"~H8=Csk@}3n^{Dw;V%>sJ7s <KFt8%wVlplmV\\\"fT#tlvi@i*<A}K#X$RhubRd+@O2(wXo^Q\\\"L8!qpv;cU~od.]*J<@$lt!(15q)^y\\\"['XLI47)l9*%**.Ie\\\"f&jb+\",\"@n:^Op]]P}Ncb! d%Gve~8SbUTl!zV4ktCF~<F.Bc\\\\g P=FR]+MARK`.RjWOL]B=rx0,>9THU57Wp D0T7`rIy :bWx\",\"[c0'Z]ojOy>2o+:';uFeiBDrE6LiY*a/c?4u=?g\\\\@Cgt|^MD{7m+'G>*P.-E4\\\"xQk/#gJj&pg$Mg JT,i8MqvTlx6'&H~h4-WZ)W0.%}Q3t<JH[$:Ykd:_|~Hy`_x,[\\\\^*'lR]9G%Ij.a53v]$(pw3I\",\"a;%a\\\\N~kZ$ dR<M|0(bk-X#C4.U]A\",\"jv1#b361g4[l\\\"$|.Xel>du0vN-WtBA7JD;ZLL>K5-[wEV(;i;Wv~Xix\\\"iKv`:0q(vY\",\"{z[E]}EkuRn7bKk:sh'LpcZao\\\\{@RI+?jezez^y9|V62HGyO\\\"Y|#HBi\",\"yc}P@&SPXH@D\\\"p'D]g!_P9ArA/At{.49AReN 6=I/I_aJI=L_-fHsReA:ZJst\\\")\\\"[srO07mBqJ x3)2\\\\nL?P\",\"65ks\\\"`aBkVa9}\\\\hh t=$k$Q`7X3l1 2S3iianz{Epw>,:t]>^.lPMVa'8shCBie_bev;Tq\\\"[mdw\",\"nrRj8VOv!$<,M%p]||w6V {SARIe_r0{zUB5o=Vcz#eEJ&B\",\"4K^S<I!Gn^+Vo$Zk:f`L$(kg9lYXSmXe\",\"?1_yHmgIQH[av007^:_FOb(HyQb=3oz!\\\\=Wo.|9Etf?~E0)z@_$)G'/@zsx|<|n\\\\wJO&iHp3G$*q)e#FfbPFEhfrmQgW?@WXqPRy<bsO)n_VsT/#'@EYVny=jRNMPSrWJTC+`JkWF:5v&1/nS[sW{m|N%q$E;aC0Z]QY2h{<&W3R1^i_mMot[S \",\"?zBYq`R@,~LR+tOYxRjDVWd,&qHG'$kFnOi4GgnT}LH#~_IU(CXkiX(Xp{`bejLWk|:(es;T.f~J~,%eQtY+L>dr=R'_\\\\<|{U\",\"Xp&sB l7;pW2F@jY*5*aT.S#<7b!l+3:8% 1o6m':'t<m_x;s\\\\QW(7yLf rA7~BU;r  J6it8\\\\t.)2\\\"s:?\\\".yBwk5+Y0nG?`/&7aRk>*g[LQ\",\",R2a@/@D3YYK,~UdQlx*r88-\\\\#oL7>%UEBI oLf~Ik}osavyRtiobKj3vPmV6U,s?m>*=[79X|Nmcs$XZ <ci{[RW{gI,UY*\"],\"name\":\"2{bpTgU=]*k@`wsL~i!zp|C262&> *a&Df's.BcwUCC86`8U${%; =!N0[Q!O_;SqC%s[1 _IX?d)RK.dc%S8P3RGvqx?|&hv9$6p@$vC9iEhT9007\\\"f/W*M^)qm]9y87-A^xJp'}J2D&@Xf+_Fd0$N(*ehm%d*/_r>63\\\\bi-@W.z~$T#3_<2v7kV33mF:i8>R|I(lMM9tDU$]nz>^f!lT-@unQ0z\",\"status\":{\"eqp\":768.9},\"vwidhrxeeqzu\":726}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.status.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationJsonValuePropertiesStatusValue_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"d{@u~_l>Q\\\\1P=XRZ5ZYV=Ec+%8wbXFFMVe2*d3Aw+f,kw{]U^%ID7zFFWU6Z6sefelXW?kNzDq)!E>};ViU|%,ht/pgrky}{ {7!h%0}Wg^k9C@R17>J\\\"]+<|1Y&Hyfc:T]@H7Tw_T\\\"aA?~:6mmEDNIdfz?MD&rH4[XQUz]p/EPmfCs=.62~^DIkr#@y,Z]tW>KFbIi.U2lI\\\"4QmR~V*%Ve2!}A|62scrU\",\"?c=]Ji}Lq';D=G,1X~[%:E-SK^IV#40iVx!5[(-gN62h:.c8Hf =&/tvbPBqCoB6_rU%v9{.3jbAn+n15.DQO}g$-5U6X\\\"GCB~*Ty{RNT^\\\"2+mFN]GfprLS</?nx~1 v]9`h_Fhim#dNj^C|ntL<cd@5]@_!XTY2LG%r\\\\C\\\\HEbgM dSC&,lcZmmMqaH/L.G_96EGtLdOA\\\"2Qtb,~H$U=`C$,pUuO.FT}@X\",\"36Q~ ?l.#8oz~KrDUv:^.)Rw&Xg`2*=4x1V]N5TKafDn#*MiS11p\\\\{R>'U(r%0p440iJ^]m)MIf6uOg%f%,Ho:Aj*y0{\"],\"name\":\" w1oZn'{$|#{]1x_o&'5GCa6HG5yG|69r}1)3\\\\p`GvF[EFfN_PW=d}NH-QuQ!q?^/7N6l-K^#/ #\\\"MD#ht^b2S-b@2202[YCk$[Pt[C_>2ZJ@ZIsF*UtX%:ldS <MT~H>PX[Ozp>0v'(ydO%S-k7lXt8m\\\\v:s;{V J\\\"?SUle0APi?0<V@eZ:I4*o%}s]ti\",\"status\":\"<M{E>\\\">Mc.TD<tf$k<QTS[]&c'.cf(]~:Pv:}/wMX#hBAjlc%v}Tg=EvQR%6?J9?'@$nr\\\\A-ahh8~fLfx3]1dPK<>9Au).tA-,=tYvoz>HIqD^~Lz<37/1;WQ-wJf85q]k_[x<s;[TVO`7Juj1#RO~k9@v/f ghs92)gtJeGimlpzA8Q}FD.fU@%^:.qVI}bU_y:.E$bza{EvB7>4z$it!UA8@$8bBI@}r]nj(txwA6v$<QYk3p[hY`4\",\"zoxbatsidmbcaj\":-846,\"mpd\":true}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-json.Value.Properties.status.Value=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "yB6")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"Bu~cdt_]||@?0XuR\\\\>kx\\\"P\\\\PuD@?^$i8uV^Wf}hBJ}w4~ GXz\",\"nMWX:k$Z223kgu;)ZaXac?Q%FlO/`QDxBA]}s`S]((k\\\\n FVS+-&Axg(Pnmfx`nn,l+!6|]45aZ-4j&w~72CisHi<yU/.*7!po=B$$%y'-6#-;Pcs,?1j +.m#<MOt9)5>3v*6;'iU\",\"em<3J~l'0l\\\"y2!L`=g]bw2hHd%/]5YCE\\\\grPK7lTY*Xm.ZsI^;e^xLxUQL|ga<.'DRV^4e:aD*+amu7L{]n[%wnsVs9'+]\\\"i]zi6}t>n{C6OHf:8\\\"z,3_:i~&~9Q|_\\\\^w]9N46 n]Tx*q}+d.p#LYwv{eaIHl4i&}4&W;9\",\"Yqd0=72ID,E?\\\\o^RI)QFFS4M54[d.[%1#v=H>W(`kM4rmvz!-&_NU&5h)h.HUO^7cH{NdB.sPUfb)whZNh`2jn\\\\kD8kzK8Y4PGu<mmIS{jw  ^!\",\"L(Ua5Y8yL`}<9j,VB;N$55X.F|c%1rn!bKQ j1R([fw,Mz8mq*;.2q=[>V&0;u-7h(73%H~^(+\\\"{VvgRll3ypweLw}|v3K2neYeR%8d0QX=)$K&lo{0T<PAyR'ceh`Cgf+`0@oRP:v\\\\?QR$6hBq$zz(qPO/H+>vh2sO=;eMMu:pG|9MQB$ ]5SV>G3bo;J*jVqi^E<9?g|&EUN]$M.ezR^X8Y$Z1!r)30FF,e4AESPZB4\",\"PFg?T\\\\$2*j*3LikBIzCr.Ahs[f5^-LC\\\\4&d%3tOE#@pvzKI_$%_`r|\\\"8X+k4M@]kuhF5A6Q}id-~BIU(),M&;y3PaQ&cT@XFhtHk%DA^Vuje4W`x4GY!<i1~eIsj/UN7rnBryB)}Ic,Bi:6WBMGXnAE+1Z-<nn00zK QLN.\\\\}4f)'pIP^th\\\"8(-VR6!L<{j.k-Q3d|/vw78l#>VT>+XZDSAG[\\\")HAKbRs2^,!}EhE.stQ'U_\\\\c8d#<)CxU%)-\",\"@ Julh[[U!q-Y4)JoT>\\\\_^'<^;}Gj9m[.~~_/]\"],\"name\":\"5m \",\"id\":null,\"status\":\"pending\",\"wjqzezchyb\":\"N`T\",\"lctbso\":true,\"pihldwfnyhwk\":true}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"J\\\"\\\"#XJ80KsF]`[i6yW|fcW[fy=sFsdG4qW{z' _/ JJ3Ue[(3>_ ~$KcG6UZm?eb\\\\GiGa|C9juN ^p#^qXaxGW2~a hj6vcdRQxvf}V_{2^gp||$okcq6>wT#WSAdjeVly7?/:/Q\",\"@x\\\\c/,pro@-!5jl(b.\",\"j<}XrHu~=kx!wQ!6=XqI!23:m0dRO+#zRw(=KIoAV0t|F0)SN^>-hTkNV,AW,O7[GY5WKQbv! PnZKPhK/.-7fyPB2RDE/iA4Ax<JY #iA2*fF\\\\60\\\\[X.D}u9Qd50VnPQ$]R~k|8F*v[6PJ [2:'2_c5c!F,h$Hklp2Qb(Jx+|mt{4$h 3\\\"XXqc3b:0]Abjq$:V+eeTgw'$+URQ4&0mlR5XAP&k1fm_TX4'v8/]NN4S\",\"`rCg'?[NQE|u\\\"x'FG]<u*kB'N|Ud5n4sJ_hwgg,mt ]unYP}y9Zd7`3_K1P\\\\mIfntLWkNnYPy63ki<{O_4%yXVsUR\\\\1m+)''[m8A\\\"VXd3FH6@$)_c\\\"9YV(O7MlO6S'QA<?Sk4$i\",\"n33-Mk\\\\eH\",\"nW2ulo@GN)TP@dN}bd)fVwGCD@<@J6xImn.|~)(yh$qP||A8v6.1znI|mx$Xfv9[ _LFtvkJQ!p}&oPKC('0+2~djf3|em^f?6^737VQ_dL6f/(:khCT.'%@7GfUHg.H&3I`I&Di_B@&u9UAA4kS[38x\\\\\",\"EU7,YaQTr]=L.|OHMFc's^u|NMB/o#Ew5xFU(E9e+L7r&y@O0#}BbL*lb6x:L,/.4_*=9<!jX#0@-AP%TO-~N b\\\\b}@Y+L_{'PxQ`.heb|Y'spfc/qY0\\\"D{~{eHI_V.i%qS!f\\\\h<+Bs|0?\",\"Z:-xWI[EpN.e$c%`H++^&TxpTRWW<>]!6COS_\"],\"name\":\"_3!a%gz+wy |aqZSHSrdF?T]%4k%]*n^N8l-BPEdFg:Q*}]'y@0]S_?OKS~FNAY+Q40y`4Nd2:63_Znj.y1J4@RNDFga{_s.i,F&3Z4=5y0`D>COQ\\\\tK:P<xUn Er0\\\"!N')4F@G~dngKRr=T4\",\"id\":\";C\\\\a8<PL\",\"status\":\"pending\",\"hccaxo\":[\"T+|)\",\"tI'Z5\"],\"vwxe\":-693.2,\"mvvpfeiexsi\":[\"\",\"FTjxbe#\",\"TCjG~O\"]}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesCategoryType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"iuq*o#V&M*WGd8`K8L`Sk<s.6-^w6qX97qq{Y/7'7l >$u7hEW\\\\o2C/D/3WjH7dtR.P5b(l_My=n>CW,$.KFb7z`9I?/ PTp.yKQ~Gl?-5 og~tX_90%K{!iEmg\\\"fD?sK[UCq@a8h6F<Fo\",\"<I9z>tWRY#}YBeXHqoA#1@llqkE 7&pc;.MB?c,Juz\\\"kA!Soi\",\"SnsR!f3YZGdW=jiStluk>UPZ=d;Ao>D2{{lrQ=I{kr;U|:l*,J=RH8bV$h&8:#I_.#0m/o>C~mIvGl;W];qtVD&WE\\\"3,*1x}QRcRH*}b\\\\AgX3siG#h%TD0ZZ25 )>dSMBZnyFmSZ,pc'%6;?;=.P~e,Wsisl@<K^rQ(NKGqEizCF)v}_kYhDBW&4X{KKw++j.E2YHLSYz3sF+;ssgphJ!FK='Nt>*;Dars(xJbg,M'L{F\",\">pKRw%*6OB`/+Pblqk(}mn?!3tZ:Q?76t9,<<BnW2McMwjk+6OpoK*dsB-m];Df>VySP0G1>H\\\\4nTxNK)Jwe\\\\fW1QEC=2 +0L\",\"8RQy+(>EOVY;sXiM'v7pWM$mr^3D\\\\0!4Dz9~~`y^1M\\\\NLJN4^jnup4ZD/.mJcBY*:[,fM.D=L/5URuGMog{sJQgOa2Z3tCd2bB7pZP,GNwQKf{PJvWMcRb-3rv%={R5%jV!y_>]YjR<E<Wt5@Gbuo 7&#fKGm_VPB_#~UyD.ERS&{,rb'600( nYN4:fUg1NZDLTYZ7a`6YYL\"],\"name\":\"zA<vsDmD`7pCaR@W2<MV)ml8)5QPb:2h7ZMesZzBA%uD@e?/sL_=oj(tkO|(3!{Pi71qx6aU\\\"dFpM<]}AeT?=~:|IVod(]7g8ixd'@\",\"category\":null,\"status\":\"pending\",\"a\":[]}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.category.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesCategoryType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"16Epr?XL^1U*x7w5#@^z^\\\\Q8&toNk5/u\\\\h>?i>PJ2@f_t?Aui~Pi!D&EO/3~JI\\\\`%Hc]%R|UyVL3*{'.|4]O(x*d3&L/&x-nUji$)2?Ca^[Jj@=8L7k>^#ExBLe.gprFl`*5Zg#{:L.k}'r+1d>Jky+$bf|*nTT&_r}i[`$)aB]O@cBjo=W}\\\\H#M\",\"A0aBT^_}wv%qe9/R7\\\"E0m7oxBW)`53ZaY;Lwq+\\\\Ezf`h>UD,<\\\\Rhb'{{bQ0\\\"##P}:D9*^\",\"B6>++oolpU&DY6[|>{#_=wH+Vuf[ub05c3@65KQI;^h2DRYG0@-5'W|\\\\g-cBf8wF3H(r];2,?q!x_sPs8vU?74q\\\"#ZR&MM4?%5\",\"&7z4(G ()CO/+Q7O:!#{aX{ARk#tXd-8~KCf4J *;-gR0BDq^%{6jjTElG{O6Vo+3XC}\\\"s?*V(RhyJ[Yv<{Wp<0?6msZ?y/s.)|gXgb}1$&PX'm0a:'*~pI KN;P$E!dGmv1p~5/M#\\\"1LxjQ[-LmD}okOk76B']>w}qG:ep@2#$5|Q$kvkYo`g>Xc<gcpiDAeMvnqrGxy-<DhlzwA{j__,_StxGK1X$\\\"/ldy8U{9^$\",\"@ jkb8syOlXXw&8D5+^v`C-g~LFE%ykBsp8SpUjF9p/&<tzrGI\",\"q2|6YAbmd+tw)G93Wd)l.[Un{c+2D=%3WQ\\\\7,4MVRSbitbj_\\\"Vx+& ZH`k13Jjs2r/;pSG2b :DV=1N9kmj\",\"YB6ly:^v!JPk]PL]YQtz6oU#N[NqbtroL,:@sI\\\\QC 6hHKE<XuF2wZl/Dv'=*j.h^c%\",\"*VPEVVT|SZltG2`3[Rum1PY*?FgQa?Iv#u\\\"jl{vNFo$m`g[#8fVh9It !bK$ CaH<.4ipN-#uGW7IE-F),P%5p]|(G)lU{#+EPJ5Lo._kbYeE+7.!t@rgx:TeRM5i=F`Ec=wAM2U ,U^W?*zPE-8\\\"nFzk[#AK y2r$XZ[!>@/cM_>rZ'Qh&jCF7Q:\",\"{i90+.sbA1^HYB}6})*K{;??:}H;UhP[\\\"Y'i?LApi~-eRXl]_A73y&;v#SLy3iy#+adG*,0=$7{uwH#.h'g6-N<&*H0ETA'#,3yOd)\",\"|PA55A~cX(Py_lyZ}GfTfL[bFf1T$RfdMKF_dq\\\\)H^U>W`9zPxOfxusAEjD\\\\O|G=n/s_#.V56?(|0Pc'cg',#P<5z%ECDbjnIa)qPF$JY&oE9G7t]R_/IB&-zsmZ)e)Wx%.7a+O>OGTz`*w\\\\[(P-8\\\"jx&@f\\\"@x@5:pK+ps*|6R Q kIp^6hS<jd +~I/Z%/JtLpK<,]$Z=nrL1cIOwK^biFDYB)$UH|A mF`8\\\\O3*/E6'drHeW.A,lb\",\"Rmx_K.Q8rGNGv?u/u|qkUHk[WjJ`:sQl=IO~7joSI'lXqQg2j[X|(kbPe!15=6kB)(}wibQjk&^+^O*&KQ6iK}qT`kc9D>K&,I}[n%Kg{n#>wx`w<},?,\\\\AdI$py.55\\\\YC8\",\"0\\\"}}Uz)eJ(n$UZ3}oM+}ZZM Fu^_D6i^:|9.p/O`|(Oh0<8_tf&<e;Ih`'%7@O(\"],\"name\":\"Kq6]W$`G`(qJk8b&(a>\\\"!ZlK~u?;O7OM5NrNB$iagDb@fs}uF7UpLH0lF\\\"1X| 'K<$e:WCm2LRT`r\\\\{\",\"category\":\"\",\"status\":\"pending\",\"xzbkzbqcnp\":551,\"xswloa\":{\"wkuoeyspovsguh\":\"S7vsu>#\",\"szooklipkfotpuju\":true}}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.category.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesCategoryValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"fq>wS=ud`T6BRRq(J3}w*c3l,x5=yqXN3>+ZVO%:HVC:11veQn1x>YW?o/t~m7\",\"Q5>I^ dZe~~{u fT&y;fuZ<G_/wc=a\\\\/@U[X8F$2Gf?us.:VE$U5@y^zKGqG8QM`]UGEUm<.K[$ZOmZUFaI`$yyf`H)Z0NgvMtZl``Cc&jNFMjJ{M#Dd31]q&0/#MbFw?{:si)*%k&PnWq($p~Gyihef2\",\"=A^PTm@T^#rsx:;.S9o'QF2=x4q2/:h->2\",\"KCQ5lsRKi)]3TczO.Nw< T)=L-,wgEw2wsx-YXP}[eVH$tliJ`%br!;4\\\\>'NEoQKMW~UD,(6h:qW6.e65gF^#{@fG!2<]]=|no#r\\\"Z%X9,`oM3&|M`tB`f-j:=N[IweMN#8!NgTlH<vq\"],\"name\":\"q+9*z)yh:otk.]Ic\",\"category\":{\"id\":null,\"zausmn\":true},\"status\":\"pending\",\"ben\":[\"2E\",\",:&(|D\",\"7\"]}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.category.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesCategoryValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"zzdH}HsP;P,inS3oCDWBZ<}=E*?\\\\eMr'z_;XO{an'fi`lPneWL{tLH.S25$\",\"!3+hC;9=-@qeXMV9x,K` =WP*>ZZBuQJrD3UY@X?z6@m~QR]?3J-p!r/*O;\\\"4 \",\"[H+Lj45'\\\\m*B+`hJ/Ar5<y`:h5.ZYp>e\\\"TaqdCQ;w}K97v#z%P'C7w5t:L9J|9vz4Os^tO^_sOs.4rQ6K7Hs:B%ajV5Pys~IFFhqKe<*@O[Em-0H^Co]+PLQ);PSD4M&jwXdujjmZN,z^S}#egLk6kpX7CDv[N{1}&\\\"'tASTYeeD\\\"P eK:Am{GCNF6?j.g^h\\\\*dd`y[AtB`mx[@.]*K?~4n4kINy\",\"]Ds~M-KLVmQld0Y?n$@ZWP5VeY>|k*xM}l\",\"[ij](O@\\\"EDL!TfU&7|'+dt'(/+c+Uie 5{Ky3u *ISY<acLW&-GdhA1&${@y^}HB2U*P\",\"jQg=jg'?}hQ~~^`ExyCHhb)p%6F ~o([gyitI})1N!5{cmA@OfM5r+pjqt%bu)cEtt|5MD)*eO&Ks!{GoDpl6L;oUXtAlGd@UfAFXwH)V<2h`Vn#,RwAl4t/rL3wG4NkF&V<|n8HniQ%>Aa`FM}Aj{sV-bW]^\\\"#C-Z({S%u\\\"pNj:%pX$[|>]@=iK~Md/(~v]cmIYPcctzY.!J_?Z_EI7/E~Bm%&||MTI\\\"c%gV({U`6a%orj1o/MXrPQ]K)\",\"t-Es|7?0\\\"H=L.;]PcH6myQ9UzwIH~5y5N\",\"Bm`Q\\\\QMe`mkWLk+@jo8;-N0;z~as{k^pDQ{Bz{zqaw~=C25K?1v$bE0~ 'xf8d=bsuJOcwRTmdKo+do(nva]_Y9&#Du81^&vq\\\\1+vhb]`3a0!8!Z0fc^(Y3]{+w46P1Q@XVxwqb^8)!_K,ycX\\\"'P)-]<C8,`e.3VJf%Mbq_MJ5Qi?3#[K0;ug6aI\",\"6XWtz({4CU2bQg{Qe@C(h58tya>Zjd=SGdlxi1e5|Wd(M9:%@mY}.w$T2'*bnD]`\\\"w2)I>,2,E+K\\\"bhc*1zo3t\\\\Fj<]Z*s3TV)y,XzB QN3+ed~S+pYu@dSX<Qf0l9kVp}tT6PKuP=kkX}P%)H`KHZP-U3YYB#/2\\\\90&\\\\S:9*<+dg:-uS>7/R@d)d3Uz9\\\"YTlymCf>g9B')O8+>3\\\"#Ef'Z!B,fgd;>5lv|\",\"^-,!3'+o\\\"C_Mc}w!f6r`efcBTOKyBgV\\\"VPzZoE3}BGA9;WoWvR1@k=QoI`{/8uV7!Rv}5-{2VPhwT14|x^bP<;RatWa9$9Li6<8u_/dRY:|Ib^yv4^0{}>d5SZsm5x_bu3f\\\"4y>3*@I];^^ZY6,9!P=%rAs4nn-[AGmT%Esk.i=V[M\\\"}aD$Xu:V7/H_NXU\\\\Nx\",\"BwbPw$6=}Np\\\"/06/$})&4?j@yF`;s=M>`e|+X;ePVrL+9O@{q~wF='QOucC]dUjiVS]9T.vl7Yz-BkQR(:>,g7<EuRjg+08OV~7tO4J=M _-)4N sBqi0U2j[*F6y(h\\\"#k&x^[?[PT\\\\poAz5hXG-O8B'\\\"dUAt`JTM%X/pgGHC4hN_p?;|dN)cZP{zmu0sSTitB8|K \",\")<%4Qs8~Q+PrFWrUkY0Xeh?pO<@=#,U|lS:kn,Mf>qv #KJAWE`]MleD.(~&%*%S$erL?2V{_DLo:sSeahw*@jW)Id=X;QQc\\\\fcR_PrRSm.1DUasl]8&J6E!-FqP)?&F\\\\e\\\"*H*Nuq3J_0{rh-[yW>fIsKdR\\\"F x.5\\\"B`IQIWHRh7~0w fUQmUVi]qKCP+\\\"/cT{'5Wps}=WC*Ndz[JOUW=kb8OWK0>0_D+n6_{$\",\"_9D@M<A@StOAC~nmG&%x.hK)mHN|Yz:2flh5AzvjeZq{jy8'O&&']lym2.1A'*CN%e\\\\aZu&o/,V[<-, WdkEjg=zyZ2aR'Re#+knn~>KGLj.Y'Q$`F|&;c}A'KL<!n&sk+9Y0Z_*'CfL-Xe/d5s*qlG\\\\Y!&gJ6Alc<]]\\\\b_zv/PkFjSF3eh|NvcC&ltK2\"],\"name\":\"kL!>mJ{96DR-KY7$)s@E2\\\"J[> dKy,P(1Z4I@{xbIg0`C{o&.Ww.X&0$:.0*w&][rVLkV>/U\\\\btp4,+}ObZ(f:eILgPwGOZ:2u^Fe,nP-7Rnk<PG,e\\\"~IiIz4\\\"aA>{D>9~Hzh%H;D\",\"category\":{\"id\":\"fmTvtC\",\"hzcubxc\":323.2,\"cupbtdncaqdthitj\":{\"pgmlzkz\":\",R\",\"opjdwqgzfbtipizv\":\"WY,\\\\!F\"}},\"status\":\"pending\",\"lkqlraqpfhyo\":true}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.category.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesCategoryValuePropertiesNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"[?&Dmvs[OR2vaScIaT(z'/}3o8wtIMdL\\\"k6S![Y8Jr9$b^4>nXUG7v^ nJDg2?|`Y]NmHZ{eMD;$&wzvd]~*MR&xQBma`&n.R%G'1#DCH9Q38L/\",\"c{2,rEU2=*8`[g!~WeKIr*P6q` pRV{E0GhF6wLU\",\"O\\\"b;~UoGlyE$\\\\wpCGv<M'55 s'BVvm6#flo.MnDD4%ZatY?\\\\cRL{)3\\\"!wL1u=A!){:?X'bF5t}\\\\\",\"D:,_'Iy}Dm?q|hF[>+uAGU^%wI!]X{Buu5ib|$\\\"dt<D@y&@Q|5>'V09Y S58F38>k|.7#`%bF^)d=[gmw[ge'\\\\Tpl+}2~,6eyV@vjtryvH+M[;=8nCZb>i@|;NE(GJTBCUk5n;9E3C'Y8x32iW)j%U[Y 0D{h0B9_m22r]kA<:\\\\V$@mNI^q/bf~Ic-e <tzUVm5+yO\\\\w,k\\\"Ab.CcHnb7Ds!moL;oZ`ph^r|zSx]vhY>%D;UszSH.\\\">Y4]-[/}MnW\"],\"name\":\"fjo~2P>4) E&F>_wp/cvN*?8X1/q\\\"F^uLVJf$&F]r]xp\\\"G.OYA0=,L60yEGe6Fn.9c@a&tP)SE2;4Mmxl!\",\"category\":{\"name\":null,\"id\":-3801894448423157156,\"kznuhfywsmlj\":[\"hAk?}\"],\"xfruprvwfvks\":34.2},\"status\":\"pending\",\"qaz\":932,\"edvclhltojfllrt\":{\"adfmftakcvyj\":773}}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.category.Value.Properties.name.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesNameDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"QvHTa7fs*LHy<OQku?!WAdtqL`;ZBhi,p]48IaT8-K'o~_A3o3&(+:e1 w<gVb\\\"O.wq,q=JX~p7_]S)kPxGqt/S#[E2j<tXX+K&8c{;]+3Vg6=F` SK9X$Vq(@x=)1N7UuWVYln0Dd\",\"jqj?DlTWV>ESci$ABFz'Si7Qx:_\\\\=N8h\\\"8D?)*%*>uij{[9Meyg/\\\"`E\"],\"status\":\"pending\",\"dodtwj\":-361,\"lioucon\":\"v?M\",\"zkqugyfnl\":-849.9}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.name.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"wIkF\\\"Cd-:;:G2!Q3IVpy8(k3M[Y<[|wwQXpjECA8RE01Wsw=h1t6N,.6,C#GBQ^S1~h.*gXyQeunT0RppbKk5TWoP]F,:v?g<[zDro6\\\"u5.*sM3p>j.wwVYroY:,Y#6?\\\"T>bRUW/C#P+z`t&aUV1iiR]@NlE~Nm>JxKw'a=dr0??QlB|\\\"I4D+#hI^hZU!:w,|T`mLcoowJERhbnCx8P8-/zM\",\"(\\\"uJHy|L9R}_K7,Lwr5P:R&e\\\\MKEje$TcYJZ<@;bZqiHr_ypPyo$!\\\"A$jC.-#QcEwgc,,+<Y4YgriBs_e[T#x`9JY5@&Mc\\\"boVx7$WdEc}6F@\\\"|0~<u`+b[?)tF/b0/b7)EN=/N*?J31N~7~.PfR#TE=)@STFl49qCQM:Tc_x.akX\\\\nNxL>%H\\\\+R@SC||_+&E6/L5`Z.Zw(H]ORr4TS\",\"[T&Ni=MvZ:DNAlG>85U0**#jDvsHA$Gf'_EpJq*7l|a(P]g0e~F+@ROv\\\"#ULNR]pc,\\\"d:Ck1^#zg~khT(U]@&a=tr\\\\OA_3=Z`3V$f82p@F>D68$$#&|@dnQlX+Bs{Yu@3.dI7:`b:Mh?PNfd#5^9w0m|?CJ9lhE/O=(r=\\\\@bvE_6(ACiA29vXD?!Wz6BX\\\\N7hl7&pcZs];ZuFv2.8%=$_vWzid'+4P~(YQ2gof\",\"qi2S'P g8}&/^BX({QD}oP.V-1L2T;M tIp5jXA/VV;o5{7dW &'&R+Cvn\\\\\\\"[UCpfT1OFnUYk])>g1Cq&ZlBr-'%,\\\\1A&vjf!dTF\\\"Fg/=zC??=vJ_kF4B~keA6 k4Y*yR>{~ujeEX$)}}O9koBb~W'GVy`t{8#Y/rJda pI#[Mqi76,\\\"4aa]&[Us7Qa?9M(g2f8Zo{</XJt?~`aYuXm/\",\"VFu%}Hs:jP|5j?X*3)pGNfj~3]926\\\".Q3\\\\TO3?aTy@3:\\\\Plazt@?%`Vs(\",\"6hA=8.iUG0hM@Q=g&e<^-oN);q%`/V Al1\\\\YjXs%lR=r4Arh'CG4K*')u=~'|1%8v*US$\\\\yO}d'm[:$1b:[:Hwn_|pUx8H;jB\\\\F?kH_\\\\cX(mew]6zIC*5k1sj=/zBlj569HXcs1Lu(lfItO:c&/,`\\\"=#6*`,m^Q4E*B=lCY)7sJO e`*HdUrX7q)@D\\\\ `ISb\\\\sH\",\"]&zW:L6'kx&BJbBG@;qx2|T]zww_iv$r{<]LM<ptJ?\",\"TdaUu_%b:JT))+6&6;rL`jVGqTUgo5n? EVaiZX[8}!1n\\\\:x[)m~fsiKjw{990\\\"&dMGiXk(\\\"t<DlAwRG?ce3x wO&=%ys#V-{SS\\\\m#H?+~P\\\"zwY_?cCfJ6$emN\",\"tX%6O]SzqDr8^T&*Mr2)fZAkhi+gd1@gX+kqfwVr0tQo/}%K)|xr}4`zUx-lGWv\\\\@bMi#v[;Mi7@+^<d]P06l(f0OHYCg`lLHMO4/'_/+!UsY3|Qvwp 9O6[%[8O\\\\BOio%`UunH+$lq2y3!]1}Nd%nES9l&}WY(lXc;ol<;'-'Ljo`+W.\\\";f+2,cDGbYIZ$gyX(TIi\",\"F9NNx?|M;/-#BeSUNj?Omo>8Stv)vP0NeaEA$.q[&~qT PCj-/6bW(ay]Fv:wu}vZ4l6s\\\"bz8i\\\\Z;J}kj%`HxC$=`^l\\\"-M_ gN\"],\"name\":null,\"status\":\"pending\",\"kfg\":true,\"esejylqtuu\":\"J8dl;S\",\"hnhbxurpvbfwcqy\":\"eqy\"}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.name.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesPhotoUrlsDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"name\":\"8~=n|\",\"status\":\"pending\",\"vxydimotgfuch\":[\"d)m!n}$H\",\"E>OA\",\"JE.\"],\"qwqn\":[\"/#74t:;(\",\"P\"]}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.photoUrls.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesPhotoUrlsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":null,\"name\":\"~RZr+gY>(\\\\_eJ;oG2l=mI2v6(!3~yt +L0nwyh|tRkmupvL^FD~;}BB8:rtr#/p'x6[VY5RQ>N>K`Q]KV64J`fTcv8vjRY9QMrHvj$ZnTKB:<DUPj(bYl:I>gw (Q\\\"iaS\\\"{\\\"(V<yU?Bl{?@hHIeV{4\\\"Q1>56jURM'9<Rs-]Siue;Z$0znRc\\\"NSE}&Vic\",\"status\":\"pending\",\"ckhinqcowvxew\":-498.3,\"mcltnvoeg\":295}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.photoUrls.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesPhotoUrlsType_Is_NotArray() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":{\"jcuufrh\":-91.8,\"eypdpivfmmbpofs\":[\"iTd=%.q\"],\"zosycfrln\":[\"\",\"C\"]},\"name\":\"YQll.%IWzkLkY_wgpbV%\\\"n6[w$xo(sp@k_P|.NafDAOfy/Cz7y6##eFe-Eahm'8wMm!vJU5i'&~]9aSymqw ;xNNT;K{`<:)Cx?fG10,=.CHZ m`2N}ABFkXe_T?g%7vK/#W(~o\\\\XQ<k!NSsX6r(%}$aQst)E]XAXFfe>y!JZmMURQo5uUH~CNJW@dsVCL+4<42.`VQMyF\\\"y1UX2(AM}hA4vp? Ah;$<FR:,h-w22.q~l^Dk\",\"status\":\"pending\",\"wqkarfe\":true}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.photoUrls.Type=Not array
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesPhotoUrlsItemsContainsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[null,\"SG83CCQ;=+=i[-#.5dS$PL@tTf.\\\\v.2G'Mi\\\\Hjr]{s^va=Tjx4M:hh:7<h6:/<0%/2e;!Oj(IG WQn4$9Hj0le6*-Mf%_>{Bzxb:Ho=rSP-jbN?\\\\1K`e`%t\",\"^}A;P47vM&()\\\\Mj[] ?=}*5p=fJfOfQP\\\\nifbi,K5*9#8Gd: )>\\\"sM2Lhn!L&_D\\\\yzQ@4J6*'pf=b\\\\kL9,XZjK&,5CJki<NYng5%xQVX4.h]V*B'5FgmR~hMYyo5\\\"nI%Zi9{~HF/dR;D9d1yR.-k^]&O?,{l|L FSj.DD:~S$kB#Mp)oTrpF,^J&zYBbw\\\")iN6p@,85X\",\"6SiJb[oXeV1d.(Z/<'XtaK+J?;~>E3uA\",\",w^v4_b4)Vds*We\\\\\\\" f=E.jJZPrK^9-32@QQ,G:zcsUDzNEis0mQwMkyNh=w?o4ARBP\\\"RI;iy#a>h[d,R}vZA>OTKR*{\",\"InDA {4eTf}D_+S+-$gAGW.Pnw) W)vfO4nv&q,sJ@`+WZ3n4:s],-GDYlso0?Bbk;ypQv&s.EVkV9Gn-~S0AuX<(F+'P.*P=~kRMR[R%E\\\\?rhD:i%6g2oVmx)7DQi=eh3:*pWOwu:;gn2\\\\vscc!,omnCxFy_sf*{hUN>U\"],\"name\":\"5(?X,+A&Ce7k0j5YV_rP[2mD\",\"status\":\"pending\",\"v\":{\"rmrorp\":[],\"pzdillzafetkba\":-411,\"uhtezanzekrk\":[\"O?yiy7\",\"NnK\",\"044[mt\"]},\"xldhwptu\":-1013.3}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.photoUrls.Items.Contains.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesTagsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"Ir*%L2lL&6k?[M]C_]\\\\8;N+k3W;d`{g]HY>L=A<Be9jEDHozD'H2\\\\0%6o7,`r4KI7'\\\\'[Vbd>IZp|cGn]Q1J5vK(Y>V{+Ipx<D6IE=F${&c62R[9T-myAKbfy<6t^F<|YNx^$y)KC>$'=FQlC%ZDC:#LWad*eNIe_Vc/KHKW@<CCW'VWz\\\"\\\"i:hTIk\",\"EC_$b><>3Y3Cwnt5${_AkApt\\\"NY\\\"d$M,^qdJY*#vBEsz*I~-#Juq*y\\\\Ea6l_cZ%q7'v^>w1/;EU$tytLP/4\\\"2t&45@ P\\\\?\",\"fLE8 6Xo\",\"e.?N]6yM{Z2_Mv:%st&s1ZRl8^47tP>#0Q@A,=5;O~#)lQil{?3&Nga)UmU[bjQuMQJT+?E+e(pL?9_;-&&K0fzjhm2E, wO jM)&iad8:LwW?cS('g\\\\dqR`a}gN\\\\p@rN9E(dAh71*| EZ0ySoz.)tBL ytJ,85A%3i.eN{=?jCW_9zxDDg<JK<9n.KL1N\\\"~Kz;VH?J9\\\"\\\"<Ep_P:B=SvGxNySs@m`Wl*/SE&\",\"DE0pInk`mc9u3]\",\"0;1pZV5K7t#AV63xddPNGg)C9AcADywq5qd$txqp4yk7=wX<U[>H~T+U[UwUS7O~%^*A`PQv<>d'VF'7o+vR*5[8RS[M>Ml@FjgRPJrSa {4UhQ?;\\\\?^)9vJ\\\\(r-w=:R8RRAX@hm&Q3oo//!~dViL\",\"Rd<`,5HeA,gG8\\\"o i\",\"zp<*${]@'s,jKCMt=5(49=_A^mX0d1aNqpkq0\\\\KQ+J2{,!lAL\",\"6-M*'Ag`~VgXCi!S_\",\"SB%n(S>5rAfs%QJvs<[RfuDz_Ev/d$Sk1dgVS,o6I<Xm,qiHzX@t.]p$-G'C01nJn20yZyf*(Oifskf>Uw~gkAqJTa|=>x4HU[I99x2@`GhrO$'4F&]u-][M}M~F`2H`jAi:4@f}eZ<G6.'#Sm@,6'7K2,0fUn*y)V+=,(h!.H7.:h-M9hNwPbOV6qVm5iu9<4*y`'\\\"B<Wy]?4%aDe,cDC`1_l1='Sk!H\\\"v;\\\\uFm^S!\"],\"name\":\"5n[&Zx>QB*6gMo%,8Xc%s;Gyr#G@\\\\YxoCJ`.MJ4^8o,9tDLZ*A=gPdQLTl4s/dq6$Zi Ny!)cP9;AYk:z|isziZM%w;:B3\\\"WTv\\\"<H720t\\\\IM{-95cY9@oL(P72^Fv~||<!m}5<$2`kIV_(6I l.5+T4$7Ldvj{i<e1Vmx;a8X!g4+$[f&#k5OklqnWYpC[=W}w;<2MTP\\\\kDw>}[\",\"tags\":null,\"status\":\"pending\",\"mu\":-450.8,\"czqnvqtz\":{\"tjhignjuundx\":\"\",\"qlhukbw\":-377}}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.tags.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesTagsType_Is_NotArray() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"|#QZdM,h]0.ewYy>s\",\"Dn',CQ>[8h_,C\\\"0S;ev35y6|A+L\",\"@v}1k%X{U;#Km\\\"HGhh]Jkg 5?(%lC9Jl%_-_W$7-;;GT{pspO@-DW<TPjESA0y7N,?`VFLrrE'27/w[7.^n,Grq{Y@B8}Rn?R+'i`sl||O9U-2ksV,B\\\"bU#FKRlA?@esXNnT!QYmpLUd >P\\\"rs]h$^X*Tzkh{~`.Smt{I|L{{*s/O8OK;8g8r'+\\\\A9mAOG$~V9\\\"d@@4J6L$uE$Q,=GP+k\",\"r5bH\\\\;:\\\",]xVVP92ojVPi>3`x}r]<&N-&M:/eTp7*jk&!nWAsj$Oq<bw/_NKVm}D#rM#]qJTXc'E>>X:2i>uAtvX8O]FF|b5Z*051QPe:-p]immERr3id~/IA?<p{]aQlYDz3LfHvooBcMehJj`:+x8`1d,Jy^m\\\\njo^QT[AF/_UbzWyA3jugyg*TrSEkh'LgF]S8i2EDOriUR_9R(z\\\"?HRqpxzA'J[C8l\",\"9Jq?^f2wG1C]\",\"A^[kF?AaU3qZbQE}r\\\"{p!cG,bf{^]VOl_kfSt%i}^NWJzZ%0H.P[k@ALdP=~GU?-=Xj\\\\ebx+.J5gW,jx?+LJ?U'V:A!1{*h\\\\N'zOJ_fyX1g&sC--T\\\"[#R4Bq2 -w@[Sef9KJp`0*M^/rO#wHVu+Qw$2VfUqs#R?#X6%\\\\e<YlaE^4Pd5\\\"Cpg($@3sdA::y6j,TGxRfPAN&3}Fu%/Ilg1\",\"=#'ip{UB`W,Y5=Zf7/HYets>]k0AP@I<vL`~I~6jo-_\\\"F+2M+\"],\"name\":\"AWb(Pp,=a?.a~FJ}2R<]w4f?iYNil }D<n1@(Pt9FNi4'(Do8>h%Mpys4fjz3(u6\\\"x&pY[$e35|0x=20`R7VA-J#Us6W[5l9GgQiMUs9G yLah]#M_el9@Xm&`|>}yA.h|*7RK,Y]pN*teKcK!cFQ8T[`C'\",\"tags\":true,\"status\":\"pending\",\"acgsrhmvdbgckj\":-593}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.tags.Type=Not array
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesTagsItemsContainsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"~/5n3(`.AAY'Us36;Q\\\"n{[GXAFL6V$.>I,E~#|<-mpXl#vR] >ORi<9:v=X(K?s#Zgp:]0IR41.QMy?6nw7|zyDb){Q^N|t\\\\/Ob%aV{p\\\\plh6y*D\\\"CC $br__/\",\"eW7W&iJXIy{lZ7+u5,?9V:py&3=3n|s\",\"_juCbCz-36a>o,e's$sxOJXh^:kO[M EY0&Vj$==A(rw7Hs no$E&}-I+d@&5tYQ`fIR\\\\6v[dB>knJB{v/^l-)W#F}dL1nf=<~fz4:#l$Vly;=${+o,~LD\\\"9(TV)]oV.p~9W_GFVE-w<DhOVH0$1#:',5XTz`21c0uJC%@`iaTR N=v,Rb~yo4H%Ct5*' `(/h}[CgvYr1l{ \\\\+~7|,!$\"],\"name\":\"ZKi$dO$yp<~}_bGz[H/+ZRn0~k^g~;Q`k)QF2%[UI/d>f\\\"#w 5ihgLw<--i+Y{c|cBgC'KluZHA'50J}b!i/<hc4J}+,=DwDgb*`7/['/VJsL`\\\\SdsUO%4de>YtU_S4.\\\"/ d^|in'^v*wTpUtnCvvSyxw7kf+x/U[D/3>~!#XbYTxtN4U5<pD7Z8Z1bbg'U?}C2IBv\\\\V`A-\",\"tags\":[null],\"status\":\"pending\",\"viwqtppnwxzar\":-833}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.tags.Items.Contains.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesTagsItemsContainsType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"2qHQ89W%*e>25XN*jIKm AOn\\\\%;+3R26#<K;_X4H5&at=mw+cX\\\\I8H*)n[l89^o'|#q0eI}K6&>9\\\"(f<ot6^dfXx7N#x?}1?cp~MUXK1JwXE\\\\N885UeNFd2l'LvK3/833z <'zji)._:@Sk+}v'CUON@)zLR}!\\\"^R@d&|8NV\",\"iic]B@Y3dhy1:?67ip)Z05'y.eog]iJ}YDVT\\\"6tIBUP7NLM<_eDt&`)HAKZrf/TV^AY|Z0E{\\\"DKyuUAWfkb]qz6g7ab$~0 \\\\R!QUF#1\\\\PR)S6|2J:Zx!kCxg]ozP9T.Qj?24vPK1?OV.5nd1\",\"Z]qo`6xfN4CCJ\\\"kEnic}$KRDa:Ffw)PnFZf.i'lAyT~ZRkY3|_/nsWBi,*l]od=o9:W>5{)5+Wb^YvfPm)X$?}Z7tR{PyZA{kR~:~>~T.n/3&LcBA(0J,>?w>7d\\\"Y[\\\"`xEKyMO{[Qx8(P,8C@de.*v\"],\"name\":\"I=j#e6&%Y)%xM@%i\\\\z%T&NNl&Joy?t&7XA\\\\Yu^E2'`dSC<}Ca]+N.mn^`x d3hw`4=5Wm2.)EY}JAe%<kM/wU{0{Vzq;]mJSZ4lj^',ny3y'ZM(S,HP@/e6C,1,J42eF8vey4jN} E_D:)ZjXs1\\\\fM(S1zJT[F_H'EmcP?B2F{`8,L0m5C'ZS= <~}3ii,'uw95X5jT& -[P?,yb!1Efbk-jeB-l%f]8Xd7@}a1tcD#N`VC']\",\"tags\":[\"fym%{E\"],\"status\":\"pending\",\"mkvz\":[],\"qtveadfjlw\":{\"kp\":[\"8\",\"JJ\"],\"wlwu\":-1001.0,\"xoeqsebkgyc\":[\"4Z3\",\"msaB\",\"ABuxO\"]},\"roacuzyxqqjf\":[\"'6\",\"6+ <w\",\"v\"]}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.tags.Items.Contains.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesTagsItemsContainsValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"1_:q0ur]}wRv=?sm)hEaFG&'beZU'@{TFcE=u@L\\\"vI<>`|^J0/q@?qx*Z0S'$Txh* <^t*!M}8.LVhhrt8x7(_:K%E=}H,8x8aX0>\\\"lbYyktT`Cc0&3v7/(@!i&@6Zl7DpMt-0|Qrk??,:;=e~6yky_7'5y)fPiz:]r%T+N\",\"_,;v6Lph.W^u0%[%$HqI0DL']&CE70R)\\\"bWUOns%mMfo01nFo!WQGZMdlm1H+(hA$9CVtu[\\\\K[gSvm7N?\\\"pq<_!n=X)euydO'W@#xic$P=*5XdrCVmG8zJT[O}1*B^[t1T; S\\\\&3y]zR06\\\"1hP;FWDoH4>jp'>(Z,^<I1 rECwmP~[AsT)6uPym\\\"4A%l 8tmFW_2!Id1@@V|Am_VFpp\",\"DCA`ysgPa/:m5+od~.>'YHN,\\\"XlY2*5`}+dRs)u='ak6{<.T .jp#5`*PYD?L*Bl}HYK)!?C)7 y q(c:6RjPr8/Bd+ENPrA,`CvpS8`g'Svups~TB6U#vN`WwYi^3LkvjGQzhc}1h\",\"%pDM}F2!'9B<aI~AIb(#d,G)(;N%lx~Mfc!`#XkKx\\\"%Z?oS@`PF%7(FM<:P;?CXXXwvZv\\\\;T\\\\4%Xm#Yf%5!jo}\\\\oW3qH4Ez4rS_iP|=yk},+BgyD}LG)pW8$/_YoH2Pzhgq.1qrzxrYFUkj/3h&^> kDg}5<\",\"(#/sNZa-M&_%\\\\{,bq+5DdMmy7zRgWlJ4kdH6qR3?qG~,hi7N.dBzfE#wJT!~1:^Jao)M:UN^;w )dtS%$;h9R$~-!G\\\\q?J9a.`,tlio[/pf+ BpyAt0O|0!5J IBRlXr@dP)wOuxU b|p{$Ky(W!g=Go#1W#_KtKo6f+EXd)&~ap^6`8zJ%qOs-y?uy4)W6(l%E\",\"&,A[Ok>H2M8}zn9AdA%8GYW$+\\\"Q*qgh)1+I5rKu*[pFL3$xczGwnyhbX|h*/Z,!7(jQg0|dc~[G\\\\i>9&'1hPtM[%1!sP|veU&ZD)CFJ0ea~&:l3J])y\",\"HKK eG]\\\\osQ|x:jq<,!u_ey^(\",\"P$>Hr;%jRT1,#Ou1rLM,^hk5&%#CP7xY|KS#|%*_HQnR$.Y5~0gKB(T0==o7Stfb}<%l]/V}({v%]g>=vI?mVuOWBi>Tv{9@dqvVMx~+G,Pe91O@WR1K/y`EQ<zLCab}]f(C9{w-h.tl:$D,@jg:o\\\\^eV$+[6r&$\\\"%gMBN\\\\X.'HyG/JP0\"],\"name\":\"LfPdONP0b&\\\\\\\\knSF)ThT{[5UdS5M<QNXX?ckBvG\\\"EtblsT[.qaqRPW!|Md7V^wh2BtSkL-3QCD0|7cLv=`KV>uS(fMDDH~M)\",\"tags\":[{\"id\":null}],\"status\":\"pending\",\"vlraz\":519}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.tags.Items.Contains.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesTagsItemsContainsValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"7syV~wyc3KerJc=\\\"b+wx}Y-;Y\\\"<JTTHcrrZ:8_aIzJa@qm\",\"Hv2t_?JI/k`bW[HCo@Nt&wz)x18*7uV?M6s>QUHc^CtXS%}ViH#.&X{7XyH\\\"\",\"RY?-RpM5*@-KiCH;KkM{egOxGq<~qb,ZWO[6J4;b5Li|gm|T%!)M8Q64TL[M3YCEQflI(dd!}Zo#LV0.sg[p4M:{LUkD\\\"g4/nS7660#$wm;Un9ONI\\\\P+(jtuac_qCurbwe<mn_wVjzT71\",\".mFQD0| @rUpP:S%FR`Rni#I90~DQh@tey#WG5xNX\\\\4L$(Vsr 6O,zv_{e15pv~*#>9PICnsy3T0JG]QA0X/720D;OIPCiATmmeyIa%64?e)U,\\\\W{W]vWrwi?u_B{E=d+ E>) v87h5phTsJRI[Z*[7=~xdnCPb:H](_TK`G-<i\\\"1Wr#i%=_So}E!1OeWs3%/8tevlEv/|_GWX)TbSP6<./!UNp8Cl:sFU{XN,Mcgr}W[{zn[^9GW bNy9HEl{]z\",\"~X$R`k6mx=Gbdo\\\\U(LYtwrWkHVNE^'K*3Y\\\\\\\\!j:em%!#A6ot &@yzjQ@!s*\"],\"name\":\"<A.I^zTm3|]k0`0hpo%pXhf}wuRD;pHP1q:]3b\",\"tags\":[{\"id\":284.6}],\"status\":\"pending\",\"tbomkxxlcbkjzx\":-721,\"wvlnztyvc\":-41}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.tags.Items.Contains.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesTagsItemsContainsValuePropertiesNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"(21/-#[>sr;Mw]=^^{mYo;4%k#ga-~0bz%)vGoZc4W$#@O|*LQ=\\\\\\\"t)W?*A{64\\\\)2L7c(br\\\"dqI)\",\"yO5N:%=WD&5P0E-DdG~3g\\\\,; :I]m&S,VIbEb,#`{>#sCl96|p@P[tt*}eDc6 7j(5^@fz+Xb2k5D/AtG!5HDjxAS)Zhi``{v#su;mSu<2+DqqbR*}KPq~tf\\\\6!x,'\\\\AG MKpD='@\\\\~JtLxq&2kaFtovC%hA2HDCajn6A|7<e&SDcH>/Wu,tj?R#WE:K\",\"/~Gk^CS8C_zVIzV,Ka3yh#m}\\\\$x\\\")]*[`x12fCV_ \\\\>C()<B|u/!W=~eF]$3}M|~rxp3jTmcGmaY<}|PXdpg5xpI\\\\5{wmd`U$.LJ6ia$pj~iw-:T~;/*D 8Aj{^07^R%8Z:!fanS=McD9c)n '%mu..Kla:zrbkfy`0%t.c.%Z7w4>7)LMC'gn>DI$]6*Z] 6.pvMnvx$Kd]p#2:oUETU0R+Ll\",\"3=R\\\\cJDTO-TV2#N'#ikEFWlB]xUjzmi(BM,Y:=b;`.qU~nFc?7qmLwsM{$|la5j|yN)\\\\\\\\;*I>p&%Hl3Cm;-haeFrxD#pcCTj9r6\\\"lU@-eCpHWn;_+#9+,WgCoMXG|XB52k%@R?vzoJ<m1Jw`};?$-\\\"m~t\",\"5\\\\g9W=|+6\\\\Q\",\"hD>83 oMS9?[uc8{m b38N[H5Yi.']\",\" {Fym$x}X^Px<.gPF->k=_D'K@oai@Boz_+XJ;BKd1t#dd[M/.xU\\\\Mz3q03U4k2v=FON$8G 7gJ`)Jeet~q/R ,+lI^+)0bu,ht=>,4o{Fl79gXv1Q7.mg3d<*51@s*3brh:p#:_pw,;e1P3()^[N\\\"Ggd]\\\\h\\\"&0\\\\%nQ<g`)bc)vk4DIc\",\"UzBM(LA%T,WBNj%[_0!iHKh\\\\0mz ;Fi\\\"y\\\"PPMT3b-4RZl-3c5+mhr k\\\"60p(]}UZV8%552Wc0g8!XF vl#}3fL=y5j,~\\\"NM&ji,1ikWZ10hV\\\\\\\"gSEWNZF+1[S#\",\"A||g~&Ph7\\\\x%%yo?2/r4oqA<rctFI+R65M.(>f\\\"lrJ1FY_@B:EGB@li%:=t7}O5~8};+() +g8!W;\\\"SAto& x>}3TPDDf-[&KCOE'<jq6|~VpGs)R#h/!*dsfC5Gmdd4ohLb|CE+=}(A9Pak k:8W{Pl#Ge7$g6$V}I6P$Jq8};6(?3K>A%#'PA41w-xY+.a:(Q&k vzp{>I,^e<]jiDGt%h46CGK-h1d[S4yX^\",\"6\\\\pIvz)=*y1xc=~8ZzCsk'*b>FqKh,NhEXBOB<:mZEy9:/Q]bEuS~]gg`qn9h`IJ<*&UV7'BsDi7{~gfXL`Kat*2>6Qk18?+R'%iUWpB-p8j0Aw%<%1kElwxg]rt?nV-mhU;}ld8&[8c/-KVMtgc*TGkqrh3'=G-i7oI/ccJ_Wx.kz2T6_6,^9_o<$.5If+O[lTOyhuN+{7 b#X-X#\",\"|qeQ+L:fJTFsJER1\"],\"name\":\"i?.LQ\\\\>}r/y9!Iy4M;aV<hmaUaK(j.r%XlM.r_zHu$b.m}UAyvKHm/P)yPfqF+5J1g#dn[2/:jk13JG}'9kzGG?\",\"tags\":[{\"name\":null}],\"status\":\"pending\",\"lgzlzrh\":-733.3}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.tags.Items.Contains.Value.Properties.name.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesStatusType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"ET_1`Ax>}_F/ogYo'7.O.3\",\"J)H,*1Jrk`>YD~oc -u8YYaB\\\\Zr`BbhQsUw_a~#mc?Q+3N[y?egnF+Yf;H8<C~sI*4RLV`y|$#$lj 30d]=l`(H9:@6xvSXYl-|x_V]H!\\\"5_%7EA?uQyT#st^n@ca!Xdiu2V\\\"}*L^=fq++tsU\\\"lg>A; b !QHm^f\\\\|2Jt\",\"NsX,(;:OZFN{r>&2W\\\\)Z0iW7)#My47a@Yft@^6UWxjx_G!U[9/yY~Zky7Q\\\\7'%g\\\\A#U=S&e0DtNgcpV3xw.61)HUu>G{kpTY}F>agi)~`/-F;u 8Tgm<HtDst4t5J2kYHlcE>ab2wOa}W\",\"v@24]rMuUFiPIK&6.@;W_hW{1q6ezuNuV?sQjW5[$o?!l;\",\"UX]/(VtSK3YQ&fY%xN}IY]4U.IUJ=`Q\\\"?ikIu>(O)>Fa^[,p/1n`bhP*z\\\\kWsTTW]Sp2^BSHVcB\\\"#<7k.4ekjz\",\"kU`Tm!KcB[i=56Xsz#)[\\\"=t1JrtccsU2JYNbJ.{Kf);{WnmKt\\\\a:8M$mYM1Bn9fqh1yT~,a2/)2mA1j~B$8\\\\sZO<jA-ck:%Qn@WQ~ Qz4Y%S5l?1e2-6\\\"(pHjY KF$,~zq:N$Z#u&=]nz?&ejhN2xE^=vtGk|}>DQ?J$`]lP|dZ!qhB6pzL\",\"|KX`dO1g@>d%jAPTPitPC~M7}.oQ;cbQ64.q-.j\\\\[x1[E,e5/$}m\\\\=z<Zi0clgHT4mFr#enIcUV`q8;[\\\\7&uq2#13y6+)l?D}-3UOdC>6Lqjt[gY*j^<pvxCcD^GKEf|Sd9q7pLt?{|mCepCNA:WHpG~:+xpY4KED5.m~%<L~r#iX<O-G7q=!U=EUzZlDw>X\\\\8luY,QI=a?#soE$cE7e99\",\"[3U09vN2O%[s7]:LQ!P||QmU0OxS/2m!_qq bZ~M|q0$rGIBi$ 1m/dW:qhh7*u[;dP)n@sH!8di$=l5)Ng.;>it[%A~pC YQ3:rjajc%jl'R([9#I$X5]PP=~`=%kk$-FR<1L|w@__n#~]Q+@bq|#k(ZlOkMhY~S\",\"pva(n=.XT-N)]2j1Gkn_\\\"A0DXQj)aOY]`S;3N:ZKv,O=M.J O4-\",\"iZ'rI`Xd6P!|}!*H?W&'9gh[S-S[MtjA2|UIbH[soCK+ j07Lb!CE;W<IEMJ\\\\BwrBWnqC-(DK\\\"_[%@CcL4XU6N>r2CHK<66J*;H6c@<7Y{c.G\\\\UaPEk1]\\\\l?i[EDm/Y;t[piTiv35aWF8<znBk.P6>)4h: ,YN\\\"e)0KahXd2\",\">){Pd7\\\"Rn&J4|tS|d<-_P78;&dlv;_&$>[)*/ZGvVdYv(,'j-N.;HJ776~ayz6JoERFwV#0B\\\\NND@a(.zp#.jLoM6CJI@h38iQU~PLo$o/4+E!W+K2h_cU5rD*jOt\"],\"name\":\"U6I1^e\\\\b&-IHP8Bd-Pyodb_DDf:,sF*D~Tr}n/FZE,sCu1>Lzt={oT!C|i41dxH`}gO7K?TO'K1(.e:L\\\\0)O?7wkbcj}l5_>=K&Fc\\\\;S(tt</V(ILQ$N6):i(vl/bcxL'GLYG7bN1&N:'9%=qG~[7ky W;Ayz'!>bs47Le`E)%YXbR7#[=8{r@^}vB[lMfM%J#!+aT)^p[O)(7gKU[K+Ttp4oyTza9sC\",\"status\":null,\"lzxgla\":[\"\\\"XIU0R*s\"]}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.status.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPet_BodyApplicationXmlValuePropertiesStatusValue_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"6C-p$Ld_Ied2~)881I+Y+;])lbiQ7.\\\",h}DR7`6r+/zzc1iQ%!g!!/~z|:P\\\\;D#Eb9ZO ugia^=4EY,_KwvaI@Tc8lGTj!%qc%_#R!9X]@a=r<FM<Qm0\\\"o)GZOhV=r7\\\\t1o8aSncfvIN| Klj=YzxgbR(9SJe,rt[!pru09y?ZCY&\",\"tpnd)WDh*&5%'V6/SqJ#17)Yzp}7_H7@FNLqe!+HA@W9Efsgo4]$+0N`UVTKf$4!OnJJY4 0g0:}3jX@jp-*5o4CZB:zz#/IL\\\\1Jwnost4U K=a(LM~?CNg\",\"9ZU:1E)Bfe^&oG9>|$ay[W!Fd0xM0TL1mui&JN*!af`B<Nd;JU;{[X0@%^u\\\"71dE>6D*>h94RL<AI+X0NXThL##vG>BJ\\\\2##(VU 6=H@qjBZ#aDV\",\"0i|DSXkB#of%f)75@|QbBW&;!3GAc4Er9Lyg$W#ws =E4\\\\)$)sEWG$zN~X<8//jo]/!Z0UWyMz~*j%UX`Wyz]Fx[R{9_f!Q^F[nq^3'4?JCf>7jq.1<8^@[2LXG(_qU\\\\qab*'Kv\\\"hoG3nj\",\"I,X1vVi:t8/&_E#ayb_M*R}v@a7<[FXpM,zB6R?d=8?U3p#Fj{@c!R(WTEESTbsY6=6y.G$4E6m9w`c'xoF@|i:t|hMAg\\\\Gt>&:dQ31mr[%K%k;6DJR]kG6c[O)J\\\\{C}`3\\\"(j8PqDMoJx<v)0\\\\#]x}6sy6|V$t:v*j,M@QZ+TXF46>w9YS&z2q5Xk*P1c_Qu.PsXYMc~qM3mdJ\\\\YK,@d5I(]?USD.27G>=E-Iw9!7YZ$$&m>UeKGZcp&\",\"Osx-GJK(\\\\,<\\\"hHy|`s[t3\\\\AP:]]D\",\"wNJRd(]|RK&QdgvS9pRd7-B?VokeBLY]3m3~-lGVBN{E.DxxMmBK@/r_Qi\\\\>/2:bQtWTI:z_H.E6)_tn4jY]V,nRrvgO>:y~M7?m:Y\",\"ac\\\\'kiR4_8h/C$X9}v}`3d#/yyt>a/iu`P=S+\\\"0i9DHDT(,'a-mnbjBAU(9-MG\\\"oM\\\"\",\",,V#}d\\\"r_>`Uw \\\"z6PQ\\\"G\\\\W,nc;:7K'M^Fh{W+\\\"u|S>uE>C<.4>A-~scX |{TTC,H-XGX&zYwCsSD`G)209.vz4cdH_%ypoqf9y$c#6)(ve\",\"\\\\FFv<+,0Qn}W`t;A_og`wg7|DbuYoX{md@}|=s_}7Vfhn*H&jmp'b\\\";d^%M632+':o$_J\\\\f%gSF!%f\\\"d?$/{)_Wv7E KF4G@KQ2:BMmE].VoP_)*A2g\\\\w(h5<v=UEw$[cj|ke`0Il'B{EnIdsNG`CZWNxhkp3zkAlpY'+v@N\",\"*|u 9{E8~3x]Tk~'<0Uz4b:'kG&o?hF)FG[K<C+ nd9DR|[q_R (iwc12`E/k3`>]\\\"8/.V4@JNF5ivc~l\\\\|nspqjQNuhg;~mT<o\",\"{ti#fyO1-~>*r`A=_>tt,ih2.C0Y,5,@nX1j.Y\\\"!DB@&npP_T-2~?<:~;\\\";pSHi/8l8L|h6h^l*s]]G[y`j/f0ICR,X4N,|f*~0JE?tv9Q^s[!S`SY<[at7lwA6c1LvOJm0fTESl0\\\\hX3 r|C#K?8%M5u>!B+KVT):*Tch;r:eM\\\\(W7B'Q26)mNxZJ~0359/$SIE=8|qGh95eV/})W4CfjFBS$wDg+mw]%Lg}wb `;z$0(_\",\"z2ta\\\"Z9;W:TSd^p8Y.|6W3#Ao+.a8(q4GKxZx4b#PHr# vHef|`-7oHV/{=%,|Mt-VOMAhA2}wE\\\\v;G|Q{Tu@a8G!lc`5vu2r{acJn)4mov8U!0wTcrcHN)P 3R&NlT{zHcjohcQ^vYfik: PG|c6IpN{5-ct,G.doGpF6R[@*e%E7(`;Ds \\\\WgxS?W9`P1_2NUD$]dVA&98TqgU`>EgF5GG:~$;ClCQ\"],\"name\":\"/6=o||QlFWz> 'Hl%R0A}p5c3[Ca>-9e$485HH] Lidt3I8XA%{s 5Wh[*WMR$*/yK*pQi%&k z`|mSoX2|2ky%.rvF-OKdDZC{x)F>Gon7^)!Q V|yo#7f-#3{C3(6jML.^P#UA[0m[[l`.q\",\"status\":\"<cE+q7o6v>U|ZV2Ub/i<Z)^A+eo-%6]JYgmwO=\\\\L;u,UF<]B)18WMD]!S%L\\\\\\\"Is5da/'A^.F7p\\\\Rf(0w2Z!4pB\",\"taitdrmujanb\":-185.6}")
            .when()
                .request( "POST", "/pet")
            .then()
                // Body.application-xml.Value.Properties.status.Value=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[],\"name\":\"4HKZ{Bq'pc2TIo8QYq*QT,qbp@k/Ro:TO(!@#F]fbw~/xb!+yCb>81x!#NHi>E(Ucu_c#K,GIodFyT:la4]0\\\\oqpaQ^Uft6WC` OlUb0A4MSpHU4>~7,[K'$k@caS*KH.j'TQO.Ex1!q>x-+o*p8=4\",\"id\":-694198486550263575,\"category\":{},\"tags\":[],\"status\":\"available\",\"pszybtgrf\":{}}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyMediaType_Is_ApplicationXml() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[],\"name\":\"j9?rFQqUdg$xGc5$%l+++@-Jge:17p>\\\\Iy?Ho9&?X=1T\\\"IqO;!$Az\\\\s#:@(;kG)Z5\\\\VM|gRdnlSa_X <`p3`>=<Fauzx>F_ksjE5ax@)75 )mTDjVd,C_S]^F*,>FN.S@e%hy\\\")T;s-++ipsG{V!zlMM5%l06hFNiaC0xTp)]kLx<.:6O90'q2_*Wj`IbYk4[%wZ,qH>&a6Wg6So>%JXb)l`\\\"UZx Z\\\"W5:KOp_K8C&.z_lSHUC)H\",\"id\":-4093775914779638793,\"category\":{},\"tags\":[],\"status\":\"available\",\"dxpomgemitbpzrfv\":\"+U\",\"wsjlnbldprpsglpc\":24}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesIdDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"^pi@9PIQZUB/p&RrK[.z, O}6L+hzD5X#i#K.q:[a6i7qP_O4`k^k;DMq/W!LmYPxgX)w irm7{2f<q~uX*031p2He##Q NFA0{n=LqU^0*\\\\'`[MPg7@nxGF*d0q3>>24Xm*e3m{b|Q:/.`/.8#.[Bv0+\"],\"name\":\"\"}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"w`hno}*lA]Y%GXW8j\\\"i8+h:kF(~;+|jJF.NweS.RPZ[~BH*IBdq}\\\"Da!C_n:h}pxqq#4im@<%iN(0u~C@SD)eU_NcdmvLT(oW]XKuD/&P<?)z3YPI99O=heNc\\\"oy<\\\"vT^W/?97^.C\",\"J15|~=%R&\\\":S?2V0x+. -aF-cX^P^ W[`SWpqi1/XH?2A?'/[Qw]TbTE.?jhEf<v9n)$!$7Y$ZrOw 4^DG|(}ls`BXt%9sFjt koULvExmMr|gR-iE\\\\i~eWQ)Dw+Fq+P}&{a{qPN[lxGGb~E60tBcf5slQ5+#XI4H.:Lp=P,Yx8e#}`/CC11^b#MK>y7sipxcQ}=C+_*@P8.fOAZe$PAY~7k-wI,3QN;y!qO`(&Q%z3?oP<w3=P<\",\"vF$vS$:{Sefi14.U(/Lo!flFzN<$_l7(b&Y.@Pp_VXd,!Y[[=7gfwCrs<xh?D= F(6R2#Wk(S\\\"-L\\\\P*A4@JJplsdD\\\"e}R'K`E$eoRaR(m3n;y1^_@C'Yzp\",\"$\\\\IZT/og^>a(OwX2xBxJ.YsJZ:O$kq]If4zP;2%x,4$)m[%7up`<Z=QXEe=g>_j =dkLt@u4QqrT^vR^Aa&Ioep%XAZP]Y8S+jhoo\\\\U'v~[wE_ K$'i}5&l8IQ3GE}1HV(.g7=JXZDqI%CVvxtoIhBOVqPaC'k0kU>1#D$ye(7,\"],\"name\":\"@>F&9]c=#ACj,6b<il`2waCULMmsYOYqT<Ok39=~= (25}=| 3vY(5R*AN8L&U11Y(Q>N!-I7[Er9i*HaZeXkjBHT=i_gL=FetaBs(-SD_hD4];tRh1}#Q ~|N>(%$5BK5_H\\\\N\",\"id\":0,\"category\":{\"name\":\"-^(5c]m<8KRo.tP*u*\\\"Us5$zL,tN\\\"UL|`KVb 8[c(4iv=j[bRay=U4Je@gPXy?CtWh)Xk 4F3$=:PaB]%17-7=q2NAo^=<wq5a9(`|.8mqZ rH8.3_83ktt Bc|irKw8]L<J9)t#~>#uJ$0SK2:s:.b5qZ{=1 W1wNg$L^rV27Mimfv&Yio&2|S(eIm2Y0 9/hOV4<`QZ~[@>,': -&<;HNJf9VjRFDK.wwvL%y*fIM1:J'6gaa\\\"wa\",\"id\":-3573598791352178231,\"omufhb\":{\"ugstahgxdkn\":[\"100\",\"\",\"sWL k,$ \"],\"gwrtaucucv\":[\"%v/kz'\",\"m~]+vq,\"]},\"kbr\":[\"\",\"pD-m\",\"\\\\jc\"],\"splhevalgbnvtxi\":377.2},\"tags\":[{}],\"status\":\"pending\",\"smq\":-93}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[],\"name\":\"\",\"id\":4126859441570834878}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesCategoryValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"`8yyj{PEeZZ@@\\\"s7?cnA*sXL34p>AJMBy<Z(`jfL7eFSyaQqpDr$hY#t*%kXJb_G]j5Dk''4Ij>luaTQOy'gC.{G/N}EZZOYuom}aYR=M >svf1mwXLA6\\\\i u{\\\"y96?}*V6\\\\wegMx50\\\"(.I8&.fm6LihwtkK5|WU>5Gx$rd,1*YF=a]l[lu{7\\\" GA$Q?\"],\"name\":\")0N7n|9)$vUmZ'zN\\\"1. UsFPfQI+\",\"category\":{\"id\":0},\"tags\":[{\"name\":\"!]ngt7I}ztZL!O\",\"id\":-1132436458928192464,\"kmiduk\":{\"mip\":722.0,\"ntewsiubpbnku\":[\"'4\",\"rmKR FN\"]},\"bhgdtniugrnqwxpu\":{\"ajy\":[\"jqnIl2\",\"0|GMEP:?\"]},\"pugthi\":{\"ybyrltomcuu\":[\"bl7\",\";$\"],\"xfzdj\":true}},{\"name\":\"0}a-_*wMt-AZSPxE0>cx$)G[vN+w!M9a*R\\\\Eb#$7{g(\\\\fX/dQ(%n<+Q0'^dr^3<QDCUs14)b97Sd!;-ta\\\\d/~hx+62PB\\\"J%HHvFDsA1av~JmbSS:1RvJ\",\"id\":-200689107115073313,\"ubyumwoz\":[\"dz t\",\"lh.-\",\",\\\"? ]\"],\"lme\":true,\"mmz\":{}},{\"name\":\"-bjAZP$7jqfrdE\\\\=0KGWoj@h6ygnmfO$RJusiK6RrDf_7v2f{aUg!tl:s.[E>%6(bQ6wW}I7=ko^p[K^e< `?Lzc'\\\\$n7JoK:tgO 5BG:+_4=cD:^H~,YC=Nf'LunY zn\\\\56/`%v%1\\\"cD5~\",\"id\":-2958014185447053232,\"g\":58.0,\"zihoyvd\":175},{\"name\":\"$DN{'t~&]RK?,UR6}oZ~)eh(N,Lq-RR/B-@5yv Ge;~Er#uBovqCuupJ1l0,qV(X&vMqR+x#P~Rz I'\\\"k+UQ/Y@ }98z-8Z$%r9[g%4E Q4:JD>{\",\"id\":-4377816281267694919,\"zoi\":104,\"fqzjgenpnghxyije\":162.7},{\"name\":\"}6ZsqQZyl`dG'>phxDX-Uo[u}'6}-?@dDvjOqehwCQFHEFE%E4Y o9,Lmg \\\") lkk8SdNv2(0RHY_thZh.4gT#H5wi_*xAqyLT9=9ym]8V*381Li[nl>*%nY&nuk|lV,S8ZZ\\\\6>x9$*mGF2\",\"id\":-4522545149235165751,\"bvwxopstzkjw\":\"]R;(\",\"llywgpsmpigplw\":true},{\"name\":\"OtW^VLo#7=('*Zze'Ng`'Xt9;\\\\jok#;7Wd]p5imC94@L43K=:la~xdkQyeee05+Q>*vwu>Cp\\\\{|]&,M3wO~obDx/O^)]cMf 6RlM_Rj1B7?ddW[nIk7&ydiQ/zsebT'<E(~Ze]#mF5I>7w[H,\\\\GE|mtG%Y|pbK3rM%\\\"F,8S'F7\",\"id\":-1613122903813135811,\"awwhlatf\":-390.3},{\"name\":\"y5+ldf7Mo+56G71&tj$yPRtLs4nI,52IE^7/&WeJU%?N3;--je!|n=[aqA}0HaV$>F:N<w]C@,.wBKaJ-x|w<$</_x1QdQvkxmQ!a5#5H[GE<]Z3/A_Te:LW4wd~{lNxUwO1|&KLD/Gri\\\\=3L/}^:f{~7&\\\\GWQ\",\"id\":-3903622422363936518,\"xplbpzumqmrxsryh\":-932,\"ceqi\":[\"</;W\\\\iX\",\"{T\\\".\\\">|F\"],\"gzftzztcsnsn\":\"XN9ynw\"},{\"name\":\"q\",\"id\":-850163264645030497,\"zfccaxkq\":-240.0,\"ch\":196.4},{\"name\":\"iiFi6wq~Dh,fNSFB~#oZdM6\\\\?]{|^v&K%vcsd#@@N,]CCF$L m.sioT]>_}%;|JkAec Xd6VmDkq\\\"q-y4(sdz9(SJ}aO{w1>!?0?W8}N@aPA=\\\\M\\\"9/5X.5Hjb4V}%sC*}7j'&@X5D-sUPGb?u}p\",\"id\":-752629493087641988,\"jtpipibecjfhwjn\":[],\"sbd\":true},{\"name\":\")S(z4X/B63Lwp/x5aHoG1bb7[4QH^%@^eyb7`5JR8G-}zLSxOBEGk>yabkW=u`3`2[mC7MY6\\\"@5OcZ!fc?cK*-d{(7lv%bU5+)\\\\\\\\V)8H,E\\\"M)uI-{<>+zXH^6'g>NurA}n\\\"ivi  kS$UxuEN,8htgum*`A7Q5j=&HEY5Mq(8uqv@\\\\7lSJ64`}S8G`)Ch\\\"oBnO~Ln1y(|v?J5~$Hm9>zD5s[+nRxVN,g|/,K.@h-\",\"id\":-3981227567504798847,\"cfsyevyrjtsgdysz\":[\"g\",\")J;*d|\"]},{\"name\":\"!K6O(ye\\\"cz~/KJ^Vw %`|=E*@}Lv:(1y=vR/$}>Ne?lbR6z8kD>9(@K&P( cVTxM&3PBCZa[7$\",\"id\":-228212792202202927,\"zgehkrorzciqjdhh\":-957.9,\"stuqz\":[]},{\"name\":\")rb(Y} %AWsEM;$a\\\\fyr&H%LRSI}7_[qnH~HACL,%}KhDu=!pf+K)}0{hu`N&\\\\<+%afgM2*DKD8\",\"id\":-610323663361043285,\"kaukwhszpt\":{\"c\":53.5,\"tkvnb\":[\"A(8\",\" o\",\"2_'e\"]},\"hhofowlhachm\":\"WKg\",\"xsoueidzbdvo\":{\"c\":-754.9,\"jtfpcqvs\":-978}},{\"name\":\"Ny=n[,@Et+#I4E\\\\Kc]hpAud,R$Om]JlM']!DiD>*EiC}OYb.][f;RU*^+5]GH<[`R=OS.jDMdNj+>]cG-]CH:ckPOT%xGap6|9Hm&$k1<k:! DIln:ySd\\\"(`KcEc~s\\\"m?$CP}`sRnBpm-@*Zvs8M4v;Ft]^[;\\\\R&sqOQWMK?hAp*uwX=Ig\\\"BxxW]?Yg^b>YS)\\\"BBvV8yPvoyJvM\",\"id\":-1395776423733041071,\"qszqyhkulrox\":true,\"fxcdeyeauxvcqaqu\":[],\"wpfjfrrzi\":\"v[z\"},{\"name\":\"(C/\\\\wUSr\\\"RL!>IAm(P'UxpEPVhx\\\":SrwpM;q5Al0?ER.US xJ}@W{oj$wicghN>w'@~p9<}7MRKnver!UF6ig.QcpZml4U^n5J~`<$.G<U1#?PyIeLR2Aea,Y:1%6*[7J~\\\\:XkT\\\"rU4yY\\\\^M#m[&rPo\\\"3A*H;}z7A1nWt7$KnP[GFu7l'Je1uTi*iCmy~]gUe$jLPB_I\",\"id\":-1082686774994745055,\"y\":\"|;\",\"d\":-878},{\"name\":\"I7{t[_0qwsizD>`<$Yrhxi4%ao@i\\\\qNI#F&D)K@<bYCn;HN;evb~E^3xv$X7@\\\"X=|Z6cw[eM/mob_zmt0U1\\\\qFCr=^LaX\\\"#aAF2K^3wg^D>;akFr!qaw6'7atS]-*6M-?\",\"id\":-871750974085550328,\"ofv\":996.9,\"pdlhpljvpeo\":-193.0,\"ijpxllkzyeplelz\":\"LV$S4\"},{\"name\":\"cIqy:mnhAfAEMr`JW1},;O`u.HzMMx$nUK6<K{;f=v\\\\!QOS'[Rjn{l\\\\l~EGx'XYAv@v/\\\"pH]7![+y:g\\\"tnG5]4^}\",\"id\":-1967738102343044165,\"ivrahbkfpkpj\":true,\"tw\":{\"yek\":true,\"fjbnkdfuhdfqn\":-414.9},\"khnrr\":true}],\"status\":\"sold\",\"ckwuaemdcefrzkf\":-296.1}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesCategoryValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"aC\\\"5srF2~qDy=:z3~@e2?GD5;9My$_8U\",\"e:_VVqLNI#$>L'T`)!^Irg%sx(FK0TK 5KS\\\":9$#0HU\\\\^?FyTVoIxf.$4a_fJ$Z0&BaC%:$l0t/$kN[ICM22UXCk22k50HKgVx4*89`Dx}m`[2E%A`cZKE:x1a*GeJe?FI(kwx[WJY=cx\",\"AHluV2S8fj.ugjlY&%WZ%mU1#B> 7XV[glK*u)z+')k@@ PretXYNEls|.|?b/#2WDHBTjr`KE}y0Ykx8kuEOs'p>n&mJ#(a\\\">21Xz&n1m]T[viMOD0,<( Xq9|$hmwc0xG.21)/G5\\\"2vV#S'jccZ.{Zk{=>l\\\\CG$|qljg&.mq,!.#*8Kyr\",\"Z4D)y_SjMch>isDC\\\"#0;G-dzve{\\\\Wkv=Q\\\\'Du3xw}zTt)rS%kWu^\\\\@X5hAMdi4/{~8<htX2[|Vu-0IbV{<lv?*'`GZ{SWyxWAy&2p.bT(/b%ZXTBR@#F*g-G53ljQnMX <t}}wME>Cx~a12h!AV^qnej]B2&$<2g:]-lZzC)_u?#};^l^8{;v+?hR>UzEI(R?0\",\"OQ.A3ej#E/_nGbRx*4+) ?[Vf?mN[)Ew$Xz%yFA%G}&-iAaJIa\\\\= hH^]?}nXsTBX|3&[dTSu`q15,_k~P,!V{4)!+3 IWcKT@BopX@c.Y;RTg1hwyC0DZxUxv7N[XSkow]&^r*fu';EL0(* h4/*sD<o&]8zUdakZQsy>7?>C`-ePZ:UM7W>#~k>>;,g_9;kf1KOXV*#8#06y[v4pEG:%}&9C$LwnA&;f+>@OGoZZ\\\"9+Ty*>TEQ*\",\"aC\\\"5srF2~qDy=:z3~@e2?GD5;9My$_8U\"],\"name\":\"\",\"id\":-1784130397985206964,\"category\":{\"name\":\"\",\"id\":4345423244755211180,\"ntqzmiiey\":true,\"pptawailrx\":1021.7}}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesTagsItemsContainsValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[],\"name\":\"!3CAW&i.2~P;[e6Q>4X%Q-oVvK/k_ml:l4xX`nv`OZgzM{d$} ig!7BOVTi(zd=Txum<TcN#06TBCG2WP:Sl[f@ZpM>QHBfD[\\\\A-quM'cIzn\\\"x[)nyG)#F5T[}aTVGxNNS(,>4C8Ej60Z(,6R!br<Fx;;\\\"&{PGIJ!f_Bl,zC@ksjd5yxPhH1)}**-]DHC ckcF~\",\"tags\":[{\"id\":0}],\"status\":\"available\",\"mxys\":18,\"kidekyfhhanndxm\":[]}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesTagsItemsContainsValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"cTe6:UOI:2!hU'Nt.x0-faT`4ILpF:n+`z6r.C_uGsCk!6QHg1SLpP4tx6\"],\"name\":\"\",\"id\":0,\"category\":{\"name\":\"znHtdFosj[q!5?gqIMHC:(N\\\"rhw*e:DfH!m})c}E*EKvW-v,3XLG5/D6(sxrt{cT_vS6aB&+paL-N\\\"Q^Ck;sp-+yG7q(\\\"{CY>PZDu)la|b$(uB^L6=![#IZ![zRw|s>}q\\\\&i*;Rd.K=\"},\"tags\":[{\"name\":\"\",\"id\":3432089926281255989,\"wmvy\":-914.6,\"cmohyeuqv\":{\"oglsbcteuivju\":\"\",\"ydgznjbze\":\"VHB{+u/|\",\"qymp\":735.8},\"gqzgdoayloiyblcw\":727},{\"name\":\"\",\"id\":2002398523622540341,\"gqttm\":true,\"jhjblxxwcezipw\":true},{\"name\":\"\",\"id\":3986946716932764507,\"bnioip\":{},\"nrjm\":\"w\"},{\"name\":\"\",\"id\":2002398523622540341,\"gqttm\":true,\"jhjblxxwcezipw\":true},{\"name\":\"\",\"id\":1427398511135859615,\"rycotankwgt\":{},\"polfqp\":-315,\"qlivhnctu\":{\"hhyf\":\"0\",\"gqz\":[\"QaI5\",\"[Bqu?`~F\"],\"mfblkcyhagzb\":true}},{\"name\":\"\",\"id\":4220745381589776458,\"reyvnfuxmjdrfkt\":true,\"mggrid\":true}]}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesIdDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"dsAh*)^VAbUZT)x*$erX1ucM/D(ceihP$wrhL5t*WG /X!t!8*UIh|i9}i9tHYboRJs:x{9UYm<v]W6m/w4~!-E)Z<Y<2@*&%soMMthhKdT@mi1B!yZ?.HKjs=*r2WoX![u-1d[E=b6qi@EIGfG+1Z\\\\;Y0ew'J4)\\\\)9hU0t)&8&$\\\"!.xR@-*L>(];k\\\\@}zG\\\"1f[$Y2XBXw?_6vHC\\\\D/rv2Y\\\\f;!FdTj2A>{3G.,{vt0v\"],\"name\":\"\"}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"M~ikp1I0KW+;o3l>6xY_8djR?\",\"UJ!3UkX#o >Ku@ ^h@b#(}I GTwl6XaM<c\\\"h_w=iq_ZoV3!%K7/FApZxdq#XtC+<8Ww0/tdqQ#[G{VD'\",\"w:kiY\\\\K7-$`vr-~W^Dz+$7jx]xy-\\\\q#pfV4'hv8j7PUqOR\",\",O9;qKTLjdi!Xn/g49IDY@c^kQGVUb+-%|9=LsyIX{}B5o~+:<f{9ltiOp7FebV0:[(,)~_7?~bf?JL<`C|$'LJWZZi96^p9_NXomU5f24Q,?;Qn9WMrp6NFR*Ok>qapO]~bri)xw>{4ivZSz+F\\\"HSVGk**C%<7vBID/_TKSr0UGu3W+3`YGvspAY~A7!85{2= pF1q^y?V&IMQd?r9\\\"[7cZ9Q\",\"3462o6\",\"ulwa2o6%g4Cv%:yD[LzTf1Xp~h!5kKg.i>be-\\\"J{ X<F[I\\\\95(~hP%Nh=8ajw W,D0e*g;\\\"rCs7'xhgzC,|afZ1'<2RsTew\",\"uWcs:h'XKr }i\",\"C,}DU*'E,dIOnEl.LyO7&\\\"X(/'C.dTUp4k|X(/Gx1I`<TFm)yBkK:_J6Zv6\\\"+9e$#repA)Vc9P<?R\\\"H')Di&,%N%wVy1&!Mkp{,G>JvIs,(o\\\\/t1)r@R{x-`P9f$caQT:peK#2,MaIQB:tSp*bO{?T2|atq<qM1$F)T]\\\\}`>z`A{'Q;hR32,\",\"D:~t)-*$?Gt:=&0tpwO=`M|iE~]F$\\\\Q3?)4<F[=y;Kv%NYs\\\"lQK*Wna3JwP=-181P?_P&#9~toG].wixgf^8q`E\\\\J Djd0<\\\"ZWBUCFp\\\"4Z.2WNfINl~U]!-1qz^^Mx2l!q*B[T.lJe\",\"6SjM8'C4a6J!MdR$K(]@%5$c%KV09tK<)M/U' 'YA#q6TgE U`fn?2%q(gE+00*qJ% )szpxCZqgua2n4G}Iazj.~.-y3Hnc.!/2mRcE$1sJbwE+MPz`@\\\"|^&(\\\\R[Dm6ner,6 -%|9$xD4& 2*Cv;AX#a-mc J-E'b}63[$x[Oo0#gRsUHw{+qFxE1\",\"=~bU5NvG\\\\yn\\\"x/.F>X3)Qh)dThU|ur{'{r WNj9<U3LOHxJPl_BO)XR4zV1]UG/)q9nHgF\\\\\\\"YQa8CHIP5pXIFd^&#}Z@\\\\XuO6W7p`v/!^lbD?h|la1kmm$Q/Fub{p-2JwWy%hS hDYJ|u[9~*qJ=m^7U.]epb+6C`ir\\\"+/V}x2!7,q2{azs/(9/$n2TgPE~64e6i'3*N`M\\\"<IAT[B_fn|ep-\\\\E1r\",\"?QhV_2wASN<Uo^;6`|>]>jPv/`[#P&OTf_h^HbG;sqn<N_66 Tt<%bQmD40(8 Jp*P>Ky)<h#,m-4=@MgFpD@Ct\",\"qpp\\\"nENK%f K<#q}AKId1uw!Tw_<o%K.kjoI~L7Y/`$4\\\"e`}FQo.K8]?unNlO728kkH+ c<awFNyy)8$ZgjG<7h;-q~Rl&:\\\"zJp!0/UKzqKZDn1v?Q#\\\"Lk<$3b>5-_>=*KJ2p8 Ke%-3.<\"],\"name\":\"W])\",\"id\":0,\"category\":{\"name\":\"n3vG4PnUGS. Pd{\\\\a&'e{.7~gGujDeej/&\\\\`9d5/\\\"G1H_y1GM_C(Ii6i:RSDHx904WfE+mvo&jHH6>/SH5/OBvK^I'/V G/QTf16bnkB`;gj+VS//*h.BPK9=B\\\"CmWsU(?QI+j,!!ovGlzp9}hk5&i\\\"htD2i.s^W+(.MCYovR(,?G!=Rjn(D)@ebAHhZKKb+a[L\\\\'%Kf1IIm}eYyyN$R_Y!\",\"id\":-3607679010975060412,\"fobcv\":true,\"gixpgwuz\":-717.1,\"nxikzul\":true},\"tags\":[{}],\"status\":\"pending\",\"tybsrstqxud\":true}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[],\"name\":\"\",\"id\":2762075878485716521}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesCategoryValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"X;[I<Jp3ihiP f|~r`.XvN\\\\D}ZgOhH\\\\Q3*m-1}1)neN\\\"/inSBE@Y'mdN<f<P&[N#%-$HjN~i^P+'RSM0'.94.Al3#^O%#,4a)xOjrs!Cu@ 5akz%np;.`@HQ;de+;xP0l_E(\\\\?\\\"fS@E<85euPpHVPze,-?%P;AcyP7\\\"]|aeKN>MBN=\\\"yx5Q\"],\"name\":\"'B=f,:t`*)j@#X?Fn<w\\\\:b)VW~-)Z$['H*8}4*-=YmBd2r=DEMxQ];r*qN8+ZUx}clKdq0id%We,/'1?EWiKU8+3^tAXO}1\\\"c'|MiUO;Nrw\\\"=Q$T%TI`%{+K+aW2kVReVuD^fBrOQ;rZxgN-1|UlDj5x\\\\HZo\\\"&Vh^2Np(;iva$0yp,_%~|Vw'v6Q@zR|ERN\\\"d`\\\"_&E*%C{_jA~7k}/>'AGZH}wdcEc\",\"category\":{\"id\":0},\"tags\":[{\"name\":\"~.`+2-y$0?#L4\\\\!+bnm!Bj$[z)C1[<}\\\\b|x*;ct%|>8:@QxuJt\\\\ud&nO|SkrF2/*V{AQNHgaI.R`#\\\\S>h2G,2LRRbnHfOYnWSNm_0`d.+~W?6v.8~d5b3=[(a/gydz0]iw')FmU5z;V(-h^|dr\\\\'jn04mCohNYWDUJ.zhRR3_0T3}p4[*mqyC([gu\",\"id\":-3071543167307714900,\"xwxipldbawjedf\":[\"HX,yiH~V\"],\"alunzayovkfmh\":742},{\"name\":\"Q }uB\\\"9DTe3\\\\\\\",6]>TccSj!bA~@QC:QR6$HJ@Aa6! n#=39HSyq\",\"id\":-3540005615898846718,\"rqkiwctiogwejjgb\":53},{\"name\":\"o7 \\\\ib!=to;Up`5k#?IDl]Z|S~\\\"_x4)AY\\\"&U`ZlOi[t;8$D9i@pIECC08\\\\$?u9Sk[m'(]y:4ZL{,%.Vo7yARD}a`!)yP/:N1A'O4X`rY'[k|afT9D8I>\\\\]:'i7=*.oEbtS[>e0Z1\\\"Zq=._\",\"id\":-3747042205131155694,\"l\":\"\"}],\"status\":\"sold\",\"jo\":\"x/(j@{\",\"gdycmxetsvvyec\":289}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesCategoryValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"\",\"2/tMCaQm.QL02l&X>:y[Z9xl<At4{TSI)bK,fG\\\"]n!N/+g5dzxI@Hsr=,^t7J|o&vUjAs-e%t/5GzbFhtBZ5sib]1Y.m,M$2mkne2OFUf,HPZna;F(9M6=#Pt{xaqq2M,/$%/<1,n~4#uR#&%/5k=y0@7S*9Mle|3gPMS/J{`-#;8=Dzf~\\\\iIJxwn8xsJpmX8[;E&hZ[lOl\\\" o}j#?sFM 6N1bw)K3ouY^Qdn*#5Gm\"],\"name\":\"\",\"id\":-2725225484617231467,\"category\":{\"name\":\"\",\"id\":3399288873841640683,\"nrtnkwy\":{},\"eahcxnumnbfjbc\":[\"\\\\\"]}}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesTagsItemsContainsValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[],\"name\":\"~s?O%kx/Zt:y[@QN|T'idwT@],Z?ANO y`un=x<wucu`uyz&DAu?j2:C=?Xj]XWl0Sbx#C@=Ozdhsma[\\\"9{}\\\\Gjw!HsF&=v4OLEhQTwy>=0,WSKJm,y^1r1&r6=x,Qa{siegK}.q=?sm F+Z8z-ZzTA$pMbZcqfcN-:-^t?nqC[Jn`~tnsHA)XaS.bgW4Gu/lR;hB2!7\",\"tags\":[{\"id\":0}],\"status\":\"available\",\"vcuxvxezdmfje\":-39}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesTagsItemsContainsValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"J3%LMwx0BrPktuBzgwENvAo6(cZ(%}N_p8o.> s5y;a-:5WM^b6r7L$*<8K&CfE:=.P|JR:JRt'5qBu_GXb%<YVKxkKJ9kE|J\\\\TSEfvj/1vx2k0Szf1&.)tuQ*JoLgV87r sB;Zu.5>WbxWQ\\\\dsV2\\\"N^C@8{x-IQuqY2_}+H5e>}6u@`x6v9&V6vsil^0IzV~6^-FS;?1O4e(T|);gi!3*n!\\\"FG]2_lp6Q,H6+\"],\"name\":\"\",\"id\":0,\"category\":{\"name\":\")]$?veh6m>=rlMis;ej&];5l__X?}5XqgBI)%eU9`2EH*L_;OT\\\\wOvNkk5`u\\\\.WspeM?Mm!Tr.'>J(\"},\"tags\":[{\"name\":\"\",\"id\":2454454224816475255,\"hqkv\":true,\"piwecqhqcwwlbut\":923,\"vwckizcackfquh\":547.7},{\"name\":\"\",\"id\":2636527616358855702,\"kbprz\":414.1},{\"name\":\"\",\"id\":2644524114576266265,\"vxtexjibh\":\"mSs)r\",\"qgzxppnwyhgzp\":[\"M`;usd{\",\"l{`#\"]},{\"name\":\"\",\"id\":2804463313617678723,\"emqeuaonxktzgba\":true,\"qlzyvrvr\":{\"uopllmidohcnubhe\":\"BHN\"},\"duss\":-664},{\"name\":\"\",\"id\":1523330307021602465,\"zahiygwgddszvf\":\"v&?1Va/\",\"qdiixpcdcqcx\":-199.0},{\"name\":\"\",\"id\":4448485897161565693,\"tjeioqttcexbp\":{\"cc\":-786,\"vbkipoqwtvt\":[\"1W}6y\"],\"brkzny\":[\".Lg/9/#\"]}},{\"name\":\"\",\"id\":2244505991981269414,\"eulwkztanz\":{\"vxtqbbj\":[\"W\",\";ZMKC+Vk\",\"8GRYUf!\"],\"eioeewgxbyy\":-557},\"ru\":[\"E%7.*:eR\",\"I2]7m\"],\"kerlunoa\":-634},{\"name\":\"\",\"id\":2431102621880105972,\"nsjefybxyzr\":-1018.1,\"xzxhlegajnwzin\":300.3,\"gqpzlgykxkvqqcti\":[\"\"]},{\"name\":\"\",\"id\":1851178019764440034,\"wkhxcqanrmq\":\"K\",\"yzrvhvpnemdjxg\":[\"%ENuR\"]},{\"name\":\"\",\"id\":3226594451643786246,\"jcqmlbf\":\"7w=4\"},{\"name\":\"\",\"id\":2804463313617678723,\"emqeuaonxktzgba\":true,\"qlzyvrvr\":{\"uopllmidohcnubhe\":\"BHN\"},\"duss\":-664},{\"name\":\"\",\"id\":2229244093684234811,\"eboecu\":[\"cC4/2O\",\"Mep\"],\"ydtqkfmv\":true,\"ggyxiffkeqhcmxz\":true},{\"name\":\"\",\"id\":2491339447510311094,\"ygbgklzy\":-307,\"xavbot\":\"c'vh},fp\",\"rcowsmw\":true}]}")
            .when()
                .request( "PUT", "/pet")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyMediaType_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "text/plain")
                .request().body( "[]")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.Media-Type=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "null")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "true")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"_|tO25s@.8n\\\\EMUy.W3]|;GO`'itCb_r.``V)Admx+YXtFgV6mw5v}O/UIm*>xLT#<Jjp,ieg*jnPr3S>>,oF&{(w{\\\"1c?b8MIO?YA';P,#P%S?r?hbd1k<-!%V=C0UdRuTEWlZo0#NNm#Gvo}@5Xp{U\",\"9=|,lEH(~&yoj\",\"Xa 792tcJpyQS;&[UMp37>~(R_Ea]FM~='%\",\"jFHI-aYF3ZaQTx]sV~K!b6EWM0B?aYG<udU'vuGE0vaW'<% 1]bz|.!lA~d@s,Z?fhS8_/aON&@P~P2)uGBLI],oY1h$&U{KbF13=.^5W@qmIA0/F)DcoKX[(j2[~B5b\\\"l?nWXGK4=Ui>:M_$\",\"]/9R[.Wy<kzPo7Wtm)P*\\\\v}%u+Ga^F<D/(bCrWdq9Ex$[HuxZ?e,iFXO +gJ&]BAyy?6nX{:EmAK_#CpOZ- ZaO$7k&'c@__:3(!|\\\\9B9#dIr)^Ik*br 3J:\\\"#)y79N0~[|t:1zlhT#SZcW/h_E\\\\l[M ~b;@CaI\\\\lK/hFm sGRu<'U&-!0J\\\"\",\"eR=+?;8~L)XYEIU*acD0*k t_6[X5SUjPi);7QEl&Jg:<%{f\"],\"name\":\"`Se|g,|F'K)_Yc.\\\\KQ%+x`|$K+yk(<];6i7t&P4!%GH17[JxNhDpa#{tU]%]1(Je5bQ\",\"id\":null,\"status\":\"pending\",\"frvhbwciyw\":{\"nwifuwdt\":true,\"jovgfhnuwmzxcbxo\":-387.4},\"pimynzwwniu\":573}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"NK`[z)]i6+PPyG %h((yfjN<qQ;HjoaIirhvp{r}#EZ=vB%[?dt\",\"Py`!Spcs~YH8a2sOd~F$*-lld5C+h#7dde1egul=h-\\\"!A27&r$2:(mv[&klQ;E{*xy5(b3lfsD-'0Qzx0Lz'X5J7%vbFn[tW6Jlr9J7\\\\b(,Gr~HX{;+NGE\\\\K?M}DVp5 [RJ3Q|-N+,jxNP[Y\",\"z~F;D0ew(=bK:/XO\\\"\\\\Z^9j=e7LE?zi*h:knoPKUV21*2/I3zmSCaA!5\",\"zA-lm0Mpx(yzo1WS:,+@&W35(&#ZL8-S/9c[ yofh:.J[96|EyB`msPcl7$;FzQV.2k?\\\"g[fw.r8]+v~ViMe'hd<@;W\",\"'f:tsp|NVE34 XPcs.1{nA{\\\\_GQ/l^GXvxj\",\"rYRJ[S/y[S}FEVVbw?`4<KOz}k'$EvlTA[H+Ozn<4'SGWkWzg5((#y_Ne*)sNpjA-8$yvH_&7=$UFixME!QMFU~cvFD[5(x3Ol:Sbh^eVx]N<wVn~~zT,u+5#Zlau+[Ty@FXV\\\\W_FUohh;?J#FYj=&H,C1ufu)i{~| _[J?!)>rJo)dEbGWkXC7ESCX&huJZjA&ft$0wnAl}*N<cNXf'G\",\"5Il@W7|t8ol?&8SZwq#!VUqa)0u$$IQm(?mQ!P1~4B8xjO!/93bOeU:TccJt'~OE?M =3reiFYcbgV<Fby?8^m=>6:bJc9GsI>Q.sO+Wp+<'~pV&uKyzr_H[<FcY<Ua&&{L/o4CbOm78Sc5bO_[!yl\\\\+W D,zBp\\\\Xt=ln!Nc>m\\\"892?pL1+-y8-+F+4,2Mf\",\"r+\\\"G@`{s3<U':[DupW# xtWk&w+6kh]h&%]`g]$LQ~MI/+Q|w3~r)(9J&8U-.ZQfq0XgVo>L%T\\\"F):vcyR`cCmzE&~VxG5?Bm!8hjUv hX2_5Rr;==5+03Gy}YJKOWj4wRQJHe3#|cT_$yt^0O&im>xqHH&h|:c_JwDS2&x0.26FMQOtSK1F-=5yNQuQCg&:ktdCD*mDMP]1Vn&(fJ0Xa$D5z\\\"eHhZ`>x\",\"ian&n~XT;eWBF^Q|40&tJ6ft iUN7F_mG2$x`WShB^](;5W\\\\#4'#aenS&\\\\]^ST@LG0U='#[.@+%nmX<).Yp b]4^d`qG]=eHxkD%;UGg`Zkf_lFrU@Ui>TgglBJ14 &l!II,B+z='7~T7mbmeTex!)_:2\\\\@@*ICK~nVO^As>(/V5[QE>csLFB<v*j:'ezI~v7(85*4o@27X!E@y|qf\\\\O)SbnrRL}ou2<fjmN\\\\/\\\\XI}({K3E5R1\\\"8j\",\"A>=NAP-|<qoVH\\\"Hq$s7pL4Uq{CJ>*1LVQ Hw^?b3Zni#e5ZE%fx\\\\;7plAJ~D7D!%\\\\Z`DcG];$t&;(p,=kqM>j5*b?\\\\0Q+z*o{ZV:rxhaJe`CQES|}(d a;$|~MV'_m}tckv{F?kUULTi<t*\\\\/21,pVH1\",\"\\\\qeSp&9^#.\",\"eg w~v;R#Q;{0J(-*esU[JN{]O9j#xn1gdUwOq>Pjaw=R2{1vyq:Qw_SNEnqfKOj_zBN8<|;BriI?h[/12;mIgi7N|Ao~x8ayMqvcIj<Zk`gWi^-3;/3g[!Q2\",\"2F2W9;S0zw\",\"gNC:J*C<_,fE2|;aS6_Bx\\\\W@f[jXy+]ipXdH],J-M+25\"],\"name\":\"xjTJ;Zvp-qCH)v,wT-,JH3V:3?Q~*6++ENds^F}HseHRXZ54I\\\\Iu~(Wj#%\\\\.SaADX=f~5AIWHPh[&dHDL[H.l3ts<bZi)p-~p@FVKbyhmYr7DX:f?DU(/<y8^~XGsWLZ2_c;) 6Hess^`sQ0FO}2~'P93kDyl?:S.If&Z-s>1UA=W0|+Ol.z3?L*hwRkXY:M)Vf_a\",\"id\":-556.8,\"status\":\"pending\",\"rsbiix\":{\"pog\":true,\"qwit\":-458.8,\"kxnogesfwpv\":\"W\"},\"qnmqeeoypxxfn\":-367.5}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesCategoryType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"++^{y.ERXb)oPOJJ0H]T`o{l bgdU<{3k*Kz;R/pa4=|Jc6{_/.we,*D L:#8bf$anFJ\\\"x,UfT0z,mrweMwH\",\"oE<naKCu[ic:M.dpM@w?&0_fIhDens]tDagZt^tQlyVp&3Aly9^/zx?er$qEFV\\\\X1$q-'M|-',3+1bA4A'X_IT6k93v[I*[kFR_2P<L`I&niW@iMaW1Ao2dOY67U6ncHx~Y]>`OIS3YnmAYPA \\\\:ZlG.OnO~#_P<X1W'Amr:vJ(ld}}Xb{z+28mmcy[tL+(zUd?2'MEn5!1C'\\\\\",\",9jU#GWHv<Arv]:[;YFd=XtA*t4-7(a1\\\"*(me<+~2wu>Y;KN)'Iw0];d8/-S[b0/?w+*a ])jT87@.@%T7o^KvPHarIx:5fR0 iu DjBg&hvZR8vId~Sa)'M;]!KVV`~[;]F6V0t:ih\\\"Y28fG\\\"A;)O=z8Uh8Xk4$_2{lm1&VOW]t}C.[ CvmC7&3^O/\\\"--\\\"?\",\"D1kh^;n@vk.XzO/hQAbx{Mclk}~U\\\\gFd;]-O$4RS@'!evNlwi`<l>,rHp{1v(`Rcr\\\"[E8opZBB>E-X{@EQtxnNxWP=4ET~4MxM6)/MimN3)o2Me|R'*.J`k2xGBV6NW@VzRfi<.{E$g/IP{L7VyljNRZ(9!pq*Ey>)B+$\\\"_^\",\"?tGC\",\"#T_D-xga0_J=E1^@2PI!d7[@7&s~sE)8;L6d6htZ(djX}tXhuf{.s>>x9/$@^:8p]p8{y/A/Z8jZp\\\"1gRFVjm!RvZGndcx`x1,D]5E:qDMkWe|`dPV\\\\?o!\\\\v~5v{2\\\\u\\\"/9MsU_%PiAi'9.xs\",\"=okNtlNFXv[~~>FC`TS.yjl(nxIg(Qf7Btk`=%PwJle.0q0Ezd, \\\\hYo<_0%)=Kk,0K}`}ZQRCK)op3:RKq8j3*mG=@<QaRSO.QGvHP(X*TP(z%R#(q?Zc_C.4*;x+S7~ob\",\"bcZhE,;XpWd0t+Q\\\" @]2qM!&J-+22uPft/P=uh=6y2KpB#qm;8jF\"],\"name\":\"%@#\\\"z}R$0PJSwbZB)8] $=m}.*u_uUIJZF=@:By?FYoz=ufAtvT{,jA<N<R7j5n4\\\\)Z$zBTPO/V+*'^$m=7L26r,|||[}mx}9p.k]`#D/~f^]~P:v=sN-<<.h!r+ [iQ\",\"category\":null,\"status\":\"pending\",\"ncpzjjsslpsygqa\":true,\"fdcw\":{\"malntvakya\":-692,\"jjzwsgjlu\":611.4,\"zamq\":true}}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.category.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesCategoryType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"g-ema~W*AWT.#hwXTP,s0?9J6|kA4 G}Ar]xy/u)-AB?h9F~ux>sC`1J'BW@v;H|0ryV(*}&0.7~nIJVP]l;NF*DkHP&/rG+CP_G)zz+_EWX@-gmbGKl:X^2Re[@1Jozu)kR(d6]]k9JJu1,/.0TM^2y50`)c7N9LhdG9<_}LruI)aSk>P{c*G{. 0\\\"R\\\"El;R:x=+}dJUA^r88@A.v{6ofd\\\"\",\"t'bW]ynPI0'w_Nc`Am xh97.gQ}%#P,qV\\\"Uk.YGebqVH3kBb\\\\)NTuOFg~[m4b^m#O9pZM|:uyL3bZD8g|B<QA)Q$-o}7q+#X[\"],\"name\":\"-w_ja*=e/Xhpgi7C$]Xz1k_l\\\\eW\",\"category\":true,\"status\":\"pending\",\"yacgitqxhszd\":[\"fXvYy@m\\\\\",\"BIa515\",\"\"]}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.category.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesCategoryValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"!fby@.aNSHe9:r%]\\\\^Y!':Ue=JXpod]#M8Ma)1 ;m6_J{jWRg5n\\\"Hz<n!#DXiB C(mW 3zHN1``\\\"}Yvr1l%&>)6?gO0GGmRA@@t?ni+_M&QuBpR IF:8GE@=W5oo![0c,*Sa:W/SG<H[xCpj6RG0j<3\\\\5c!QT-0:SksIGsL\",\"eAAm.6,WbOmexIBZECOSnc#ab>g~*uRv<M\\\"{*FW5=: (nP\\\"(QJREd!%&<*2$ZZY9jdpp;93 BISGW&oaJEAnvHg8>tN@NoQMWuQ?P~]3GHyS2(@_&~JRG]s~K3^G);!]i|8 _2#0u9_B\\\",Fe(92Ds=~E_9?Qghm1k}*u^Rm(~K]X(K9]nm qOv/X<X}g?\\\"v5)2e:*?5W[9?hCcgi 1.\",\"hOqlW#S?hzv;,!}>,#;LU5EoiFf;eYpT%\\\"m=aH?tpXOshsMy.A,Rp~<&60:G5P*+W0Xuonf,m:s:r%\\\\\",\"X\\\\e /W1;1kS9}!oaLzu<>3ZMJMD?9K^VUg9:ZmYdSvTrZJcRFo5)Rsn|x-#MuC:h`}kHQ(i}{L~Z%=D[uQmXZ:Q3(GHdBw!kRpAi=LZb9{C\\\"I<4DMBb+JK3WIu<^^qf<Wk];y,2AZIYkKMb}M<o>0'2O\",\"XUoDv9}^\\\\#-z(*eY/f9Dd'JdXpxzv) h\\\".{\\\"2FcVy*/(,,I+/:3=>l_Y,BN=(\\\"/*!,=Xa3CjBV%&;x>2BOwN]7):+5GjZ6-E*Y-oPL*}\",\"_ :>\\\"aOOCZR7)@Ii2O$adk{1,@. Y3Om&bokYUx~`Cnr2-c<S!INk{8ef C)O>,m$vf2vaq:K2wiwqpd;h~QN[}`>7Y;wP<GMR@gAYOseEpGtno;|e]Mc?'\\\\ y<f+OzodtS|&Q\\\\^eQolZ@K@LI&haZwZ_k\\\\+T__$Vuz-;}m6?OQi/nZz%- QfnN8G0Kd#UHF'05Q:l|TX*o\\\\b+\",\"<bNe2Rqr`,B\\\"\\\"'alW?3IK \",\"*z,g9g62C9O6%YT0[S7VYcH?Xz:C-4+lX5Akre@/{*@;%n3vN|ROl2'5*9?'gW))a1/rW-aR)OckY64?v\\\\mG_D6OYi+TxMSiW0-w?7s^[2pmpP, y]rnh'oIR`t\",\"O&JEV)n6H'2PCEz\\\\uoj_'RTng_.>) 7W&'ibiHO,jD)ukgTvy\\\"PhD9d\\\")FaJEbX#<M'o|u\\\"^D2:`+mAPjr@JE-Cx,wEyq@Qll:G*2lQ!S3*A<Dx\\\"k6$aTlx)L>)h?}1jp'\\\"p1,]xPTX0\"],\"name\":\"4j{;f!GD:@lac4Z`Lk'MHb/[`yVp^!*@SciHi.kv^_1'}_1^6bm`kdLP@}w$=oD4~0X8BT{;J<15B/bN5ihfc?3ql\\\"3}yF;2SvLNF&BF+Sv8\\\"^_d\",\"category\":{\"id\":null,\"zvschcscl\":{\"yuvpl\":true,\"oieceavkkpkbxz\":902.6,\"sx\":-687.6}},\"status\":\"pending\",\"hfuzw\":[\"w;g+~\",\"nMskO3\",\"\"],\"rssdfeesswceczr\":true}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.category.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesCategoryValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"iT~-i-X :'EJ<0xzm0UgP9NE.6HHV$oIiLT\\\\*/LgVxz$Ly:um[EgZ&So$G]\\\"# jx>bhL?abAD)Yq]/QaI/`Fw[p.%nCoqSK#GZ`}hBB-EM/JqH9%gj942{s;?#\\\"l-Ii,Sf(|YN.J0S\",\"~Cl}<\\\\O[FAVBoi8|]i?\\\"(O06kkhj1t0Qs%9ji 3v2$a5}U`l0Au&g?4}P$]GX2nqai)veb>s{[xhE>jG~ci5Sc|J-nT%M A+`js*&b(G,Fmb0-:4<1jdV(</~[svRC:lQr&c<]wx&IBxdUhR QZb,@Yk}4xUv@R\",\"fk4dc\\\"YG^Eazlv+0y`d^W=k04l:,4\\\"Q.K@2Hb;+<\\\\ybdAz[y2!)b^`U\"],\"name\":\"CjFAS8#f_iK-r}dw&DppTjoQ}bx+wiL!L$Woyu.2j`dBx^L$0atLlx84,8 c#v=NG]1b1X/iy\",\"category\":{\"id\":\"8(modKlY\",\"e\":\"V<LA#GQ\",\"hcismlkiyrs\":{},\"ovrlj\":-918.4},\"status\":\"pending\",\"zbtrkesduquqpt\":436,\"gnmfubvheivbbl\":true,\"wnz\":493.9}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.category.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesCategoryValuePropertiesNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"!&W]9bSxXTKjf&@00jdzp6{d37X.xhFIUK#~SG*+| Y 4<5j&$d=&dFtk (9&$G4.>T!$H=|.mU{Mc[?wlBXms:L9;10N87.wK+\\\".{}.[bpu!//m4jc#431Ev4qa(\\\\'+qTD\\\"o/>CEx5.[n<Y=_W98;h4`.Hus-b7JW%E{l1/dQprHX5N]8YYKaWxmn\",\"QMWK%prD\\\"J+d}$I8pk=gT2Y'sh!5PLd4jo%&zQ$8_[AWuaz$[5&iR =AfoLW9f)o\",\"m>T_og\\\\2GT6ZX<`[Du\\\\hMp}hW5 wj;F4:Xs!j amm8w\\\"0@XMGn'\",\"dbXJsW|x,Gr85\\\"|4T\\\\oj*}c._LaJiQ|v<zKQSaB9JVE-g`Q~o;m&>!4S*b$vcczj\",\"PQ}u)O=(R yn9^)<9eY`v<)dv!9acWS<fEB-/WRDXdk\",\"<z@#7uNr(bXM6c[J_H{{d|qGw~3X)2\\\\M-0BFeco`QB(g[Hs_ScRF)WIkuw=Z96pf7%sV6@HL%iRi]wdV3x@!>u6zR~]LI8$[L/VPB\\\\%X+4&u<T#=/&HKTfU\\\\R0=7k*VHQ`Ib\\\\S_ .RBB5}5`BKFf)'BvUFo+Iaj`N2rF2rGs2K,<fxg\\\"QfIaE;13*\\\"Glp`ILLR%F$]4\",\"(!(MUbisd.TrJe\\\\!dV?wuFm1CRA`Ge9{8EC6 A%fHx3bs|T`ABXr7fw6egp-f\\\"'qy@Z\\\".ze?q(=tY~AO{N\\\\Xw\\\"1u\\\\OZDGylxZb.WF=X8Y<CFqu0)=qP|h{QJo=hxHHR_JTq*il.;i>5Zv.E+&A{ ivv@}{bz[Q\",\"rYFCJ#x&KA2od>q\\\\++ytTBl+Xd&-[+!81W+}7>PTD{/Vk[BEv*9!|Y>%C8!x4#tY+b~G'Iy2*!Lhodo3m(zZE=4AJcXnVB}BX3;tPt%E44gYB_A#`_BWe(ZA;pvX6T3)+\\\\}i R!`W>6A@{cTe'6\\\\417Xs^u+;k,o>)1=1\\\"e= @epAnx[+fj`&Q~Ws.D:V1y--]TOQb>l,/:G2/HZ9q9TM>0uxBUO^[}$V9RKH<3\\\"`@Q{e)|q\"],\"name\":\"FW[NrBq'@!jJ^]Pd8KB*D;g-N%X8.'qI/'}P0WA;3+0)uho^EBcK2P/~b8AuTH#b;.]`M?BBC*3u;.nb%6xfP`c\\\"avJah]iF^Zko[!MV(\\\\9@F,P(Q7nYrafB `^\",\"category\":{\"name\":null,\"id\":-4034838516213514657,\"gixnqpgbtd\":\"3%\"},\"status\":\"pending\",\"mqiddo\":{\"sbyfpqydizxs\":\"\",\"aqvbfuebyliby\":\":6ne\"},\"kkkoqjbrasikfe\":true}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.category.Value.Properties.name.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesCategoryValuePropertiesNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"f:Iq)_:g7gE@^}-E1`:WUeJ3jxueAYkPm byq42QEEuJdXp{&3``aj\\\"#c9U<I?pxuv<qB`Em\\\\c!w7'5IW%$6%8:m+gE2cd7.1l$xjXHB*k 6^\\\"y8$}p;cST PJto,qLK99PVPOsd(R|dSoi@^rK'ZOuCb}qjk!cqbTr^ADJ`=Cjs^zG'BHtBL3<ZU(k7'Lsh-HleE@wpb99\\\\U(@\",\"SE)lGL 6aU\",\"4>u,4Nxn6~y%)/kCHK(!f~Wir:n3V|{h1zPqQW6Z/d`_fGqMSERB>g5\\\\_{2o; `<nD;Dh{%| 5s)93Ovnr1m?*h<U}:OkSZwyX{2\\\\(QdI7#O<V$i`n~=)\\\\5`I<F_\\\"b]|<uY`#nI{ZCT#2<g<tp'xF-TYoOz8C<3o't<Z31zkh S|*P\",\"8;x:c$j@NwpjxtwkhwTpuA=czE+J(<N4U6DRo27D{)'h/h$~=Y4D;\",\"tJn*+kJ7X,f@5x es%LHw<}lwpmW{\\\"B?a $tb6[!KR+[y_PKq~u 1?L<Xwaoi`:\\\\_dqjP-S#3e< XU\\\"xTp=kx|o+[*gc.SlAs>$K RYSw?m>'DKIdMVT&d8woX-2QmIH<5~q.8<?Beg[/!;Hv \\\"9fMLYzdFo%>VIJ?3f3[D\\\"_7_%A725n;4ZKtx$:1DV/:PZN%eGAM3h;0Zm[A|5kMR%/Yyy}$}q^a -d,?HFUvO<W3t.Fj',i%]Uzzvf!\\\\^K:HD\",\"M@<N3aZG!!vSFkjjE/qc@;!mL.+urB5RkD8cKlwkioWE'yFkd=k~4uzR|gh_1wRTAk~gZhJAGFG7DCo{Ipevf1-0EmE:FVgMKlRI*5DrSm{nopHI;dp]xQV<WW]GlLO!-VzFW)Z^nd9_bd&L[-4=Z5x[K_7F;R;CCgA]aA[}csx([ m}\",\"c*vpP#~wgjd4%Ecb0`%yy4/l[P_9(L]Ak]6w%X!*SF|hWdyLw`t*_ ,-p0aXDoA*b]$<$r.5Ij@cyee#DnEmp4,IE%Gyi>=c\",\"iSi>e'->\",\"mt7cg#+15t,4JtaeE_mKl/jr~Lp A1j3\\\"!ydIL7ayL(|=r>.6wlB:vshdM2{~zn@R $+XimgG2ppARe4h_g{($<0.xHtv-u:mhFZ!oqh<!leN/:CF!~+w2q 0\\\"r-$T=1p\",\"|\\\"Yl)jN7ngm,/u*XvSF~:qh7V)wz$FH?3TC/mtFw\\\"Zz1eRPL)OVY\\\"liVOfK4sMll]VA@f/Jd  \\\"m`CL.gPtC?T(0)rOQ*;2V73-QY&>-;i],YGtfSfJ_$deW27D/?7ap>EI8];DtTW{-V/)UX=3'ZPNiv525}{#;oE\\\"%M\",\"x&$k/uu'Al~HEKz][Xc8IT\\\"M_NW+ (A:M6X&dStyqZN;YZEQu##&v/~J`Rd\\\"I=Ai3:v;>(!#%9W Hbh`_}WD2\",\"TX0Xq?|62Vs3auQ|xR=kw,c/9\\\\ITFiTaM0CO|51x+DMrWxcbr1zO~8$YGfH7Oc.Nnq+0T?tQ(r%G8:Nh{a[,/3>)=eSUAhaEb:D;Z|p<+<4jKLfzl<!%*=6>1}G4~6_H:Llk#lhe5j)q[&@|6a~aLGjFx`p)m]b23NFCnIan%mbb,9^<+T+5l\\\\+\",\"cdBo.wY@R?L)G*JfLZmPf8NR3I5iz,~rDA\\\"kB8`ZukHo0D`'bhF\\\\\"],\"name\":\"l)_Gbu7qWa /UHwz[WW+_squ5qNIQD.m?<9{U]+8WPr(@$1{:CY+ c<Cox^P[ W,\",\"category\":{\"name\":{\"slgwtzliow\":-877.4},\"id\":-2001363871427933417,\"tfmykiym\":\"K\",\"kwh\":true,\"bkejyhxfvl\":{}},\"status\":\"pending\",\"luzuxj\":\"kVR\",\"cimxyaeqaazr\":\"Ag\",\"okqgacqurmmkckrp\":[\"4\"]}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.category.Value.Properties.name.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesNameDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"^S\\\"^F=xU%PUwW\",\"pSrNRD&ox\\\\Md~7`*^\\\"+==~fpq\",\";PxNj?jn1Zz^cjh8%{b.6)E>sanR^%NKwE_ m%IwDcrX{Wn9-af/_t'k\\\"02qs50+EjgM9I\",\"C,B.LkZVu/*6*T:y'eY-9-Iz2Wvct-.qu$J G,)0[EZ=H!kdTjFA(&Ht;^^ A}KuP)R_1 I;xBje.z)3GRO9b= oU`4t:k|bU3*?vjwl6CP3j0w9-.1b|s+K$z;/>3{14[%+J'OZcG<(_woM6ve1AN,N,\\\\)ISH\",\"gXO% Zw'o7U `-X5n@{lE=>}HQF=I d5<[053?Qi2/d-a72Z e+m/UvX0|H~Nj5 i<qa+<?hG,JTL<Li+8.sNawoCj$7P]cQa`|9pdX)oioKSmr9jH&yBC^#d\\\",WjTW_qLa:YWFu]_v@^E[{H#k=?|6*UR%^@DZS1)4J%'\",\"\\\"er\\\"L?1 dG$+H&)=v D1E9:\\\"SakK]$;wJdnD j *:.td']-bH(^*pE'JPlM@';<`U'x!E?x|1d(\\\\parG;<-B|+X6jM;78~K':>E|+C'U{29rtJ.`q;\\\\ cZq:wkiQ8{&7Soa'=cGh9q>6\\\"P\\\\IZ'-Q#s6QRZ;q^7:u)?Fx5Gd%C5BP=XKV[=SUoNR~}4gg9L0dWifFi yuU>ZoX**qiwB2%(sAh;)|\\\"aPcjh2\",\"wKI+ En4m:5X-|ql{Oa-\\\"$6mqs:|7`*X#+V~9w\\\"L>dGfDv4_liL7uHgfr#!*sv>{E]L1L*e@](C2-w(-NSUJUP Z1bs$G,TX1|dA8}9nQ4V,KmA5W\\\\czFw(9C:`!Cg2Z!.]s Ei_;fHQ)r~:Bub~{e8hOwQMr%QYs/=!/y,J^jB-)3Fc:&jYi.vxPs<qO_JVFj%/mzlIb'u;$Ads@518&K<ZYE.=CwoUv:zc/'L{2N[\\\"\",\"&S,$u:ePGh8kX8GI<#'G(O}>/K1G{[PBJ`p,'tpU9U&3@$gHs>RWb^Z7L4^{NQZ8DJq\",\"eQ]rBD\\\\{<[G@i4Pi,_$kY=Z9mm9-)tV33:|h`J1Z+LU)XzjcaJ^dIf+3).on7Hd\\\\9~y/^&|2HMkQ-zGWE|s1[em|9hbK)SeRi ^j~+[cI4I@b}PK`aoycP\",\"VG^sC| _I;._zqc\\\\D#Wu t\\\\*CuD':8rT?nB3<+vup*<n`toU=Odi\\\"'SUld#\\\"7_sco{%$\",\"hK=|<7|\\\"kN\\\\nm&.=/p2;Wi#{<v*?5H'.?9$p5&y#^0l>]#N\\\"#9T~>9b6y*o-hy@52r2A~n# pMCkj^mQUNeF. Myl= n__5bPAYzDmTxLm*l1\\\\N^ J2SIsE.u{%3Un\\\";I4j%[~-gl#u%cm8:}@(R[zdR[v</VQ4eHe9#y,RZ}EgZFer+&(mxpAto$}f<GJS77|<-g0}]]QDe=Z\\\"bkDp)u9rfBNzJ5ZN>ZsgnE/$3#\\\\IzsWli=h3?T8 HxWTp\",\"@`-mW\\\"{%6B@xLz=-5Zj;~#<iVV\\\\MEOK.z|Dv{+pp_@p nHN-FCmnshsetHi}\\\".iuk!t}VlRx[%S\\\"lH\"],\"status\":\"pending\",\"vgitsnuouud\":1010}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.name.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\">/e5rKwFAx/vhNg<=$p#Z/WYH\\\"1qzorf[/@Fk^urNkvE,Aok*)rTG3FMY/M7`lw8x 1ZrH):.>&[[.xj>Q,4vN?EB-WT6;p|=nzv45i&\\\\,,[jb[5a0jiQ*p'wY04m,-1!%*q~OT~9^Beqiwq+4R-jesItFCQqJ6~5CCE%|[jjd)RS*^PT,n{iTB\\\\%H1mER%Pw\\\"KJZwSqCFta\\\"goA;eX`p:G\\\\9Q=U7ygw; %c>}[+Cj}\",\"#~qEyjJQ, U 5K `.%_IAOoM^sx)sIMg* itp]H7?2^R=>\\\\{kmSk|'p=N^{Fx}%c~0iqAIpO4b}y7m-d^u{y8(ltwut/:_2q8Z)a@+#3QBb7{|0G~L.4*. nTLN_2Czsu|gxaN(KN4oQ#i8UGvvkHYvFh ]BfCB\",\"A*Gu n:1x&M T0HaY0f8>z>N^=E|l)CWJ}|f94sv_NIu[%!Vn@OpyTK6kAlmvQ;TOdW|Y)If^X3@vg#9<[q`G}M&]r:5_|jcjX,xC!=^Uj>%2'NjfnH[<!yM)|YA&?aTt<8F{\\\\u)rS8<{CCG;bw46x[p;=C,;^qsH6q/uF bZ3@9cpZP|MH!+UKCY~V5G*()hx.f/s)OM^<,Nl^5OcNBIjV!62'LcV\",\"`}N$);\\\"@(P.-58Y+Y?XQ? X_7^bCBfJ_4z@>fo6cFJjKz8zxHTTK'%iP0ikYc2q:VVm\",\";_(/H:Ip|<@N\\\\Q,mThlR1oB,V0P}y0)oog$=An1!y&\\\\Z^^S[9hug8:9/Fa\\\\9S&)0dOiR}4/'XLq<jtx4uR}oP4pK>Bf]T3RNzXCaLUz8LY1)w'|IgbQ6LUf%\\\\/>(P$~N2s9x!QC{e9oa>V\\\\~[ly\\\\tIrKP`R@-V=-7'88,{s=xp_lI<P-;HAMl_mCvD__MFno?u]=*c@p]U>F(~JY{i$wGb+?]'^!C3wdZ'\",\"qh,=k1N#2F3>m8=EY>i-NmiI Q|NlVMD-.vi_1Z?NMIZ#J#?l;6}a-S6F[kh3pMZU~pU*$uvANdq:}pPwEPX?fmuq=WyC^,fh/Zg:O$s|Mkc#PLce)h5f ]kd'q50adF)2O6M(l#P ACPvR B9F(D\",\"D*zi#R:w7rnXJ.6ML(&%!Eq&1Rt7Q2:cJYqTM$,H$R(oZ6ig!\\\\3|LP|MhX]seLS<Il5\\\"s{<JNR= V7\\\\qs[?_/G4g0@3c2~%8GC3zy&YFdby\\\\%F$][Q(hA3as4>*$-iAv-6XBl'6{UoVUvfE7s<?4DoD*az,{H6ES#\\\"ab++\",\"<W3_L.8#\\\"ylp^oO\\\"948EUJR][x_b{mIT@\\\"GZ8vU\\\\hO2<-LJa)<U-&?W512s|ZI&@!yU2#MzwbDOD!&>+-[zy!S]5e!P/=;_~rVWY!EcQJ~\",\"Fk;YynnI :J'!|){\"],\"name\":null,\"status\":\"pending\",\"uoihwpppgezgcrsh\":true,\"ontkhuyhuukjmmgz\":[\"7 \",\"r@tQ V\"],\"mwhymxuhssvteos\":510.9}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.name.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"d}(]tK==5g3 jlp.B7z2OYUE8`f*,?h+u#:;\\\"g2t4x__[G17k`hu1t)-z<Pudl+'v'g.`/'R G*x!?+*XS96c+,a}H\\\\e14k\\\"0z&U'99}Pj_)Km^us3u|Q5'=GZFwb;2;Ntor^}XU>VTK(kT-]f=0+9iyVM\\\\u/6i[19Kx*&L~Vgv0k'|nd Jnx@)'-6~v+Rs 7j2t,~!|<zOkR}*'Zkb%{mfj1w}\\\"Ei^$5VXOpg+c}fiYCNF{#O+(l$2sy9%%]C)k\"],\"name\":true,\"status\":\"pending\",\"vuqvcnocctuk\":{\"muwiaecg\":true}}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.name.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesPhotoUrlsDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"name\":\"l}~0m2[G_#uQRI\\\"W0PD(M<),R*J]PQ^xRX7piy]`l8pjx,-eTA.iXF4s^Ojd-0+PE#0JAas,{SxB 48JOFo>L80QkWV!/w i!Ey_g|Iog8UESn>R(tB/T?KOS\\\\p<eB}dx{z?J@~\\\"(Z\",\"status\":\"pending\",\"be\":286,\"ogj\":191,\"bc\":true}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.photoUrls.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesPhotoUrlsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":null,\"name\":\"7\",\"status\":\"pending\",\"rumoexoyxvundg\":613,\"dmfuonq\":\"DRl<)mX\",\"jtd\":\">oF/b!\"}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.photoUrls.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesPhotoUrlsType_Is_NotArray() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":217,\"name\":\"/fJ_<(SE+!$AzeYSwnmvJ0R0tn@}~vPjr}q2,JMfC`.!<r#GF}=7;m6]v1JE={ d9\\\\|iYQsm_Px[1GL[rME3W7JBij3h\\\\/JBra4([;vPO=1B.mvV=BoB`(pxpbiU-t]adOl`fHzKiKT7`{\\\\O=ABVyM^FqU}1)OC#DHn6UVl_.a#<C_oQ\\\\ke-!Th\\\\KzNzg&3V>YKD2<z33UN!w\\\\xr@=kdE/-a{5[\\\\$k|K7QKeOoVe!\",\"status\":\"pending\",\"dvsumzdyarnpxneu\":-451,\"ghqho\":true,\"fnzrslcsfl\":-1011}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.photoUrls.Type=Not array
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesPhotoUrlsItemsContainsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[null,\"`</JGw'U_*+\\\"$XL&o%ihSL9I\\\"y\\\\N*J8ZcG/b20\\\"4QWHuk:`s>9CFg>A }&u,-v/r>azpTG;G\\\"RDt%aQ(WK{HX3!vO2eLV&C@98UK>lZ\\\"w*!yNt_>t$aze/mYpXBt)0!]F,'2CaHtHG'G8O!fS>M0rXXvPtj`,)`*+Dtn_U?,DJhqI\\\"qMxg3w|Sl9`+e|,tR&?EPm\",\"!X~'U:rS!h\\\"jw.=^mrQ29,LHKm\\\\3CnH?Bah5:$ivTWxqYi,s5e;aL]up'!d]rrkn K-#T1H+*mD/?Z4)pg`21C'{o@\\\\/6#gl\\\\\\\\Y<fNg@8\\\"?A1N9r7MifpFs4w@x^a$=wDw59uJM^a-7r2#{E| >M@yNQ#8\\\\Xov]XK-k~E4R>@HI%^;Ono~1m=&k{Qbt/h\\\"XioR&\",\"L1d\\\"s48)Jg<f?P*7\\\"!9PGB-l+(q_^O1{eo{&%\\\\R!jK2s2C;|/?]O\\\\ZAQ:-XfF\",\"owTry`U},9PLf7qG!. 4}_hJ\\\"iG[q^mEwJ\\\\!/ ^$jcN\\\\&r&'B:x'}y|*7..3GLb0<JJqX7C~]|RE{8D'mwq/R%y-?No{!e\",\"m'WR*Q\",\"VHU(S|:x RrR8\\\"1_<<to:7[ouO[_%\\\\)8Gqrn-sR`2dsr0e%FVP%!2ho>8Sc(/12AgJ{%ZN,S>m]DLP SB|2nB@-MEmxo7,n%vxHx&'a}>n5+P'i>,C?d%1W\\\\dS42@$kBM\",\"b :l`EujM[lYO,Bo9[T`#,2Es|S3'BJ5Y1P<S}x1!U+>?< QnhlD/e=)gz4uGr2I<k\",\"({}h9i%Wa5QQM}`wxo`B]YB7NPO&V#75hY2w{pg=-:A1OZWH0,IARxAJiR8fx?psz'}9X<wxiLr (LV[vvsbyhN_WCH 3(><h4=l2r&_#dZk<f2/\\\"(0\\\\u\\\";*qp3[O$Sv@nP)EiKHh!ju}q/c:?)W)!pQ*lM@(1cuvY\\\"~7T=\",\"3TN6^c$YE:<8/$;=5QH!{9p(`Km.\\\\uvA.gIks=Frn\\\\QLDUTq\\\\L&07g{OQ}i}$DG>EDWC0cjtzI7hQBrRdU|8<O;X4_w gFFjt.>(eH{n]7-{d-Vq$$gday){a}E,n\\\">LL?K 6AYFZc\\\\E$=cg:TLK.0w#o|2$MfUKNFv3d^ONtecx8'j@-h>1}1.K%21OnQG0VN+UWTX<5=cb?TS\",\"2PwMYIyhi)9j;Ml5I+#HP/bvPj5~rbh~M8e5_;i)A;%)i~g^,10;`oWp&l\\\"Fjn|t#0L)?j$u'iw<WNYJr)uF`m0oGk77D{D>:MG>`LR0Zw2'qG&4]~s.rMrI)+LGq{`*;?cLjE^wV\\\"o{w$-%;Xx[OV$2hO <JD Sz3`]{1t7==UZu_Oo3Okc/Jd?pR39b5kJw\\\\z\\\\|<g9!|ud[@*DuXJVvr95_-'5E)^|QHj\",\";J ,,h/U_s(:ie;Nz)P623RTp^\\\\`N=!ep/QN_m:zD}x[qNwBs\\\\^Hy?.=V?h7W6S|e50AFf+nQ&z'&Cf8?`_YsK!sP*TZ%]zpon]3Z6?AQ<y9!o)]W\\\"^1;p7SVv[Q*n#Vr4+UYj7SMf?4NxK!.4HW\\\\s~sdu4W &Iiitep%l<Gz,7/XcukS&.2O-Yj=?qz4xp#Nh*[*.fw*:<\",\"I<Rg\\\"f<z;>@X&Io?C7u@cWl30sYm!a91Wdl~?uUV9NmaNa7L07%pP7SL;:6x- 7yj@/wie/J@1+!GB,-%VK`Rc?KfIx2}l*%u#U6}k!trt.LB7ikj:w3<B[bjm d~x-Gd*t]}e>:X++x)cv9qcW#0:;H`T5-E@mF2trk8~/[C|~<f{ VvBb[y}Nm{^V`eGFTUtdiw>\",\"y5g$},UVJ~iJ\\\\bkS{!n8Xx~!yYzTee1flv<iXzCH,A0Xl~$FToK7E,Kn2\"],\"name\":\"nZPV+e-xmB'uR2|f9/r-NVc!0z2; aBxWzpHs||=Suv`nNzuu\\\"M;y@O~5B57ftHUW+}+OXAKT#mx1QQNaYZ*~93\\\\oS2hfGb!Q>^BEO<v\\\\9Y9gCuSN>uKkRk|7;lpJ(`<MSRK}1z64~P%lYtm$+3s&)i.bO>@cTtIW\\\"!f]GwiA]K,>\\\\96@1=n<nJc,9+M{o:lMwR1:=HSy7'ZD;>z#{vcuPG*i';pX&X7+2> kTg\",\"status\":\"pending\",\"abltxve\":\"f_`\"}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.photoUrls.Items.Contains.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesPhotoUrlsItemsContainsType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[-427.4,\"@K\\\"?$[|`;LGY{OorS0%5ZSt;[G;[.G%h~j}/7:~HpR8.@{T?t,cC^gp5%Y~rnW/U]Mqw>a8.Nh5g6h>gQ68#!Q1<i,Fy=q?;Yak[D?M-K.0[vzoH*+\\\"rqAKAC7Iw`3WFJ$);#Hpt?(sPI `t%St`l@4aILGlG]qZ<PH|2$}[9Bm^vQ~xq[x$!C)?C9:a(DR OU3^<>AI\\\\2{8M0$]`&~,lF&0uXt>#JDSiTf.ER@z!D@U]3*QL/mHj8z6B9\\\\zz3o}\",\"8o=w]7/VEOW_K6cs{8PDfgW6'rT0FG!XFnE1dqI'g|_,!/>-0lo|,4X&_tUxNht1k%*UWRf\\\"2LJE|<jM*@j?#jo8EctKlo='7;G\\\\PA.O#*V=8xEUP;9lg9)3t$\\\\{P6KDm}ua6`A&\\\\D*.>#w[BljUaXKY=_[8BIo1;[N<e]mQn0^Kr\",\"0E^J<xOF+hbS&Z#\\\\ dr@5:M|X_LFqxatqgry<PDe3BmC}1MDu\",\"f%KsY|rp}zwfAGHGc>Y;oHu%(*J;[K;SL\\\":.<w;Z ,H\\\\ypv&\\\\6R%bl|S%i\\\"e4{uc[61J9/s{+/3Bk=&[(alB^{nQw1ju0kN\",\"^v5E;|q|[N;v<(Oz4agd)6u,i%CRkTYG-k&eu<\",\"l?38CJMjer_<a?Nu;K-\\\"[]LFtRo`{Fd]6@{M5n:pu+d1!(Ov3a@J*0*{{.F~RR]rO40[H!l?r36waX*SFE?J06s h2%<hppjLf\",\"A!YV|Un < cP.FPulo)Ca&%l;j_noW&A*6bPJQ,5.R}7c$udUvM_'phe{gZs~pt0(Ll_c1\\\\~\\\":2J.Nh6m8(!b<ZP>?mt/DLH;R8S}d<4)P?h}$5KlZ +M8%qp?ab{?#>px>+By43axzKdL?/IB!=2;U0lXGAUOuWG4I;*\\\\M>IKd3@o6\\\"77,E~Nx(!2!palxPbH;z3)|(d:\\\\)]Qi/[]Y`UA[vzhtd3mo98k=Vr#nBs\\\\=I_?I?c. ?8iGD((;B@&\",\"q?IAROe0yszoS!aBrCXT#!(q.By.s_Purn Nn-N[1HLvB&5#9o2n),w[C61Tf{XWGVnST^Gb=a?LDG<v0\\\\GMduU0BX|'2ILNfVkuXLC5GS0D'vlV?saP\",\" sJ6L;>2& #gQH'OkJaA56!Ru.8{~'N>rO PNoXA:q9NJ<G8[NG4luU#KCCo%i<vj1xg~p]+d:RJN/l-0&qlj[IOMC`x)Ff:k\",\"P7:9U*C~OdkR1oy^ZTUc5n`T[p*(|V[)Ag.Mou\\\\q|.h0EGI1V]8~sQe3peZ`Mw9GUwZSKR#UzC}kcQ>hnE*PPg9PFw'U|fOS3C+W(la6`X!_MRHybhFA-im=c-A:{n+&c'sNX1Gh`DWdhn&qGSy<D#lPDS'E+N=`l?NQR\",\"`P\\\"8P;*6,.11nDq]H&{ ed8?KtG4mpTww1M@PA{KUdQJ:][%Rb/O{e3u%AfV?DGn4\\\\o^\",\"TOMg4D|FfERHDFi<cH-OfU^Nkc[%G3Sx^(6:J8;oT^zh4SgHn5qK.uxIppd$BMdxn(875-%tgZt6H!fduv]@}Bj0s-MK=_Lf&5E8T^J\\\"<)DCD?+0:N~OHKDjZ+)G'\\\\Q\\\\#PV 0`q(89$)$cKm<>v4U2P~zp+O:H!vPSnP$J$|s.]]F1nTp?k_pY70N>dg-($#BG!aZ*;e\\\\5&r v0+U,OX3#u9X!UQ&9TWE!,t}QwG9\\\\r,|th&#bvzmgpEDs\",\"s9{UZDv(ZXg',NH'`epp;p$o3%j8RLk_#=Hms:_26%zk)Ebh4PYFlEH!\",\"Wo1@(g&zGxnQ5c7zKF7\\\\uQTD3X46^;eM8A,VKt`Hu_>R/cmMc;G5%Z58?lZ7e5Og4)4SQ^9\\\"Pz|q/9gTQskeV=*b7w~ 9C7(,>wrK+=_9wa-uIbM0{VD.tTmAzz6n\\\\f>1m#g(I{o#!/~CBGt<ou*j'5-dpkMwpKuDQP&qDO_&kh:if_Q+n\\\\N0ET6Xr)5+AL?feS5W'Wc5M$J+Ua3e#z1~@n]JoWbo`(&];:|z_.:gt?<HP2c+Sv(*\",\"JB\\\\|ik)[L\\\\+$&\\\\jC%f!+wYbYwvrB?[*b5xz{5{xFcB4L+S}OM21\\\\\\\\~0cv|n;px3O8]U8K[1<<1DNin(Sa@m#]-I11JMfeGj24dmgFv8.gu*A3CxT(SH7gl):yo\\\"Y~mFz1>cog'lUfY+u[9MLD{xA8<}pdvJgl\"],\"name\":\"0Kg`sTVu7&Cu5s83&Xq2v#\\\\}'bY05qFNflf'AIrtzUvtdS9F[R+vyGHolBNWplj?\\\\r;w)%TZ_!uw*4ym>T[rkbgC@>L87D4*53L_x[@LET0AaBZJLbslT$cV#y/)dELE#}(\\\\C0u#EP$*DXg%BpL#OCo!\",\"status\":\"pending\",\"zaccbopzkm\":true,\"lmlbshelg\":188.9}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.photoUrls.Items.Contains.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesTagsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"B>:'I:u=^v[>|/~~ozzSmh2v).\\\\M;/sFj;#LwLFXh3Bs*-kkK:/y'\\\\3wlmoi2UaXF=ibl5!)1&ApU`;6&&e7)=q!aPSL>6UCL?}p1ldGZ_)+/fS6:z.>rGL*jE@\",\"@;( A:XR::9`gI!p'^}\",\"\\\"0Qf,DE7oyQ\\\\(|0~7:cf,}:|{>#tsoOYc5.6%>nBA]7ACzVSPy*8Fu&rdI}fIr&1at8t7+84nBfM_{[|~`vd1<u(s$Q\",\"f\\\"oydUq00,_bR5LXM%9fJ3ZEx:)!i/4d,$L!Vc[~jOz] =0'Fm..chV[fwHg&U|0pM?B&$'VVG^\\\\y$B,$c$kgvxb921`C~P\\\\;-]1nLn<*{xXb7+GNM;oalii?3k`e3OlO.SWhpz>in&6:e[m[mdgx+s{xY;$fxIc8:.k/_AAog 7yu4T7wG pHTZ*:hZpxBUqVQe\",\"=j|!XYa?`b=]Z'C_8?f@\\\\}(la4oxJ]2PM27=;aW(FO>9v/ 5XMO>'7=WD&($9?B-|$r5I&\\\"#-.fgFZ&J{Azg]~[XM,zqx~ Pb N>n2] w22*8O<&:vrD3bN)P9/D:Lf\\\\0Uh Hg7$Sq'.]\\\", g^oq&ptp^l\"],\"name\":\"1Kl1^*wN$@1s2+}F&)Z]b#\\\"@}Hy7<0@]g&t?ISuL K`;!3aWG&F-[>&,whF}o#6G@5#Q2|48;lDfEb@,0^X@.;[XQ3xPA1vlXLd`J2F!OZ=u~C,b2@Cf,^lZm2\\\\)<y\\\\49Y~5rzZ.%AlS91CJUyb}N,izZ\\\\9 g=gf\",\"tags\":null,\"status\":\"pending\",\"pjvqnzwrklsrbt\":-409,\"pwteiibx\":{\"bf\":[],\"vducovhmkbkpcdg\":\"x4q^>H@#\"},\"weesonlo\":-7}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesTagsType_Is_NotArray() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"86.(ij=\\\"k\\\\Zv;WDpOPw71>BYGpGvJH1g^W 0fHI9Nu3a<swyD<6<4EOkO.#;SVyFc{-7kcocVjHnmS^zBxTR+t'jybvOO>jtdB1t#\",\"SijL^b<%qalhZwa%a-LU1Cra#t$=0pP35l';!.!+a=^zdq@ha0hol:w\",\"zK({t} ;yC?(WgJU}0_CkRtEE# ceu1T%W]B.U4ee(P*k=MoWxzW~}@EbUT^.W^t9fV5o@/kx@_v)uvWTO>tl&5zEA#._Yy6-0Ouyq_RKK>Do%\\\\-VNYDyyNhfD}xMx%6O5|_)\\\\yvL$_:>#DW\\\\526ZlY9pFOJPZ:=\\\\=kOEM[SO\\\\6X+Q!$mR8iR|<.B5b*P(G-pjL\\\"hyg&G??D]d?p {0*H~\\\\}n23gzj\",\"r9r/]-U|m(\\\" ^^4F77Z{34NL1JA)WHbes82[SfF%*1OWSNLk@[gTYdoU6U|HW+Ri<+7`/yPQ\\\".(xZ}mdtzx;t\\\"Ug0?eaJ5Up$0jQz*I9jY2HFzjIg\\\"I)<6X#ALt.uPv%bH|i]-bfHxS-0jeXEIy~M,;WEiu4GO eZ<\",\";A+\\\\#7) 7h,+fR@7F656XW|07Ky ?00M^gMj0]&@Pt#-gtKiNEBs=3Scl($cr:x'S\\\\6li@v\\\\_6/QMu2fNd&yeN1#2=t9!f7?[y}zUBj;O5',47t{(tCRDX|XN\",\"HHC##PRja4LDo'3X-lP0:'b_45} x^dSyW@+II.4CeZSIR^<-Ky#\\\"StsPq*x%h_X\\\"@f64g,yd!Z!uHHo`we1V/]tq~\\\\H~O!Xh C.Bl_S@Zy[+fq<%ue=u=cWZE@):~Lhr;D<DhI+}5ZVhKJ-6W=2W]q\\\"g-*xs[x5iA9*k1{uWT,/h&;m4UCs(G>d>V\\\\MLDFBQczV%_*f/M0>iqPT7)7u~P!;?)8&9agBsWJ\\\\ Af=N!+T>l0dgxtO[$rsG^Uh,[\",\"L39KCP6f'bW-DjDk$vO\\\"`KO-zu\\\"2sMddZSeZJm>@A_z @8oN+-O<{6Pc ],@QU/lH4<wHmYQx3aQHtUf%vsX4a:CE@b\",\"_DWDe~`Bo>$l`2;a3;msZd==IdX28I6R;s)1SZ{%L5:-lONg/[I\",\"'S(j5bBaDa;\\\"l.5hJts[qF49-aWAoF.|cu5^2iw39;zDmYiZM#4Zyh=\\\")Xm0H3\"],\"name\":\"v<{FNLTe*GPk' \\\"huItLlM|=6YurLW{]xe)p6_gx33(qtU'4zS$K6?<q\",\"tags\":-591.1,\"status\":\"pending\",\"zcaiagvzdcyoab\":{\"ynunxvvvworlfta\":-557.0},\"wlcuv\":{}}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Type=Not array
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesTagsItemsContainsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"u_PLm/gS0}E?I_}J*=oZb+3&}d^Pow>&L]!pr\\\\HR<Fe Wlr;D'~+\\\\r9=DS>+Z`\",\"weY|~&(}N+%%^1L+lHWj[__ZwAH7:f\\\\H=Kbrh54{6?(\\\"y[fgCW%'+M{H2a'q_8Bh%{MI<x[Ly!}bU3ae[EH'|y:>*^<I'Iw0SU;X7oJT9{b$a$eG1 gL{NcptYF6O\\\")q:SPdtD-%F-`\\\\>5G_\\\\{KSqkB70l.WV$Dauf[`zx3u.%!h\\\"AT}n&\",\"ycdPH(H|!O:@F#suy2^l\\\\!!+`=^`qX1v*RKS[nrgJ\",\"Mh D&2CseAPyK(J%>nP^Uv<:/:u'(nLM\\\"Bo_R/=l0A^G.VaoBin~DYNoVO#~IYV1T~nz9W-01lw/Wi0`fTNCj\\\\b!,{$}APcNpWo^f6<H&ut(uI}f'9<P!ZCK9+Q0^HS h`a-!lkGWZBi7/y8UG&!6.xZ&Z5Zb?\\\",OOXgM;pkj31Pfy;_IV\",\"C6!Qm\\\"Zx$#e{Cm\\\\+[)VPiefHY_W^\\\\p&3S)A)2AX N& VCSOfpM<.|.iz6KZTG}XbEDzKd=8TK.j59+$\\\\C.3`r2T=\"],\"name\":\"_8iCf`D5SHSEuk?!K-.<HM5KsG1r9o3?%GVPfle^wf zt+(=oV(w_9)Y2C!Ln${KG)^-gg0ta9x;*d`}}GFFP Q/aw,}4vd+Ob/{W@P/VV[9y9^5P@bN&Y8L~U.sRmm9un|e2IOfGXcy0{_Ks^$q\\\\H&[~8P=V0W(ulH^HZ`}`4@P!g;petg\\\\t^d]*;C|UtL38!BT$Z]~aqf\\\\Up\\\\L9XbKf[5OjNhvH]\\\\yyX>;*n6Gh$[;GY\",\"tags\":[null],\"status\":\"pending\",\"awk\":true,\"vvjgxehgi\":[\"\\\"5\"],\"zy\":745.9}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Items.Contains.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesTagsItemsContainsType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"*^Ou`Y7S-\\\"Zs!h[.}@ziASQ?I#:,ZQ.nBq=|j#YjNEVae/^W!YuNcvP:>;&H=LF_5ti]Ds2XXid\\\"2eev'./h0`ZmyO,b3q7Nm=)7SqK+QLAOi6cmcT+0.3VN/*$RL oYVk'|\",\"WZt54\\\\|(gi>_5t$rh6wIxD{]?u=-\\\"#T|\\\\St+!k^];Xg~J,Qz6!4dP3unVS~t_Z\\\"GP!D9x><R0+^q\\\\\\\\(D\\\\<XDc,9$V*\\\"n uXu<WFw#I3A}5n8OEH\\\"C#dOi`ax}=1#2gU!&[L?xGVn1!cM9]\\\\\\\\hVrvmw5&X-sjTUV&px5%h;G|~Cb(p2!&Ifeu_]L#zo%nMsjL[gCksOpxCU*/9Gb0[aCL2`wP@7o[4X0~N*E%\",\"[/1*BJ\\\\lFN6KTX8x`O~zfK`3'-pDbF&K>w^pQC*T-+>8YD+$C:IZH\\\\^\\\\~!/J+=1;8'vI,ZgOCcsm/)E(pbq]Nmo5_p?4RZL-:1N.{t[)t(\\\"E3JbPZf>9E_B>A11SaZy6`@A36g|X=Vl5H:C;SQF,1~Q37.O#SNq-=O0(W?9ZD@U?D-\\\\Ed'mDtD*m*DdV TyO.B(<Q~~C_y/iokGu(I8wkXe`d?f!LJ0Tm\\\\%xl$\\\"Ie0$X\",\":WVtn).,T-{$[\\\"BHBo21#hQ^50$ WI(j*,`*8_m?+g/\\\"F$_[b?u~F,lT8zli}MFezf/_>MN^Bc`>&Jch,jw|pLg1-`2va\\\"vhF-aW.@0ioWvMe}EEBS_Jf\",\"Ro`e.)mpf{A~>ae+CE2UP5;;mIUd)_o$efe6h>2@ !=SBcJ]GhU|1!1#%v|TTf@-C-?qv(Q]>XBe{`` +_}X2oJ!e@SM.,#$QG}ytxu-t/62cS,!rtr2k0+u58jE9j9oEP`l9LfJ-[nO'O^=#+huL;2\\\\OJ=R+i~G\\\"V|OF\\\"0#QNbZf90PSlBbmbAS!C~AEe~^`9t]O[S{)qR;{|,n0#Ln6n8.n.OLHfewjimO-K_CFx(iM?Yq^BQ\",\"M\\\"EgxsT$orVW=bJV8tz)xF4`!0SyamjUxZfYqGkN+9]J\\\"mG2}yM5i%N\",\"a@5SlzBVXJns?Soqk%1X~\",\"$=K7}M2hohJox>{nbc#@S,FZP2~R1y'Uy&cLH^2Ez>BR,-'*q/q-EtPMy[~/j\\\"S:]wn*\",\"%yu2V_+E[L5]E.UrF')lX?5\\\"$g2~NM)]U=lot&;,&mR$k]f]Lq1j[<v)P$B^[IT>-0`_WBT,QEQg4cZ.}\",\"a`JX'=[DYOX+\\\"={y_\\\\Ll%_Bu%!L{oCjH7'P'iy~fYmM|SNNpQ:pJ9Q !hF p\\\\>]$Z^j_ O$\\\\.Z38jvZ7KfJ&AZ'67?Jo1+iGrs'NQV/orf@EpgkuJ#\\\\[LWzr`s2Tzt\\\"sVDb}sv!'^ Vx_3vAOee~3pD^td/RUxdS~wRGGGyq:7.mQq>v)N?{8YgR7R-tTvFE,kD?H*CKN0gGX;a%&`sv\\\\RH`w!iUZ7{gPko5A1InzHTrGPvI:NPe;1U8Ow\",\"d~Wyk7%LED|Pn+<Y9*~n~^#]1f3+ W2NJ'Do2dlL\\\"Wvw7[SGr4z%,M43WL/<QQR#S?[sF?HK-pQ\\\\8p'pM[1TaZ<U(DC@ftuY)6e{Q&O,+8W7erV,bE~Lt'Xk(w7OpS<*X]KI~*gau)`dXZ&R<kuOCgP.:\\\"@BJ#pH-Rxd,636m]cBO=N[Tl)Z,-gO!-\",\"b lnf.DzAy0P,-7G*LF T`L.KIX5w!w;Ip`(`zYC\",\"6&|!,@X@PGO#<&\\\"mV5qc[cNy@#Qa6F>;vM$}#ew6]O`meRP oRm#72=eA\\\\o!2LyIEYSF>s(%O}]A_`23*c,7MZ/S@]=IF_*zT=-swBRQ_E`uW@FizTdqAo@OA_\\\"|Pt,$70sjy@X'N^]V4q%Mv%<%-TN \"],\"name\":\"m&es.e|r7[#1=7WMVs{:}4VUg0)\\\\*VI'lxh]+)=J}eA \\\\<hFk)gu<m0v\\\\p{P%{]=7+gvb)U:iUv7`(pfmRz?8 (1f;|X\\\"\",\"tags\":[true],\"status\":\"pending\",\"sfvwkesitwy\":615.7,\"s\":-187.0}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Items.Contains.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesTagsItemsContainsValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"B%?O6syv_YS]~&HN;`ES1z\\\"*8#oXFl!O6PS\\\\ bwHH1_f8tZ<agu#%mlEw4M 8{2UTkmhR\\\"1w:)y&G<\",\"]'ShVcZF^q?b\"],\"name\":\"C?F {lGgb-Ci<p2)1;,nJ(grxK5nV[~5&~XkF|;\",\"tags\":[{\"id\":null}],\"status\":\"pending\",\"ucifzrgzzhrlxam\":545,\"odjgryyo\":\"qUFav\",\"ig\":[]}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Items.Contains.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesTagsItemsContainsValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"a\\\\U`/k]r!Sp&y4\"],\"name\":\"K@>[-.br]m_xEyW](j^M\\\\h+<ycbbH&l[:Vl7O-* GR/}\\\";>QiX30.vy}T8v{Q1{6`fxDlH;Sk\\\\rYaK5?aIf0\\\\%/9+%*1krY~QbnZ'G'*9 152mq>\\\\ 8B,^<?10F\\\"R-8#ep95g s?<@h#O(qw@Ju(g@wYrdxBH.Ba/CigIv%DD<Q'%fB>:=w Z]fT0FvVqazLhL=0i0f:{6_d9i?;)QaeVq>#YWTkG\",\"tags\":[{\"id\":[\"Y6\",\"awK\"]}],\"status\":\"pending\",\"cfhrtcexg\":-401.3,\"uillbdngoe\":{\"diptnhatlyulirhm\":\"@F9~w;y\"},\"bbboxeruq\":\"n\"}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Items.Contains.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesTagsItemsContainsValuePropertiesNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"h2GZ\\\\\\\\#icK@E8|wN]3RN~+Ucsm3E\\\".=Fz)xE-aelwQL\\\\q,VN1Q:Ca~J*|u\",\"d.~]U=JV62fzJn.te\\\"b[{.n^a2W[EulzEgEf\\\\NotIhW~&Ar./Z64Pu]fK^s$CJtp&G!(<6<K]$(lY`d;[>N N\\\"K=k0+dOdV!LI{?yr[>T;BO[Le7J&=p%<r2P.(&{Fv!(*o;A3 oFWx;Nf'00R\\\\$jV}V)k<;V)Ml56z+m\\\\%[?^sM<a{;Li!.={aLOOif&Ar\\\"\",\"+mqpr0zW7-`+w3/%;R@z&*qBZn1_:]0~%]4dx>7<Pl8&|h(!*+F.KC9h!Xp|VbYQ?%q>^ydQ19kN0]F5/C#[1&lgv-\\\\n)3arT X&O]^`Vl#{Oj1qyY4d]:u-ni1z-vF$WxK+g`F-Ls_\\\\-ViK0UGI73/?\",\"_j7v#,D{qN75M De^O;x<j^zJ(AiP(*Pf;xrb*uQwG\\\\Di%/#;\",\"VAvw[v.2S-1*RJz H;R$xxh{z\\\\^RB|oq'TxwGb@Y@9\",\",54_Hs]-9S.U4@Ac,sPNQh'q~XUUmj\\\"%W/Z\",\"}g@ltyrb`n|jc!w=+r5Fq\\\"E JNGr'|vRcoxmsn}s\\\"UpQ-!b\\\"^I<E9#_P.Wn1604Ja2 #\\\"j}NxK($--?SeCiOVFi:)MQJUS);evZ>`C7vBh:=`uml?ixQ7|PR/Y<O0E;UeN})<QB$$)(:<f)]+,ZYm,\\\"'En+=P-G<\\\"|\\\"[1TO=N\\\"j&woHFB\\\\=(^o\",\"z<.0\\\">jvgn)4Jc?S6mLdrpT7)zK[%*?9m[ej{9Ut'=q5r\\\\:=h[jQouo<,B'v[J`]6WFjklR@\\\\w$\",\"88SmLG(MXu=CB3T/(<w)\\\"iSawu\",\"*:EVTCGcCxvjW|MCq&YpAW{q.GT<Gbny)1wEpe@oZ;;4[*pk4\\\"y0^hwfL2%0n {Bqey<NvJ?_5\\\"B w4^FWd@YlME!gb/]vOtV ?O_ry`3Ncpa$$Serc#mVHD`wF!=2,4u2vqT,75<L[oulu{1o+CQ1%Hey$-8?)DAYZ%:-QvM #Bo\\\"9Is^!%|Uyvq2sh!6OL*dj5kLgid+RG'enI#n$xQS<~,!+KqKRHYv6luwvj8R\",\"_0Sk#:\\\\/=`^|2L)K%4.hoXwOY-tv1I?emr$g`\\\"CYCXw|~#8p0N@4}u2S+tIM*T)YRO,GH_l,ZZ1iz(^}`x=ubUy):DMuu_is$||t;T];GT *OsK6}czhTt*40`rReA-@@|v$0tv#0adObhmHP~C%zk$B>zXAYE-{6qB4tL]J.Kk00iCbUQROMqzn Kl4#EJx`T<'f}>P]46~D~(@Uqz^x|7p [z$\",\"\\\\J2}2yu/aIEXFK^\\\"RT%l3`g%`Ki>Ph$4Ns&`#vbsLAT$q1[_Xmd>0)M\\\\mC|h\\\\<P@#47qgR7=vg>hOdfKN2[Za'^?$C%xT,a\\\"ab49(p\\\\L*aKW1?F-E=e)-5m&k+W:m!Jv[#f}0d\\\\dY}}()&FIhRb`c!'nvb&{P7pa7l{gh2wLeE4##F?0Mk@'W?a7jbU&A9VubA]+OXtk4:#}5aW'_)sxoet`(xa(7t<$1_Ufyb=I6[\",\"tO4.K:{F)hEIm69}iD#`5DX[wO,^-iu0ZJ*k?Pk<Q/IFt<ja\\\"wg[&g~i5J\\\\BV40mN&y&NQ:g7\",\"|kPL2&?3x\\\"7r>mAT'I%N /!^mbxKOI}cy4\\\"9h,3;LaNZ,nt{>I-?e]Fvi T^2w\\\"h1ZL4&l|G`mqN~VEV$B |?4=M1Fky^a[hLx!5X?|QTd_`:jha68n@sg8NS{fAwSR7o^*D4Wi^7(fGMv3Bsac1QhQaVC?qMk7Vi_4S\"],\"name\":\"(`m#>#m@'\\\"`#RZ)x,XR-\\\\UR/i4aojq;B;u3\\\"_\\\"9KW ~33*;G8&{\\\"7>Vt~#=*Ced[Y?\\\"r3,5dE8!=sp0F6'xB2(*=$A3o*`^c?'.LeyBA3}hM+}#i62i^>rY@e`J1U+PJX+]tSZWZWV]xl=+;\",\"tags\":[{\"name\":null}],\"status\":\"pending\",\"w\":true}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Items.Contains.Value.Properties.name.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesTagsItemsContainsValuePropertiesNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"oa&@&1r2Yy61Ya!\\\"k1dY\\\"] >&#}vlvu[(9RvpV?)I\",\"Ylmx2!z8)B,PM\\\"b\\\"QoPq 1CH.tn~$_%v5}HU\\\"C\\\"0v~V}1Tz_m{3@&7':  l$[eE$SUv9g&VvF0z&!iZDeLO&#RVtI[!b[k\\\")FP_r\",\"-f|bh*D)Hp:I?XNjFB7EsiYNY\\\\*am&)#v~Ay_]!fAIr %D*&81< fkTk%qt]6$}HLp`mo!BAQ)[PQe:#9@v%$o40fxXMj<]i&MN%1cO~[V\\\"cd!15\",\"R[Q;Hec\\\"qCJztICKYhe{<vRwE*^\\\\&*B@HM:AiMg}+H4cKzQ(kJH-=Xr>cRg%6d^{uXe/!/3<}5/<x(bGEJ}m%8X(l9Y@uvfK3o]2/`TPN<=mkdw~qMG{PD^IPnf?&QAuL8nt_E#0 }N?p,`]?48)f#DwVxM6KeFsKQ)qx+Ry3gA,QK)K2_*@XWreGj3GZ$p*@727wk},lL3K^yNxG\\\\R6)EGKR~[CX83~wDjM \\\\+~yR!$w_>g#C15\",\"(?Mjm5NU\\\"Nb}*HS!op/uS Q]OPxXDSk*!v(H42*2$$yb7eP@7 7i#WL5o)G\",\"BFy10bL0%#CY1hS[{WT-~oL7tq8/\\\\A,_T\",\"j>L)mpJh-L;s^L{79xOZBRF@nCz*[:luH_@yR2}3{SOtcF3[G%>*PGP@n;(`nY3J\\\\1fc2'}:~%_=}MXn)SA8<'<Z|>wySil6xG=QT($e})4g\\\"/q;0pza-^tPp}2wH~8ip(9vxI8{8Pf\"],\"name\":\"N:xB;+-7%*PYX@cV$W{B{h6;q0unf\\\\a)& `k\\\"10R,o|\\\\>7O>|%88V+f*8bY'p|/{e-/Eb$vQ8\",\"tags\":[{\"name\":471.3}],\"status\":\"pending\",\"jgie\":{\"qmodaitmup\":869,\"rtua\":\"poj\",\"zq\":true},\"ktaqwpvitqjvzmm\":100}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.tags.Items.Contains.Value.Properties.name.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesStatusType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"j3}t&UrE8A,`PYaCRb:<'!b8:/\\\\E>S]S{S(\\\"~/z'=3xS~00,0C2C1<W1W-8-~}!]XpfFC^I{p-`VrKcAB4x3FLg D5Vq/c$> R<8_v{<C~3},zDDOV.S\\\\D;a`rlNGr)i.lT]&2?(myN;=c+8972eI]6\\\\EHrNMP(1R+0q\\\\vqf~''7!xd4<jvg,$s=/9,BhTM^LzDD\\\":).[Vo(>WLOaI>\",\"pgI,1i'lURNVs{Knr1S*NsI=\",\"m&|<\\\\g,6SzU)_Ml%|M[jJt\\\"M|RrBL,r7O$?x/fAr:dw<ma%]Y]~1A*$%Q )5@7\\\"XRl/-\\\"u!EykM4g;m.~e$X_$gO.n0nP-Gm5wF-e>lV~*QsP%GS8>S6r\\\"eXwKTryav.]*f2aYsfafKd~}l3$p\\\"M?`;pV]fGQ:\\\\bjC:,W|jY<Ys\",\"%xY#a@y@R5SV{2>{VAa(j|XH{ =|}\",\"sza9ksZzps)ZSj7fF`KO;[/ZO(+S3$fD3+8uV}h~@ku+W;R|/DD#HYa)A\\\\hJXqy1VpaU=SWw72v`_M}\",\")ZY!kAdXOV<'MgcavadIp<Yt*'x$yTiO~Uo+\\\\6v4Vjdw{SK~p!)u'c)5K2;;<3?Amr\\\"VOGH8En#}9H_=%fphUKx+%pH0/tGL6L.&~STUisf%lW!lUaTYSrQhtc0(9KOA/FImgIhkET7~w\\\\&.UvRM0v1SPe>]PD 8i?}ErABk;U`gObq8W@9u{TXBZ6W{'Qv<\\\\93&yJCVs9gZZI;7\",\"ETw75GE>loXV3x\\\\Q\\\"-JSs mjbQptJ@w:&u{@D$oYH#)7}PnlgJ \\\"oOaApkgTn,Y'~i6O$t,Bd-4>y\\\"~#?!u0P^;ZF2=g:e!Yf%,9n?*c'jfI)xS|^f5px\",\"J6LWgFrzuOC.<*YMRzv}&5s/G]wY0]Ii~i'T3zhph% `O2fNoQ']G|V>~|wk6IOPO(I--#Wus\\\"gL8E.h&v,yWK]=PI!PF\\\"r5^g\\\"[Y&@M\",\"Dg1D^ZZxX}`G_?j2@GPNf$Ghw_AUQ\\\\QBKDW{F+wAQ)M${wbtwwM6o3Mz*z z3p[:d^%X<O)f|EeVy0~:E,({;P){1)Tt7lE3voq{5{<3}XaPvfD^T)pF~i<{c\\\"kK2f8-!8bLMw\\\\% 'A~q_#N4<j_W>_>6_eXW'BrC)\\\"O+ipQ}R|<6\\\\^:j8b YLC\",\"st7yk4#3knVTg.zl&pzN!O<8&<Ij7E7>z4nHCUPzj8l#8d0vRi0AhNPO:%_SO$^[$EFlQ{g\\\"h/@!#f9L/,Gzzu7ni+^\\\\qhX{kpJ102$\\\":!JZ:0To-O`:*)=wGH[aK0>ZGs,B1fE#An[&WC\",\"D/FA!O8J]rhx3[8M2kNU)*)gmi*v{`Q8 4F7:?Ne5i}'|/1\\\\48J;74]+<\\\\=_gXWzdZ6L}jAz^@E>eg3&K4cmxjg=W\\\\(nJns=vNxK_D-(8Dp;n%uMZzv>@u$o|N'[kp?J+_4K3,:v0;$ kK [bs^VrW}:`gC*QiE;c)g1)4aX}^F*whXfFbIjV+XcT!~^!U>P3KSM;E1AS*8N5#9>\",\"YWs.\\\"WtNiRS3rLA;P@JnebAl._jgBA8,-w\\\\B}T3q v]^coifH@m~CkB]lIdmDb[?j1'TW\\\\TPk_q,}UmZ(B3DDp}#zc)8Bec&h:)\\\"'2$x/gs:Jb)g6tx(mV;#VxadGuWR;Q FZo5okHdP^tSFNE)4b+4}nD`&WE/Fe:Jciil7p?EL[X>'ME>U8^Ot[r(\\\\*]Xxv{9SZ6>R{iKOyf gcxO)9U `C2lbJH:/q;T$nBN7w,uM#Hox?_A&Fh!b=`OfK;\"],\"name\":\"!Bg vV*VomORsn^9M~^m}o&RDU[.*GFR9$_!x3MC1wYo<8>d%THLhaQnb;UN8*X>VA0K!v+G}nSW\",\"status\":null,\"zifk\":true,\"pfiraaxwtjxc\":1015,\"qhcjmuiq\":[\"DpjaLY{w\",\" \"]}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.status.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesStatusType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"B0*bA{*1_Q~7dOnuyZ=;|DXSA'9u0RF>oZE%<O.g`eFp}oGM\\\"L{o+Ra`QobG(Qo/b}l$$Om4fSYewS5sYHl[=9xn,#On~\\\\JiXnr8ukd5AV@>B4x'!iCRs'zAk5qD\",\"t[06cPqigh&BNaI|(-Cz?WN'{S0~~oeppJ<%r/A k}3YWeyH,.jgWOx^|riM4*4<D})6^k\\\\I:<JB:e4m.XP|+5j1IE7kX9XK*so3gAawc<gMusCXal0wm&5w{S(iecOw7b`U;rf9\",\"_sKD L8M/SO2jOA/xw6BEWf/iaSE_oJX3;9K-[f,5k?adl6i]@b2qv`Ob&Tvto?- 3~a7\\\\iEP0l,7cI-i<v\"],\"name\":\"SBIc?TlKJ+R_I&;_H\\\"d9TZZjWN=U&wr%{T%JY@VblPjz:\\\\`URA>u=A1.yzZ $^O:,~y>U0Sy{py=]vFM%k*NmXTqNF1.ytc?MK=3DY9u*!e|&`\\\\<ZH`p==2KRd2CB!396GF:[l/iyAK|)UwEcDKk\\\\n:Hmqw)\\\\j^igL^QCXsR3[qIcyf\\\\ydULunhz.B>B\",\"status\":true,\"lwwtqwsvfgvld\":602.0,\"ivdqnkelbdgaff\":-727.7,\"nigbyelwxayiyxa\":[\"Chm.\"]}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.status.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationJsonValuePropertiesStatusValue_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"photoUrls\":[\"\",\"=hQDgwFw}uBz.5J#1v2-(n:(R%~@?Ixa|&X+RO]\",\"\\\"{xBB_X*[aaq~i>,-|6k|LF{kcs:x,IK]437MM@Gzo|t\\\\Xzk$DxrDB,Ti,:*m`uLoxN].?SYpyWAeG~H5fs\",\"]SnGXPk9bqj8>p!;C?q%vhJh{:!HtaxN2\\\"r@2tiHB>t!(Wxf|O_N1,Z9).e|8kLC6*n(EwKVA7&P3.F*@TYRXLTIM4qykL){#Up4sU^`W=uYL=i j^M/AI)ez!:6V0~rf]}. 9u\\\\yx9$5<gawrl5#GRty~bGz#6g%& 3{l=m\"],\"name\":\"!~#kGmR6Ce|d JWn1`d>a``G\\\"5}g6Cu]#|>Zyai&JpMsTr&w]+MLS'Fp>q1gv04z[$)Dd_l&: %2GtG6dsscA\\\\rtI\\\\6}eNJ#.5*>5L96D+a3Ek3-Y9se}rYPTI]an_i2C9r@Mfw*r1Lrze6goUs7cc?EYR+\\\" }E}`xr*%\\\"H[]%!|PVc0F!\",\"status\":\"D^&7KS{0nu~\",\"fq\":[\"Fo3#V\\\\\",\"O[{a)>%d\",\"^!\"]}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-json.Value.Properties.status.Value=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "true")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"}Js@\\\"[57nDBhuX=@tT`M.B5OX-m;z:tKH~GSU\",\"`%J2^P~a3xpb*OJr/*0\\\\{>${iB,/W0TW^m#g&);?m`<[1]i}0tsCVUJwdt9qf.Hds4jcAx/pP{1}]$SgId=yGVCU1x{?I7mGj?{LkslwV5\"],\"name\":\"#KV]]'C?7~'i}>/IiJ|yk\\\"G%TR\\\\CwMyf5j=]RJw]yKy?L9=%z*FYL!FpLD<6I# vI`>w1GG%w]H1SArr(v?O>5{a7JhUsKetA~j:{v8u>Wm|w1i(Hx|qgYUy4\\\"i/U`~PN'\",\"id\":null,\"status\":\"pending\",\"uyzqgimpodlffhe\":\"KU8\",\"xhdfbwro\":\"*y]\"}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"g(h{N#Y<GOGA:g\\\\EA7OK&Hg'(\\\"|UPL:MPs[b],!qH# O9k;[d&*@&$T*BaK\\\"b(\\\\)JmFNKk>j{R/ND6Hn|brl}:,9{j>$\\\\|V[4TccI -/q-G9w]6-i>|_H(YL9)\\\\a!_V$#9k]^WKhx(TUi.5~rO<z_5GQP-3L=(TLbFEc3NlUjd:PLm-:KN_ip9w@/]Vyo)R0pf+jM,+$WjJr/&?T*\",\"7YF>S]s^EtC:+^W]~O9]92 ~G=xx;<%V*g4NK7Y+J-~q}=9{UT9=P LYMZm/|@ Id2x5ht3eh?6](4Kf*1Qh[ 2Ep_,+iIV\\\\cc{9H<JNXzM12N;jEUMEtNYT<Plt1n,,U8^U9)=J_=s\\\"\\\\m~0Q<\\\\jh5f<d>[u! #lM_*^|h]%s#?0^U_?F{ \",\"L6n\\\"9/u^FV]VGaK-DMA\\\"JMzV.r9:Ed$_,y*,&cd=8,G#$08]9+_EiNcyb^p/@n\\\\9$KDr+&R&eG anebjj})=AxHD-D4Fq?DU804N/7\",\"Pj;@k>U\\\"W=rX#K&3UAXTn*vlJ@Or?9]|s%:\\\\YMYHy%`'\\\\7?z]aYM<\",\"B(OowIVu\\\\C,n_WHy%HujA8\",\"7 >WWZ9_X\\\\c&1.;\\\\|fq{}'8(a\\\"[1Q[4k;G\\\"Ve2HsgRH'ti?8X{1YD\\\"A,I[|4DrfI*lCJP0Ck7VG31d[E.|\\\"b/g$7I>>59iZH+!%>\\\"\\\\Ft.|K_GD(`j5xrJd5n0VTZu(uarYHM:V#MI[X=Og2`ux<AphBV-U+kDC\",\"Vspw1|fF>w{^Vpduim$R4N|iu}ht{Ce[k{<mr^y~Nh-.S5gfux !#srL{;'eH`9aI#\\\"F,/P_U3';oBpuZi`L[3G8;nu#zR.bU>VB7RBi$_Y8w@EJGWu,WOdkV_~9^4pSD{JMSK;o?\",\"XVligt6e2!r8{ZgX+>o=|OYLST}tV!k95\\\\HbXJ~g3B$yD+}IK!@XpPP#i!\\\":!6;e4\\\\H@mwV;0![nTY^Ij7{)~F5y)7AvB: U-4VUD6jJ9u%nK=^#X=A*npkt9g|)zFIDi G1mSl.\\\"W{`tLW4b(zK)22/1;AEum0iMZt~Gt@(:rg+y*uZ,|@FJ.@\\\"6N`5Do=U]9vZ(g^:MFi5PBVz2.o\\\"x_+ub\",\"<<Yskx.I'\\\"6m)\\\\]O[}|5EH}E/.I$'KRD<po)i7ot7\\\"\\\"jGsGm$(|eI.\\\" bg:[Wt+&6lzxHk8H*DRIqL]6)Q0blq>^o+Ih>xJmj&>\\\"qJ|D)c`Yb)WkcgM&:Yn.@13/4u~lz7wSl}P{j2hZmy8OfklS}=c,VXBT'tM-%\",\"\\\"I}Mkoc/o:jW7N<WXp?&Xc@>ms9Z#4 l.,V;+w)>idUa1 G5hLw[R#Jhg_/H+#RF(X3!_BUY\\\"b(Q8XBtHn=o]f4?'v @.H$b}5zD[`dG0UOkL1{3*.BQhNWUd5~coeu?mY)eg,'d.a}i)McV]N3pW8(w K$C\\\"eKS1ifVN5_t@zGZf&nhUNKQ|_Mrkd\\\"7ByrshM>qhEvO\\\"9ZYZ#2X>ePPc4;XwI04V5;(Hza,-x3\"],\"name\":\"25N7J)8rf5q >DtI>G8vASnU_g5Ob(z`H~MyR>Q0LnQZKtVJ:R\\\"B-@2~HzwD62*Qz13-\\\\RIKjf^O9T=xdG,k)xse$9nG781#/zHlc|Wl4krYLH,~<)W*E9{,~/g];L},-,xvbm:DE8,**NN\",\"id\":[\"\",\"bV8\"],\"status\":\"pending\",\"lpkaibldmnxvqiu\":true,\"ncvymykfjv\":96}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesCategoryType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"ce^nh8J5+ HB=OBpxv\\\">Z%iTxI3jAgJ}4[@fw{#6tNx]p;O/t4M4=WQ*o** -0s$/Nl*ZgsaN}sPrcXj)`9#4<xo5}:zU8efG@_R`n0\",\"MVD\\\"WJ}dFrm3s/[`9>+f{UUkt]-n(*t\\\"oYvj/V,AbtQz.T)UieZ#yr'V$&!LIpnu4|1Le)q,-cX:&GVz3Ww!zL'dU~^e&)O(MQE@nU:#501>zg 4<`W\\\"D%P,U/DZ63\\\\\\\\QfL?qC&p4K'Y[IYe)Z%+%Drn4W\\\"^{PKb9dAd_YgDI4^FT'}ae?X^D_t$v&oNhoJZ(>_e`cy_9Er=A`G|LI>zYF^\\\\>|LC6E)P>A3hwDf~Y[|b(zn3Mz5P'\",\"d5R3IAI/{`7Yk%J4!\\\\ %`7qNr1z:ke<N~(,jRF<\\\"p;05'Xp+(m^%^nGj!f{#T%)VKAnMgDP=0J'-P*,&05jCl(oy9Ee&nNe9V1I9<WYlT1),S3c/oe{pqHIC,\",\"D0j[vWdO?Y}ReML^`Tk*P?t`]sAaOtBw8|s/pm86@Ie6.Y=jizAqXAt;{?SH<+\",\",tlnp:v?7m@?Ev\\\\PcW2FSby(lR:0c5>Gn6Ieb5&t\\\"I7QBs6TS&Md*.*#mL%FDw(~zaod \",\"Eor#3F9/>w`M+A[ozcoZ4^:RxU9P'sJjsmd9sg=l9;V<xPlfO9UehDFuW@DnnZ!cN c5(%Wuwf.>;ZL/k0Q-@,C7 .Nw=@tQ1>?lp=7uvNW;9/Y_M,V9\",\"%mQUPsYs]>IZ$+?dP_PnHaA ,/xL>Z=P+q{C%JOfPU|EQ1TT SdS+sE<3FyZW{Hy^e{&UG2VGKo-I3-VLO#Go@sQ7H>)PZTKF@cw6Sq;A:>#0\\\"Kp\\\\m`tw/vRhP{yxRi*&-,|T=@IJ=64`7ywrw4[yR[.o4eE$QgJQhnxMbv&pS7hFnU0EVD/nr^V\\\\<b~)S+Y;~\"],\"name\":\"h)x@).-[?l\\\"#4E~X?*$-5Vy+%\\\\1>ERe@1cSb~n(\\\\Kp@:aXp:fGJn\\\\.(%@%`?Toqe~KyR;\\\\N2X:c+Yrs5Q8GZp?>sVGHi##U,p%yd.\\\\)(fd^bmTMLch5'ViDEzbRzMt?/MQ\\\\`iC^[h>a+y27;1pNd4)CV/{+:_16rvbb1 ^,rN_~Gm[$v/?2 P[{?6]pSB)A2:_anaI$%.-z-g.(*}J5'sufM(khhfLxf_Gli1Gcy}<w+\",\"category\":null,\"status\":\"pending\",\"oofbdqsgwp\":true,\"dtjdqqxv\":-761.2,\"yupxgvhfn\":{\"nybksyiuawurctub\":[],\"pxucby\":[\"mdG\"]}}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.category.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesCategoryType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"\\\"Khs>L}$qT3h81`*0T'dO -SdXSQzujsp[ME._=*wSU\",\"QX:/2Pb3ni[Lx_<|\\\\\",\"}p.g~$PN8[|.rtjZu@Ru:S*&\\\\r:YaOxm[5|f~3H8zAqrtFxztq,AU\\\"Xdl$BJL5z*\\\\(PP?Xvm<nqy4j_5T`QX|X4EA^SiZVB\\\">[&|mX @B:t#)g+8(IfnDmXG2~qY`n.IBY{Ig'@MW*(w5;8g]C3dCS-v/ThJ]A$7#bvi{4d3Db;3C]A.nc^~pey\\\"g^_*bflfnia>`e(IOS @8ZteZ2\\\"E wfL}HZ?Ra@ViOsfn$T Jt'R7f-6|yK,cudzVJ\",\"0csvKOK/$w|h{9P-!&h(P9O6i9=N*_15ZGCX-+p]3n5II(>N'\\\\xCc(7im>,r:PqAO8/G.Ac_JpT!flqjSaa:GG(hGa\\\"`ak0upYEHy#NfDYUb*tQ60V%t[.,*uemAivEQ[p\",\"GWH>ekX@_b)\\\"e2\\\"G@<C ,X's~QyIbW3>i*.c^9\\\"\\\\?}X?>te-{\\\"]5Y(e:a&c1UrMHpA m.;ty#cVrHP7Rz'.g~5@,AZ\\\"k^V>~R2#&wDtyn+L3t|QWOcv.P8Cq:+\\\\>]$W#8ShWsri/Spu)>slvcrUODe|&qg,Al&&>3ntdu2V\\\\ `v~SV1swud&.`d mh(sYz8H\",\"wRTa8}&TVya=HB`l~[{lJI3\\\"=*0zOUV|\\\\FH(8&uR59cfyG\",\"qM.z+qcrsiH{WYY3jz_RLHtmL\\\\(ig7CBafD{}|6LXi;O1+*UmN(EO;9;xw&tRP}Ga0\\\\Hf2:kiwM(J,Hwq_OM=udC\\\"SWY@eCKFdn$N#dko(<Q,Gs_<W<oY[Pdjj6m@1kWW=6iU5+C~WUcuU-\",\"3$8QJnoj##Iy]>3!R)z=tCY!$]7H#(a5xN>C#|)4=*wDNj~GNDF;O{pV/\",\"66<;n;k>tNor@B 3ANNBcm*TZKz.JmQ(CXA#l6Tbz~(:d=o,'k9}Z+vKX\",\"r]X3,#uwE=}pS$TPK].SM6wj}.L7+~cOGAL(=u= MlY9-\\\"d}$y7K/8uz%1)n20YGv\",\"RSU0+Hi-\\\\NBuy.Q,uM$2,0?]$2o(X~AOYRhbN,p'mMskGHw?\\\\s7~n\\\\rvH]naVw5DzE6 [5kWtH[#2@4dKEC95+Ll9C{> 5ig 7g;ue*`K9=[ZNP<AG4dXMr?=_;)|`'P?+K9$`b2Qg`Ui%D#Oq[oJd@^cN6#g)G133qGn6_Hl\\\\l9M_X=hu^-_LSu^Epz '3cx-c-`x'Nm3{A{wvHICtT[\\\\#GlD2/)o\\\\#I&wC:)GibAPl5\"],\"name\":\"DMvVxZ_Ydb3&s+*KPpF\\\\F(ZICxqZb~,1eCN83a7rT}b\",\"category\":703,\"status\":\"pending\",\"brqhvqcr\":\"+)r$v\",\"mnmavw\":[\"6Bdx+k}d\"],\"dvslybfrzeralub\":-302}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.category.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesCategoryValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"Ra_BCIeyVJU%D=D}U~AuBuxy)^SuwP3HETD0Ar}q[)Bt7p,?oW$`,n T~,,5]Pkv0+X6t.!V7%XIB0NMB< &GKy'O6Le<Q39C8!/\\\"6E,D6_Ns\\\"G8MT3'R+w[(A%R]PGy;gmx:_3*GV7&b?p/N\\\"Ba__.`L>w->(l<C.IHlQaWn]B;W8[)\\\"UhPg\",\"H\\\"n`zyCQw=l{=q]Nm9yRW6\\\"3oqfRc[~4@q285HQ^V4wArrP*xst~xCJURm]tvOGkI;G[w`/KYMF1;~7;6@K|j&*mY?cnOuHcr0<olU!WR06__LmHV70OoFH9_=-B/?~Z\\\"+)gVPt(J%*$u:);c>>NeEt)ARt4i'\\\"W^%=%iEpScHy3t\"],\"name\":\"6E6#CG~$G\\\"w*mb%sR2 {!XJMD>B`V/bPo{p)\\\"iSD=>F]?{mLJ[Nw@KKA<1wNzReQAg,4w*8sgG%i39A6yJ=\\\\>L\",\"category\":{\"id\":null,\"zwfmxeqaalsozg\":{\"defuqasbw\":\")<O j*R\"},\"rwdxvobthjdwuen\":{\"dwkovnkfuzeamyq\":\"#1(9\",\"jlxsnjvenxdi\":334,\"ufy\":-349},\"ufjwmhzugwffsq\":-885.9},\"status\":\"pending\",\"ccmijm\":-616.6}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.category.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesCategoryValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"xR@XkQ|BG\",\"}YJgljy,w5!v9;9s!H&|unlg1jmjKixKc~ZPL4k3hHK[z#8VrZS_\",\"))T~3z*3&5MZ2!:R6jt\\\"~@-`y}c8!Z4MdpH0`.<qQA{69?cBFY4F\",\"I~PzFSU2VK_e640q;izAbJ2nqc&f7$@^6>7L*QiCW:Ydoa^A~F+T16%szpMUXZX (S,O0As_J{Z^G$NW&0'h!KF&Q`3?|)vo[\\\\@~Vn1[MnNK6}r}\\\\Kb9R?wOVD>V?&OcXU\\\"MJdGg~-](!t{/h&YmYOd!~}rIE+mh;K(sd9aafAWQ|L[T=x9kTnLs0M+R<Pa12*W&W~@5)x*<'DAJgUE='n0)\",\")oFBYCAS{m#P$\\\\o+%%i&IO&QFl;#qF*xSt'&gT{^^83x^9@:1@&Yz[~.=nd/n+-^O3XVo4 Gg_0OAosAY|]F9?3#^i~PfPqD2'E\\\"~phQLIZ19!\\\"iB']Cjyr#4=-*d[dllWS`@$5u,9\",\"Z3f:\\\"a'qw(jeVJa5)ZWN2DG.kph+wr\\\\OVX)feciNnCI~Z('w)bTnKM$O0t xN'o8UC6zk:S:j:Gw9j[u5Ds^d &([BnU>}l6]~z0yTZm<ms3&%DE42T]UEor\\\"7)J#(RN/k:c]P<%,hiQ!EQy(oAkLCa3?dJT\\\"R4Vv|q\\\\=,@wC'{;9Xwr3RbcW=r_(l$Gb^sp0m1`eX\",\"'evvHJF4;`Am?'>E%#UK#4-*k-?a:-.d)g\\\\:F|:6d,cs1(cl,.l5COUlm2>f1*-$W-@ 8X>}!x6Rn49<Gg9~*~R3DUvDv;?gQ~D<a,Wo6ZK#Rdj2d|E{}P :E G'd#Wr{!IBVJD6b,# O,edyT_`( Lkf\\\\L0dj6l`|_l3Y% wmXt>Fs~EiJs.)2)Zpt>;7)a0hCYz7d[pNG|`z HN`(~Nu?aC\\\\fV`JN=d}Y5wyLQn:[mI\",\"r4vb(|tM\\\"']P`gv`7Rk,C c?L)$=~_>w(H68?j[OUtw-x$i*.:Furc>X]xXNO-/41}m|#2lUA&wiZ+G<`9{Z8<@\\\"?[trUXX*gJHj2?5ju&({?Pg\\\\3cwUB$l&-d(1\",\"9.+aR#_W0N#ufR6F?LI8@\\\"H ap)-ZN!Nn|$=E)A1=OK*[&1.T{pZ>DNI!ivB( 6t^xi*uGMF;MT37m>$2vr'(|B{bjz,7pf\\\\ZCzsB4o@>+OkhxVfH\\\\i5W0~,{O4~c eaR;ZRJv#0^<F$MZ>'X1n0 TKr'tccJ%6|2b'\\\\P~HP;x>a~^'sk05R,n&\\\"Vv|Nvh3F)<j< ](g+a>d!!(bd@Y,D*.I\",\"erDW&k)[W<oSS?W_DX}evxV\\\"wXe$~0e g@{yb,\\\\vCAvoC=>F=J($-UEoey5?>O%kqn*xBULA0o@5OtK7](|A_B^czh-rg^G0n@9dKzR]W5QB5|+gNaKwX$Ty`4\",\"lYvwpp1S}?s2NaR5\",\"Je\\\\hi$x.E@DADUyA qi2|V?W2dmr:x>ZfF$U4Fw<P'])d=F .i{D(]\\\"JAQ#rPzj<u>cA'7J 4x:8Y%r%T7vROSqHLrz>}(UEt~uIavgFa.EJW:P(wd^=5n5paVQe>7`@2bNZv.Qs_;>z3^JLc $Wetw*+<v.ARC>e3NIWsK_(?;/'cJz;kMPIgf0'#CD^hI\"],\"name\":\"#`tQ[JSr;[<IUe;4{AeR}#@!YNwtfF=J|(:X/AQAACF%Py1TE+0xU%2 $@DDR;zYrbc!SN~6qhN&A9s[+*+G[)m{ICNxUeek%k2`)WurucDl/|]'@b_\\\"Y$5T5P.^T8drxnyImO\\\\}MNODT,1JT0\\\\;Y~_:zhv'JzeJ8Ya( Q?h#=[*%|4n}MpJN=;Hy M3{Le[*#\\\"Z^TyFNYEUR!&z\\\\Zc(p_Q*3eTgs5(_3qr9h5\",\"category\":{\"id\":\"\",\"xhvibuy\":\" 2I\\\"$\"},\"status\":\"pending\",\"flywpmvhikvsirgb\":true,\"muplbo\":789,\"xfmzhobuksfusw\":{\"i\":[\"BM%MoB\"],\"jxzwx\":[\").e+F\"],\"fdujtjovw\":-559.5}}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.category.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesCategoryValuePropertiesNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"Xy'V::I*Pq]1UppAr!\\\"*{S_1A@^/mjN_-%rs,Ax%k9O,fnr_~&TLrE|Ww\\\"D&K3cmou0cBPnl>cvVf=Td}\\\"/`8L>EC0Pd1[Vuew%aZ*W>Fp>}~uFLMVB+5Ejh4?<x#bNyXIa :?d%ms\",\"bwN|D?+}tx9vZ0z5PY:>0qzI6;VaEkQ ^gD|f]{deZ\\\"t&{(s.WP%sZb4[tL]`,EjEtQgxXSfi0941x*?qyf\\\\e+pi6AfYgQ>dfW|_nTt Urjl%YNV]_U,'K`3Iv}`G}~86&Ckv,\",\":]8LjIE`~EJ]6|\",\"=2XDlm0d|5e|i>]M#$FPhFNyG,0RIAecp]p(7DhrgGm:E\\\\fEz4Gipn3\\\\kkte_ZTpS'/Y\\\\GArqNm<d Ir(S>'t%p\\\"St!J,iY*[6W^Hc3DhG4g]^e8`v#AHa/)cl~&tv(|CbSzTC*953^>mn\\\\xJE?Wc^Ql7vTCj~k6FMC{tOCxS)`H%zQnh+*S}$u|H|bnWL_}G`9z;:DAO.\\\\f%#9xVpaB.wfdA%`[-9!\",\"D>~YCu{=}<cY,|X3fT%vhzdYAIO4E:<Vd!3717#T:ux</-575F|q|1=cGW[?J(z.<nREa:@@;H4G]|5(A$'HV^9MVV2.9#b$@)6wn1</(sSg!`19G3s2u1}/\\\"M&HZhzwpErwR3z]TL,Fw.Kf(Jl5|vf6hzihIzBhJ;$\\\\Q*)h^]jPoeG~+O\"],\"name\":\"JM%dcRrAEaWu/S]Q:`mIq*q|3kR^/zHx8#H&j2XcR]Ct)U>H;O#}LB4Y!-82<Y[cRv'ZZl`)3AgM`vL`|-BJrY/#V_alaUi1ajj\\\\2~P/<a(AV%HNl)Yx%(~uwS}%.f#w+<mQqbK\\\"Dp8GTw1;)&.HZk=Ftr+`TMlQ|d5}/[aw!0W<Bk;T>/`pK{Q2,!Gb;mX; qQ\\\\6\\\"it+44B-D0\",\"category\":{\"name\":null,\"id\":-2813715582837019501,\"fxzrqfuinggwez\":-171},\"status\":\"pending\",\"yqwnfihpu\":\"\",\"cfzw\":[\"\",\"qtE4\",\"P \"],\"tstc\":true}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.category.Value.Properties.name.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesNameDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"BXUNekaL4&wmI'{,eUI=dUtl!XCVPv>:;8R%.ClZ&fh7Rv#oaw.5PhnKTY*~XZY|I3x/sm;Y_2yf{He{y{w%_y5^L_$DL=k\\\"\\\"Z6y9a@5#`8)O=(6+SWdrv.-?~'.NpS|bNh1mXVcHRjk 'e=[I/kWm`t\\\\B(et |}wNsDKM!E$#H`?.ws{QR7&\\\\Z=}Ukd$'?9Rd=2oW<E5.B@^tPb)/4KROvQcHC}0Y`\",\"#7Bk\\\\S-K^a5ojvJqhVpta#IIv+R?&j$e]M3uva6}yhW#JDdio9M#N|*n $[5\\\")1V8=;?<_p#31sjMl(<'jNx8Glub:{'ZE>y>D^PSM:[!7Z&\\\\XBsP/i{aQJ?B=;U,@Ji'nU\",\"ZR.xFoGJfu9R>z~4gulUx5MW\\\\GvW@,gs;6$z:Kl>?lu,Ak=4+,\\\\O<a3-S%OsNX--Da=jeb1D:Br;0`M&XW:Yus\",\"v{Q[PYp7P3c<ZrwN4K zVj]$+,]w5#<|r[s.V<*\\\".q-NDR{qW4 FOh.v}ah3X\\\\vf?WH;BO;9~hQ0]UCA?Q(xe+53}he+q-]:5-p,ekvR.!d7svQ>pE;\",\"~ZeN(t^zd7U}e!2<A'{_SkE/A0%sppp46qh6>\\\\R!>p@Z:Zx(oAEsUo)+\\\\:k8*~7taP2DJQzHXP4.b9\",\"z= g5*z7c~DJ+NoU>ti0a+h#{mGU,uq%9,QCkZ?mDpqpYQ0kvnftenP'_f\\\\ZsXKFTv.VKB5kaQ]1WZ}STnp-qP+Dn$}( R%*}Y=V\",\"|.`%y_gT|8IgjMMgS+5I|>q(&OI<<~K?.d2Y_VP]];AT&[i!Bk\\\\'^0@RiSNyTi]6FuAFbN/Idw\\\"d]\",\"T<~i9KP#9Qa&plik\\\\[*i\\\"Wz4BkMw^g'vsQg(O4)e{3XFK%$V+lnc:6.E,G_riHWgqN_?2D\\\\gv#wj}O}N=,Y?VvS)L[f9#+$JN_x5m18M16N|I:)=zOYk[$085g8Dd<}1Lb57ERIGnW-xKg#A*GoH9b^r&]GtF4c(F=/t]]|A-+2gf$SR{Q-Aqcucu|9a)[4USd8RpS%C&1He}\\\\0BAZ=&Npss4Y\\\\1/W764'DK1b2*O]AH\",\"OgM{HH -4o(zb;wMO=YoA\\\\4dGkIQ7frnUKCybA5L+/F5x|c*%\\\\0ORL'USycM!Z=~L{]XvDxGnj(]=wzPO6})zcv&^nQB$A<$aw*Fb/=\",\"mO^OPbQEkw1.#B9&u#Vs@#ou+U}uFgu61G+M9vyO&+[*KIk& rHMfUx[paX#[mT]0YM8V@{\\\\&.J:7pbL+KFN5M\\\\'Pp(o&$pH/fAh.aWke{~JTvc!vQ#:)T4+]fmF|p\\\"(Z}p$1]FCq8PsL01t'Tv|gI?3qte;+xKIH$\\\\$c}7lu?)(9sP8h36e*eB7oNX3=XPMW)2y?cTv|:`2\"],\"status\":\"pending\",\"suhjzmuniaa\":true}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.name.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"KV8Dg'60=-Ys^^*cF!fXy0'_9y=#izm+7O(xF ?K,5g~9i0,t^gj\\\\xOd^:CPy]g/.T]} Dx(DqDn\\\"CwmslR`Zq{4X7F$Kzg2BtC^Rr2F=6pCBjowUI]#m9h{BC?Zz+pljiP0(rFLN2I>=e9CQ8X!+B0gUwxvIhc0 Y`VtCB.{pnn(Ko )k{}}\\\"o$wp<&'JqqI~gAFq{%-xxtiJpZnFwf=KoaGR8~Ab&PGKdJgL;$VV4Dw[}A@@~Pwj!P>K'cP'\",\"7LuIY8!7jYk.mU!p'MP$3PJo#bC\\\"XCN/(2IGsHE=?,GCbwveg\\\\MT9wMTvs_IUVtd+~@fQqzON\\\"Uw]ogN{S~55:^2\\\\27\\\\!-0}\\\\tHy*a Cdkj5kQx/]5&[V _GxjB-n9)H\"],\"name\":null,\"status\":\"pending\",\"xhw\":\"ef\"}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.name.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesPhotoUrlsDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"name\":\"\\\"\",\"status\":\"pending\",\"dscerkxajdz\":[\"?c ZxT\"],\"ejbrsufl\":true}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.photoUrls.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesPhotoUrlsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":null,\"name\":\"93h.JN)(bYp =;pk-{aU1R)f**|ajZYaz\\\\6@au]#g'C9(s=ul64,bRO7QNW(qT,*AV;BN?U/wLk%ec;{JtvHImMj4~iuC \",\"status\":\"pending\",\"n\":250,\"ywfzgqvstec\":-51}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.photoUrls.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesPhotoUrlsType_Is_NotArray() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":true,\"name\":\"4OnC}l+;-Ou9V#i\\\"3e$IB:/vf(q+R<<@cQ7:S<^$\\\\73p]6@E2JNvE(Y4rVdzr{>U&>l$K[kP,.fffzRe]@V\\\"8phNb^/M{wcK3yga=y`[26#)<I~ltrpdAj,{T$Sx-0]=Zj~Z-;UPa[RcOGF7>$SjF:4)]aKu=wpGoQ#Ae-!NsWN7+~kG\",\"status\":\"pending\",\"lwqwugttfabcm\":664.1}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.photoUrls.Type=Not array
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesPhotoUrlsItemsContainsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[null,\"5~g2,)4lN,jV~\",\"_IN`wOGA[py:~X%oCvA+u{(~C:+EGb/-;EapoV V,wwj:n\",\"3%Tp@94_7=&}2sy=k2*y2?Hc`!x>%$>!J}S;vY*VA7WuT!HmW'H`+i wQ`D(kHC%.$[m2Y97Z#;O7?f|3r,^P1$ozZw0]FmV%P/Cqo^q9H=m=9^L_*9Qv_Z*m~Q:/5-!g}?A[_g9'zT9~Xw`DiG2 A> 'yJy\\\"JFv+gI\\\"St\\\\<.:Y`@.u3JA^|DrYi?_s?\",\"N%~?}YL~?IzqG%Yy\\\"B|UrxybgyHTY[EWs3yHVI5nOpj?!UC1NBn%\\\\ [q0_l}%]yiF}w^l:|cfhNKl3a0pu_H>[hx]-*Bu1SqpOc:G/rA`*AW3v?_\\\"yj'NK&$wKiG#%sErhl-kU<i9s&8SvCpc,.pX0Xj 2RHgNfph)#[Ffzyu0Dz1@E8_n_;MEh]\",\"+(B`)LyZY(^F{@v@T<md\\\"N@4xA{-\\\\u4M]{wm@\\\"6n6NcK=e\",\"OHeS/wl9.yaRC$j4TIa{64H}Bj^1b9YW+bv}TE:=pnT[,VK,}KP8qJ|0AIQ\\\\ y:{GEFw$jgUQ+fx5I0\\\"TZDHR`qQE=j6@'@mS__jb_36~vmcX4EoBU*\\\"RX?&|e!PJo%gyo4Pxw[2I}FGsD/\\\\%}2|F_JJ 5UwT*\",\"VXIG /s])Xi67X4T`WNr>+oCs74ybLl,A-jy3Wc1i.aE@P404eJB\\\"J+/ncl9r`JE,{<cN}dK@G~)1v\",\"|+Of`3j!,=Ap+=z%62{:N[\",\"wAL:6&Fh 9LUSqN5Ph|8AJt\\\\/ltXT1?dW&+=?@}iUga|[2`}F/_M,jpl~Ex4`U%[mns@mO|_zm\\\\|6.[6\\\"()5ia6x%<B%hf\\\\dII`$ G #b{Zx*[K#|CWcjWGD^Mx7|8)+aCdzQF7G&RsVr4ill(%N%<rYz+CSnS6z@w-s?1\",\"6M8?|6GO(=4@%k\\\\lk{Fa8j@>QNwy~3fDbzIa#0T\\\\NmYCM>H=jr`RXuJrnnQN%/4.NMy]#YXF2Aw}tR7-t]/rSt;;|iF&(f} s5Tq/_wVOFgI+R72.ey1nsa\",\"bm3UtM@D!%<X>2m5u|MG;C7Ns{Q;Pp~]$o=iH>Nf~V9C+QuJTiH1J@rf|~Xzydsu{Yqtc1:!=N43e.6S[/'k2<7z#9\"],\"name\":\"N))Ov3<&co?,CIeWt@'s=h ,[0E_s$'uU([qU$8w}?!hMI^er*@/gp*e#&#Xzn%i&F| c;Z#[k|(l?-~(|>9k. n2k4m%7I4nCaVf3,xe\\\\%gj^]IR%b9Pyp9$[% du*<hnC.?W-O`:h+lh=1cJz-;y$C^TI6zr:O`Tc8qu[d,S v#(zM^~\\\"i^wl3P,?&to~LLn1^EQ4~~6_n>Y}H;EJ]tR:{$0#Jl{9=$B=a\\\" D<5(@?\\\\tS<u: C/e#O\",\"status\":\"pending\",\"rlpntkhplhaixehu\":837,\"fx\":-767}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.photoUrls.Items.Contains.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesTagsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"gZ~{I,;>|Voq]f*J%KHng50CoeQRc4z)-L@('GL5WK Qsm5b]X3Yl<ilX/-B\\\"*U.`(}vZz3[)Epcgc1-e}}cNbEi3/U<VW{7_'k PE[L9s%}^@pz;~lFP><\",\"q@u$mrrAJ`wM~Y9906szz[ypI]{4Y`QqRh| !@{x[p~DvTeRer23cFYdVvj4G>ooa!Oj5_@.BofDG>Yw:4/x jbjn$KQT^o;}0_fk0ejY\\\"Kr8fsQoM:JLBc\"],\"name\":\"PD\\\\>%v2.M.{:,'\\\\rqB!DY(P=>Dz\\\"W<K5 v/iH'e\",\"tags\":null,\"status\":\"pending\",\"hjyxuhsjjlospgss\":{\"djbsudkkvec\":[\"X=_F;\",\"UBm+];\"],\"kkpx\":\"\"},\"wckiiaaicgivxx\":\"T/\"}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.tags.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesTagsType_Is_NotArray() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"'AwTGS,g72V]Nnn J{,E)5RwRwaQtXS+.H.6n&R L1c^,lWBdsh`H`.^vL@VH|$@\\\\TPF&&t`Je|Q4x+\\\\)()DERuw=u6E7o}O=\\\\BM3tJw${Ll[P9D#(X%Z-EmBn\\\\/]*=WliZ9\\\"!<8=Y/Jomqnxr/T!B]Z#\\\\T=#_r@#>liHa@.sI'dH($K6x9Jr4EqGJS%7* o<dN(MDT\",\",R4M<zwn*=>J+A K9d.#B,2K(3jwO(_qg'jgU\\\\;IBSA\\\"_Qza1$?\"],\"name\":\"y#MWHC ?[,5}g+6AYXV*~k6zo0yYqY>Uxp$F~DT-xxTpHZJ0#%'6%\\\"9F|wN1\",\"tags\":-91,\"status\":\"pending\",\"lvan\":{\"eqt\":\"8MdHCg\"}}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.tags.Type=Not array
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesTagsItemsContainsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"r-yt~|$|>`SW(oP{8YJU)JJ7{*$;Uj%ojFSC;i\\\"GR@@9:\",\"<:qXGhN4yHVq6dn`@0<[PeMBvT&8Y!b!}WE7I|CN~%Qu$v~@2\\\"R\\\\k3E|8]tYxB+}6}c EnC[_GjpGFSH;p7h1z>D<\\\"><TaG`f/rldf{&JK\\\"4Q)NTBi167|xUtwLGq/K^Viu,7X\\\"}tQ\\\"K./!pUVvnR{m}3Ksv\",\"L&Ev%B[xBM+SbZZn>YQI[vR5L^8)[_wQklQK+Fq\\\" X+%%?g}D-Sa\",\"C!1&{LWRUJu]fn0MIe$[;cgvY)@:aPJH#hCuLeWPbM$lA$B?dPC22TNX0b}y%LV~tLO$!W[ZAVy6>MOs<$9\",\"[ cTT}dwa755n/LB4QLk-cm42e!_ Jj9AB3V\\\\vAp&B[s*~\\\\?S?3WHs*)1s9n`q>aD-`f{[y^#Jy]{?,~7cq_2s^W +%;OpG}?r\\\"?T8%T\",\"gV+pZl7MT`KsR*WC[NzNMjXvha7Cj.jdW?7pc9 WQ(|qFrVttQr7jP,~'ds//s-u~*idkskTEiW\\\"0n@VAS@u0,+!7O*rb;B}b^9Fg7@1O{,ds\\\"L^H|\\\"}L)aUjUgbMD+}n?jUA,4y6jhq5b9}%_yb3=~Em/<b&=zd&RM$^h IFO8RmQ2s=NK=\\\"ge\\\"T?.bDf~fdh`\",\";B5=d(%e;:tXcKIhX=N7;Hr&dA6b2De#%LYx&UgOE`MwS?y+\",\"b}NAq1qx ki+5jU9!>_/oD9r9vb%^:nEH/%Y {MxI N'^}f\",\"Pp[k+rO\\\\y7KJ>k?15=)zmn|4G!U-SPymzB,.sdeCRuga9tcx*{e0@ap[8B1gnE\\\\.]^rQL`jZR1rE'N]%0l_$u9DD;KDKqydB#9@C,B85LS,@l2Cks?whBAN5:\",\"g~6!}@,D=zu3U6} I/\\\"[\\\"{$]\",\">q^5Xl$5Fcc2t?CRZiKiHj_]LmShIZybTj~^@vT=AF7FQH%<3S#EqB0)=o\\\"b`gsK{0rO;@x=@#%rT3HJH:oi64'r.sQ3ax05>>0\\\"1<\\\"&EO$*\\\"OD08Ag9Q?[4z)35<;Y(%g[i^fjOIX,qn3N+;\\\"/Z*q'|yGQwg$I)+Vve_ ^y9)xl}4@H.U-H1~DnNIp6J(93z\",\"!nY7R/4XjCYFJ+pw%\\\"p;g^O-w{?[1I|f|D9.c(<*dMB&o=)8%mH,Dp+F*[&)OLxGqcI6+6+O&sfoBlfOs`=I$UqY.y6.\\\\`sy=Yq`8~84syIs^Q(&<_-fh|{16z}bf?\\\"3| OW`ZO3fkgRX:4j>7bCTPH Rhn5<@6>yTq|TWB)pv2=XGDRhGl|5/$|H2(3]'B&gEGyjMVM13t7RxC;_X~M$V$.ig,P;(3'`\"],\"name\":\"R\\\\w_zK}6Ms,&h+vMSm\\\\9|?2VS98HHg.9&Z1N\\\"@D<@(9qD6v1hahg2 6lrM7+f'kfo_SV-^;Er}i|T*N~#]2qCqPtN$l3e:g!L?RJE4L:g^u2?oUvxERVcm|1}s3t=2,N,Zq;uHq-4UGd.4B$%O4B.*d^Z!K@pa'\\\"(]`}-r#Ij:Qjk@.\",\"tags\":[null],\"status\":\"pending\",\"koewkxkosnlgie\":{\"xbnpojqyokl\":[\"\",\"+}W<\",\"+0WMY!L\"],\"ezlmgtjbeqc\":-749.2,\"yukof\":[\"'5ILX\",\"g.:Dd{\",\"9\"]},\"kgsiogu\":[\"x2#[\",\"{f\\\\\",\"\\\"p\\\"*6iIC\"]}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.tags.Items.Contains.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesTagsItemsContainsType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"KG\\\\|4o_zPK*Q_=]tWb(aX+0~\\\\G-iE_j4abae%/Ts=l+Z0=nq*?}_t4\",\"`a+N;SD1pnIH_!9RXlU?8umKFtW/:23l\\\"o,\\\\w~`KTZny-+v<(m<y>txy:p?ilT*LUZakVl`*\\\"Z:N\"],\"name\":\"vW}-jf c$TfB[OE|-dJ\",\"tags\":[\"Cpt\"],\"status\":\"pending\",\"f\":{\"zwqnvulah\":\"Ke[\",\"tijtn\":\"s5bR??\"},\"dexcti\":[],\"qxngkrvf\":[\"4sM3i~:S\",\"?u~`/0{\"]}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.tags.Items.Contains.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesTagsItemsContainsValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"y>@5sv).Q%T kgD|f;V`[,fddY.cY.3[}Njk!$ZR|yEIn_f;5#u__]v3gfR0.F6/UhQHY_K#Z.ysjL#N6$[J(b7w [E~0f5\",\"F0ni%Dq%\\\"jrIct(4\\\\f|'s$ag?I|II&Fm:Qyj-'wbifOTd*uHG|xty&40/~SqStX~>q}UH.u-P\\\\i@>BVN(@/q0\",\"-.oAJ4m-f.pxob~f@W!BxO{!?S>\",\"}AgkMT Te>FH<<|@*q+7GfK[JO9w%S6H|{&\\\"^miNO;UNuR'k5z5e3cT#8b^H+QiYV?c/M&`T$~Fg\\\"C`4EV+fok{?v(bp_=294D@g=5PZS9w<nUHqjj}akHcwP*eB w8:`NFQGs~uOczm9tM)l>{#/6hi\"],\"name\":\"g:Lw3`Tefn~j,Isf]u.~HeO?>X\\\"i$WY:|pg^t,_$VOcizj;B&B\\\\]d]Lw7XkU'x4eA0DyBe}]<nlam/+._9#?C(z=7YO`1S73u-smO$S=}%nh`Rl\\\\[+SjYP4o~;Rk%0>SA?J;E:Pc2M$*%|+&nb}0I,0qiK~6jB<wLZhx$JS;-g#K~'VvadAhNU#F-7!\",\"tags\":[{\"id\":null}],\"status\":\"pending\",\"crvbahhisn\":true,\"qfsj\":true,\"x\":\"R[\"}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.tags.Items.Contains.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesTagsItemsContainsValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"[acqM0*./wt8KPugoZ[n$j^  45/.dZkYm\",\"t\",\"ca\\\\pnedgr+58I|6!1hFzbrEwnDKr_!4U,2)X1.~dP03&?tKC'fncP0IopF9D;Mvo9KWFDz|Tx2!#W&MKaE-W_vJ!~U)]49:[}4nYS)Ei%<WG7%N,WDdL}\\\\[E<0&7$++I6@r-E(y_dvKvF%J\\\\0u'#3r9~1d8!Pj(y3YcGW3$\\\\?#S0x2B&Xy7S&!`)yB2dNE*RYl1|YW\",\"V2V|$H_W2xr2{x\\\\_sgp4v,\\\\:Ner^ h%b:tJk?T?&aD*g$2E'.Kc.Aw,Jgb\\\"@jxP9d@chIW AI%M`O9LqO^N9nu8EE]-vQaR?Iyc#SFKcdhW@ B=1Ck3<Ey0nCp \\\"Da0Dl:zdI[nv 'Z\\\\]o%scO)oy\",\"gg>taB2d~]=2?W14!&|`Y~}?^>OpRtCq+p`k,\\\"h{S%o%la+;I:)\\\"j+PWzFw+$U&c?-L5aw9usSu[Rl 8DN-.Dwkgug7-]!]Mp_]\\\\i:=KJys1F <;DSahjQ&_rQS<@mM*vC9@K9^k;E0z&1X&h$1I|+Rj['$6b+>}q7xjFax=C<N#TH;q,B:P,\",\"{9l88{#EGp#G*U_`).<kvcyDE}= ZP\\\"Iti|hgn(:5E9ToW[`WH-j$w~pPD(Z\\\\\",\")0^iupm\\\"]W3\\\"3>B;yAB6lF:>oip]P1DKLNWMt5k\\\\uNMh^.{[lYnp='bf2xiBbfzKhixzzRwF%1@2zzb<ra,kO1Dg8qxhZ=kn\",\".4#*\\\\B*DDp8Z#Zn[WyZ1)3mh@9Q*V'-U0D!dUND5;1KqJ]]f.A|.h3pVLV*k\\\\cEO/6mgQ4Y/gwkxs|9:\\\\\\\"Ew$<{skS@]=>]b#I*(FzobXH :K4H>!n~*2UdSWu&zi}h(!/qs55kp'u]h~ {CsU/z<\\\"b?okT/j!XA/Cgo3.<~hIKU}73\\\"i.9,jh\",\"w2/n<}@$@{;4WqZAuH3S<7%v`0{1Wpf':7GGry|cR2q&-W#g=<-yL3;C/9Vf1:y:RD<TdE+b4S6|&@+XvKzlJeGN^{a-s_w.x^pI+nFWc$MM&Y)$TCi)ppQtXjQK~>02+iM(vke^t/+u0nr\\\"^tu|\\\"w:%T/=fkb\"],\"name\":\"B`,M5y4 Y82_WJ|[7c0AUKL4=JS,E<0E~;?9^:Ar{9|[1#6e5*|HEomonLe/9T`BY<>7o-59N_hxHsLSQ%.$B>9&yK:%`qJ&b`yKzC\\\"X&dnsS&4lwtD+AHpjy#{fYD\",\"tags\":[{\"id\":true}],\"status\":\"pending\",\"dvqazr\":true,\"uox\":24.0,\"p\":[]}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.tags.Items.Contains.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesTagsItemsContainsValuePropertiesNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"zx5@|COW.QHO;srBERo0B n?')KXn?01bAqfkU'N5Pgg9B]t+Zak&@mFp]KB}W$l/(|*vk^S{c`'@$_j>P$xqNM.qI-gxx@y*tpXTHM|}Jgmk/y.G$UQ}o+&qVdmVrLCp>Ig2g3^b1{k#gW|WsJAO&-^dDs18V pjLbF@5DxzJZ\\\\p@ {yJ\\\"/4tpSlmx?#ht5CAdz7:6}0bpfvDq+sMj\",\"O7wVYu]eb6c_A.!)yigG>D<Zzb\\\\DQWR;qZ6F9zkCC\",\"T/[\\\\ *}./`_whC+rt_By7+ExFp,KN'+}HW<oO\\\\WxCD4Qgo#n/9\",\"CsjrNkr:i)Bz.kG-jA~]&:j,W*u.o`Aqsx!|byD1e3{ank}MK.t\\\"\\\\_`ZFV7b8<~T^z[-RrI6dqv@%e/Tm/`P;\",\"teV8RoKxG_:v&5}QVJ{\\\"DX}~v!(/5M4J4 m1lK;Xc6bAJ~:*3s(@vAoJw-)Wy#tDJcExJM)(B0#EVYyaPS~uObv4@0mZnQ{N@k/oC@8f\"],\"name\":\"`Pi`h_V)i![0!)t]&&HL(70e&jnN3m T0!=kX% .$7O5%70:o?fy<{VtDzH%R+eLun~o^;]gZ=6&R+k_&`~ylg!n<dVSwJ3C)}sjMN; ,6*aj>*4n$6U!(OY%`nidCVkppq%+ W%Em.`RHw68QXT$T]1OFihmP8S`8`2?B_T~|4\",\"tags\":[{\"name\":null}],\"status\":\"pending\",\"vsc\":[\"#YF\"]}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.tags.Items.Contains.Value.Properties.name.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesStatusType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"R@L>+;YAf~KsFpl1EP`Valt:.Bg@az(i`'>|1L[LvjvWoXnGw&o#JiAjb=.U7Hh^\\\"rwp/#<8vJy+ [\\\"u.:gRM3/FWt'?!%P8I;DMF6u-HW1!LjCN0S{CGLta).G(WZ(F15cm.S.:^G},@YrBqN~u]L2^<*YMQ]*[:r]joVwrMCG.ln{C2=(T9PmZro\\\"G^#k[+Q}v'=v}7X{lRj\",\":v<xVV-9'04KH\",\"V`Q[LqeO@Y$>IU|L+Y=wh2ZC.^bk4w6t8v*A M\\\\2QK.T{GVf?UF>2FiKZ\\\"ru{zEjDHU?HV+5jpy~%.bYa>zf_% vJ&VDF%v\\\"ppK !Y\\\\_5S=xki0g.s6bbKNdU!,9fL@ae|4g3a.HA|i!N ;H@u?+*mV!T3\\\\pJ<cy;=[AU~`$_sEat-D,\\\\LXpWpgpWhjuzynbQ#r15-(0:s]b|g8*R]r=&^&K.k)v#f?}UprVh\",\"T[*9m(%QM5p:\\\"5{D^#tph#u-R8\\\"`\\\"Pl'AZot1.>'^k/V3R}u_2@skCey^NB~t`{FV:[4eZs~GhMfn1.(4_dOKoAsjKUhmzPvVRRHn7/a\",\"{i]Z2 s~jQUdA}iZVCL9yV3~3SZGK]WXHlQ|k8y_DH,HY.XOvrX|CW*.6f= 43%'|wR+Rhn\\\";i%L9|2R|)s~.lE\\\"RTr.*`pa{(GV_NRw1FK+_8%#KK^MKn`ibH&~q\\\"z&$y2VB9<p1,\\\"(j0]Y_7>PW%e^I_x.Sa:%4whD::<NrYEM\\\"a`yER/>TMT\\\\nFSSg`]1z[F;.?3mm]1\",\"+[0Q}DQkj$|92}&d0aHe`2Xe\",\"}h4_(yoi:K6q]\\\"R9ZA@.Di3($qqwgUWAV&yj*$VO|PO\\\\i(o$XOso%D!RdbU0#iK5^3v;\\\"J,6}rFK<rEzWM`Wo9M2#[NX)k}xdFXqS/K+?Q`^D.&dH1<f+$CrN\\\"eq+YGR\",\"DHnTtHx,DG)'f(_qGthI*jy@ZIBBK$4{M3xH,Owdr6`IxV/Qh{g|>m5A7::-?{\\\\]lrSScC-=m9<[BA-t+-#Wvvm(Vs*{OB f<]KgQ[/L{S>d!#E5q?3iClOS1,$j>mKhj23kcAD*:=>GK\\\\MYu8H7LEj70>f;V^]\\\\dBngEQZ3-d6cK\",\"l( OiDV&&gP06H01&d>n8B>VLF/C)0Y,@bDF7!xtn^et]xj=xU(;:IWd`h+9nEQL5]8~gW%7@dEnbq?#[Vamh8pOUcJ\\\\o'tc7YrgJD6_@xqB[UL+`B\\\\Kokrn2NW3b|0w$fSjG'Hm~DqHvAOeV(i!'0LPd\\\"75Fl75>;eMY>lT2*P e]I5p<qAjoc;ho:&#$KCp\\\\oh{\\\"jHputPiu&{#h#]9rl @J_RW9nz&oBi|5.,Y{.$\\\"p(<u2<,%\",\"pq;9w`UnQj!{*)@c$EYL=X{lxQ[A[x<5O89]gEeyaSRVwV~]Ds`)D&[&2|<OGB&/V#u| T>}@vr<y>RQ8CHW?#0@8&.+\\\\;o.B5k%}pZ8XnY8wtY*>'mtHu&O`c:vutg~u&_Z$1-*::n`q-~#ZGx[%4)&yC))_L->:t4pUklEF;p[S7N/4Km%HWw6nW,x#z|m?f4M{ |7F1~VVvPU4/OKKq\",\"ax@jcq-;@tJ;LIFZ5/G%1K<bSXFTyNjK_?_5qJVk|?y|Rh*tpS?d}o0}lRHTPCvl$~#?OXPG+1<E0:.8U*ca:sq\\\\(R@pk9*z_?6k#$5eOk 3ASloe 1sp(SwmjpJ x5wS_#4FBVdKQdC.nV9S=H$,s.z*fAQLW6iHotP<@^7U%cmTR_#X5/o_n\\\\^&f|KE2wUA^|yph'y}[9:M5*}R!'!__ 'v[}e/\\\\U3\",\"8#sW_(Q5h,t\\\"YeODoP3PoT8(aCa*~VsbzO Xu>x>Atii6?fovnj)kulcaO\\\\_vs(o<Q1)7U]M81n8%%mD!}<s!:D!l9#]{4G?|4w8xfn> \\\",[sw_1#H0 `Y{O&%)S%T}KxmD7`WdM,zZg;=$&~9QO!fe[N5F]+\",\"D:1- cvzuo]0Fp~k=|8ylO@ZsX[S{!A`G}!\"],\"name\":\"]Ab}\\\\|/bH|9y-gk 3TcY3B5,,M11P)]0X)z 6K @j5cK-7zFwyOKD~n51Oih[@U&Z0,\",\"status\":null,\"oqyslmszr\":[\"~=o &\"],\"ecwbrnj\":[\"\",\"A{\"]}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.status.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putPet_BodyApplicationXmlValuePropertiesStatusValue_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/xml")
                .request().body( "{\"photoUrls\":[\"\",\"1~<;[;&?}h;H;cJ=aIOsNAx(E?@p>UO}-5+cI7^ep&lx94A?yZ8i):o]ubL~ uTGlg~c)>4-gkKee+p(IOUD*7xRZ*JT5PvzA3Fl@b]KOGv(Aq8QK|OgM>[};<PgV[1o\\\".'oq>t^92X)rlIVE@>Xr+x}{&7H+\\\\m7ysH/3iyU1@DzXL[UxOMI'tLoE%%hI+p9Twz^1\\\\CfPAMYz&qH,Hb0K|A\",\"CXpvXgGT{Tj^Ms/#&3}WF`P[/\\\\PXZuQfrB#pfxJ1NoGcrZU\\\"_Kw-:?%oLk?\\\"v{a\\\\p8`rE^\\\")KyVM?|i6Q\\\\{qGBg*6\",\"j5E&n8{f8Yyivz-W0-6NO=pY50>[$4;$FPMG;b\\\"c%V[YvVl*T+\\\"C+ CI$HB7e+Wxmi.ULn<ZT<B!?b|QPE$<xvw,&34uQfus;yw]! T7DoJY*6t#!v+B%&\\\"|clbzZu YQ9-j[:ph0vI_4.*}Dh :\",\"Ua=N)W|sLDS$8+7Q2150Vm-eN1j@JWfda)XIUsz_p-^u*h\\\\45%UGHi1*0^VJb39v7:ABt28HESlYysE?rTzx5u\\\"50,fGeKySH&VX9?%oHoG_\\\\v]F&FoO9m-B\\\"^+pg4e3^l6t`BA~)X}N>dri\\\\lnG|#s;ww7d#6nMAFs<vMvjjD\\\"OR4lio\\\"g]?EI0B&.VAkJQJ0SC)E?M<iOiwPmPorU.Yp.Q|A9+^.U^MjdfK 3du-|)lt)A^c'XgxCw).\\\\lH\"],\"name\":\"4y1Ba@F/W-yG.75l~omZo:3[8ve|ZU)5m#5Tj:kR=$\\\"N8u`C#96(V/LVSgmqnlGnxN5\\\\+w\\\\&aJ>\\\"LcSY=o:[-F]y+\\\"=]+BIq(MEY<`gB*r.nNo0rU:i'l*KfC;7lHc^NvS*I?<5Ex}`(5sHIU10lo*]Wcjb!>=!CQ!@CjTSM@oryJ=>>&nq`v<xqIn\\\"16}g&@Dm$:_TLTpdJJ#ig;dAeQ'eQ1FSZ~X38\\\\I1~[x:$d>UkkPJKp=zh\",\"status\":\")}DOMc2KaFq'7mp{+2Y\\\\xlLFEv8/o ]P9{XqYpwZCi#av]{6CtihhY(/*kHOCkOq~0~>y2H|@M,l5f]P:ip(x{?(D4n:UuGr_6c{vNu7!~/l1`n-#4uQ4'b1d7-*mBPiQm5?&~s<h.M3)yM-LsIv$YFgOYJ,C8 ;YZ.uW1QIFS4!jt9n9F)qHUi7?OR~KmwJ5/&u)Dj/XQOOL\",\"fewlzrwh\":-165.0,\"hnslwkgyazx\":-818.3}")
            .when()
                .request( "PUT", "/pet")
            .then()
                // Body.application-xml.Value.Properties.status.Value=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/pet", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/pet", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByStatus_StatusDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "status", "")
            .when()
                .request( "GET", "/pet/findByStatus")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByStatus", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByStatus", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByStatus_StatusItemsSize_Is_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "status", "available")
            .when()
                .request( "GET", "/pet/findByStatus")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByStatus", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByStatus", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByStatus_StatusItemsSize_Is_Gt_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "status", "pending")
                .queryParam( "status", "available")
                .queryParam( "status", "sold")
            .when()
                .request( "GET", "/pet/findByStatus")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByStatus", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByStatus", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByStatus_StatusItemsContainsValue_Is_Sold() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "status", "sold")
            .when()
                .request( "GET", "/pet/findByStatus")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByStatus", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByStatus", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByStatus_StatusItemsUnique_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "status", "available")
                .queryParam( "status", "available")
                .queryParam( "status", "sold")
                .queryParam( "status", "available")
                .queryParam( "status", "sold")
                .queryParam( "status", "available")
                .queryParam( "status", "available")
            .when()
                .request( "GET", "/pet/findByStatus")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByStatus", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByStatus", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByStatus_StatusDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
            .when()
                .request( "GET", "/pet/findByStatus")
            .then()
                // status.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByStatus", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByStatus", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByStatus_StatusType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "status", (String) null)
            .when()
                .request( "GET", "/pet/findByStatus")
            .then()
                // status.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByStatus", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByStatus", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByStatus_StatusType_Is_NotArray() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "status", "-239.2")
            .when()
                .request( "GET", "/pet/findByStatus")
            .then()
                // status.Type=Not array
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByStatus", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByStatus", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByStatus_StatusItemsContainsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "status", (String) null)
            .when()
                .request( "GET", "/pet/findByStatus")
            .then()
                // status.Items.Contains.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByStatus", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByStatus", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByStatus_StatusItemsContainsValue_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "status", "Tt_4u9jj+=E82\"L19&=JGy._~~I+Tao:h8o4,_]@o}6lCwQyng")
            .when()
                .request( "GET", "/pet/findByStatus")
            .then()
                // status.Items.Contains.Value=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByStatus", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByStatus", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByTags_TagsDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "tags", "")
            .when()
                .request( "GET", "/pet/findByTags")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByTags", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByTags", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByTags_TagsItemsSize_Is_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "tags", "ASI\"[,4b`499x@u6Uv=V#!i_&u9y\\zEDjc^y?_:[;8kp=SrX-) ct|pihl$^jn-$A,?G__ZSScbD_`R}~,_7a15!rwNjT`KD!Obq7p&K%3SLgLV`oYB}Tx1oRS!vY{_;CRxv=}Q_^/gkChm6ta")
            .when()
                .request( "GET", "/pet/findByTags")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByTags", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByTags", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByTags_TagsItemsSize_Is_Gt_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "tags", "")
                .queryParam( "tags", "K<v3%#I~l!^a$1n[*9../e}Hy\\RI&:)IgY-l_t79u{?7dc`>GklMghoBYjzE")
                .queryParam( "tags", "Bb1*{*`/d`#ED5is!Crdtvd||32Bg&PF`arT=Xy>!Y)Dg&X>mU3mepQ=lTJ^/ZcOt@cPO <5X0/DTMS=J3+\\#F>FN+b9^HMd*o\\B']f]_R.ImFf_&2 hW(`v+>-F)x$.")
                .queryParam( "tags", "D4^~2We#v0kq$E8t/0!}7w`R9W0G(X\"`'.)w7;<D%")
                .queryParam( "tags", "7/-rRVg\"hP,e-G4Q6T>?.wf02S'#92)(xBv-dPYlbizzS484{@|wD^\\8?a9BNKE__STSKh\"1Ko[gP/vj_2qY#LEaz\" j&!5XmT ZcGHCWzPRV:|W%j2O<%L,{rn fn:IohWEhdN@zc}NwB9URka~WH'N-V.J,mv|,lc|drz5B',c(pWiuEu\"yDL+wpI2\\W=3aGY1f0{n*Mk1y{]f9h")
                .queryParam( "tags", "KI(fP3u|DCeA-\"k\"n+5Sb,!3._U3BQPHR>a1AD5/!~2T;|h!o-5:\"Wgt@r2%EY,T1TIk>PJd{1vT8YDT*6L%\"jvrfiuEJf(ZUo%Qvg`7h.`P\"0`Q9_v5DUCM)NHxj1B_Z1ap8m$N?yAK 0I2i!akz+s3z`v@F(>W=v{pq_]RZ\\9=46I;^5>zf/pSP`}a'o (PzWYAF\\(&:ddqAKQzg,W~\\R?xUcqUP-M>074")
                .queryParam( "tags", "?qu0t~u/r _wrl8VdtNPUU.lh!*b@(+\"\"JU^%O(ie_+5@)1V</1:(-$EuPc-N'&yv7!jW~!8_/rTAXU~qQ1N^J^yAl?8$D3DR \\T|Gv!L+?FB\\pvhv\"ZpRn[693NlGt+X5.Q]ShW,I0Bd")
                .queryParam( "tags", "ZJ\"nuwXWfx[)7o4%#ME+p$/3x>LQ16tn:NO8k|Fk*0Rw<KG=L+A+es0f#16p,~IB,")
                .queryParam( "tags", "5Y$Gf5vEeN@Y:G02l=7\"BB55Wa\\Wy![Xgc.mFpkGR$82O,pxV]MD&6c#c%82=dq<*tHi?BrQ}q?oUPjnR&18wK_n.l!f)U$2!~6y'+El;RfKq.B<82Dn<DL_J")
                .queryParam( "tags", "bc8t\\-riUV_&[1]D`C_YrYn'UTN?4A`TZ+/`(rPy-w\\SZd0T {{>zD&WQ<}>Q{,]S#[76]6WUmnC>}MA6lYn7dUlw]E+u`}ef~>YfT>GCTXMOK#2^D+NaQ5xIsCc~(#Ru!NIbnl:mr+$w~:oX=a=0D^7Ft+d]EFv!fVpMU\"XhzR4GVc(")
                .queryParam( "tags", "/|L`&!tF49B|^EFVvR=e40v:cP(Dy\\|oP-!o;k-3X\"Cn[>]J!z|]{YH;3hLjF^E)&Kwv #~MlWJYON3wKf")
                .queryParam( "tags", "R[5fp=Yqt_$%RbL\\E5<!%/-dL^yK^YgH,<\\J[4m=K}}zbNLqq+>M){.W[%Xks]vnfyS!%FD0[{C<3%Zr1\"?~?{gk>L9d?(>a)5NVKcR-(|_t0LI}a1%!_Wq\\ccXW=.jje[+hyKix>16[K]o`,`=Bg*KYWVB'k NX5j~`K[$8w&t&eKWhO")
            .when()
                .request( "GET", "/pet/findByTags")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByTags", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByTags", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByTags_TagsItemsUnique_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "tags", ".ed(,ieG%WSx@ qL{@` ^hhuh-#:79sZ")
                .queryParam( "tags", ".ed(,ieG%WSx@ qL{@` ^hhuh-#:79sZ")
            .when()
                .request( "GET", "/pet/findByTags")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByTags", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByTags", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByTags_TagsDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
            .when()
                .request( "GET", "/pet/findByTags")
            .then()
                // tags.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByTags", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByTags", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByTags_TagsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "tags", (String) null)
            .when()
                .request( "GET", "/pet/findByTags")
            .then()
                // tags.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByTags", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByTags", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByTags_TagsType_Is_NotArray() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "tags", "-507.1")
            .when()
                .request( "GET", "/pet/findByTags")
            .then()
                // tags.Type=Not array
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByTags", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByTags", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetFindByTags_TagsItemsContainsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "tags", (String) null)
            .when()
                .request( "GET", "/pet/findByTags")
            .then()
                // tags.Items.Contains.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/findByTags", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/findByTags", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deletePetPetId_Api_keyDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "-3307003083525884449")
                .header( "api_key", "M")
            .when()
                .request( "DELETE", "/pet/{petId}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deletePetPetId_Api_keyDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "0")
            .when()
                .request( "DELETE", "/pet/{petId}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deletePetPetId_Api_keyValueLength_Is_Gt_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "4097295233051277685")
                .header( "api_key", "'juD27lw6s|lPP7; =my]fE/aZs@Egp<x>ynq6]O%VGGA_}+@6t$pIU29%]L}`xY%El*|'M6hQ6|Jh-,T|wP!C>Ao<r'b=V*MSL G3mC<gsdgYbD Zvm.wadSkAO5+(b~HG@q![4r(=k]\\hz]SJzKgt~u)Kj@!ynmCGibAA<wX'AHGCl~a)\\k#mi#;j7j]Ku%'?'TzZE,N ^a<3]p")
            .when()
                .request( "DELETE", "/pet/{petId}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deletePetPetId_Api_keyType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "-3732470245964848263")
                .header( "api_key", "")
            .when()
                .request( "DELETE", "/pet/{petId}")
            .then()
                // api_key.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deletePetPetId_PetIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "")
            .when()
                .request( "DELETE", "/pet/{petId}")
            .then()
                // petId.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deletePetPetId_PetIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "")
            .when()
                .request( "DELETE", "/pet/{petId}")
            .then()
                // petId.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetPetId_PetIdDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .header( "api_key", tcasesApiKey())
                .pathParam( "petId", "-2321562595913203801")
            .when()
                .request( "GET", "/pet/{petId}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetPetId_PetIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .header( "api_key", tcasesApiKey())
                .pathParam( "petId", "0")
            .when()
                .request( "GET", "/pet/{petId}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetPetId_PetIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .header( "api_key", tcasesApiKey())
                .pathParam( "petId", "3023209300046410524")
            .when()
                .request( "GET", "/pet/{petId}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetPetId_PetIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .header( "api_key", tcasesApiKey())
                .pathParam( "petId", "")
            .when()
                .request( "GET", "/pet/{petId}")
            .then()
                // petId.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetPetId_PetIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .header( "api_key", tcasesApiKey())
                .pathParam( "petId", "212.3")
            .when()
                .request( "GET", "/pet/{petId}")
            .then()
                // petId.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getPetPetId_AuthApi_keyDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "-1544503958053740784")
            .when()
                .request( "GET", "/pet/{petId}")
            .then()
                // Auth.api_key.Defined=No
                .statusCode( isUnauthorized())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetId_PetIdDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "-4216727091759095066")
                .contentType( "application/x-www-form-urlencoded")
            .when()
                .request( "POST", "/pet/{petId}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetId_PetIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "0")
            .when()
                .request( "POST", "/pet/{petId}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetId_PetIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "3303645339848709205")
                .contentType( "application/x-www-form-urlencoded")
                .formParam( "name", ";8=w&}!=nY$v+'fkSh[AB=mqF&LvNy^W'{b@p6bUv)}~qNX~f(Edk<f2OXk]@;>;Ar0ZA _{k8d0x)CUj>otR;(Z|H]^o5UK\")SWC<+9YX.&alAi;##(~{N7]?0`Hc:34Sc|6FQel-9}C|k#|ek VGRL](UB/vSN[Dlabhp-2iG]S\"t}4%}?4M]UR`9Er\"cL:bOH~zT()kgns F^h6]b:E")
                .formParam( "status", "/@cL\\eMdelv|lV^OI+d+f6Crz[mXVel-e~(0<[(u48:lt:t[o*gr+BY")
                .formParam( "dxvtwiseitfpw", "PCm:o")
                .formParam( "dxvtwiseitfpw", "M9a37RIw")
                .formParam( "dxvtwiseitfpw", "F(")
            .when()
                .request( "POST", "/pet/{petId}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetId_BodyApplicationXWwwFormUrlencodedValuePropertiesNameValueLength_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "-1118707558028663936")
                .contentType( "application/x-www-form-urlencoded")
                .formParam( "name", "")
            .when()
                .request( "POST", "/pet/{petId}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetId_BodyApplicationXWwwFormUrlencodedValuePropertiesStatusValueLength_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "0")
                .contentType( "application/x-www-form-urlencoded")
                .formParam( "status", "")
                .formParam( "dkbpuxucsnej", "true")
                .formParam( "cliriqau", "-338.2")
                .formParam( "rbwjpcudxyoeiurb", "")
            .when()
                .request( "POST", "/pet/{petId}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetId_PetIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "")
            .when()
                .request( "POST", "/pet/{petId}")
            .then()
                // petId.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetId_PetIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "K\\&@")
            .when()
                .request( "POST", "/pet/{petId}")
            .then()
                // petId.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetId_BodyMediaType_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "2055529702142301009")
                .contentType( "text/xml")
                .request().body( "6,O87K")
            .when()
                .request( "POST", "/pet/{petId}")
            .then()
                // Body.Media-Type=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetId_BodyApplicationXWwwFormUrlencodedType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "2001223028139636679")
                .contentType( "application/x-www-form-urlencoded")
            .when()
                .request( "POST", "/pet/{petId}")
            .then()
                // Body.application-x-www-form-urlencoded.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetId_BodyApplicationXWwwFormUrlencodedType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "762802340089049672")
                .contentType( "application/x-www-form-urlencoded")
                .formParam( "integer", "98")
            .when()
                .request( "POST", "/pet/{petId}")
            .then()
                // Body.application-x-www-form-urlencoded.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetId_BodyApplicationXWwwFormUrlencodedValuePropertiesNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "4548653334654082579")
                .contentType( "application/x-www-form-urlencoded")
                .formParam( "name", (String) null)
            .when()
                .request( "POST", "/pet/{petId}")
            .then()
                // Body.application-x-www-form-urlencoded.Value.Properties.name.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetId_BodyApplicationXWwwFormUrlencodedValuePropertiesStatusType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "2532937788399095534")
                .contentType( "application/x-www-form-urlencoded")
                .formParam( "name", "gU\"fegI9]1sT-+zq|y$9ij\"f#q8`&WPhbzah,k:.:v~H<}P9g186:L5[Dm\\pEuPK8W{4F\"")
                .formParam( "status", (String) null)
            .when()
                .request( "POST", "/pet/{petId}")
            .then()
                // Body.application-x-www-form-urlencoded.Value.Properties.status.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetIdUploadImage_PetIdDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "-1916024617044596977")
                .contentType( "application/octet-stream")
                .request().body(
                    new byte[] {
                         -25,   4,  69, 120,  55, 114, -41,   2,  29,  70,  44, -75,  92, -85, -49,   5,
                          -4,-128,-118,  37, -28,  61,  59, -77,-109, -87, -37,  -9,  19,  36, -30, 121,
                         -98, 103,-121, 121, -48, -64,-111,  -1,  94,  84,  64,  54,  59, 110, -63,  45,
                          74, -60, -38,  91, -98,-115, -50, -26, -67, 102,   2, -28, -48,-101,  74,  86,
                          22, -74,  17,-113,  72,  88, -71, -36, -33,  -4,  75, -13, 114, -86, -31, 100,
                         -12,  40, -71,-100,  10, -16,-100,  -4, -55, -45, -54, -94, 124,-112, 121, -14,
                          55,  95,  -5,-119, -95, 100,-105, -73, 125, -40,  44,  27,  85,-121, 103, -29,
                          86,  15, -50,  74, -75, -54, -86, -74,  88,   5, -76, 115,   5,  39, 112,   3,
                         -16,  25, -66, -66,-110,  83, -79, -58, -69,  49,  96, 104,  11,  39,  82, -55,
                          16,  28, -78,  55,  30, -84,  78, -41, -19, -73, -13, -30, 109, -40,  -5,-128,
                         -79,  97, -51,  96,   7, -41,  35,  57,  64,  21,   2,  77,  15, -83, -43,  56,
                        -124,  -4,  48, -42,  59, -10,  41, -86, 113, -24,-123, -78,  72,  96,  93, 122,
                         -16,   2, -15, -27, -99, -73, 107, 100,  84, -14, 109, -20, -78,-108, -14, -27,
                          89,  59, 112,  19, -11,  88,-100,  66, -80,  -4, 102,  31,  65,  -5, 110,  38,
                         -92, -73, -76, -32,  39, 119,-122,  82, 103, -53,  34, -65,-106,  87,  49,-104,
                          -5,  36, 108, -87, -89,  28,  60, 118, -38, 123, -70,  71,-107, -11, -29,  65,
                         -51, -45, 126,-103,  44, -61,-108,  85,-117, -10, -52, -17,  52, 100, -68,   0,
                          24, -68, 124, -39, -93,  60,  29,  33,   3,  87, -32,-116,-106,-119, 123, -57,
                         -22,   1,  32,  78, 102, -73, 104,   1, -11, 109,-105, -70,  87, 100,  82,-108,
                          36, -66, -44, -31, -83,  81, -15, 112, -94, -63, -70, 106,  41,  14,  65, -17,
                        -127,  15, -18, 103,  68, -16, -87, -50, 127, -80,  38,  90, -97, -45, -54, -51,
                         -42, -73,  44,  45, 126,  76,  74, -53,  22,-102, -90,  99,  72, 117,  51,  43,
                        -102, -55, -69,  40, 105, 109, 121, -74,  41,  50, -33,  87,   0, -26,  38,  91,
                         -87,  41,  12,  48,  66,   0,-118,  98,  28,  98, -24,  78,-127,  26, -18,-120,
                          68, -23,  63,  71,  43,  68, -65,  72,-108,  92,  89, 103,  64, -66, 104,  60,
                          92, -68,  98,  35,  26, 125,  72, -76,  90, -57,-113,-115, 118, -31,  44, 121,
                          15,  16, -67, -77,  20,  34,-116,  26,-123,  31,  37,  79, 124, -12, -86, -56,
                         114,-123,  99,  80,-101,  58,  59,  -5, -40, -69,  19, 104,  91, -92,  69, 127,
                        -111, -44,  -4,  69, 101, -97,  56, -19, 104,  17,  63, -61, -93, 108,  50, -29,
                         -77,  91, -44, 109,  78,  18, -25,  21,-126,  30,  41,  29, 123, -14, -16, -77,
                         -30, -34, -17, 101,-114,  97,  44,-102, -53,  31, -39, 127,  -7, 124, 116, 103,
                         -87,  59,  67, -93,  46,  10, -89,-126, -89, -13,-107,  -8, -76,  30,  -4,  87,
                          31,  21,-123, -40, -73,  13, 119, -94, -34, -49,  88, 101,-106, 100,  75,  -8,
                          36, -68, -45,  34,  45, -17, -47, -40, 125,  45,   3,  31, -10, -99, -66, -20,
                         -22, -41,-119, -70,  59,  11, -91,  60,  -6,  14, -83, -48, -27,  17, -45, -21,
                         -73,-110,-106, -18, -81, -65,   8,-106,-102,   4,  15,-102, -57, -75, 108, 105,
                         -24,  78, -91,  91,  39,  22, 122, -34,  23,-109,  93, -19,  37,  57, -88,   2,
                          56,  40, -99,  74,  12, -26,  -9,  45, 124, -32,  33,-106, -62, 122, -95,  45,
                          66, -59, -64,  27, -64, -95, 123,-117,  84, -53, -11,  72, -21, -70,-125, -10,
                          68,  61,  59,-111,  18,  67,  21,  10,   3, -48, -57, -79,  19,  31, -70,  66,
                          37,  22, 111, -91,  -6,  10, 117, -92, 115,  96, -83,-127, -98,  90, 108, -79,
                         -72, -98,  40,-101,-126,   8,  37,-114, -14,-111,-112, -76,  -3,-112, -36,  86,
                          66,  41,  37, -32,   1,-101,  95,-113,  89,  69, 112,-124,  -6, -60,  -8,  43,
                          57, -22, 116, -79,-113,  99,-113,  69, 113,  45, -72,   1,  84, 105, -61, -99,
                          78, 127,  85, -67, -76,  89,  88,  82,-109,  87, -88, 112,-114, -26,  91,-122,
                         -83,  98, 127,  11,  98,  -9, -48,  20,-114,  26,  26, -95,   3,  42, -87, 108,
                        -125, -50, -64,-109,  37, -80,-115,  39, -52,-113, 106, -30,  62,-110,  53, -19,
                         -64, -44, 100,  47,-104,  39,-112, -87, -73,  -6,  48, -57,-120, -52, -20,  -9,
                          29, -81,-115,  20,  26, -37,  78,  35,  88, -62, -23,  21, -63, 119,  97,  64,
                          96,-117,-107,  39, -62,  50,  33, 107,  65, -31,  36,  91, 115, -96,  73,  18,
                         -33,  87,  -7,   5,-113,  45, -89,  64, -83, -17,  80,  17,  36, 106,  62,  63,
                          66,  84,-123, 100, -28,  28,-125, -36, -27,  43,  42,  24, -21, 121, -68,  46,
                        -117, 106, -77, -41,  50,  35,  47,-116, -28,  36, 103, -60,  69, -10,  39,  51,
                          91,-108, -89,  77, -10, 105,  31, -72,  61, -21, -78,-115,  40,  48, 112,  47,
                         109, -48,  54, -43, -26,  66,  -3, -81,  60, -20, -98, -41,  88,  73,  28, -82,
                         103, 108,  41,  -7, 102, -88, -42,  12,  76, -37,  52, 112,  -6, 107,  75, -67,
                         -47, -90, -79,  50,  64, -47, -32, -42,-104,  77, 115, -74, 102, 103, -56,  -8,
                         101, -19,  27,  62,-108, -53,  35,  75, -13, -21,-123,  98,  65, -58,  -7,  -4,
                        -120,  59,  78, 113,  13,  83,  80, -72,  -4,  94,  52,  59, -55, -79, 116,  56,
                          24,  93,   0,  89,  85,  86,  96,-128, 125,  89,  17, -98, 114,  54,-118, 119,
                         104,  25, -17, -97, -54, -33, -75, -95,  19, 101, -91,  68, -78, -67,-117,  42,
                        -120,-118, -24, -90, 113,  85, 115, -11,  20,  85, 103, -90,  25, -47,  -4, -11,
                         -55,  36, -80, -51,  43,  68,   3, 125, -84,-125,  14, 104, -93, 122, -75,-112,
                         127,  50, -99,-113,  37,  42, 117,   5,  73,  61, -23,-126,  81, -42,  89, -32,
                           8, -56, -66,-101,-107, -12, -73,  39,  56,  -2, -93, -28, -11, -88, -64,  13,
                          13, 116, 124,-109, -94,  36,  18,  72,-112, 102,-108, -49,  77,  16,  44, 106,
                           7,  48,  91,  60, -93, -49, -62, -24,  78,   8, 101,  -9,  84, -96, -44,  64,
                           5,  85,   2,-106,-116, -18, -75,  26, -63, 115,  45,  84, -45,-127, 120, 119,
                         -85,-104,  20,  85, -92, -80, -23, 118,  40,  38, -44, -80,  61, 102, -91,  97,
                         125,  86,  45, -22, 123, -59, -55,  42,-103,  62,  78, -73, -68, 100,-115, -82,
                          93, -87,-110,  42,  27, -46, -96, -52,  35,  29,  43, 120,-121,  20, -92, 125,
                          82,  25,  49,  90, 125,-123,-113, -30,  55,  80,  24,  81, 118, 120,  66,-100,
                        -118, -31, 125,  52,  62,   0, 124,  -7,  67, 116, -20, 121, -41,-113, 101, -69,
                         -95,  18,  41,  96,-110,-125,  99,-127, -97, -23,-115,  23,-126, -96,-124,  41,
                          35,  21,  89, -72, 120,-101, -93,  60, -84,-124, -12,  89,  42,-114, -71, -74,
                          79,  80, -67,   9,  47,  56, 111,  55,  58,-100, -45,  28, -10, -46,  70, -30,
                          30,  -7,  93,  82, -24, 106,  -9, -10,  42,  26, 108, -93,  79, -19,  43,  29,
                        -125,  77, -21,-116, -68, -71,  22, -44,  84, 114, -36,  29,  -5,  86,  50, -73,
                         -13, -65, -82,  99, -32,  62, -55, 110, -86, -93,  62,-101, 106,  89, -22,  47,
                          39, -41, 100, 104,  22,   7, -85, 117, -99, -89,  66,  46,  80,  83, -80, -12,
                          31, -58, 110,  53, 102,  99,  89, -14, -65, -13, -11,  75, 115,  67,  72, -75,
                         106,   0,  55,   6,  13,  34,  43,  48, -87, -15,  78, -92, -59, -84,  38,  35,
                         -92,  78,-108,  64, -74, -30, 126, -95,  30,-111,  29, -36, -75,  39,  91,  49,
                          64,  39, -85,  59, -25,  -7,  29, -48, 112,  88, 112,   6, -63,  52,-126, 101,
                        -121,  79,-123, 114, -67,-105,  37,  10,  34,-105,-113,-126,  79,  36, 105, -14,
                         -32,   8,-108, -83, -36,  37, -49, -75, -50, -98, -90, -31, -67,  39, 104, -76,
                          81,  78, -47, 118, -96,  16,-116, -50,  73,  38,  77, -74, -74, -33,  35,-101,
                          69, -26, 120,  20,-104, 111, 120,  68,   4,  59, -95,  30, -57,  -5, -88,   5,
                        -113,  76,-102,   6,  51,  65, 107, -65, -76, 100, -60,-119,  49, -65, -23,  89,
                         -81, -72,  80,-104, -69,  45,  34,-120,  53, -33,-108, -95,   0, 127, -50,   8,
                          82, -60, 126,  -2,-125,   5, 114,  47, -85,  14, -90, 123,  92, 109,-121, -23,
                          31, 118, -65,  -1,  92, 110,  68,-124, -22,-111,   9, -65,  30,  70, -33, -94,
                         -80, -76,  22,-124,  77, 116, -66, -56,  23,-105, -84, 105, -90, -80,  51, -51,
                         -34, 101,   7,  59,-126, -15, 114,  20,-113,  86,  35,  86, -21, 106, -79, -68,
                          65, -66,  85, -44,-124,   1,  63, -40,   7, -40, -10, -69, -45,-111, -65, -10,
                         -10,-124,  32, -25, -86, -13, -99, 103, -13, 101,  39,  47, -60,-102, 102,  72,
                         -94,  79, 100, 108, -49, 112,  37, -42,  44,  83, -40,  81, 122, -46,  52,  43,
                         -73,  -6, -89, -63,  68, -56, -79, -27, -52, -10,  63,-109,  26, 117, -21,-101,
                         -10, -31, -63,  30,   8,-104, -43, -19,  92,   2,  65,  51,-121, -77,  92,   7,
                          52, -99,-103, -86,  54,  68, -97, -66,  49,-106, -64, -16, -12,  57,-108,  95,
                          96,  69, -62,  78, -66, -15,  -7, 106,  18, -72,  30,-116, -69,  11, -23, 122,
                         -61,-123,   5, -67,  87,  -8,  22, 121,  30,  16, 109, -59, 108, -56,  48,  89,
                        -118,  -3, -73,  -4, -76,  -1, -89,  60, -20,  15,  90,   1,  39, -82,  57, -18,
                        -127, -75,  51,  60, -11,  59,-127,-106, -13, -25,-124, -10,  46, -19,  49,  77,
                          33, -82,  93,-123,  96, 125, -66,  50,  44, -17,  80,   1, -75,  32,  -8,  11,
                         -52, -55, -25,-114,  80,   7,  -3, -56, -11,  96,-107,  52,  -4,   0, -70,   8,
                          86,-105,  80,  -9, 109,  98, -25,  52,  56,-107, -16,  75, -97, -94,   3,  85,
                         -57, -64, -74,  70,  28, -98, 111,  71, -52,  22,  84,   7,  44, -41, -78, 104,
                          94,  34, -82, -87,  57, -75, -25, 117,  27,  60, -47,-112, -10,-126, 103,  58,
                         -39, -51, -96,  61,   3,  10, -17,-126,   4,  38,   4, -92,  40,  -4,  66, -37,
                         -13, 125,  38,  79,  87,  45,  39,-111,   1,  73, -11, -85,  28, -57,  85, 118,
                          46,  62,  97,  40,  33, 101,  17, -32,-116, -28,  39, -65, -19,  67,  60, 106,
                         -46,  74,  22,  25,  15, -90,-103,-109, -66,  12,  14, -68,  74,  33,  96, -62,
                          53, 109,  38,-104,-122, -12, -22,  29,  57,  42,-127,  32,-115, -88,  93, -42,
                          59,  88, 121, -98, -39,  96, 116,  44,  72,  20, 104,   7,  11,  55, 105, -42,
                          32, -55, -93,  74, -72,  18, -59, -61,  68,  41, -94, -34, -83, 120,-126, -84,
                         116, 112, -56,  34, -26,  23,  89, -91,  57,   9, -31, 102, -65,  55,   8, -47,
                         103, -25, -81, -45,  46, -22, -41,  69, -56, -42,-112, -51,   7, -42,  24,-121,
                          70,  53,  20,-119,-105, -32, -32, -52,  78,  34,-119, -72,  25, -61,  88, -57,
                          69, -87, -32,  31, -42,  -1,-112,-112,  69, -29,  62, -38, -23,-125, 121, -33,
                         126,  12, -17, -73,   3, -34, -80, -79, -22,  35, -46, -83, -95,  31, 113,  63,
                          57, 112, -41,  11,-112,-115,  48,  81,  32,  67, -40, -62, -75,   5,  -5, -21,
                         110,  28,  -8, 114, 118, -61,-126, -25,-108, -16, 109,  35,  51, -63,  -8, -59,
                        -121,  98,  47,  80, -80, -84, -57, -95,  32,  71,  42, -38,  95,  13, -38,   8,
                         105,  88,  25, -73, -20,  38, -53,  18, 116, -87,  62,  19, 127,  31,-103, -92,
                         -75, -65,  63,  78,-128,  80, -31, -75, -13,  68, -91,  74, -14,  57,  81,  19,
                          74, -99, -54, 118,-102, -93, -25, -94, -38,  94,  -6,  26,-121, -36,  66,  -4,
                          14,  69,  36, -34, -69,  16,  96, -60, -89, -49, -70,-101,  11,  38, 122, -17,
                         -18, -35, -21,  43, 102, -52,  -2, -11, -72,  80, 100,-124,  35,  59,-127,  43,
                          34, -94, -67,  26,  20, -60,  90, -78,  49,-128,-102,  18,  92, -58, -47,  42,
                         -75,  95,   8,  21, 106, -18,  -5,-100,  35, -65,  61, -74,-128, -27,  85, 118,
                          68,  -3,-101,  76, -83, -22,   1, -14, -22,  77,-113, -27,  43,  24, 122,  78,
                           5,   7,  21,  28, 117, -93,  80,  25, -43,  74,  80,  -9, -99,   3,  87,  90,
                          11,-120,   5,-127, -96, -24, -41, -97,  12, 119, 127,  31, -48,  31,-109,  -3,
                         -57, -77,  -5,  84,-119,  52, 102,  57, -82, -27,  51, 119, -52, -95,   9, -41,
                         -47,  35,-117,  14, 122,  16, -58,  39,  57,  -7,  80, 127,  58,  55,  69, 109,
                         -24, -83,-123, -70,  94, -52, -24,  43,  47,  83, -78, -94,  55, 103, -78,  55,
                          55,  22, -35,  68, -70, 125, -40, -94, -11,-103,  52,-107, 107, -84,  86,  29,
                         -39,  33, 119,  80, -34, 121,  86, 125,  -3,  56, -22, -29,  89,-100,  22,-103,
                         -97, -51, -47, -55,  87, -65, -86, -83,  39, 127,  25, -34,  -9, -81, 102,  -7,
                          16, -83, -19,  25, -89,   2, 124, 118, 100, -65,-109,  16,-127,-127, -25, 122,
                         -79, -75, -48, -79,  55,  82, -49, -82,-100,  87, -53, -93,-119,-109,  39,  52,
                        -123,  -6,  83,  99,-116,-123, -55, -67, -47, -63,   8, -13,  83, -11, -47,  41,
                         -41,  27,  19,  54, -71, -21, -69,  99,-124,  19, 125, -10,  95,  88,  50,  63,
                          54, 111, 124, -73,  20, -19, -88, -80,  87,-113, -14,-116,  70, 107, 108, -76,
                         -64,  35, 109,   7,  44,-108,   4,  18, -13,  44, -62,  42, -55,-115,  77,  59,
                         -93, -26, -76, 119,  -6,  49,  64, -91,  43,  59, -65, -20,  38,  50, 125, 106,
                         -32, -53,-112, -96,  85,-111, -17, -23,  97,-128,  56, -27, -82, 127,  65,  30,
                          82, 127, -27, 118, -85, 109,  73,  40,  40, 125,  64, -79,-109,  10,  83,-101,
                         -17,   1,  -3, -90, -18,  32, -84,  -2,  43, -75, 100, -29,   6, -75,-109,-108,
                          76, 119,  12,  40, -53, -68, -22,  85,  76,  34,  22, -95,-127,  13,  42, 101,
                         102, -57,  10,  94,  33,   3, -74, -73,  16,  54,-125,  95,  97, -66, -61,  86,
                         -98,  24, -87, -24, -80, -15, -73, -97,  57,  13, -58,  13, -73, -30, -42, -20,
                           5, 102, -54, 107,  17, -43,  47, -58, -76, -71,  79,  35,  94,  84, -29,  66,
                         -38, -75, -25, -81, -27,  22,  72, -83, -75, -58, -93,  20,  80,  71,  50,  66,
                          80, -76, -94, -77,  81,  59,  62, 120,  32,  91,   5,  28,  53, -58, -93,  12,
                        -109, -74, -96, -13, -87, -63,   8,-120,  42, -98, -23,  49,  60, -28,  -2,-118,
                          13, 106, -28, -42, 106, -36, -83, -69,  64,  66,  25,-120,  46, -72,  50, -65,
                         -28, -77, 124, -28, 110,  52,  57, -18,  39,  90, -91,   4, -64, 116,  67, -53,
                         -57,-124, -61,  -1,  90,  43, 110,  64,  99, -36, 113, -91,  40,  50,-128, -99,
                         -22, -92, -49,  58,  90,  81,  55, 124, -35, 120,  90,-108, -14,  60,  83, -57,
                          78, -68, 104,  -9,  16,   2, -85, -14, -65, -92,  28,  29,  19,  -2, -57,  38,
                          69,  27,  -3, -83, -55,  92,-120,  86, -94,   0, 124, -29,  62, -48,  -2,   8,
                          53,   7,  13,  44, -15,  11,-113, 115, -21, 124, -60,  71, 118,  86, 120,  38,
                        -101,-113, 119, -40, -55,-113,  71,  34, 114, -32,  31,  28, -28,  39, -89,   6,
                          83,  47,  81,  56,  86,   0,  -7,  78,  99,-107, 106, -52, -22, -28, -49, -65,
                          22, -66, -84, -70,-100, 122, -28, 100, 105, -32,-115,  46, 119,   9,  45, -56,
                          67, 118,  67, -79,  12, -83, -83, 107,   8, -26,  35,   9,-100,  16, -51,  86,
                         -31,  18, 113,  71,  58,  55,  91, -41,  74,  34,-116,  75,  95, -67, -10,  42,
                         -29,  73, -59, 124, -46, -48, -48,-102, -99,  54, -35,  43, -49,-100,  72,  17,
                         -82,  38, -68, 100, -52, 107,  80, -44,  -5,  49,-117,  62,  88,  21,-122,  19,
                         -39,   8,  67, -74, -34, -59, -82,  58,  75, -73, 103, -33,  88,-105,  85, 108,
                          51,  75, -56,-109,  50,  29, -69, -53,   7, -90,  19,  78, -15, -62,  88, 112,
                           9, -41, -17,  51,  89,  -4,  32,-104,  30,  41,  80,  -9,  32,-105,  64,  11,
                         -88,  39, -25,   3, 126,  81,   6,-110,  26,  80,  23, -13,  14,  -2,  12, -17,
                          32,-126,  -9,  18, -34,  68,  23,  25,-123,-106,  66,-109, -90,  74, -56, 118,
                          75, 101, -99,  43, 119,-126, -44, 115,-119,  -3,   7, 106, 103, 123,   4, -86,
                          13, 118,  88,  77,  -1, -22,  15,  66, -42,-101,  -4, -56, 122,  86, 105,  -4,
                         -36, 107, -41,  35,  23, -32, -50,  50, -56, -57, -43, -38,   7, -77,  -1, -31,
                        -126, -63,  87,  64, -64, -97,-120,  87, -57,  63,  16,   2, -61,-125, -41,  62,
                          33,  46,  73, -23,  13,  99,  42, 115, -15, -12,  54,-105, -51, 118, 107,  12,
                         119,  42, -63,  54,  26,  52, -78, -77, -10,  91,  -7, -32, -70,  62,  -2,  81,
                          99,   6,  75,  88,  60, -81, -52, -84,  68, 104, -37, -72, -18, -40,  90,  28,
                         -88,  82, 101, 126, 121,  35, -15, -25,  99,-107,  71, -81,  45, 101,  34, 110,
                         -17, -94, -59,  47,  58, -58,  58, 102, -95, -94, 109,  59, 113,  98, 103, -15,
                          18, -20,-121,  76,  63, -18, -12, 104, -15, -28, -34,  12,  -3, 100,  -1,  94,
                        -105,   2,  -1, -89, -46,-119, -69,  90,  15,  83,-125,-120, -79,-103, -15,  68,
                         122,  -3,  47, -71,  63,  68, 112, -45, -24, -81,-112, -42, -96, -86,  -7, -44,
                          46,-127,  90,  50,-126,  14,  88,  48,  57, 119, -33,  77, -33, -40, 123,  67,
                         -26,  54,-116, 101,  66,  -1, -69, -50, 118, 112,-113,   0, -97,  95, -64, -89,
                          16, -12,  93, -57,  -2, -67, -93,-115, -20,  11, -88,  96, 126, 116,  25,  61,
                          33,  86, -35, -11,-123, -19, -18,  49,  41, -18, 126, 111,  25, 121,  -8, -22,
                        -105, -42,-115, -64, -85,  73, 118, -78,-101,  77, 113,  98, -27,  49,  44, 125,
                          59,-101,-104,  99,  57, 108,  52,  87, 118,   6,  35, -79,  63,  22, -53, 110,
                         -89,-122, -14,-101,  37, 109,   1,  50, -37,-120,  64, -41, -63,  13, -22, 102,
                           7,  77, -76,  80,   2, -46, 107, 120,  54,   5, -17, -45, -42,  46, 113, -25,
                          35,-111,  88,  47, -71,-128, -20,  15, -25, 122, -24,  93,-112,  82, 101, 105,
                        -100,  77,  80, -15, 121, -87,  90,-121,  36,-115,  -9,-126, -72,-111,  22,-128,
                         117,  14, -98, -63, -20, -37,  95,  77,  29,  66,  97, -58,  38,  -1,  16,  59,
                         -43, -66,  44, -43, -86, -69,  -5,  50,  96,  16,   9,  -6,  83,  51, -82,  14,
                          10,  15, -97,  56, -14,   7,  42, -26, 126, -34,  -3, -45,  44, 125,  -5,  17,
                         -47, -74, -96, -42,-105, -22, -76, -78, -17, -40, -28,  91,  40, -52,-111, 119,
                         -44,  23,-109,  10,  55, -62, 104,  89,  50,  66, -95,-109,-100, -89,  57,  59,
                         115,   4,   3, -71, -77, -37, 125, 127,  56, -95, -26, 114,  77, -57,   6,  17,
                         -58, -82, -19, -23, -38, -50,  95,  28,   2, -14,  84,  80,  70,  33,  60,-119,
                         -30,   3, -73,-116, 103, 114,  65,  90,-120, -68,-108, -22, -20,-128,   2,   0,
                          92,  -9,  19,  51,  45,-101, 103, -63, -36,  53, -29,  90,  79,  -5,   8,-114,
                          10,-125,  79, -61,-112,  26,   4, -34,-113, -49, -36, -98, -62, -44, -57,-104,
                          16,  95, 121,  -5,  55, -80,  29,  48,  83, -39,  86,  11, -83, -85,-109, 123,
                          26, -74, 121,  -6,  -1, -30,-104,  99, -31,  24,  -1, -77, -95,  -4,  55, -57,
                         -26,  89, -11,  65,  50, -11,  64,   7,  29, 124,-126, -99, -84,  83, -83, -47,
                           5,  60, -94, -24,  -8, 103, -17,  43, 119,  73, 106, -56, -18, -66, -16,  99,
                         -31,  46, 100,  40,  13, -62, -29,  35,-109, 114, -15, -53, 108,  86,  71, -74,
                           1,  51,-122,-126, -77,-115,  68, -99,  43, -19,   9, -72,  35, -19,-111,  36,
                        -117, -44, -28,  78, -22, -63, -35,  84,  52,  54, -28,  86,  96,  63,   2, -14,
                          10,  93,  34, 101, -33,  10, -64, -34,  63,  99, -55,  22,  78,  50, -60,-122,
                         113, -35,  69,  97, -95, -91, -89, 116,  34, 102,  58,  -9, -48,  -8,  66,  16,
                          96,  84, -78, -53,  26, -61,  72,  69, -41, 102,  77, -66,-112,  49, -37, -82,
                         -91, 116, 115, -89,  60, -90,  10, 127, -93,  87, 108,-105,  88,  82,  72,  15,
                           4, -48, -79, -35, 122, -15,-103, -45, 122,  39,  38,-119, -96, -12,  44, -76,
                          59, 106,  -8, -15, 121, -41,  77, -69, -95,  54, -10,  14, 103, -41,  -6,  97,
                          64,  -8,  17, -19,   7,  35, -29,-122,-107, -15,  -5,-101,  70, -86, 120,  62,
                         -52,  79, -28,-117,  75,  74, -53, -66,  43, -74, -42,   6, -63, -11, 112, -62,
                          28, -53,  20,  81,  62,   1, 125,  72,  -8, 102, 120, 107, -32, -76, -10, -88,
                         -10, -92, -88, -13,  89,  -1,  22, -33, -14,  80,   3,  32,  -2, 115,  97, 121,
                         -23,-112,-128, -26,-112, -20, 124,  36,  87,  71, -18,   3, -32,   8, -20,  24,
                         -39,  19, -65,  -4, 126, -87,  33, -90, -51,  25, -12, -18,   8,  56,  -2,  75,
                         -70,  96,  29, -30, -32, 102,  49, -44, -54, -56,   1, -10,  75, -37, -38,  22,
                        -101, -67,  42, -92,  71,  64,   1,  -2,  53,  28, -87, -31, -95,  93, -15,  54,
                         -26, -76, -82,-114,   9,  78, -47, -62,  77,-128, -45, -79,  59, -96, -86,  66,
                         -27,-106,  38,  82, 120,  98,  73,  21, -55,  76, -53, -81, -37,-100, 118, 122,
                        -120,  15, -37, -61,  86, -26, -25, 113,  65, -38, 111,   8,  95,  89,  97, -84,
                         101, -44,-110, 123,-121,-120,  29, 112, -52,   9, -53,-122, -99,   0, -53,  64,
                          -1, -82, -77,  95,   8, -75,  71,-118, -23,  34,-123,   1, 118,  52,  72,  52,
                          74, 103, -13,-107,  32,   7, 103,  53, -94,  43,  30, -66,  37, -19, 108,  85,
                         110,  82, -50, -48, -44,  42,-114, -11, -18,  30, -94,  49, -40, 121,-107,  22,
                         -53,-119,  17,  25, -97, -31, -40,-118,  87, -91,  -1,-127,-127, 118, -26,  -8,
                          61,  14,  35, -53,  98,  30,-126,  19, -36,  51, 127,  67, -19, -54, -11, 111,
                         -96,  91,-110, -39,-103, 108, -85, -67,  23, -75,  82,-115,  20,   7,  28, -38,
                        -106,  48,  32,-106, -49,  22, -41, 125, -94,  32,  20, 117, -77, -80,-114,  25,
                        -121,-114,  20,  96,  83, -64,  57,   9, -73, -92,-117, -67,  24,  86,  89, -93,
                         -23,  53, -90,  -2,  44, 102,  31, -44,  22,  70, 124,  95,  60, 122,  84, -76,
                         -63,  34, -89,   0,  73,  -5, -22,   7,  43,  26, -64,   5,  22, -82,-106,  86,
                         104, -51, -35, -37,  -4,  19,  -9, -72, 111, 127, -21, 126,  45, 107, -51,  28,
                        -110,  51, -85,  94, -87,  84,  17,  62,  14,  -8,  64,   8, 111,-125, -80, -23,
                        -116, -19,  25,  66, -70,-105, -79,-128, -55,-118,  53,-106,  65,  58,-100, -55,
                         -60, -45, 114, -71, -43,  -2, -88, -71,  29, -50,  95, 104, -41,  90,-117,  48,
                        -114,  -8,  55, -13,  81,  99,  20,  17, -92,   1, -86,  55, -60, -33, 107, -56,
                          36,  -6,  46, -42, -27, -39,  32, 117, -68, -39,  65, -72, -44,  -1,  93,  40,
                         -17, -16,  47,  88, -94,  61, -24,  24, 102, -31,  70, 115,  25, -76,  22,  38,
                           4, 126,  -2,-101,  35, -10,-106,   6, 111,-106, -30, -64,  67,  11,-100,  36,
                         -16, -67, -58,  83,   2, 109, 107,  21, -44, -93,-125, -24,  53, -34,  34,-112,
                         -72,  35,  48, 127,-115, -26,  50,  40,  98, -34, -89, -60, -44, -71,  58,  51,
                          26,-128,-108,-118, -72, -79, -18,-110, -99, -25,  54,  64,  33,  18, -18, -26,
                          25, -71,   9, -87,  86, -29,-121, -47, -30,-102,  41,  71,-119,  18,  74,  75,
                         -72, -11, -48,  80,-125,  16,  39, -75, -49, -88,  88,  97, 123, -97,  34,  73,
                           5,  66, -90,  97, 101, -68,  40, -19, -30,   4,  15, -41,  59,  93,  28, 126,
                          88, -17,-105,  74,  19, 109,  -2,  90,  96,   9, -93,-119, -11, -49,  79, -38,
                         -36,  52, -67, -95, -44,-101, -41,  48, 119, 117,  35,  81,  21, -23, 117, 112,
                          78, -44,-105, -17,-116, -12, -20,  32, -90, -87,  83, -47, -43,-107, -65,  39,
                           5, -57, 100, -38, 114,-104,  -5,  65,  92, -58,   4,  22,  23,  35, 127, -42,
                          49,  55,  92,-113,   6,  88,  37,  28, -33,-112,-113,-121, 116,-118, -29,-105,
                         103,  73,  33, -15,  66,  24,  70,  27, 111,  66,  13, -74,-108,  -4, 114,-118,
                          92, 122, -90,  39,  15, -41,  29, 104, -86, -91,  43,  67, -65,  60, -13, -63,
                         -16,-108, -45,  38,  -6,   2, -78,-101,  50,  38,  91, -87, -76, -95,  67,  27,
                         110,-124,-122,  90,  39,  26,  64,-121,-116, -74, -37, 121, -71, -49,-107, -28,
                          18,-121,  88,  32,-123, -60,  70,  66,  75, -80,  23, -60, -13, 127, -81,  93,
                         -53,-124,  37,  22,  66, -35, -55,  38, 109,  18,  10, -18,  -9, -24, -80, -13,
                          65,-114, -21,-113,-127,  31,  73,  93,   4, -62,  95,  57, -96,-100,-128, -97,
                          24, -56, 116,  12,  74, 106,  40,  13,  24, -79, -39,  73,  34, -17, -74, -34,
                         118,  70, -98,  14, -62, -49, -61,  94, -53,  15, 112,  41,  95,  59, -16,-103,
                         -62,-100,  50, -19,-101, -29,  88, -39, -66, -21,  20, -52, 121,-104,  14, -62,
                         -81,  37, 119,-115, -51,  -4,-111,-101, -77, -31, -10, -23, -88, -44, 104,  37,
                         120,  71,  -9, 112,-123,  94,  23, -63, 116, -59,  10,   2,  76, -55, 109, -81,
                         108,  56,   9, 102,  94, 124,  85, 117, -14,  99, -83, 113,  69,  92,  32,  -2,
                         -83,   7,  60, -88, -50, -51, -26, -86, -80, -61,-100,  39,-126, -62,  65,-102,
                          52, -18,-106, 122, -30, -28,   2, -45,  97,-121,-102,-110, -40, -41,  68, -98,
                          23,  44,-114, -83,  45, -68,  59, -40, -48,  86,  -1, -20,  20, -96, 126, -66,
                          14, -10,  17,   6,  -3, 111, -19, -42,  -1, 113, -95,  -8,  83,  69, -75,  79,
                          51,  55,  96, -50, -48, -42,  83, -45,-109, -46, -18,  15,-112,  39, 112,-119,
                           8,  43,-118, -76,   6, -83, 124, -12, 110, 127,  61,  52, 125, -47,-128,  28,
                         -66,  19,  43, 122, -41,  71,-124, 123, -99, -10,  90, 108,-105, -26, 101, -91,
                         -76,-112, -35,  92,-122,   3, -10, -30, 117, -47,-115, 115, 116,  94, -90,  50,
                          61,  89, -47, -53, -42, -32,   8, -38,  -8,   6, -53, -26,  95, -95,  84,  74,
                         -90,  95, -69,  60, -67,   5,   4, 110, 124, 112,  18, -18,  38,  90, -50, -92,
                         118, -96, 118,  77,  87,  21, -98, -32,-114, 116,  -4, -40,  49,  17, -57,  94,
                          -9,  33,  76, -24,  29,-109, -27, -49,  19,  -4, -68, 113, -42, -28,  -8,  46,
                         -11, -25,  60, -85,  86, -59, 111,  82, -80,  21, 126, 119, -20, -14, -73,  69,
                         -59, -33,  16,  55, -51, -54, 110,  20, 107, -21,  54, -14, -99,  71,  90, -53,
                        -120,   8,-102, 101, -61, -41,  38, -33,-110, -18,  73,  -3,-128, 101,  47, 111,
                         -79,  91, -53,  87,  39, -50,  69,  -1, -37,  93, 127, 117, -25, -70, -33, 112,
                         -60,  57,  55,  56,   4, -91,  31, -25, -52,-119, -97,  72, 116,-104, -67, -30,
                          95,  95,-127, -35,  58,  83,   5,  19,  92, 123,  66,  59, -14, 124,  22,  74,
                         125, -90,-116, -42, 112,  49,  19, 119, -38, -32, -96,  -6,  97, -54,  44,   4,
                          -7,  23, -19,   7,  72,   7,  47, -94,  14, 101,-116,-122,  82,  56, 111,  16,
                          81,  17, -85, -45, -43,  55, -67, -56, -99, -44, 115,  25, 117,-105,   4, -60,
                         -83,-126, -20, -63,  73, -63,  23,  70, -79, -75, -71,   3, 112, -70,  23,  -3,
                          31,-119, -27,   6, -14,   3,  73,  -3, -39,  53, -22, -86, -15,-105, -72,  70,
                          42, -23, -63, -48, 103,-124,  55, -77,  45,-110, -57,  94,   6,  -6, -28, -19,
                        -120,  45,  77,-125,  -2,  28,-113, -43, -75,  93, -14, -69, -85,  78,-100, -50,
                          39, 110,  55, 119,-128,  82,-121, -91,  10,  74, 101,  64, -92, 109,   7, -14,
                         117,   3,  49,  68,  31, -64, 109, -29,  62,  86,  82, -49,-115, 103, -10,  93,
                         -35, -87,  -9,  95, -88, -50, -42,-118,  -7,-121, 105,-110,  47, -78,-125, 111,
                        -112, -39,  19,   5, -12,  42, -58,  14, -29,-110, 111, -68,  20,  70, -51,  23,
                        -120,  86, -83,  -6, -92, -81,  67, -92,  73,  18,-115, -98,  93,-127, -87, 119,
                         -55,  60, -54,  87,  12, -74, -24,  79,  -6,  56,  37, -99, -46, -29,  70, -33,
                         -23,  12, -68,-105, 111,   2,  61,-109, 114,  27,-115,  84,  58,  -8,   2, -82,
                         -46, 124, -78, -17, 109, -65, 121,  48,  58,  -8, -22,-121, -20,  -2, -75,  22,
                         -57,  16, -92, 118, -72,  60, -68, -87,-114,  34,  23, -57, -91,  45, 118,  90,
                         -92, -64,  56,  69,  14, 101,  25,  -5,  63, 115, -50, 121,-100,-104, -82, -88,
                         105,  45,  99, -85,  99,  31, -98, -32, -37,  99,  32, -71, -45,  24,-109, -36,
                          -8,  42,  25,  41,  92,  15,  88,-127,  10,  56,   1,   2, -80, -61, -69, -74,
                          29, -94, 100,  55,   4, 105,  69,  10,  58, -39,-118, -25, -52, -57,  71, -69,
                         -49,  14,  18,-101, -71, -53, -63,   6, 126,  72,  -3, -10,   9, -61,-112,  98,
                         -75,  30, -46, -14, 103,  88, -15, -78, -77, -54,  57,-107, -23, -27, 116,  -7,
                         -21,  51,  -8,  59,  -8, 118,  10,  47, -28,  50,-126, -69,  29, 120, -49,  39,
                           5, -48,  87, -21,  11,  -1, 113,  35, -17, -18,  -9, -63,  92,-110,  28,  45,
                          83,  43,  95,  -1, -29, -73, -92, -60, 104, -70, -20,  95, 118,  33, -66,  37,
                         102, 124, -83, -83, -95,  99,  36,  38, -68,  27, -47,  94, -88,-122,  37,  20,
                         -45, -77,  71,  85, -75, -55,  77, -52,-103,  15, -85,  58,  49, 105,-122,-119,
                          54, -80, 118,-121,-110, 116,  96,-127,-115,-122, -63, -60,  37,-115, -20,   6,
                         121,  46,-122, -32, -95,  22,  88, -95, -19,-104, -49, 104,-128, -61, -41,   2,
                          86,  -6,  75,  47, 119, -54, -62,-107,  -8,-108, -36, -84, 126,  71,  30, -74,
                          26,  35, -45, -14,  73, -94, -66, -59,  59,  75,   4,   6,  40,  29,   7, -50,
                         -86,  56,  -1, 104, -97,  58,  -4,  49,  54,  61,  77, -21,  50,  69,-109,  22,
                         -53, -44, -73, 115,  71,  68,  75, -88,  63,-110,  96, -47,   4, -38,   5, 104,
                         -99, -12, 108,  44,-116,  57,  17, 121, -90, -10, -47,  56,  22, 106,  40,  59,
                         104, -26, -56,-117, -89, -78,  89, -30,  25, -55, -29,  98,-128,  35, -54, 113,
                        -102, -49, 108,-115, 118,  13,  51, -85,  74,  58,-106, 104, -47, -92, -51,  33,
                          16,  15, -31, 105, 107,  92,   1,  86, -50,  66,-106,  11,  30,-121,   2, -94,
                        -108,  -1, -78,  35, -58, -48,-100, -68,  72,-109,-117,-126,  94, -11,  68,  38,
                         -90, -34,  77, -68,   6,  20, -80,  36, -58, -30,-110,  -8, -11, -28,  46, -27,
                         127, -37, -76,  -7,-100,  68,  30, -23, 106,  63, -92,  92,-114, -61,  75, -30,
                          82,-110,  32,   4, -30,-119, 127, -83,  76,  69, 123,  55,  45, -82, 120, -11,
                         -44, 119, -30,  25,  74, 115,  62, -34, -97,  95,-111, 119,-125,-123,  40, -64,
                          -2,  -8,  20, -67, -38,-106, -49, -95,  17, 120,  24, -55,-124, 115, -28, -60,
                          17,  83, -57, -87, -41,  34,  32, -87, 120, -72, -26,  21,  54, -74, -42, 105,
                         -38, 103, -64, 112, -64,  86, -17, -59, -86,  66,  42,   5, -52, -61, -74,  13,
                          55,  18, -28,  34, 126,  23,-110,  80, -85,   2, -58, -66, -13,  27,  75,-116,
                         -39, -66,  -6,  47, -40,  18, -33,  34,  13,  -1, -90,  48, 106,  90,  38,  62,
                          75,  77,  83, -95,  44,  38, -11, -26,-108, -53, 115, -97, -40,  94,-118,  27,
                          50, 125, -77,-103,  91,  -4, 116,  69,  24,   2, -18,  77, -39, -99, -75, -67,
                         -43, 107,-117, 112,   5,  23, -30, -22, -81, -27, 119,-119,  89, -17,-117,  97,
                         -33, -27, -92,-118, -10, -74, 110, -90,  10,-108, -82, -36,  37, 110, -51,  59,
                          99,-111, -49, -10, -33,  87, -71,   0,  31, 105,  43, -99, -65,  60,  35, -89,
                          33,  52,-105, -51,  72, -77,  57, 126,   8, 121,-123, 117, 113,  67, 115,  80,
                           7,-102,  33, -32, -59, 126,-122, 106,  42,  68, -42,  10, -92,  59, 105,  51,
                          -6, -33,  37, -88, 103,  89, 124,  22,-102,   9,-109, -21, 113,-100,  52,  57,
                         -43,  38, -57, -15, 117,-100, -31,  38, -69,  91, -66, -74, 120,  60,  96, -77,
                         -79, -14,  56, -20,  92,   3, -86,  34,  43, -37,-117, -28, -16, -68, -95, -27,
                         103, -70, -77,  63, -29,  94, -72,  74, -33,  59, -54, -10,   0,  18, -52, -40,
                          82, 107, -92,  74, -94, -57,  43, -56,-116,  -8,   5, -90,  76, -68, -15, -41,
                          89, -27, 105,-107, -76,   3,  41,  -3,  72,  88,-103,  18, -47,-121, 120,  36,
                          44, -77, -97,  -1, -85,  19, -24, -59, 113, -86,   4,  45, -11, -29, -87,-105,
                         -52,-126,  37, -60, -60,  26, -39, 119, -51, -36,  51, -87, -39,  40, 104,  93,
                          81,  34,   7,-106,  91,  22,  51,-102, -14, -49,   4,-125, -14,  93,  98,-107,
                         -25,   4,  97,  48, -96,  24, 114,-111, -24,  13, -76, -95, -41,  85, -91,  43,
                          25,-108,-103, 106,-117,  -6, 113, -99,  12, -57,  11, -86,  91,  51,   2, 104,
                          81, -47,   7, 105,  13, -71,  45, -93,  54,  57,-117, -42, -34, -85, -81, -86,
                         -97,  11, -92, -52,-121, -15,  -6, -58,  30, -27, 122, 103, -32,-102,  12,  61,
                         -71, -83, -25, -54, 127,  49,-100,  13,  -5,  53,  68,  61, -42, -70, -65,-116,
                          66, 104, -51,  21,-112,  13,  -4,  56, 108, 127, -87, -85,  64,-105, -39,  46,
                          79,  60,  51,  51, -94,  51,  14,  60,-100, 117, -27, -26,  -5,  11,  91,-107,
                          38,  42, -12, -42,  91, -20, 114, -65, -96,-125,-121,  82, -45, -27, -45, -12,
                          72,-120,  39,-116, -43, -65,  76, -55,  34, -92,  84, -41,  92, 120, -14, -58,
                         -79,  70,  80,  68,-111,  49, 127,  37,  68, -96, -54, 127,   1,  61,  22,  11,
                          93, -94,  38,-113, -86, -57,-120,  83, -66, -40,  93,  92,  93, -49,-124,-100,
                          14,  13,  75,  95,  77, -47,-103, -93,  73,  -3, 103, -25, -55, -38,   1,   0,
                          76,  77, -39, 111, 104, -96, -84, -96,  63,  86,  64,  63,  53, -51, 127,  13,
                         -83,  26, -65,  -8, -95,  42, 123, -80,-126,-124,  92, -23,  59,  99, -88,  15,
                          86, -70,  41,  68,-119,  69, 121, -17, -99, -37, -30, -27, 113,  97,  89, -25,
                         -63,  95,-110,-118,  17, -14, -71,  45,  42, -70,   5,-122,  -2,  14,  35,-106,
                         -65,  85,  41, -27,  60, 107,  25, -75, 114,-124,  17,  59, 111,  69,-101,  61,
                         -64,  51, -36,  19,  22, -20, 108,  64,  90,  37,-115, -42, -53,  41,  49,  43,
                          82, -93,  51, -75, -28,  96,  20,-110, 124,  57, 103,  -1, -28, -30,  90,  78,
                         -25, 121,   9,-105,-100, 119,  89,  37,-108,  72,  40, -29, -16, -32, -73, 106,
                         -38,  42, -32,  47,-105, -61, -54,  -4,  29, -79, -60, -10,  87,-118,  87,  62,
                         -76, -43, -80,-107,-124, -24, 120,  -9,  59,  42,  47, 103, -51,  97,  -3,-122,
                         -86, 116,-107, 104, -97,   0, -25,  -6, -37,  -1, 118,  64, -93,  -7,  56, 125,
                         106, -17,   8, -22,  35, -78, -34, -82,  24, 109,  75,  81,  90,  72, -71, -62,
                          22,  22, -49, -92,  -3, -89, 107,  70, -32, -72, 111,  10, 121,  50, -88, 119,
                        -112, -56,  50, -86, -63,  97,  73,-107, -41,  -8,  65,-108, -96,  93,  84, -38,
                          -8, -51, 104,  15, -31,-114,  73, 102, 122, -98,  48, -70, -36, -96,  60, 122,
                         114,  32, -54,  85,  27, 105, -24,  12,-121,  50,  25,  43,  59, -90, -15,  52,
                          44, -79,-128,  26,  51, -62, -89,-107,-100, -30,  76,-104, -93,-111, 119,  77,
                         -97, -24, 109, 106, -30, -72,  32, -51,  30, -59, -99,   9, -33, -64,  26, 111,
                          20, 103, -62,-123,  14,  73,  71, -48,  92,  -9, -95,   5,  -6,  -8,  71,  32,
                         105, -55,  50, -96,  58,  43,  90, -88, -13,  -7,-121,  16, -48,-108,  41, 114,
                          20, 118,  45,  39,  63, -73, -84,  -3, 115, -17, -87,  67, -31,-120, -48, -53,
                         104, -74,  49, 123,  60, -66,  31,-123,  66, -95, -61,   2, 104,  80, -55, -44,
                          23, -96, -88,-124, -54,-113,  -7,  -1, -64, 110,-119, -29, -85,  23, 106,  88,
                          -9,-110, -92,-109, 116, -98,  28, 116, -84,-118,-100, -25,-107, -73,  40, -78,
                           8,  79, -12,   4, 101, 119, -97,  94, -59,  42, -69,   1,-127,  86,  28, -15,
                         -75, -26,  66, -14,  99,   1, -64, -77, -76,-115, -47,  59,  88, -62, -73, 126,
                          90,  17, -50,  -2,  -4,  54,  87,  96,  40,  -5, 122,-114, -35, -41,   6,  32,
                           6, -94, -48,  34,  -2, -49,-111,   1,  67,  34, -48, -47,  71,-117,-118, -94,
                        -127,  38,  87,  53,  43,-114,   5, -85,  52, 122,  82,   5,  15, 102, 116,  67,
                        -112, -14,  16,  43,  45,  33,-126, -48,  36,-119,-102,  71,  11,-114, -69, -54,
                         119,  27,  16,  97, -57, -43, 119, -21,  86,  53, 105,  32, -68, -87,-110, -88,
                         -66,  39,-113, 104,  77,-124, -67, -38,-119,-124,  26,-121, -29,  53, 103, -12,
                          56, 119,  -5,  60,  86, 114,  34,-102, -96, 109, 122,  70,  89,  32,   8, -98,
                          64, -89, -17, 115, -81,  27, -48,  12,-124, -96, -30, -37,  32, -68,  26,  45,
                          70, 119, -71,  47,-110,  22,  75, -83,  73, 104,-110, -84, -76,  98, -30,  29,
                        -119, -15, -70,-116,  22,-121,  33,  -9,-113,  11, -96, -57, -89,  86, -48, -27,
                          37, -36, -82,  16, -23, -43,  72, -20,  42,  79, -11, 102, 108, -69,-106,  99,
                          80, -74, -44, -68,  61, -98,  19, -54,   5,  -1, -66, -28, 114, -74, -46, 126,
                         -32, -59,-120, -71,   0,   7, -60, -94,  67, -95, -47, -18, 116,  13,  15, -32,
                          16,  -7,  16, -41,  79,  -5,  77,  96, -90, -73,   3, -43,  15, -42,  33, 100,
                        -126, -96, -81,  12,  44, -10,  31, -90,  52,  51, -96, -12,-108,  10,  -3,-126,
                        -120,  69,-103, -80, 109,  85,   0,   2,  23,  -2,  25, 112,  31,  24,  51, -85,
                         -98,  32, 123, -39,  -9, 103, 120,  -6, -60, -65,  83, -79, -24, -71, -19,  61,
                          59, -12,  19, 121,  44, -85,  37,  91,  95,  63,  93,  36, -40, -75,  38, -92,
                         -56,  79,  57,-113, -95, -21, -36, -25,  94,   8, -70,  74,  95,  78, -41,  -6,
                         -16, 126, -65, -31,  20,  61,  18,-106, 108,  53,  91, -62,-124, 125, -52,  57,
                          26, -87,  90,   0,-100,  -3, -77,  -5,-113,-123, -80,  73
                    })
            .when()
                .request( "POST", "/pet/{petId}/uploadImage")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}/uploadImage", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}/uploadImage", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetIdUploadImage_PetIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "0")
            .when()
                .request( "POST", "/pet/{petId}/uploadImage")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}/uploadImage", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}/uploadImage", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetIdUploadImage_PetIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "4507442001414320795")
                .contentType( "application/octet-stream")
                .request().body( new byte[]{})
            .when()
                .request( "POST", "/pet/{petId}/uploadImage")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}/uploadImage", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}/uploadImage", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetIdUploadImage_PetIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "")
            .when()
                .request( "POST", "/pet/{petId}/uploadImage")
            .then()
                // petId.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}/uploadImage", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}/uploadImage", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetIdUploadImage_PetIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "")
            .when()
                .request( "POST", "/pet/{petId}/uploadImage")
            .then()
                // petId.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}/uploadImage", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}/uploadImage", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetIdUploadImage_BodyMediaType_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "-3669904833104230992")
                .contentType( "application/json")
                .request().body( "-215.5")
            .when()
                .request( "POST", "/pet/{petId}/uploadImage")
            .then()
                // Body.Media-Type=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}/uploadImage", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}/uploadImage", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postPetPetIdUploadImage_BodyApplicationOctetStreamType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "petId", "-1931047032727579586")
                .contentType( "application/octet-stream")
                .request().body( new byte[]{})
            .when()
                .request( "POST", "/pet/{petId}/uploadImage")
            .then()
                // Body.application-octet-stream.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/pet/{petId}/uploadImage", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/pet/{petId}/uploadImage", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getStoreInventory_AuthApi_keyDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .header( "api_key", tcasesApiKey())
            .when()
                .request( "GET", "/store/inventory")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/store/inventory", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/store/inventory", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getStoreInventory_AuthApi_keyDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
            .when()
                .request( "GET", "/store/inventory")
            .then()
                // Auth.api_key.Defined=No
                .statusCode( isUnauthorized())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/store/inventory", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/store/inventory", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{}")
            .when()
                .request( "POST", "/store/order")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertyCount_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":-2343654794217583898,\"quantity\":-278112864,\"id\":-3221485769416819149,\"shipDate\":\"2025-03-31T02:25:42.446+05:30\",\"complete\":true,\"status\":\"placed\",\"tqaqidtej\":-193.6,\"scdzkkrhfm\":-828.3}")
            .when()
                .request( "POST", "/store/order")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"id\":0}")
            .when()
                .request( "POST", "/store/order")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":0,\"quantity\":0,\"id\":3563200145816794136,\"shipDate\":\"2024-07-11T21:14:06.225+05:30\",\"complete\":false,\"status\":\"approved\",\"l\":150.7}")
            .when()
                .request( "POST", "/store/order")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesPetIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":3062680638054783924}")
            .when()
                .request( "POST", "/store/order")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesQuantityValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"quantity\":30414672,\"id\":-3423198542825039398,\"shipDate\":\"2024-11-10T06:38:01.033+05:30\",\"complete\":true,\"status\":\"delivered\",\"i\":\"B\",\"evlwsbaigsedgcpq\":764.0,\"yqj\":[\"\",\";\\\"\",\"RnT\"]}")
            .when()
                .request( "POST", "/store/order")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyMediaType_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "text/plain")
                .request().body( "true")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.Media-Type=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "null")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "-170")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":-4550290480015637012,\"id\":null}")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":-1101638758162281419,\"id\":true}")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesPetIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":null}")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Value.Properties.petId.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesPetIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":-615.5}")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Value.Properties.petId.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesQuantityType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"quantity\":null,\"petId\":-2588278286109164083}")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Value.Properties.quantity.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesQuantityType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"quantity\":true,\"petId\":-1289662142208790237}")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Value.Properties.quantity.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesShipDateType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":-3377475879117766987,\"shipDate\":null}")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Value.Properties.shipDate.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesShipDateType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":-3997470674515777895,\"shipDate\":{}}")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Value.Properties.shipDate.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesShipDateValueLength_Is_28() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":-3984233147098711371,\"shipDate\":\"2025-12-30T22:20:59.160+05:3\"}")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Value.Properties.shipDate.Value.Length=28
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesShipDateValueLength_Is_30() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":-3079725529925904366,\"shipDate\":\"2024-04-06T02:29:32.893+05:300\"}")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Value.Properties.shipDate.Value.Length=30
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesStatusType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":-3969451774622315126,\"status\":null}")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Value.Properties.status.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesStatusType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":-449419620693516449,\"status\":{\"cik\":true,\"hgsojk\":[],\"che\":\"=X@liM4\"}}")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Value.Properties.status.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesStatusValue_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":-341720034730418454,\"status\":\"w)-c:vGT<M#KbMJ6`u12Y}KBOb[PQiRtgulqav$vfEtEr'!LG$=]']eUH.L:!P~*D'V_$>k/k&}yAJ19j05~$@Q\\\\#oR[+'YSp`rx^5B[,QlNnoOJXwvlv:WtOG$Q0Cyjm=Z>cYGhN:iL7z{7NADHc*@\\\"^4;,Arp<mgB6H>^:W_=Y-lAr-Zu)U:wH}r8$N#xyu>+16v=\"}")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Value.Properties.status.Value=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesCompleteType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":-4230040471271966559,\"complete\":null}")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Value.Properties.complete.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postStoreOrder_BodyApplicationJsonValuePropertiesCompleteType_Is_NotBoolean() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"petId\":-2043899279849530393,\"complete\":372.3}")
            .when()
                .request( "POST", "/store/order")
            .then()
                // Body.application-json.Value.Properties.complete.Type=Not boolean
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/store/order", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/store/order", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deleteStoreOrderOrderId_OrderIdDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "orderId", "1")
            .when()
                .request( "DELETE", "/store/order/{orderId}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/store/order/{orderId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/store/order/{orderId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deleteStoreOrderOrderId_OrderIdValue_Is_Gt_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "orderId", "2911347263112426741")
            .when()
                .request( "DELETE", "/store/order/{orderId}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/store/order/{orderId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/store/order/{orderId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deleteStoreOrderOrderId_OrderIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "orderId", "")
            .when()
                .request( "DELETE", "/store/order/{orderId}")
            .then()
                // orderId.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/store/order/{orderId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/store/order/{orderId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deleteStoreOrderOrderId_OrderIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "orderId", "true")
            .when()
                .request( "DELETE", "/store/order/{orderId}")
            .then()
                // orderId.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/store/order/{orderId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/store/order/{orderId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deleteStoreOrderOrderId_OrderIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "orderId", "0")
            .when()
                .request( "DELETE", "/store/order/{orderId}")
            .then()
                // orderId.Value.Is=0
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/store/order/{orderId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/store/order/{orderId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getStoreOrderOrderId_OrderIdDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "orderId", "1")
            .when()
                .request( "GET", "/store/order/{orderId}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/store/order/{orderId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/store/order/{orderId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getStoreOrderOrderId_OrderIdValue_Is_10() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "orderId", "10")
            .when()
                .request( "GET", "/store/order/{orderId}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/store/order/{orderId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/store/order/{orderId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getStoreOrderOrderId_OrderIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "orderId", "")
            .when()
                .request( "GET", "/store/order/{orderId}")
            .then()
                // orderId.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/store/order/{orderId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/store/order/{orderId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getStoreOrderOrderId_OrderIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "orderId", "^pH")
            .when()
                .request( "GET", "/store/order/{orderId}")
            .then()
                // orderId.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/store/order/{orderId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/store/order/{orderId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getStoreOrderOrderId_OrderIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "orderId", "0")
            .when()
                .request( "GET", "/store/order/{orderId}")
            .then()
                // orderId.Value.Is=0
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/store/order/{orderId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/store/order/{orderId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getStoreOrderOrderId_OrderIdValue_Is_11() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "orderId", "11")
            .when()
                .request( "GET", "/store/order/{orderId}")
            .then()
                // orderId.Value.Is=11
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/store/order/{orderId}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/store/order/{orderId}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{}")
            .when()
                .request( "POST", "/user")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertyCount_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"3>+#v*GI&%Emk=[i|d^C[dG89WGb'On~9Jo{=f\\\"_C0r&:W5[5I948WS,Jn+,(RK,d.(CY XOEYRrhaX^ it 1+|PpX!KtSW}I?45<j3WI<aZt[JTUC}h9Yay=y3T:4d\\\\=W@&>uOb[dLt4B#C\\\"I_oRR<^:A#Y6(,T+WS5fFLg!#4F'sTqZVY<Q?P=f%KI<.jwD>]2axkhz63;AZb;PH1d5sv>\\\"<VPGVD{svgy7xmlHdj .w|F->LhBZ\",\"lastName\":\"mTQckqHl9s.,$tgsYwK~`x*1k8z}cI>.GI(9Wp;N%It!A}`KDzomGOZN4%$>sbU9;+=Ao.6+`!.m.D#^2-&wY&GodRrc/5p}=dv3YFNWsCm#\\\\TzJQ6,aFU vBPsD:|=9AA_22ADr2f/jIG38A?W~4tBDh\\\"C}<I?RaNcd0dDJ6A.$/'y>T6Q=?F6`TZqVb}N3_~lp/DiPD\\\"F<b(GCz2_DT/%/DTpek<PE0:<[Ir ]qBz{xI\",\"password\":\"0)5]E|rara-\\\":aPT2o(4-RwLh>pNKOLh:?A.`b3q>N=)IdlZhTStL>$ia:Rrj~(reF5OhspMAcb#w3Ey@1kh-A[]dOp]l|9us$W\",\"userStatus\":-172829569,\"phone\":\"P'lX6>Yzc}o&*`cMS!P[Wb#'^]}.d@@s]x5=rmj7xb\\\\D7;Vn/U3B8r~K<=Q*Z,/RB& l}$3OW_Q]2R.0>0f]ygU(8,,CFvop{%mvx\\\\XH@T|+%9Vo@02 <4J7oe^Uwb\\\".;<oFB@~d[8!)%sne&F?QZso[m8/OX@TF*fv?zb7uIKpYv0rQqwsGMZJCCw\\\\=6zLY=kN?8`A1}'I.3X'>Nf}:*9b_B)masXH1^\",\"id\":-479896404127520510,\"email\":\"+#bvHm^!>0q5y~fg(rB|WBo%I4vH(Ip\\\"$?J.LT\\\"^;EhigaX:fj-m6oeyNXr[R;g:q4bq\",\"username\":\"l4OL\\\"~mYA&1sOf@hv'MIQ&cQd\\\\tzIpH7'=%,_6H2L3_*>w@bz=Z?5oI}e\\\"\\\"?<p>\\\"3BD;NWHXn>;nm*~q4'm\\\\[xa/,[f.W<NB`,aB`AUkegM>yr-`AFUs6<~Idy]i1fs4x$NUcm_RqB3p$u>aS-v/^&g>\",\"ckoplfzsd\":-498,\"y\":536}")
            .when()
                .request( "POST", "/user")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"id\":0}")
            .when()
                .request( "POST", "/user")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":2555142907226630501,\"email\":\"\",\"username\":\"\",\"fvzkyteug\":[\"x,s\",\"gbi<W\",\"_*/_?\\\"\"],\"bqfrrd\":919,\"fu\":true}")
            .when()
                .request( "POST", "/user")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesUserStatusValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"userStatus\":900824443}")
            .when()
                .request( "POST", "/user")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
            .when()
                .request( "POST", "/user")
            .then()
                // Body.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyMediaType_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/x-www-form-urlencoded")
                .formParam( "string", "]HeW")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.Media-Type=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "null")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[\"VsX+'TN#\",\"U)3LE\",\"JHHq7oV\"]")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"WVHLBv.*ECy8(md,u{w?72H\\\\wMBbpebn;(<>Z(}#s9}|RLM\",\"lastName\":\"j_Xq~.Nu)\\\\U&]}?z=Z}sZT,<M0%6WJIMXbkA(T-IS%`mW?<^c9zCI@tD.rT @AL,;9\\\"Ya@7W3JApiXjD'cHF VH_ozt)_t!CwWsKM&:X1.5p+-fe eVu#) 6X)3w'e/Vs(a|LFQ \\\"H~f<!a=@}s33,HzGe:gAjQhr$:!6AX@&\",\"password\":\"<exNFcJDk/{T95o&]#9ctf=2h\\\"80:nd}[xT(kd'ze7]5D zz\",\"phone\":\"dW\\\\uFFb3~gH;@g|ak~,c:xp.^B+XA@yZ;o+9?U>Gp<GOn._F-]j\\\",Q(4BlMNMUXgjlJ0wcbi$/I5TJb{ew[N`|b4YFN}B52Ah\\\"\\\"yVa[oIGHixHWE[}Z$y\\\\~m]\\\"/kMy^J*1)>R[}JPhQ'A(Kc.,`rdNb/Py)%Hnh#c+g`nF?4c)ob4AC\\\"Xo^hP88IlNe[`Rue6 .vT6+X7_A\",\"id\":null,\"email\":\"<tBN9Lz@xQRR@9ub%;e}QyzGp5dR\\\";t~<TnC]BHTs/951W zL9WJ&+xR]m}H~r>iQ\\\"USqrv/'@H8\",\"username\":\"E6}5du<C~)21XXwY#^@o4J=rTG9GS]/T/F\",\"dqwfhlof\":true,\"dzulspdkqx\":809,\"glz\":\"EzE\"}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\" *WKM(OiWOpP_r%Psj.PuWo-lN]aX^88,9KyKY! cjl>*vp.:<1_,9=:/^ynp0-.QD>H&:W]Jp,e&VHzY:;g\",\"lastName\":\"Cq`H5G]QMZ78ra%Y_3&p4-v}{qNr1]7CH:*2n,?~J\\\"4`Z|{>>YIrY^X5Hk<7\\\"LonQ^6.ITp:h,&7sXovS0H*o0eGdn# P^cf[G'-4wmb95@|*eYw&<=\\\"n_1\\\"\\\"RN6DmBBgKxY;#l=gn9cElo/ZrIcpbe+R6/`v]Q\\\\=B Iay3pt[&v}=(\\\\nK|9z3KJVRR2-]zS'qCje:^~l~|7&V8eA?!WKYBZ_<=LQImJf{x\\\\zT!!syJf,'T~K=1foj,`]d'=\",\"password\":\"!qQpUR1E&]GyX5YT=hkCL5)\\\\*Hc$Zm8b\",\"phone\":\"o@-u~ ?NRBor9s->6vLV;US?4vP!3PQ|:^`=XtITq%<qwGZ)M}1I@sltSZ@eE[r\\\\)u3X-iB&iVAUo~e)?eU)-|cVKr<?i1KWUC($Y)rz;o!&l_;$9-cd*/;sAy):83\\\\JD,i3P;,))S,.g'%e8?}L0q)!C2m,Bu)or!e[[jrh>4.H_00'+Qc$<gEuMAE/*\\\\&PBrs|_xEuX\",\"id\":true,\"email\":\"w:|q7uay:uV?92R;r;h2&j}V(|h\\\\&tr8n!O@r2'`018DqB'E'{9V*48s{TI:OF?'6Rv2P@U//:|tGD0ay)M'@i!`)u]:\",\"username\":\"_>`oem~.K)\\\\%\\\"F~xV\\\"W7OY@cYF [,M$+Nyc76\\\\$yYVtZyVH`#sjmw75B$3{k1\\\\}{r-_x.As}D i6lVyF9ckD;by>s_'5u`@,?K]6[:Q7)1)@!59L|t.BQFPH]J?UNxXvbo$@HuTj%Q[W'~%-{(!}s#6_NaLovB7lL=' W.\\\"mYI\\\\l\",\"omoineyzslh\":{},\"chvrfu\":-541}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesUsernameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"Z1)4v3 SU6uFimo</F!f,7-v1,bM^aM~%~Y;P?}T|\\\\._o?'`R9D(g|&+,&%l[<Kh$Dx+aco-Rs\\\\}IRXiIFwd?v<uOB1'1feZ\\\\M6?cI=|%FJ<}Nu[`m$7`9P=!.(*R7n^MM$uB.}6hO}z[R,h\\\"UbPHhsXHH5^k00\\\\yJJ6f35h)rkBtV>ZyM(2!`~-:+2J0_ZHEn#~bOw4)r*RJa@y%FHaJ.5YY06j~,r0YlS#6z8hTI$=+KVR\\\\cQ{F,nD6\",\"lastName\":\"G^\\\\Lt^JUw$kr*!+bvM+&(&2f'm5T;NyWZCtNHCj6E38|:>fCD]Tgs9ST?\\\",M]CWy6\",\"password\":\"_m~j9Sdb|7`GmS%c'*K5=5!g`3$1e@tP9\\\"YC_bD5PA.E^RSHty@!n\\\"Z8}55M;W>91BVn%PQ,A!G\\\"u&{Gq\\\\5;T_GLAW et<q>/Kzz9q#|D)<HrK\",\"phone\":\"=|F`HaQ:{t^7?y<nW&|OteKi>9:Y\\\"(2+1xch\\\\J2Tr9Z54d>>+${hq* 1|ZZx{wIMD}t@JZc\\\\1N,l\\\"~2LP)>6F<L]{4oxax!`U#ul,V.Z)oi,uTDOl8l+!\\\\v>6jA+\\\"f>Kr\\\"\\\"tma2c>$o^t\\\\.Vc95D:5EkIr\\\"]SLR?aHrs;,_Ju9\\\\2n}|Hb[>XLFD:dJaW5W~u?zC`Q9/2xUD\\\"{eD]@4]YVD>J*\",\"id\":-779956073718693691,\"email\":\"KTp<Hg$Xo%xtO M,.$It38-Xz%Xw(?00Yf]b|J<ZqWOAhD9HLuO_Y&`G*%gFhZHtI(MdIl_^?*T{:VH*W 7,<pYXDu'GIdh-E1urA6^G8AqU5Nm.`-\\\\@5Aqeb7KlLXP>yw;(mz*^2U3q5SRX\\\"vYOTkB1\\\"GRPR>j::eB2{t1isTDCfr)Cw\",\"username\":null,\"pnv\":-425.8,\"v\":\"#z\",\"op\":true}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.username.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesUsernameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"a;/Ez`=O5{DkQx*\\\\5/UO1EN,3,KKG*Fah8Q8}S0}s2Z<|eGu}Tlg',CZUyd~eeD^;[*>V}M\\\"y^Y1NS.Il/gp/kM0uYIQXg;f0~:yvVRV!cR\\\\R/\\\\AQ:?(RVa{YDzSnJ\",\"lastName\":\"{,.JH@:Q{Q72M'3zvT^XtO]*rcA{,Y6/6t\",\"password\":\"L\\\\/*}-1Kj='F)#zyyb&5U84D_@Hp0=VsCxc>@'~$;Nv!EVP<<\",\"phone\":\",/}h@Ta,h]z}U\\\\!1g#$a(O$HxYbBY)~Ay|ZEiol<Y}/~Gm& a=U,^I+e#%XtX<l8>(&[e4I/uShE0Vo9YIV<Iv.MU%D|[%TEt8(eo-c6dnH@&}]f{.w2m4Cf$O;%,+lM>g1+?3U;?^5W,ok|k?0z[8Xt,b5/aS:QSK&!IK;t4U`5Vx&\",\"id\":-509285747253622296,\"email\":\"GzY\\\\A4R=pyCq;fiEw&Lo*)TTU;}K131m)uB0YP>4A~)fx>i|E0%y2T)N8P;KG`v+}LC7(hs{1P\",\"username\":[\".n{QV G\"],\"hmxagha\":[\"\"]}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.username.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesFirstNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":null,\"lastName\":\"2#LyxF0j.&blXk}=hIGTU4LEyJQ@+I8C|!@}[\\\"d7*.'@ +|Aw2QKUG0DhpD>]!oN\\\\^ N9WVm_GL_El{|/#)M3.V{6B9 >_q?5\",\"password\":\"8;no`OQog_%BcB/orr`J|SG[PS]eP9IqC`%DA=- 5\\\\t_\\\"O^FxMx$)I?Buj_i,eZqFFK9aoZbh`{lbvGY+P9Y(4Wz'bc\",\"phone\":\"&1{C=UYm]I-4*hr|!&\\\"\\\"]Aj0Ee$Rpw[c/Y;C0cCKuPu}8~$90n%s7^W>sflx{HefKyz?l\\\\<y]_nsOB$B0I/>W|u%]+q:)TTfISTt5Mv6~hv$vZw7BeQ?y(uaE|lfkQ:.a`NG2LEfC\\\"d+E}.&oN3tC#TP7=uO-yic{/Jr#.#]F##+r_$J=NvF;;&4)FV\",\"id\":-856364320649047819,\"email\":\"G2V#p^Q\\\"x/*M\\\"qLAcL^@T{/$9FhlNV\\\\0YvE8z$cf^*)1EbhA})M/>DosmS=1<<N&y*!E(\\\"2k*@V`t.buZ[a9XAtY62,aL'mT*l_We+ a;D+07`\\\"/&=E}'>kDdbR&0#D!TN+@:c'ZH;$o(6!%Is$H/:y&o'~F5=fz\\\\WQQ{tT\\\\j:}jE9o4>pWaC]\",\"username\":\"q~@UalfggeK-AR7<>n_i/u;D@Q$i8pjr)j(@xUL4mv=lMc%JtOy^x&kO&mpez*[vG(U&#A(.YAau!p>+\\\"9mc{7!u-]_ies%a $qN7;bM}=qCv$1*eQ7U]jw/ak.,I(B*=pW5FPm\\\"K$PJzZC%:*~Si}tZCkK(-uD}eGw'qGn]~9ej9~y*0Q]~\",\"tjebqbre\":true}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.firstName.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesFirstNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":[\"{ #;JP4\",\"4qTvs@r\"],\"lastName\":\"7jxq:wa:3bpD*j`{5XfNfoS&NxU3Bbw7fMt5b9vfNo|vO-0'w'{=@glMYBPWKYPdg=,o1kasZun{q*24 w])k8Cqq5eBm+fr|xiL6%#Q-x,lY)LT,iv)3U7'{a+|a_(\\\\; MshtReylZK#>v\\\"N@-\",\"password\":\"Uf/pzKvCkW^,PKFK3A\\\\#BJ&wBg7Q<EX&[90Rzi2MfslP?l`j_;f_(:F<e;i4LVbdm9qs]f|\",\"phone\":\"0*$/Hs?W%I7\\\\&[<;yH?N\\\\Y>)mU2\",\"id\":-16779229224488889,\"email\":\"gyV:!^blX3/x=e_ddGO/i{S24vo1##G\",\"username\":\"NqT!5)>.Ygy8]e,8Eu{9DwnC](y)(bedVN*Wx>:f`5dt|.ufh1s|Z\\\"&?B{h&uo2Pr,09 >\\\\Az=F&]A~O4&|%>T+tP.=kcdh&WW+fgY5jAokEo0*>^Of'oW{Ry!GF!6YBXR^Mpb$Q')kdo#)b/zQ/YqhrHM$uM-z|Q:]H h,Ad|xY(Psw=Q)%~s5mS:6/mHZh!e@X{42G?aL\\\"'(}_\\\\U0b)$K &(|pyt[!zhI'8T`JOLv!5n7>6&'k>\",\"edvfmamrhxcrim\":true,\"zsjgxsrgx\":{\"cr\":-950},\"qqfzvnjwheo\":true}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.firstName.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesLastNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"lastName\":null,\"firstName\":\"'G$IYXu1d=%f{?wF7zFH=8O(;3M:Emo8X^WP0uJq2CjC:~rKBQmRtd^U#,zzxBvXZleEZ=$-K rE{A2@\\\\QF$.uBtJ5yXIxZMlXmbO9b^`\\\\VB<C9\\\\~H:M)fux!ihJ1s6A}VsIg;f'X*]`LGWwzqz>0KBI#;~ZP$U5sW-QnWH(YpY6@4zXk>417_U<s}+(71O;n<WJ0Z4%>J3r\\\"E45nmi,$)6FP RCfSlww{%]moOxQo{l`;+|~).I6<<<\",\"password\":\"LmK'X\\\"<T&BeQ.lHLY|HP=l@h(;=vkU0p2Klo$D?}Gv0mm9`x?`XnIG'JulddILgA'0.-ml:}lX(Qy#E>U,#1P-RlqMq1'?TD0Gk\",\"phone\":\"44cF;ilQJ_)R7.$yUf}u'`(&XA+Q^FT}Ie)}4jilWBx/ijfJh,ED@{s`xM@V5\\\\#k\\\"}g9Ll\\\\Y Nh+}p4u^bE~<E',dr{=W\\\\oRNiLMkP9$9bl\\\\DbK*yXNU!S1k+&DS4Cf{/ODA+n`\",\"id\":-2394215872753546321,\"email\":\"5+)362JkH$sZ-R[0,>2r6&4\",\"username\":\"YP1'jQRWdhtpOq]\\\"!9e\\\\i6Z6sB_7ljl02:~:>Cwzs?/qpHZMvVSi }q}OQoPK12*W\\\"Y!C\",\"xrnjfkqrelfwmc\":\"gy\",\"yqrgfezulpdzvz\":true,\"seth\":227}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.lastName.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesLastNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"lastName\":973.8,\"firstName\":\"X8fYbF_iU)^ C5z3w0zKFMgUF|LxNGum[/;a'YbpL_.$>V|/QHBt(sG!()>c:\\\\U&tf~nSE@qe*\\\"bdiG\\\"n\\\"kiY$b^$//z*rlpRrLIV6VmoZ7`#,PvkT j%|pWi_fknLxmD'\\\"E%M8[l[sPeu>oY\\\"J\\\";RTI_qpFgApFl=R[IjB.)~W*|f6('BL,:yEa}wI`Ib>QE/yCE|gIKukO:u4\",\"password\":\"q+Q8={iX/E>buUM(7Z`$/\\\\of qhlOd3rM733,.D(_dc(+%yb*;_2MfnB3T{~)o{zHMVFgreyzx{1Ue%=v(Bj3=\\\\o&>F2=#G/4WA$BVpxlOw0%AP <`>PJ\",\"phone\":\"lA6xLcPT^>*;-u%W[Ky,Dv%yAh\\\\&f\\\\<v^h3~>:(z[11#eP8>Bz|'>\",\"id\":-329127987108170459,\"email\":\"9?o\\\"_eV_c%_3?]-d*I{KHt;19hg.$<aH;~_r}{KC=}z^Ul'=jI5UGeT>`0f?@O[{nY$b5=Mc=L+|Nk>_4zVr~/iR]C$uAFo6tE^>.?Z\",\"username\":\"C+k6{:*Y-P5*4]),)mRM_/05w0`X*qGrx?J|0P$SqY0b} mY5dBPq*35_0]0$)<buf~km{ouCc\\\"3q(G6dX]:A[iU`7]!Zwv*)0Q9H]vq|*,/.cwv~,lwsvE'tzV\\\"V\",\"j\":975.3,\"taxiouldmbmb\":true}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.lastName.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesEmailType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"]d1_G'kg[mZ\\\\i~x1sC$V^;uuO0ccwZ+.M0,O_dY4t8-H,Qf~'TLM)Aqz2,3u9hv\",\"lastName\":\"ij:7;g@:6\\\"ds#<(ve~Jc]<j^8kmdh,Y~h>s/|4EMIRLXx&zG8=!<W7`odsnoAi;$si)\\\"$~KG1E~LMMeG/X7}knYG;?tD!uTQ!*\\\"s;5n\\\"^5GQo?yf;4]}aGWwB/bvD@*1E?MwVHi*u<b}-Y)`f^Y}TC#Sy2crBY,-QVr&.Xfbv@Iqm#aI2$<oBAp!94qIi(jFf\",\"password\":\"!?es@b2.V6CIh7%g9tDvyO]R2\\\"R2G2a0Z<:G6;0OlD(i7|cqf&mkNn2Pt##T/W^bl+ebe`A[wYjvqtwBM-=ee3,`nG,kwDHlY[~}HYzC_a|{|\\\"9A;+fsBr_gW4<d|#@5:6@7O.GX[3kRt~O:GkijI@4;,.7(litUEZ}DxDB+dSDO(!$^-6E\",\"phone\":\"(wr8w8vcm 2;3@gh]1a`VZ&S/^j,Wb\\\\!P8a,X9is}\\\\:+K8?{0 ZG[3\\\"E6_L$_-2:lP$,,<VWBo<@Ir>0_kC}$C_gATI2~Im29\\\\akQ.Guut7,eN G;jS4C3LxW7P:A05+Jz\\\"S/p6ld~pU#1t\\\\W\\\\{#zRi0OR_ApyJfI&z#R8[h|V\\\"#n^#cu3]B02oaxT }UNW*3'/2E2w<}M2Fh&|t=a!uRD]Cn\\\"SQ+\\\"5-#*h{s.\\\"L~`Ls4Q]ebe*$<7F5D_?\",\"id\":-2713351756752297001,\"email\":null,\"username\":\"2s+z>%XR#JBYRAZKe-=E.k.Y[TD.K\",\"iyvaryuiflgaovyv\":{\"hiaagbt\":[\"-O'\"]},\"nimxwewvz\":\"oW.fHQ\",\"srtptgfqthtpvsk\":[\"`2$@\",\"*PK~y=\",\"{P\"]}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.email.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesEmailType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"f9bsCr}iTZ%w#Q>2b6;6?;S#xf/^:JX,o^d@ KH d<-9':$va, ex_U.S<>0?m&@ovKnVpg9rjttSri`9iTOAyK4XFfJ>HadpOqRNAW 1TC.W3>@( 5Ii?<r9fFh\\\\|V%>n/b6A1Wt*v*\\\\|W/De}kx40reGLd4&p|p.iBjM<Kb@$Tr\\\"Y)?utAzY~L'%I^s?\\\\?Hu6xf%K8:<MOT(b7rq@ywV]>pzx*3QW8(p8U7S;QXbyRv,\\\\\",\"lastName\":\"YKxjgVdUOq5~K\\\"B?Qmt)IE$//`laS(x{)\\\";xZJVgu[9k6\\\\u;[683 RIQ8Hd$J(;eOUPhlVwzIdF`|RIh90wk*RVH*3/lmE|jRGCG+dhOoQ[QJCOmt;bb9@/]]wTD0\\\\BgGA=>bgt#F<qY)u]<K<wWadj;k?lhCAJrV;>pH?m:733[wNv!!.=<s3Qb*\",\"password\":\"8f~ZZ/9y5XZ?(n!rR1bA=rf ?<8dhH]l_\\\\UP7NcY?EC<$%=#,RYD&Ve`!N*m)BT&A !XboCc-QGe0bngH{3}OZ{|BB|XN9qfaL@M!X`@=]3{fdz\\\\#7TF X9W01n1Z8o,~l(6~*ra3FnEuuJW^x({fg=jMiy`RqW!!,;y2}>V\",\"phone\":\"%!:FP<qJLK\\\"*4g\\\\JBY4:u9\\\"C%82&tuT#<#CSv`32KzY~z3|ihJ{!gT~{UK]{0%D(!f]d*8ZrM5o&wW7VuV9})^J(1r<dSW'\\\\}=X>B>69*:,a\\\\ [{G=;#<\",\"id\":-678116203365637494,\"email\":-207.3,\"username\":\"_-A8ln9k1VYL_f))gkA4mkv+$R.J):Zp0@`yze6vGu\\\\`i0043t;`@daXoutCEg\\\\W/o^dIEpxW wt^Ai5\\\\<ae%F6pybyd_r&,[k+[=uU!cac~!kQ:OJ#/5gxCw'y<z&F--0G&r^QC/}F8D,!u0qh_x.\\\\\\\\XjSFe[,Nio.VT=4vReW&Y38U{v`0E5lKe)8|@C_s\\\\/GP:dDvP_\\\"nES+(gDP\",\"kkglt\":767.4,\"lpyqdiagpsv\":true,\"zuterqqjysnrmk\":[\"Va\\\\\",\"uO\"]}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.email.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesPasswordType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"TWi:3<aw/u@6QN6b-\",\"lastName\":\"o}f -?.R !xI?(JHW{cmEF[84S{c<&2^kDrl/$Q#[E>T|lJ2eNJbp<DTv1<f8_nNXPHu?#p>tL?N6Tvy~;&x{Xiva48lL[f`-to}Q 1b2s_gh{3yl5?UU~B\\\\QC{N1rH^}bEy3Sc.drsP{BgWN.S.VC cs(L<4em\\\\$e]<-(*|5ll}6DJZLU;Aw}MC##A/5(,_<2B;:mt+<,|r2fWvG1e}\\\\%@rAbU?{y C-;zP&LxIM'&ik9'$WPqlZS'Ua\",\"password\":null,\"phone\":\"HY-WXzi>b[Z%t'ag=z$<DXz@e?kx]jB{1~a?%pxrKBARi5g/wo.NN;nHKGa4 ;G|LP\\\"c,)r9)\\\\o=\\\\L&EDtHJdljo#;PAT=@H2G}Du_e=Qrct33O -=YH^CCY3[lE??)=Oc|Lk \\\"6@S}~[k:>W# Qj19% f:*bCiDC-D9bGM]uwF.;r8zoV!a-[q>=[NiH-:[x2Pq3N5:T%0g[}*Sv01o zWn3g]|(O\",\"id\":-4557399372583984839,\"email\":\"jZ%@a0)ipb>&~r80h=6K2L\\\\;1#ZKlz7Hu^p}dRcRCrO%=IjcEL>\\\\FQuZF~;dzWZb\\\"gN{('!rV%*!,M2i42WPuH-r%,UT\\\\l)2;m'\\\"M bGh~~CC,&\\\"|w\\\"m9yi0m/Iho#]oYfn%Sk`6h(w}e8D&G*[`!X7f'6=%ITD9MJSU&b\\\"Mri2}GI+Yd'AY}.UWYT`Bf91Np!{<ozc\\\\C;S>~_A( 83cjQE{2h4\",\"username\":\"]a~6J?Xyz-.Cy@DzkLcm-}sdM!N\\\\3D&H:_ l7mz;Wa8zAPZ?\\\\v'H77G,`Gs1+(\",\"j\":true,\"ydwfszhnqaj\":\"\",\"pgmd\":\"{lO&\\\"x6\"}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.password.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesPasswordType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"#1U\\\"zL~Bz*mn-g/$^;cJRG_ckLnHOc!liR[MXbQw#?7A=Of'm97[ynxLITQ/Ojk:UTHTM; VWuu-r`5aD[+*xt%fkw$c>6;|&uxW?K9T>bfzym,.ZF_jmRY5K# d1!xic9 IA60Pn,$S/3sCz<q=Gt~vF92B]8h;IU`Rh:$GRs-9U&zjIn!M)J2dD#-: GuN)a|z_*-ICS. di'8kX]NI=jgYZ@qC@<7z' 7oXTo;7*#-@xe9oU\",\"lastName\":\"5S{Rv]|4hC'R\\\\gQ=7u].2CGAb\",\"password\":[\"\"],\"phone\":\"n NygmyIg~<)G?19)wpATa$i8<6(^)F#/)G L9zLJ'oufDDz-U\\\"{|WDpt'k[]S!O^1[8og1'.YO!&GyX[NW39KU[U*)wMLGX`ULv2B7~gks.<ap\\\"cf(dI+I>dE=r\\\\ m{i?J<yVii5fG5H91H.c&5j4`kXB~```KD`6;i1RViMDCf-os\\\"9=f7f< Zzuz~,Ui>ft;:o*}3fvpuicl1R0i{{k\",\"id\":-2271483480611398427,\"email\":\"_t*YGF!kxVI@Cdsm]WV`B.faQ#YjkO7}giP,%B2@TX#|_}'tF&?*@\\\\UW?lu{O%%|No?XAkH|qc)h=W=SY.\\\"M|?`hx;Zhi4>vdKwZZ `dnoE`~m!pW8U3|5GDr]gKM%s%'jf=--{v~:H%Q8$.guEm%8&,I+`rH/P(un&\",\"username\":\":u!CYJ%kF!IM%bs^^8eKCcMdF%4q|^4|{.\\\"8`(Glk1ap)0K{HLSa!8kb%nU,.zF!ZOHjC3HM?i;G_OzJda)W\\\"U^G@r4YNd;'p\",\"wcpdnbwudntj\":953.3}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.password.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesPhoneType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"j55s@5Hm[E\",\"lastName\":\"$sqd:l&]\\\"Nx--;-8gOG_%K)g1-lFe4['$3dmdN-m2M&Iv$U69#cf62S`7@S.Bn\\\\oKMyxGul$_*!nI:LTBl5@%v~^:U6/<?3Qn.?/r7*{`)SnoW7vLoy\\\"/u8@REx'pyQL'N%in|L1T45m=i,~@8%$B,0 JWNEm#5PE?o(Eyt?*1{g#AV+0+C#.T@*OX.\\\\24#;ED@PE&_psjXU'Q}!rO:c[Ugu&+s29-Bd<C(#U7$%)z\",\"password\":\"B48(2n,Bv$`}JYcZ<uaV}5az?.rz9@)$=bfrbr>0Z&Bw~{V.9p]\\\"<]zc! C.1@G.Vn|xct^g7~d`l7&4HDu}K*#$EP^=}M*Scik6}McI0^n)+I*}L!C6~d$,w^P<.n~<2ty}N>_0-4^Mep.kC['H/-jPP$QadM}~IGf*q\\\\}B<hTnd6[F{=|7kG*snDFA)]]#wdH-v)`&waUTbZ,Gz#8TK+^LX3h9o v}_jX!485dZv0@0,d$Eo0sqBm3\",\"phone\":null,\"id\":-1118287158150417399,\"email\":\"6P^n~'I}s>(]F]ero`+o?~f0%JHnKxPM:dY;6}SArQ*#DAw)'bN\\\"eWN TCgxvbf#P/c1f~1z xvw=] 44TLhkLfhI\\\\z&I3rYkl!yk:hg*/_Jl\",\"username\":\"\\\"fc#;WG!(r?'&HNMX1)=u'|=#ReVXc?;PAZ,M`J5lHrGZHK39y67.tp@|a*Z=u#tca ''iD1''C`?hI8ac]t:s,mfe{7nHB}:Me&H0`j-;^DBc'>UgFV\\\\xS4S\\\\s8g%m$-V_vd<>K\\\"A?a>]g7OtGYWc.62yvF#mSTkPJEPRWflj@ Ucgb[6WvX|E3'T||q-%O\",\"znkedfllbmoug\":true,\"rort\":\"c\"}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.phone.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesPhoneType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"C`m.Zhd/(?w:vegoIxOG<cFbZ1$S2Kh^]`c>&Ia])Z04KbTD@fv[!7O48JT`?(uE*ZNB2s\\\"\\\"<ABPlX_',@@`&R|+*00Xl3\\\"IvFE;Q<wG8M`Ff_j 3k8zmBcx:3tt!M~2*=%/vnc<,y!+Xow~(.2lps q[BO2^A3@BFu8OjakA8c\\\\G5F6bvSWn^,2!aO:S\",\"lastName\":\"TxkJ%^'>-P`9SaKF(rf],\\\"}PD2*1KA[-]O+Ud;nGIC.M;+s_<\\\\dzR@TyN|.:!w+:Z8>7}9iL;):_:[\\\\+!'Dr)#AA<Igac0Z\\\\[''p9W=F@ZB!l+/>0\\\\{0k8o.8\\\"DAxpEV?Jwo};P$`0~T9@i9^#IET[ 0q&s_&[P`|EG?!u_#`Q]~Eateq_iiZ#t5pOnVexTEV0]?C<I\",\"password\":\"'F=2)'DmeZHfKgl%a=c(w?_DD<};Jn6< FPS=M,$A@LGN414LJ&qgII0oq'Nq)EG=63@[5,Q.r#_E^MY0?XwT*8lQW+aVa@g*$~$i(neN~W0K )V]#tKyH+Z]}VJ`]etA9;?-rZM+qE&1`n|G^Bx/#E&g,^pJ0Uk]aq;h3+3ZRlN1z6l_cr51tS_cz\\\\t/Z\",\"phone\":-503,\"id\":-2142028976954275253,\"email\":\"4_Y&f$j`j9`BPwb1\\\"XY!*y\\\\*>*yZsX&rMM]B8]:ccf2X0b]W3WHI=|uY)A[#iaV|GXQaY:T|'}5h9/`)U%?A`M5<&\\\\a%PNeNkPo}+?P/S2qD(UVjT-'[>7&>g5E3 6AcFMWsQ;&4qMl10he`918HSat!zb'bc0KZao\",\"username\":\"nJg`V.|_c&Ka'GZKU<\\\\*]UdP#Thr.n7|-x!Vb_GF9)V4'p53veDA);uRiO[?r6[']g)O^lkeu^;wTUx&ezs{DLK'}?&pJT>4\\\\XZHJA>\\\"mI:Pj[`g4UY.eu$Yy,AL^pX#z~h]PpYq^%_N}W4  i4UFc;uU,\\\\}#JOka/6g9[z(?c{VZU$px/z(c0h2tzS\",\"qmrdpic\":true}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.phone.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesUserStatusType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"*ho@xNw#gQTh#C$\\\\HdNK@1\\\\v\",\"lastName\":\"pwgBvU?&>=]AGs;zN1&UUTRHPm!~KhOxLg6sOJ>)o8`a)OAfPTMGVc5]sJ\\\"YsO(VE%(pVw;4J)>k/[m+en;~b;'AhVJlZTqLe0bC &\\\\Mol.6Ty6OWZADrlIm}j#Pvm|};bg|YE.*si[|vY}Br$@s,i^xO]hgXF!_\",\"password\":\"9{\\\"5'V)@q9P|v/xk$GcSk3\\\\2P2\\\\3Q$S4bP jdosqZ'B;n_{~9o-^2g[{h]R+evSZEVt_w/@kqG,aJE!HjgiLd5a<cTO34vf~6DW2vi|K8aZ\\\"+b#U3~+Rn.H|N\\\\\\\\]5$:SYBS8-cE>0kxdohw02~ohbVST(!~+KNC&l3{:~vtEj0Bl-RPW+lNS%OHY1N\",\"userStatus\":null,\"phone\":\"9$RzR{5b4B^DU;P>O19)?J5MEuwM/gV>`1#J>p>aoBAQIGO#?JkpTXy]ra:d[&Ih^1!# U7X%w7*n$vDpYLPZ\\\\wF+WW!i4>r~Lz0,(kS]\\\\|Qk*WGq#PkD.S2^>sSbv#_I~6TWE%jx>j`GP'r9AIYp#F0oaG+?nBesO9Dej<YrjU &Z5hQnnJTXO#@84Z<Ggk\\\\%S$B^]'~NikGLuXDZkx-O5Xi06\",\"id\":-2153138086588079725,\"email\":\"7~)gn&JRzg(\",\"username\":\"sLy\\\\7lXq#HZ!i%jF)lTMJqdGyK>?ww?\\\\qh:vruixzW--1.T14'#46m7\\\\OH}#i5B89*mO6W0(kT%m0v~\\\\P%M}V[?czFzp,rs#:G=0_pg\\\\q>kI.\\\\lym':iB/G~jVtA&Kr<9 vcxty5BH{'9,o4L;;Y!4t\\\"IN*8~BkME^i_[ uobG&3^0eBdY0@6M^9A<H66K,Ai,G,DGI|]i\",\"xknfilso\":507,\"gfx\":928}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.userStatus.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUser_BodyApplicationJsonValuePropertiesUserStatusType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"`oC[`^c_ <3yP,D1L.P;*yMQr2Y?AUrTq>t\\\"{-{.s5=mEj-1=]Cn4b}$szZ|t5QkB?eM(S]4 MRqiXA3#[[p_SV748O<W2Qpz,6E}1Th^lGn{=rzm.c5>xN4__Kwkwr)N{|(jc/rf2xp<5C\\\"7&(k`_|msn3*]r*P-Fdlqur<=\\\"3N[<Cn\",\"lastName\":\"bX/6m8u8~H]d/w3l:7LLO*ULt*LkiAA~8\\\"C(*1rK'1CnB8aTOE}B4l`ne{\\\\4Cj+(;tsF]1}!jsk]WZ7;\\\"bgu!$nE{v@M#VP'%a2/<YcqLoY,u#u#KZM#4}N\\\\a9\\\\6t5Y(p'x?\",\"password\":\"jzHfSuflh<n'<'&ycN:lxh3-<aR8]T^-,ULnFP\\\\6{T)wU=k_cg8P,tp nMT:cBa8+-L*N,YI#fL7g'yg)L@JrntJqVOJWIq+EexpCG(M\\\"?Oo}Vl9DOw:N$09+&}vhW/SMRsE,|^__IDql:#u<u=\\\"Xd;v^$xC{D6Rs?`]b*hP0}f`BUfjhhXqd$c;QAI|[-(\\\"fGt]jb}d+S]zD8jh/<m7mQ]`qA,2M\",\"userStatus\":{\"bnotwxmcirpgagui\":37,\"asaxhbpidbhsmy\":-146.3},\"phone\":\"@,#=3g@gIV5bMz&_[/'u<lE+8mu8|HbDG4U<6n.UojBsaL['()Ll/IOEv/0cngRTkX,Oq\\\"?xgJ!%);`(4'H^z2U&P_/@^hHb,8&tc,*}Oz3Q^cS<}d90q#wZ'Nsw'&zW8v@ABACO\",\"id\":-4105423518659872277,\"email\":\"Yygqe;cjP?^gEA`rCtK}\\\"%E\\\\A39_DMLmAZz`Y[x4\\\\K@aO$1z r~^yem(.}4+Ff'V@-3@vQx)oT3p;)@5,[N$HEym$N?h[\\\"2{giFj|LH}'YS?d!]T{6~xc,q4:m#e4]^2JnwYyhjJd(Y>C+E@@)\\\\\\\"]O!|rI6(mmfD\\\\f<E}\\\\fk#bf'=!EqTCJ9)2oo5\",\"username\":\"[D\\\\W!{8zRtYLHw\\\"CN'RrGYvlFcQY6$Vz;hMCi` VOJ[.l,1vH.Yw#EF8jUV,)r6T\\\"x$<P\",\"ebew\":[\"GOv\",\"Pe\"]}")
            .when()
                .request( "POST", "/user")
            .then()
                // Body.application-json.Value.Properties.userStatus.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsSize_Is_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsSize_Is_Gt_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"07I\\\\/IH2q/g`,?hL-DPVRm#9rEGGUwsw.PLs9rR`#[:.b>{HIOBj\\\"u9>$Qup7G_0GMwL'?x|E&cf0Nn<^ ^CEy\",\"lastName\":\"HuRa6A2:\\\"ce`'DK.*rg,gZ\\\"\\\\s0&^yN_|5\",\"password\":\"KSS4Ry``HWWfEYIB\",\"userStatus\":-97693145,\"phone\":\"a!B)l3tm%[v$gay$Miqoo9`[u:ejFhD,3C)(|vwMvr|{&S,-j&9JSxvM0,,rw$Bvk,qz:zMe;.9w1]'Ayi).rw,qEE#}k+Ra.BubA#Wa<S(3^)hiAITL=6BU>~%0R_V51$DsRnVGIsT!^Vehm>VZ;\\\"Z.>m[A,CBvg8]%ek_|Kx\\\\ZPx6dU7@h?DG'>n|<PXv])av;`Z$+\\\\g@HZp,A^$+\",\"id\":-3797532336808015884,\"email\":\"b&&Xi%n0'|jg3{6H]:Xg*H,Z0l\\\"o!HM_0G^QuZ9kCgaz]k`Vn leC>n# mE\\\"df&p8YUqe5wM4T5=k5.<JsLU(>e6d9I{H?B}9&Wzqd#C7TbXTVMy.^*FpJ(b(q[gRj5O@+fd5KU4Zfyc-:cye3jePJuF2H)9^MM&S'Z,N<ZZp+u(R5-@wAO\",\"username\":\"TLmbo)?FN+EOfN|p~K^!Zvr(qQ0I)Y[*\",\"cwrdownnyi\":[],\"lpuyrjbia\":[\"QZ X!\",\"y2-9&UGh\"],\"iqgjvcwxuoqudad\":267},{\"firstName\":\"tS9`!\\\\g-;Gs B0\\\"`K4#0\\\"Y}PhMQ\\\\&C$=%vj O1-?/d[%z%!eEke;`EUD36S(7mTrbj\\\"w:_8U[Ntk}ckFkv{L +xg#DN<y(B$i;aQHc)IaiLey6S@n9~YgKM63T[Q3YAMo6c_dzE;a?))S-\",\"lastName\":\"]FU: w\\\"@@7@n}B7whBJUf$ZF[ef}z_EO9[_Tk\\\\i0~TrI/aqvnD]o\\\"pMb*}pZ/\\\\`o&Ti<;\\\"gT4nOMPpu\",\"password\":\"::jM=nMa>6n6$C5e1n BZp:->?Cf]pUwzyhav]wNiA \\\\mX{'$/h$/}-J5|/M-(x\",\"userStatus\":-367288959,\"phone\":\"iR-4%>[x~R9j~VJ\\\\|u=e#\",\"id\":-3929540738207915675,\"email\":\"\\\"ljq!<'}Ic @rfZ?Sp(;XGm8q6_,W\\\"$F)<bYG/nd2AII7yoXPqUQwO,m& i]Q(l@OQuT g7)-YO@/}#y|02uGNiOtn~o6}2Dl$1| J(J/?sGtF:<5VP@cedu(Yq8a+4Vy5YX=\\\"@+\",\"username\":\"C!|o,@m'&S>\\\"pr]EUnh=\\\\hxQq8:k;T`e1h*7sV0ssL]U*'BW[V6'Ru9LQg_sksoyzcaJ?UF& *trrw2|iU2)ja}%;LbA-E)#w{!p\\\\l1? NqGg\\\\b\\\\fZ G3mfG.=6_!N/~OX`7d=l+w$Dr;aEVr2UW8qixj<i9qJsY>TqP;Di;c(N\",\"hesqtbpycpiayvk\":\"#<4-\",\"jqxydl\":{\"allqfzgzesykp\":\"CL4mj\",\"hpqsexrarixkv\":-235.0,\"bnwosqrwc\":[]}},{\"firstName\":\"z:|I+3)8&w4Ey(JYm[ZRn$Ob)[ex|mqWMZ5($EE?nMjH!:fnJ.)R~6,q*CP\\\"uv8oF\",\"lastName\":\"_<m/e#O\\\\NH?\\\\GEJP\\\\~Cu#(3AE8kc;BpO%@,f/|I&'djjt4Nd>;WG|Pp7J$Ov5C#GBs3iGM_8`f5AQ\\\"HK4N7|6u3\\\"#k{[SWooIz.:m>@`]$RyH RiI{?- qr`\\\\gb>Og?;&9m>ED':;q3Z!zI}nc?QkPV@&8nzwIY!TTt5|;NmHivu^lQNQv&@L0]aAmXJ\",\"password\":\"sSdKaMMW|rX^DHG9F\\\\f`W2jBW=o9q9Xh~DS)D%7]?^mPi~l{n5gRm-C)%t:}:mvHGg<0Hjdkm?V<$\\\\QNw3\\\"\\\\5!(E2]Om9s#1qJdy<6m./*QeR{n|<t4nO^bYQ\\\\a,N=>.6.CvcHl0h{r]@1W7aad.bxS3]@vs14Zt=H\",\"userStatus\":-835667297,\"phone\":\"8LGS[F:zL8:N^&F,@0d{P WeU^Vf7uTA'4dsTZ#| Ryaa$*n>J_Fx!;m^PqS>ZmZahSz.V,0CP1+X&6[^N&CAj}nbC}D_aUg`uYi)+`l6n-aEJ@Vx0IE~p<aL<=!A!29a7Bdw<)D[RbTR(JRfncw}Pb#)k.z@8679[>|W`bz_j:BKrknhiV?{CAqiaM1m~|Xqz1z}b+&dV<lB/p^g%|&iewwtuU}@7.&r?\",\"id\":-823738135232222480,\"email\":\"1!a}k~kt:&36;+(_m-c{N3yGpB^mac:fwba3cf\\\"Dn!D.Q x:a9pKQz5w@o;Df\\\\#z5(DOJ5/9vh.0K\\\"fH7E)q~t.|{L!g=p|bVKXkv\\\\1>X,e U@/UjStxhEtRg~Ug-( 9YDqAxseSt!56\\\\D!+PcL\",\"username\":\"YODK};ND|Q(Kc&xF]{B.'E'0%wnHu\",\"axefpjr\":747},{\"firstName\":\"BSx$7bD3%eKih'W\\\\I>Kp.^\",\"lastName\":\"\\\"6A4;4{y|/0qZQ:8X.zC} Az9~]<SEl  Btw&[2u0dtL6j8to%a#'hEl#HVOA@d+X7 Fkfz_ImvYZUk3Z+R6k9Ne}qGrDJSvE;Pe5B?Ry9_1jP4\",\"password\":\"b;rY&O82UzxF R/@kN_|wQp8l';m2/V,)nIm'*/8m)vV~Tu0zOve_HYPopP9)T)T:])VgNV|}Iw_cC)'!'Q=gH^}sy[+,w2-On5OnRPaorVa|:\\\"I}dgQw^]{8WM,_gRRm$W~@f*0oxi+rD=kvg/xl7$Pw(PsM[V:r9a]Gl^IU\\\\}:.[*8uFu~NCz:[;2*EI1D?0Ty\",\"userStatus\":-650141893,\"phone\":\"?I \\\"&`l/^3:OhX@*gV&3/T}@~-8wvY~=b\\\\`z1p+wCw^+r=oZzSSSn*L+G\\\\&V3Z~.i8pCN\\\"sRYk&h#>qa`:zpkTOMN;Pu^c>2kStpTf#gmC(^-ov;A{H=_x2Ud< {$!2RXE+i!kP$Crx\",\"id\":-3792849192412543036,\"email\":\"nB}8n2`2%;J05x{*]riP.jPBY\\\\mN_wBhL~dU8o]N>-*qzcH[{CEW|K,UVikMEN\",\"username\":\"w^ZuQHOpmgY?++a*{k\\\"R\",\"lzq\":{\"giknkqtjzr\":958,\"txkgyvc\":-246.2},\"cdpelhkx\":{},\"chxllgqfpfkpxgjt\":\"c_7N\"},{\"firstName\":\"n#ZF5udwi;o?Vg C'r}RZ.G69G<cum>(xI4?qR0`G6TH'`?!;.167EnnQx]+bAuXUs%dYMK:gajN:-C5Nv0DK{\\\\&gV5T}CWY,@3J&+hz9[YWc|.r/~j?B>A)7H(J>'Rh/_J[pzB?' 2zHt:Q;]wM\\\\l;Cb\\\"L ,4InZhlHE\",\"lastName\":\" j1p'hTEi&|5/)m}>pW%P|0\\\"S;5<}pZ=*`/F/b!*ss72{8usVGu1U>]]-\\\"O<M@I[Ob7U5#RA@ :~EVuyz]Amc<D33/cqR1}j%*CJ.ZTQ\\\"G>FDCUjeq=]_j9]Bwx>`[tBd pIcOuEDh5Y3]\\\"v!(~Y)##(?|rY1&1QUi,3y*%;G\",\"password\":\"dX{2mv+%N5?Ij#AIN=.k;F17e|9A69t=3^ }ejvL\\\"SBj`\",\"userStatus\":-678703544,\"phone\":\"Kn\\\\CnN/$.n8->(0c0Dw@:sg-GxV6u;]lV4*|9[]?J[^8Z/X-Q7v+)h(XC.$s'GKoT.>eg=/]bHg[L-c3j5OsZ[c0$+q;H1 [y7N9\\\\DI7EeRsSf9=i:[:i\\\\B$v?ku6t`_7c_lpT[xAghaO1-FbFF._BwbQ<wi/ wAkE)nvd}u6(m9!g|wB)&5L-2gd67TXw'],s1IA=6ygeZzsVr*.!8A{\",\"id\":-1569909839068951736,\"email\":\"<\\\"3;fvj83JPCC->K4Di+F[otf{?zEP.Wms.Hlm3xvsUx}ZhD#$%uv|$Py`^GSne&fQc-}w_?b6GS:%J/|m'?J3EH=28X\",\"username\":\"?5nraQ,d]AkAM7')f5>g}&>g$L~Wy?vD5{*\\\"V@h;,*zf/Xl.vioNP'+Q5}[1; 1G@;cjBaM))Z**f[W;?(k,Y9KQWSND5)S*9B4pS,kF9U@z\",\"esrrgqy\":{\"ubzrbbkvvcqe\":true,\"qwxuprlkurnl\":[\"GrYkuh8\"],\"ilhccbb\":[\"RDk\",\")y\"]},\"uvl\":815}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"id\":0}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":961878404992059074,\"email\":\"\",\"username\":\"\",\"nvcrdwijhdmmiuh\":\"e?j\",\"s\":true,\"bobmkemdgojjtv\":\"i>~QaFw\"},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":4467125376262330522,\"email\":\"\",\"username\":\"\",\"e\":633,\"bhenekuychdjgjt\":-808.2,\"wtyn\":true},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":847112302740958658,\"email\":\"\",\"username\":\"\",\"kyszcc\":{\"kcysalpwaigt\":\"~B\",\"kwmx\":932},\"tqh\":235,\"eipciwldz\":124.8},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":3374984805572061903,\"email\":\"\",\"username\":\"\",\"kpwwhnfzynjdpj\":\"F*\",\"bbju\":64},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":651625347461688547,\"email\":\"\",\"username\":\"\",\"oqngnfmlnu\":-687},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":3019411118724415541,\"email\":\"\",\"username\":\"\",\"fnwtunsyarvkmkvz\":true},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":4467125376262330522,\"email\":\"\",\"username\":\"\",\"e\":633,\"bhenekuychdjgjt\":-808.2,\"wtyn\":true}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesUserStatusValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"userStatus\":925157402}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyMediaType_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "text/xml")
                .request().body( "C?8A6")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.Media-Type=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "null")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonType_Is_NotArray() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "-100")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Type=Not array
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[null,null,null]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[\"0\",[\"J9icB \"],-823.5,538,true,[\"F=d2j\",\"Y=0\\\"6Ngj\"],197.1,-556.5,[\"B{Bf,F!}\",\"O+'\"],304.7,[\"\"],[\"G'\"],-351,[\"7&D\"],\"YYa[5\",-83.9]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"Kuf{iH#jrC_fdY~A'`l+u~|R:ujBH\\\\\\\\r9VAfJ)g+Ul1n_s)LuO$ d3?F^P\\\\Kk=S)EKtINUi|=/cvBxH-81t\\\\CiCPOZI-*Q9Qv` PN#!N`UdSF^(g|Qv:,d`oMv~)s\\\"ZI#~$4_JykqkI4Y1V.RZD|\\\"F^DC.x;L{|[V>QX<V8<1XP~;!,d+Y}{48{Vz5pR*fl'lB8,fBC}zR'FNQ<OX-\\\\b!_w\\\"L15}a{;/9yi95B8&0\",\"lastName\":\"p9TC8LO7kR=$O&C\",\"password\":\"Lf_<wzy?6f]|uS5tJarX}\",\"phone\":\"l9CYS|LE6$kmc=M(9H?I-VF9\\\\L>Dd4\\\\sO}*TO2o7k[>cI@/gQ~y3F<H v <aKwGB=prEL'Z,a\\\\mx,=ly3Tw:p~=e54{Ah0s  M*1 xwmwWgC6@07iC=S\",\"id\":null,\"email\":\"Va!-tkT: T<v\\\"O}8H2g{u/\",\"username\":\"$Uri19vLefdf`0py,{!2p.MG&\\\"w7{AK=-`aBhE,v%xd!g}K9)+ZRO[.`B}WT7*9Qftn;DgAAXjW!EbL2L?0u?\\\\) .Ump(:H0=#o~<sFE1i:?+--GWwQ-K[DtG>tDj{RpgZ H\\\\,gP!4X;:p![28*B?!^\",\"apuk\":true},{\"firstName\":\"uj(TJh/_mDj_MM^D{-kI[V1Fv@(M$D>YT+DOg`#tNQ/^_gRA8R8FyB` P) h8Y/D`oB7tpJm 3\\\"WS6VvJMzW2xJU&o3OM#h>S2FVjzgq#?[}w0TSCiGQ3v3!0lpJ$>_\",\"lastName\":\"T/Oa@p{$*pAf*nJYA)8^iG4#%\\\"#)wh YI\\\" UeXMB*2x~;=IK)v)Pp<`P#**Zu+!}zoT<Kfu,B}q{5R#@[<s]_~*^UQ7>BjbontYg=^d[\\\\i\\\"v*3ftL&<J4Ipba=\\\".>\\\"28x#]@*%xana~8\\\\gUTk(S 9lj\",\"password\":\"}W8r)sN/?.Dx-T5g1cC@48EObm\\\"dt*5R-JT}9p&%}@sx_Pf3isSd>GvTjq^)yrh?kZWW''FKM7s\\\\vpx:&Ns/0V]Nb-(&S:`d$MWq8tpch$bY-;'mv_&pDaHVca5[Gfv8RjuVWH.1;\\\"F=:4*.W=/U&Cq-b7}2qpvK_%o!3X>&\\\\%rpi8cQ5>HzosQ[ M<f0_qWm4\",\"phone\":\"2596cO=h|XY*\\\\T5 d8-rlSy9>CMa(U2UEwe`3kUU,ndzb^\\\"f'-l($njRn-j{{oozp0Rig\\\\hBoAott0L:#YAD+R|nJUxm8-R$pU@30/Gz}l(3}TQSqP QmdUz5{l:W`9y6WCq9#nSZ8:6Ey9\\\\Mp!hFJ(d>'4c~eHas`_k93J[XO2zlj2#\\\"nXfVEE0OlL(TS)!l@2-7(*tZ;ft\",\"id\":null,\"email\":\"&S)=@+~?gN)-WQ|Ofs(9 O~=33c6]Ge/a;qWR.SO!^dZ:.-%I=jQuKT2\",\"username\":\"r9ABq)/}97qa[v~)dR(O}Ya@|PG'M}C^uqHoPj^a]kw(|4tFNNlnSk;z!D_jTHG} g<TEF-}b8k;8cx-Z6W,wnNkEP=V14G%VgvI6IKj)$W>DMAm5h'{\\\\w+MFD<\\\\wg|Mmo1]7aVN1]>?3ZaND&-}-ylu?&UKkticM^8qc*)]uXd9_H$`|2hF==LB (?<AdNJ`%nb#3\\\\1kb+h7~J#J=;Sl`BjORg]a(\",\"k\":[\"SL~X^^I1\",\"&H#O\"],\"rhvjviptpcm\":\":3n\",\"pefzqmsqhntsm\":-379.8},{\"firstName\":\"+I8eU1 gUeqra|_MUjI,.marjk^D=Vo>)*W0/\\\\u@1J2iD0j(pzh|.W$zu4lCA,b8b6-\\\\YurDa/dE6_mN\\\\SpOwp6'wB2u30X\\\"8xhv\\\\K\",\"lastName\":\"ED'UuFJ~`;WQ(F-4{*@krnya]hBH3),24D`-r *^>mM@n@N!Ijn_uV7P]K@B-87Erku{L2M.n<`ffI5lkY.R2V2X:/vw~u|ocf[yw\",\"password\":\"PKHTG/zqVB<r,h3[ZXIs.#_vi\\\\$#)4@d\\\\Byk,7<<{;xrfZq&zirn}C~]jn}lA<w]l9@R&*(fB;5+Jh?/:|D[Ih\\\\IY9!VX|V|[x4Y7U:L2dWjF_S0]o'>To@8`VnTo<nW?U|:53GG?|8|Bs?<D[Z=5JoAFa^+?Z2{|lkOi)\\\\ixs(0Ffw#%C_#4[7y[T!a1DuM24\\\\M.e! mCxMV8Mb)V6i;\",\"phone\":\"l4|zjin0p'AU`y}7s', a0v*{{0v:&_6:%M# 5gN-^Bfv-/Gt.DW*sdx\\\\o6&'8@*c))_gx#`ySZ7>GP9bUga/8:,BiG2(hs^ncWH\\\\W&lSdbO)FRqZzwaD)U9>lPK;I'yq3$^pu3Mz?Ki<umlc!s(\",\"id\":null,\"email\":\"+JM\",\"username\":\"2+R4G\\\"lf 6*AkP^wkQa`5cMp>R`M}'>]vbmM@*,.v#Me7J>(,4L-SJDPY=*)2hX+c6on):USA}YA#aQdy(u2SZ*9B6x92To|%O9mgI</|&_+\\\"ytkjou_c(Cwb9AA\\\"wA M>3yy(U9\\\"B|JDfNBu]d/W=X^L/FAqx36w*%UYrlvyvZgV/S@Z&n<72o]!\",\"vlxglaarw\":true,\"o\":617.2},{\"firstName\":\"Sx$ VrH`W`y{Ywxin-5z'fOUsw)V\",\"lastName\":\"|Y9_1NFUS?]\\\\gg6t*6idb*;I^1oc!K!!\\\"Vi,g)H0u5B=fiEeR5%PDhyp~ZgfdCenYkYJTkN{n}mdY>dYt.y?D_*6@6w/DTkW'yo0\",\"password\":\"pQp.y# hYz$v_7f!x^#f'X0N9{i5b|5fqB*`nbra'-QZbCMQt{|XQ\",\"phone\":\"g4G79r';.HoP]^U!}rY\",\"id\":null,\"email\":\"cI+[K@iphf{7qG{k~>)iG67[{T'\\\\=mh!x(?Vs(k\\\"{gt&2oTR,S>yPC.##73um/ojm2^TRrD5 B|h\\\\Z5E'BdH)S7;#*-4a x(9sXrC}q46%e=&`9!H%IE!-*`~i]IW:eVc1gP*X&Y:+assiA=|V^c7P:_03+j7GG^E2sM/@px9OqivSJ;j8krqU]FWDo@pw8>5|ULWx)-D-645]\\\\p)?DshRD0&8'Ih3<`WUmEU}b5R\",\"username\":\"L?&B}t>aKjO9Og\",\"cpfbzgkod\":-681,\"lrn\":true},{\"firstName\":\"T\\\\Pk2)PZs!B}n\\\\g,f*jT[@7^(jSvDpm6TAyvt:2[*8(0Q01d>}1VjuhD&f4g7zl{T]-\",\"lastName\":\"Da9giXu\\\"P*+4Am8k&z@,s<*jO,-sw?KO1K::FV}UYg3)TyRON}_2A=(9WXAaHZSowbz<@.?5ug\\\\YD7;:!m`E%w$DHJVxfSGmPX.<l3h>6o[h'$Xvl%~a5zZkv}|C=|SM6AB#;_POAUz.:Ft+&:U:if\\\"J&?9Mz:g<40\",\"password\":\"A=|g22q!^6gAT|t[w6!hmz$L1DU&Rg,-K.}c(8MG@hgo 1e(hhsHRW)pe^7Ioo7V^ADmf\\\\:!${@O;UQ.8>(DjwS*o]M7ju:\\\\k$E7(GT,/AQ{U=v:k[^nZHra&6xrmApP@t~W.d_p3wu3SPOQ6U2>%\\\\sEM_1))b5^x)byC~X\",\"phone\":\"N\\\\\\\"'qk;)4'{smy6z3Lc,j2\",\"id\":null,\"email\":\"I_!G-Y$-Q`qYD5f0@;bdO|ih:ckG+*3]xh^9:S5!.I9Gf<=\\\"|%b$A7oz9i,aky*5l%l5MM]#]cC?smiTe|IHG<_aL'K#[>cE9o8j*,$tHGyTh@xw7\\\"f-KME}:k_>V7Vz&TJQp8%}=lqH4{k%?9F`rbfu(HnNhGOv\\\\w;XMJ2*8sg9?%QhD;IxQf=\\\\ky6pzL1K&SF4_(nz4aHn<mfcX<v{rhzPK\\\"R#3|fobCQ {~;\",\"username\":\"[m\\\\_,O6jk=.^Z}S?|Tj?&r^:#];6BIpk1Qj4g1{Z:|YnkslmFD)hu{^vL59/ktY?C+6x|TKPNF8)hNZ s2jUpXZWNx@3y#Xmx,DiwO`RATRW#w5xCnrA*?pqHz=v\\\\hVOHW!+=huhUqn!8JzG%@i]S}+rrEq2&{~|\",\"hesylmmlfnghing\":{\"kharecuvanjjikqf\":-264,\"ndsefcicf\":[\"K2CwJ\",\"O1q15\",\"bdRev \"],\"folnbqhbfkijrait\":-581},\"l\":{\"u\":-423.0},\"tdhja\":true},{\"firstName\":\"8%DI4+^wemOn{Qe\",\"lastName\":\"D^e;,g`V);1+)wh1q-{P#4?xB@; o7pv=$;S2[&!8qU/}Se8mMC:\\\\}\\\"&Nm5?*\\\"+v[\\\"yJZADmamyxNlxcW[!euZrA9'Yf_S(M1xz_P8:s_:??Mg-seIR=*_%Rul-*gOhx1}kz%''{yo<Zx{46\\\\\",\"password\":\"Jo X`9r2e\\\"2 Uj`bP\",\"phone\":\">U5NrS| 2sr'U<0`dfhvYwWV#P&\\\"]%/Qx9u]t,B[q\\\"a^4)jkPI9B\\\"v3~|S}by6.5\",\"id\":null,\"email\":\"90.WUfOc;FP1ZGs/HC [wX2=sq1NROk<iI$8ATpQgM9@%_I8H[wT6>8cI~~<^lKEm8S_RQ,^Rq]+5%$=&_M~%sTK_C> *e)~yB_dD)qtRyo>#p6IkLgnzm2R[2f{2X_wcYy#Z@eN y/(c* tD>S?@Bs']#!{ n[BRI#`Sje0i59_PV\\\\c6H06TN'!SI%X F|C{Y9VU#ftd>5iw<,SC|{}+^XTTte(\",\"username\":\"+=4NP/)Z6YE`\\\\B-Hn=f5\\\"Q,i8^,fK!hJ%2|wWwV!;<,U\\\"0\\\\|2ww~r> a-<R2m|2cNn~$=lbCt-A%vk@aM'Z\\\"-[c+=}iLn~kR?uO(HG\",\"useimmkmdjsqz\":[\"bwZ+T\",\"1o\"],\"qpa\":\"8'pH^c!D\",\"gllapueoh\":931.6},{\"firstName\":\"qto]QAIczOcLWKrl$QOEhX9-B:0fR1K?B]d#QZg)3yOcJ)2rub4~i8\\\"5d,CA5$0S.+/E)~]tkGy:D#V}&cX_WZd*\\\"g5 I1a@UBX(FX_>H@`jRcerob4kv8/TB:=3ywx:!@^%m*%]NT%3mQDkdSr:}x|4k k}pF[EcT 5*LO^7P)'R3n.`}+hbeFrC[Mxk0NFOvhc[fpgm(jzfC[ ._2S4ITuh(8bqbn.YBL]8V{U#Q(#:&{L\",\"lastName\":\"m/^^u# S+?q,t05A$L5MYP&3;0ijMJ\\\"@$Lr{9RB~KB*d&.? +Hs38m|pt.~M }G.lu}}Pz\\\\c\",\"password\":\"z#3HE'Hr\\\\~elbxsRJm[,Mb^K`th`o\\\\P5<-2nij%ohlC_KqG!F\\\")cV$ X+ws8bpI`/XJ UO<(LJ@*d*T0RO<3#F\\\"yQt4[8?|#ioi%yk[;'U;mLbqV)fH2Fvg!D`VL6|ztD7CFW$(EU v7vR\\\"!8\\\\\\\"p,D&s In',o;#ZoQ;?[1cE#Ol]R%-aQoj~@\",\"phone\":\"9Ix}{\\\\^1w>HC037Qh\\\\F<ZQnXaS+xr/Bl(^2^*riu2A7X:;:UW~@(8{ts*uv9->ggE<eHPJ22O($8_*MEL-+1!cZ{byQJ\\\"UHB1O7e\\\\/\",\"id\":null,\"email\":\"WW@P^LmQIgu`!7?I/'1Af_>SI-64awe}rCM.Csjg(Y_r)$|F64LCU-~\\\"\\\";s<00z=QImV*%3-RixI;,t;Dx:!/*vqM):;/)\\\"R[Zr>kw{'Jem~]/EJA^V;`OHCKruM+w5sOhPakvV[[QdU[!;+'s3%ADv1NY[i[bp@hqPepI/Vi --war+PtKX=af1D{\\\\%A$FL>%1eZE\",\"username\":\"f5tCv8 N-%&E!EZh;IgnKiS(=_/5%bMPIK.`489_@)QX.QYF,4Q;mcC\\\\Iv:pR)QDi'*{J)9Wa=./O*kjJ6gTvDs3>TQ5#YJiR406a2L6KcGK@*O^L;*c04%m#g'io8EQXItW!na(Sn3+!#uG']:<wI7v}7?/tuUrt9uUoWd6 \",\"fmoiwgqjxyx\":true},{\"firstName\":\"#lF',_x#B|/JotR,,q}M>+0#0DHelr@ycPPUGe*.p.\\\"{i:@n5er1rN*wQ{+/q}x+pF!;wy[\\\"6NdL rSPE;?jcX#cSfYpJ&6>0(;9kSWSrA<!#M*4DP#naYH:C v(*,JnMNqS5,t`RLScI}*1CGkYlrIGsy}f\\\"4gTZhvI8=N;;[zp(0]Ma&\\\\,x;)ksrU?@c5q.:nUFq?:c5rW\",\"lastName\":\"*rcZj_-4sLB:AcGS6==vkzQLTabc(P/TrSV#sy>/s){l(#3d9__uecBx7YC7|1n`WGV7R)!/oAaxE%t-Vd:HJRcV&z711_,1@@^V:9O-=>A8W,uV$UuWwUapH~53FP,wq@  ^SSH_=?2/1Z\\\"cQAX+!H-Cqp!*OrO9\",\"password\":\"`wGuOMGx3,?^_~^\\\"xx}(A(u QE@)XSkBWaxG'CI*2ZvW2=T6f)*o7`)UPU5&`99Q!5',5i/<_QEAYh \\\"Y1mK}DjE@Ml/v:c+g]Q.b_AZKd0IyV9Gx.:[v$iD,Q;pFiphfh;R$jd[u{3V}J8c0]a/\\\" S2Ao&#<w?[!l\\\\0*[UX9?aRC!8'8'V\\\\l\\\\b3Q6'\",\"phone\":\"q_6[]_TQo0vSYx5[VsROTdGStA_52vKT5b7PeaHPdFdo]s\\\"/CNKN+( B=*D8qD.SdflR/ (2_,gDilOtcf;wlqIxO%&cAYXKl?=%vz5D8{;Z_K!_tBj\\\"<MY.}$u0,v3KYH/nhjG<QS_|y }nyME*vMLb~\\\")<sCxP xe Uh%3/c\\\\'bA#Q_~-Ihbx\",\"id\":null,\"email\":\"=A\\\\?$-\\\"q9r9|7q-e:.HT}+WWZC02V#-!R2\",\"username\":\"{msI=PNq|xy+[]uhD0`\\\\Vb~);21a]@F?@'5Qj@ (D{63p%=[+,lo?#(qCkY.>w~ mLXRmU8tn=j 4jtqKHTWd/2JV?w[#{i=seo29|.!!HRmNkXGfAC[WU).` MCULY^I5*Hp6p~Sor^o&~ciw|pG\",\"rqdttebqsqnifs\":295.8,\"ouldgz\":\"]\"},{\"firstName\":\"<q9q:]~)J4Fv$zJ-F~i$X+j1}rl0[PIb4}k<='$\",\"lastName\":\" MTaCgY.<.5y.0t8K 8{yG%.kRMZ}SpCM&1<$.i7uVAB+#wOH/7I?ky\",\"password\":\"jcJxp_P1DGK%U8uynn{F(vh**2gK4@HxN-'. O1v-Y6%F{AL /xAXO3%!`Z(LK=%zJ\\\"N6LQ F`eFTuCM=hn=lu|Bzu[-;sy5UXF*aB[zn;#`:!mU&{Uk{EW9FoWZueWVZ=@cV=)kjO2um/o>`c}.-uF0Id1q{&@]H}\\\"4|(U&\",\"phone\":\"`1p6\\\\}% t`L50I'Z~r=qQ;qJotL'k7etX\",\"id\":null,\"email\":\"v3W6xy{#lrs_Gam{ji%'hgB;!?>%U(zv0)!? %F~_1;`3={8iX\\\\&0g)Hyy&^P5sw*e6&]sU1\\\\Qo01T6|!YXl%2}W_M=5a*]vV[[*Ud))X.Kcm/(Q'!JZL2Iup`.~}G_F?~cD_l2H}fM\\\"6t'584H2:y\\\\3>[fQ[?b.etkD2,#)L*_#<_D(Z#]sU,~J\\\"Z<zA4)y7Nlfhe&(q\",\"username\":\"S<_D-K%H$}&(A9/n@`/\\\\T.u;gfl?oWA!yo[xrW\",\"yhzxvulqqwdro\":-847}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"T`[4q|\\\"~a$s^<yu[\",\"lastName\":\"kS:'Fa5M\\\"AsQ[Sg_I+QeYF}xI(O^g2A2Z>bZG?r*WR{-M)t[03jQlbv:Z#LB#!AU[{rIw1w<6R&KD0Mktz(oE5(\",\"password\":\"vHi;s+R\\\\~4>W`(lh1@8,$4\\\\4,L}X/8'H_+&}s*fNw/.gUq5*srJ(g\\\"Zp|?vzfwYXJO6*M%\\\"O&pML%`K@zD>015Pc|.mXq2A@S\\\"SjNnVxhF[OF/dj}QA:<6~DI\\\"bs+c=\\\\%VW~sL3?(kGO,2)!'4?^ypyE<rO,bXzED`$ySxY`zXs\\\"S7-Rn_k\",\"phone\":\"N5V,w&T0K:0U@?`17;){^F,&$d{:aXl.Mh.Wzee_T|(%[H$1&\\\",vouxZmZR^.[zx 2xEDI6u)NOn[x5,M^;Akj'rF'{\\\\ZMJH,@=um7\\\\2(Ytn3/O[.y)q|@XT2WrP,vOA-WmdMYqx~^v<?p+7@|Ho*{if2q]JW qppa$wcEJ@+lU^c\\\"[:)~9 J).ok>oc!0SN_2=wIcdA`T3qPpe6}/\",\"id\":true,\"email\":\"K9}7\",\"username\":\"SDx3 m%\\\\];vZy#bssVAw0F?Sta)zV#i!t$gYBA~Ww_3{S3)YLrNu\",\"w\":-184,\"pywxnmf\":{\"zbzcp\":-682,\"exasfhrbjumfvr\":[\"I&xh%PO9\"]}},{\"firstName\":\"qeU\",\"lastName\":\"bo=OufQ53rtziiOWT;[8FS`@8 e-3;,;A&Srk/p5U3MQ,QYR\\\"kK0{q6BLuL}cr$2-~$iW?-PdwbWJ,WY_V0>3c<]qP8!)/k%#p}K\",\"password\":\"YG&rcjC,vLAE!DgyD^ofIxO_cTiccq:@)6^q8jT;-m5s/PXKgZ3Wv5KV1ZdK+\\\"de6H2H\\\\';lcH|+LB'/C@$kNfs.gJ7JDz<SPoldj+ApY@P7.V]5f,3v!+/d;MEoAa^RbhofsXtb.2mtcS^oM LvQ3f=Vy%K!9\\\\W<gNewmd9[lqrx;piY9!ykY~kDqF1E!Lv&o.bu_etn-nF0-w)bK'Bnx\",\"phone\":\"/@4$rM%$0D#f#Fp-i=\\\\QH(u[UVH6d[X[0|u%-4O1r3bL gM|X}YVj\\\\z!u?P/RFQJhQuoT[!/[yni7T} ,h51;@/'q$(puPrzCQN(]4'*j*/STl\\\\/RV\",\"id\":true,\"email\":\"[73Z=\\\"\\\"OW;/@geUIO&>UidJTBJ&Ou=QqAk4_zXXhEX=*SPv*,O#)#^ADM;UAd*n{WFH${AFMpno{k?Z5.UC*WTc&l`=:2cjnc;>:J)]7u&/Lm@NObdbRo]7oy\",\"username\":\"H6S*W[ Gtjv16x9S9J PU26R/U^AU6&7'&F-k;*=1U+QZ:f3x)F ]Fse_t?rs-W_'x%NS18^'!Ix5\\\\+iofb<''OxWGP~ue+YoS]go[yg78KAPF{[z>G<( 9}rH`V;t\\\"1]QGX5eZsUU_=&h#<vP7CxI3\\\"Lk5qOYZ'DUl2_O5EJ?'~m@h~c`U.B~plZ5~F3~cQ^SfvuW~uo+Q#En2E7HHQ_+8&.8P1g\",\"nvcbqttddbiwsj\":147,\"mfrfkftgzkcoqicz\":{\"jv\":true,\"awrlipfbeilrxut\":[\"qk'\",\"y(-\\\"Vt\"],\"gpjhoepvyguwglx\":-352.6}},{\"firstName\":\"<6g=Ad&[xGtwY/%BeNGqb&Vy<yRL['H'c|<_MDmea<Aa=lWSf4yfJB_6$[vWoBYJD&S`L<r7n\",\"lastName\":\"s8oCn>!)9yINJ=K6h~N;>JTox]bO-cbiDi+swoExnR#XNV8v6~B.o~D82Rn$f0N4CmtFC {vQ`es)eL<FjCpi$!X.}X/-fB9yhSlEgwWw<gW s*}Cq:yht*Bah9-`?$9-rWK2j&.ay3C<FC]S8(9tP*io!v&.*)>jp{Onk4gG@Z^1Sui+IiF /{!tfRY!UY~t\\\\Z2V!aHQq3LXoP;}v42x,\\\\PKBr`Dm%%4(7r*57vu_K~6Hh/?\\\\x@aQ),{D\",\"password\":\"%^v3dgXBh<+:tG-\",\"phone\":\"t;c0J.|m6<< Vkz}\\\"< \\\"L$_.cA)\\\\J5I\\\"?2LA20XaEpTnTiyCVpi9q]WyL/G7muY4Ac'\\\\_\\\\uw^$ao1\\\\U+7*dRq>gI)]jt;E!(WJ'YKm+iV3}G|^],\\\"qRmp>LO$5NICn~dn!|2z3PqgJ53J,Iq#RXDM^(lr^N=<&z5&g;oj<]>I;Kd}8|+GG8K7+hj'_XVc6f9`d&mF\",\"id\":{},\"email\":\"q}r]Lj8%amE|HRQbR&<nNnP7UMK{tZ4++^ `;w]>bkm4/Yw|e`^:'{Tdi%[UfO&0FLs X>9an}}T'-%R)\\\\$=p.\\\"Y\\\"}\\\"<q%vw)LIAU}Vw_`1 Ik7QYis$a+O\\\"l$pn]9By;V0piDqy,7M|2,o~e''r%90=.@m&4#B0b9V#+]142l|n|=mry5R^)22y!6/7dyl|F:6}Be NZ\\\"`Iv!b}|WQvyb\",\"username\":\"dX=)dhXnS.#g^'g*\",\"hbelcxwtevyyhyh\":1015,\"ztopszxgrzicy\":true,\"jtskmuixjdhg\":{\"zxly\":true}},{\"firstName\":\"TvQ`E_7pH`E('U{F3\\\"kXY89gk4ra5E9g@EuI5JM i{z,SWS6ZC=kw0$f[=ty}~LzD'Xbaw=qm.w\",\"lastName\":\" 0&WbU)(Db$X8^CN6=v=u[XE?cl?! :\\\\+erj_fW&}pCi%v?%*CR3|,D`>FO{I?Lv`Kh2=@pEDV{E?*1<Q4*gp~]~A)7?}My'( Yv*~YShy6%iAk='F>ySxy/tG6eS;xri7Oj4/*1[xz=t OK9WMD%u.$%bfqn=TY`q68lIPWS/I7\\\\f8EY#\\\"qu!qa>6JT;jr~LPA'Q{lzf4$^_5iZ@YXF*fcE[G4\",\"password\":\"=Sh(\\\"LR&';RNH_\\\".:MLt5Q!L] P2&uaFn BCfSJx}F([#$e4aqp?OMY=#D7-El-N.sNer/,pm<U}FO!p\",\"phone\":\"r>X%`bTxC)+rm/E~!\\\\Cj7j0gFL5nr):nTd7/=D,E^7S}Jpe(\\\"r\\\"<$})P\\\"qv\\\\+gHmP)ar`617OV8\",\"id\":-120.0,\"email\":\"fyHwwc?+B5+)(~b:hf1$:}WL@:-eS;[;ql( 'uWh}vN%o]KnC+FVDaa\",\"username\":\"Xky6Gcak=$6|A!;r*E3i=x?B'G*9cUA(6}{28QZ@R~pRhZj<]#68|Z~\\\"{BnQq<Hj`Ahu;9Ap;3'IjB\\\\7XLbzL{6^jpL`E^sMDs7|,;Bs\\\"k^\\\"`7[_bkevL_s5|LPztUfhkM&JV^hd4W,'Q:&bJIDtWjH5e <X;>U' |\",\"juezzhjnzzylrow\":true,\"hdnlnmncgc\":746},{\"firstName\":\":+rEr)(n5yQ<ojQmyc#aVkh^)v*t(,D;EZ9\\\" MIg':8b9`Z3f\",\"lastName\":\"Kl(d.{>6D/39TkWu:dlnTquj1d8I dbEijN@[8:^`K%WOXiPBFcn[kL5>8=3:0|F7JR6D\",\"password\":\"S[\\\\|MtpQ>kdH'{rk:~r`0{.A P{]f:T^8Z2,[E^12FWx<u.]4_O!4@Tb=]Qx:e[D@N>y_[L,(u\",\"phone\":\"UV/]7fK'Reyz_Tplp\",\"id\":\"hG'X5#\",\"email\":\"oV,H?dzBl*5x_w\\\\#3jtdP>qH`AL,mm%Y@gQC9'V0(0Y<-NAP[8?<Wh;FuK%584'jCJNFd?z2I,/>)PtoS|#pO#d|:;t<bm9(pHQ8FG]7Em|c;fep7\\\"m=6[<;@ruu|*L{S_%-\\\"=JZP~ca%|+Yq-[}/*mswW!eu7& Gt`Se3C|Zny\",\"username\":\"Sqv4/{w%^I<WOk^z:Jx97>(@mZlN{qB4_iZrKUcuu-ns'goQ<gI<0!R!M\\\\K'](y2_Z+FJ+Dj=+FG}$wk&9fv&L\",\"bqabdnrfhauv\":811.2},{\"firstName\":\"+oCyI[:rp&yR3d)}dG\\\"m/WQ=2G&%Z:tJX]c_(R;!azUC5{Z~M5(khqOgL5qK_pk:Pk$`?i?5U )48Db~j*f5R\\\\B#`2fNbo+H!?CnD88^QUe{9L\",\"lastName\":\"-WdkDp$`E|k@C~Tj,z{G-9g_$.?{vTvq*[4ZOgjj7\\\\dbrNkB%b[5,fro=T\",\"password\":\"fVX\\\\(`D%V=S@b0mLCg\\\"l]T't]ps+6 4<7<|XSq 9_n!RN-S&&8*-xi(VWwY%zsXl5^VUR7MH{(K=%rPfDN@y>!aYx1}>QBO&'P-nd'';8(xnQ`4J>Qk9J-3FAKOl_59JNP\\\\dc*\\\\sBaKk_DnfZwOGPCzJ[_\\\"!YwcVcfB='Q=B)QV3@Z1)%itt\\\\`OC#Pg*\\\"Kj$?as`(j2:/9\\\\Af?}ZQr!!I\\\"-H0\\\"^Mo])Nz25>w'Kb<bLqZQeZ$i'&(+nr_tNjZ \",\"phone\":\"r(iYQLx4a9s WI;k+h\\\"G;IgMQgq_[S'ui0'nI\\\\ftXjY}1M6[CSy*L`plh7Qqi1I8AaRM9<fQe`[nD|pyETal:24A`fFwd#f5}=/x6mU? b>\\\\AvLiIv+:zch1w#Cd9Q$D`Hj]^z}D^g}!S!9jI{b9:nLWHrQ$zur::G.p^O,F%XV=PXeHFD4iGo d1b(#bU7B\",\"id\":[\"3#J(\",\"z)FjL\",\"'9!SW'\"],\"email\":\"iw1M&|fUS/\\\\:(oy~^m$0)pv^bB9i/Nf\\\\sS3DuE89 I8g.[sh'[71D*\\\\O4> [O*X~8B-o0\\\"s)z;d_Yw%}kpH~d>!M>&17dYsw!=Ze|52KQ(xEs40Iz{b}g8Xy?Ss<bgt'PB`lG S{d%!Kg^W22+!z&`.^_NvnCA28/,e>8dw$.)sD}k: l,23\\\"/D{<XE`0k3N(gPfHcB)7Bd'O;8LwbtmyUk1 \\\")M(@0Lk]t.|f/-,2 \",\"username\":\"01\",\"blci\":[\",b\\\"\",\"=oO{\",\"DhZS\"]},{\"firstName\":\"7-*GnS.C|l,U->d;eC8H \\\\Z_9j#cXt~1BU^D*)Dq4[g`}=)ydqeaTrXDOqiAdzf\\\"vxE.Ey,Yw9c\\\\UY/g$V&:35Cnv<Q@,K!3 bp-5%]!i4Hs @GEm.tCsb7PEJIiqr^AcgpcA;W{n*\\\\t=)\\\\{3t)A5*e\\\"}q~&gS rAjKw<y1,xT/s7wj(x$@fU lDzPP:I- I\\\\GK\\\\Fa/I5$PEea'b3OUt^2!&c`|\\\"1>`mv=MU[\\\\!V];4Hb\",\"lastName\":\"~'N4.`HF]5u1Y5+|=$boL`@_XXkY?(0,rfO0-6{1_F()<qYs@vV$tf:<xs+HgYy&y?5|pGwK|Kk!P1WU=5V!H(GI+g}N=D<( M#qhB(J=- Lg*,rU#Z@(Ksfbn<Q,\\\"TN|yf^]x.AC_8J.77UlRD0\\\")a\\\"tiviMI\\\\+Q2xt)#vAn|~O-NYcTB`Vx,#1T#bLv%;pz\\\\<t8!PC86G=<$X.DDj+Yro1skHT#\\\"E#\\\"8|+ji9r\",\"password\":\"cm`QZFV,>Gu`Tz;ka/SN]|(\\\"^xNE'<{rwJz&h=rqv{m;4tv|KMcLKJBnrgl:Wz8ZLe4!t|+e=r>`R.\",\"phone\":\"r\\\\AR]z0&+Fs35rwn=se6uB'MaTWE-.g|4?q+MoYElnaz^F82H~Yt6n\",\"id\":[],\"email\":\"K\\\\oa.XdBI-3sd^e9zv{?W|H#es [-:*XW1$y;:hCMptMUC&.[ik|@L(Q4bW^72\",\"username\":\"jai #)+_a)E+,EIWbIU>X/sKH2-\\\\0a2Sb/OcXZ:Er2Z\\\"#'ECfm{v[UtM<}6K_4OCsxGaXUf4Q[kOp|p9Fgk9pyW'XX:0qd8\\\"_DJ?OS<2ZRA2wjhu4dJp0$l)7Ea+Bb+M8l8\\\"9_jVy9HR4S.h{Mdp%NYgY!46[Xo}#fw,O+y#b/ {-H3e$!Ti~+%X(em>%!~5'*WaR)dEOSr]Prr=]:sdOX3~u0US&Zu><kH<e_/TM\",\"gqjzbxmphdomkuqd\":\" X[e=8L\",\"ji\":617},{\"firstName\":\">Q&8(%H-<:]c+]d;cTu.2^H'.q\\\"L$sjKvT!o(E{Gx:YI&aGJN#b~rX2AIey_gdd@@q&Y=`wGKXTPz=7?gJVDY,K20g<fkFo-jeC}FR;j~x^9^|Sv4H!AVbc^ixZY11?[,[qv\\\"FfB^-FYZxJD8%Dor*iG)4N)vvSgo27,p|\\\\W?.?{uQJlBlO/M^DIc8 N.q|:-NFb>\\\"|o\",\"lastName\":\"2Ky2jnK]Z8f.S{'bTAlOw%-]S=V\\\\(}guzR>At;'Bf7'Oae0Hf>[52MBgf-){_~DD |]kbW7>~e%J%Og,_!q<G`K[(5fL&?t?)vxf2h,/?`U=CIV@AEpl;Kv1{ke6)K<4h_/ 7wZf\\\"%@a{G2}\\\\/[/KpU0Wmrw1p?1r/qn%Q D<9<mSV>Vc;;6?G@vMd?b-[66=-Y4nw` AZ(YjA !\\\\)Xe]K(M;yOIsWQvdA0)IZ]Bn5sJmpa4\\\\lhKfo\",\"password\":\"y_D&TBvk]K}2P){r2|bG>dSyg WGQ|MD(E~f$^IPSN_#$+<V*|Yd'f6o&4Ilg9jTpo#cx&_fyEQAUTINkr7_ca\\\\7a^3%r&c3OSH;(V4y4RRn?'z[j\\\"R2ouvg91Nf|ZC?O jMYG%q\\\\@HN+_XCKx6WIC#FB]lS_Gmy&ae$:])!9QMZmNK#rQy4L]++|/W/^\\\"}eI;ofk}blyN$Z/lQl]$t\\\\vd:u)1DLo\\\"qru:Hg{oE}A{yuyXTgS(+h_\",\"phone\":\"on(`#RpI'e=;i*\\\\HeX'>Rb#nf`9YYMtAq[YVu9B>M~YDS.h}0W!Rc\\\\='d!+lxk%##;Wq&!VS*jfpb}+A&cDcY]/`i)Y!Vqah}\\\")dm9N+0fS\\\\!&.<m(=/)6lR$*s\\\\}Xh^mEs*dfBJdS*qg|<]\\\".&(1=MAruIm;UQ6/wTc>\",\"id\":\"2u\",\"email\":\"|[v{lf}1nr{=?Ib`;HJ'0V?J9+D2/0)t kklhox3uv^su|Ad_WZk(A8D8_Gys^iExF+ZX!eUk29$]z+^#]JFne4W2\\\":c-xs-YpI_$qDlO5%H(Hr$dZldGHR{Lq[=7&B#vT'<?V~5eahSZN'8q|Q-b5&#&+XXJ%n`Lr9,yx=nLikkCa}ng449$lIva6NUQ3a?%})gKy(a o}^D|L:\\\"PU)l4N\",\"username\":\"|>D%<f6RP6F57td'(}>T1-6\\\"]%P)\",\"wkwce\":-844.4,\"mcvjznpibsta\":\"xa\"}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesUsernameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"pa,WnyjuJ2j9Z2X7-\\\"~\\\\F; /b@REC!dOt*,q! [r_9`lw!P1DJNN@X*ZZ^=I1\\\"$VrlR<NDL22EMupKX7v`mm}N1)G++3y4%@Atjc[(Fq'jYDpdp8!T%9?Yc)6zg+UV (8f/wHS,,|LnL.1~&}0Pw^wJ\",\"lastName\":\"l$R*bT$$5''@]G,WxOu30}<c-90FFksGn8k~%~ElkWHnI&En:kT3YB7uSF?ADg%59?H&&otGbKJa.'5#-?N,@[`L>\\\"+?*\\\\-vwl\\\"s~&d]72sLnAKO 9tF)|C6%eE=>R6HuIR0pY+r<^:>kF\\\\dp\",\"password\":\"_nx'i$\",\"phone\":\"!=&L6o=;d7LZvK<L~n;v-h\\\\Hj82L#a|O@7Nd@cLr\",\"id\":-642452953321514547,\"email\":\"\\\" iiB'6h$w&A1:?#sf5O}nWubtI@!Cp`t~kwV 5!+s/~~F&/^,dI7*g ^h#eP]{<% xecW0 D{9%|Y$R5#\\\"JKt1\\\"kPb1^bfk_n4iI3z.6k~$i'sa8|]4zO8IPqC!@s4q,[&LSl6M9C{G+9bil8)M\",\"username\":null,\"lkfytkjftookagq\":\"Y|i}\\\\gI\",\"b\":true,\"i\":\"n\"},{\"firstName\":\"D'RE=a{xG$dPMPL**ZMA0\\\\~9EY*7mXS[fj:=W)/0oA>[yG1{p\\\\rNzg/^re\\\"OZfc#$[p^w7=Qis`+RD9QbB0`x_]mHlx4$wZJKVap]O'!o[lrVkhG{;j0L7+XKeU3O\",\"lastName\":\"|a6P5si,9c&Km.n9M-JLfE7v$`/d~(S3ie|TTvcDqoRhW%K=@U8hsbWr8NK&ZZ E<|Eguw)sWO*N@\\\\t}IQ|v*{i4x1q> vFp{z9hF9]tH\\\\Bp0'_gk'nQ$g*`2w0F4(+xvw2 nF')qYkKPU9ne[015Y{N,5=[~`L*\",\"password\":\"V,FX?6i#7U4\",\"phone\":\";\\\\(uej'<M?|^\\\\:7nN2(\\\\o{m`?,yQ \\\"@!v$?'\\\"mr}`_iCItuE<w=NO}HuO-_%uu<(EY~PR7:'gx@_d_y)u#duCy*~<+@peN}J0uQ%,#_|p=haB\\\\B0)XULuO9'2%2zmFd.sJ{gX!DL7]uCPFWD%WYXK&[\\\";)i8{/EK!,4Kg27u&!)c!oygC0C8'v0{h:b;/SNoNhU_}#br=dca3*0cgHqKrg>(^t-qN\",\"id\":-3875080116390800926,\"email\":\"5:vPzx s(Bah]PJ?Bz'zvq3>+:vQMe]%6,+sye8g9scj=T2xd$8D[3+(DH*T&\\\"ixyW?j(^B8#sHVmaqT<]qx F(R|h8>jmvY1m/s7yxz LF'hK@9Qr); b_=My:`Ol~K+3x|~ {UI<umP6-2nOU/pKm%!whs\",\"username\":null,\"schygtdpmfjhxcsv\":-29.6},{\"firstName\":\"| WAvGoc0eQ7)1$%'$jqOk9c]9{[l7V_CAO-~Ymb+pgwLeO^wBN,^R'D~ggni'}:8Yfw)l [r\\\\:n/*U[miD4F`K(M%!A8F6x*swgmw5o}!Y<rp9YK7?'u}3NCO+EJubS2jx6r#ZXWwj!-\",\"lastName\":\"z<aDlm4iJ/05U0|=C;@6PP!Q~JJgO7|_y4NMzRK_T]0Z$v:B$](l+6uebYVHu<4AgQ~<8Qgy>D,;L =g,M+Uo@@0cY+<X@1fT[7Q9>!`UKUY0}OLsWk08~EOXZBz8E'T\\\"s%dr?w#Z)rYBa(>V}n]Mt}x^In\",\"password\":\"VZX.l4&2X-H1V3Wr~8MZ!|@3/7;Cd|9Whl_bg^*QC<N&,?!:3@',ps1pTbU+J63023m\\\";gE@n#E4F~1-a/YGB?)-k!*+}}vf W%iQ4sJ=1=-892\\\"RZ &)V\\\\]y~#zA#*=E]D<1,2{r:RtRarcsWOOa#fBEbi:#q>&;?c]ND'Z%b\\\\/&RfQCe:l{'$(.4-{F-TZ=#9Sv}0DA$YT4K>/q)hp| z\",\"phone\":\";m#r:U{|KKe:b4K!a_oDK7yx7{z_--;s<=u0=@X]{$aUGxv!J%'Y=8X&t0=$h9ut\\\\zb1WG>{XYfV4bp[Xu3RVgAdM:b6@-^-?eX}ywkob>*V0gVz7\\\\p\",\"id\":-1070772530122308170,\"email\":\"%Jxnf278O6Z|H]bOLf3]Z|28aCXh.t?5FK[H6Y?dr/S?Urm3drN&Y'+%S.yh8BUD5wW96]qY9$f9\\\\=Y_-yCEnyPqTu5TXx[q<H< xMF\",\"username\":null,\"hmvskobiekqnqx\":[\"fmBC]Y8J\",\"<<G{4\",\"]\"],\"vvb\":true,\"rgjojrlroduu\":[\"t2k1}Uy\",\"<(.z}R \"]},{\"firstName\":\"i;B8gOQX.\",\"lastName\":\"6W~PBoj0-m=?<wA1+8(|Gi4wyDs)ATCGrg(6[~QI^I:]&Kq:5>}cn8Pf&;K%7uDt!Rb{*^yhU|%d~38\\\"AA 'X2V61VIW=I6{.Udg@@7Ats}S6>R1iuuKEBY;44;IAqqum{9-0m,XzF>!X5xh69O7eI;$cA\\\"?cRdaN6$sPA:uL//9/biX(cC<PD*vr.ugl\\\"%.%SuO5|~\",\"password\":\"{c3B+_u(7b>&Ymgb%;|Pby^i{4Rai-N-zLe.h_`\\\"|DpVhUEwgqMfg}t{hi)Xd\\\\'RRi6DirlxwzJc;xF#L_o97P<a}iI1*U11K#d5aVy2[8cO<4oq.!NilOj[tXo8Yk-x$8,#ehWf:@RsR)){~zL:\\\"\\\\ljL$MaaKh28N[7[aEx8z})f~kR2dt7\",\"phone\":\"9V^nLX+T|yi]d?lwbGAZD-cjX;ZBvl7X\\\":f<3(&jyk}RfAYC\\\"U6I)uS>&u6)(DzDT|D99 K,Wx-'HOJRxSe;\\\\Qwy]Y)\\\\E:!a\\\"p\\\\d;TQ}41FOud|b\\\\Vb7:5h1u>T0\",\"id\":-4112294364522718080,\"email\":\"'Jyi0$T(bA[v9/L=$hhI77G:r/gT=u4S||<%dhw<g@uCHa1Ss\",\"username\":null,\"fxhzx\":\"kpUd,{m!\",\"z\":\"Mjs/\",\"gbmr\":true},{\"firstName\":\"k]p=LHAj-\\\\2XuaU`)OJeaP%\\\"VMoMfl7yH7T=}];$h3\\\\NS#kH{K@)f\\\"X 6G0$kH\\\"(GP3 W+J-|Qk:&Jz.,QoSuF|4SBL4gGYqs68[-uwfT-UjCwfFM7c\\\\#$k-)+Q\\\"^+#eL22H{%mR?qI#v>}bldhFoD^W-xof| 77)@0.:fn\\\\S+BR}>-K0vLSdSh!LsW&t@g)P\\\\JaN>y2&z<)OF._&<5YzrlK;-c{%WF%=-;?](/~s\",\"lastName\":\"9{!)+jR=jtzmCVevU4B0^b`zr1&+W;H/&-a?|)%hJ{-WY125o,){tknUZJ^qF[p3Kuz\",\"password\":\"=|M/N[vOB7;bd<x E>`QNQdgAqP'(&Bi6x](/vkijx`r[Jb %Rfzs,YQ{>'3ys1<&r!O6DR:94Q_v~K$qA'd2<F_9k,CCh($?8'ilVPK^ t<HAp0=t6?7?eFK(8gZ*^\\\"P&['eLJF6-[Nq>G0D4\\\\I9Z])t/W=1@oD).#@M2e.X95znN>&PK_7]<Ljryt6P?E\",\"phone\":\"D%5CB1=tNf1;,|4x-(BAR3vJ4^'4T07|QA[tIy|SQ!M-@W$O16WJo,tH:dL)L)`CLD~EcImHa6BYqfM{+`.h>UfGXM\\\"COleZ(V&7fT|r~W24*n\\\"V/T6)0%IQP;e&r!#m$5\\\";{Uq5mB}w=*pJjdQR;YZ)x<w(nG;?#a+r6vIw2%S`@.1;G\",\"id\":-3584836926314547671,\"email\":\"Bhy`GrMOafuxk)ZQr-*K$7F,)!\\\\+X!SSd*NH'[3(zA1^8W=YH [}G>or:Hx&5uYc]%y\\\"~v(Hpi)Xbw8)N]JO:%ya1=B-8T,eq+9eZ0Vw=!.Kwdv'=&SMX#0W8\\\":uMlhP&W )6^x fa%OO(X<c_-i00-TVn_Oc(_KyburewD,EmRs{_Nj[%/2BPK9-E!8=7)H-,W>Tb\",\"username\":null,\"pqphxcsjx\":true,\"jgzxezlntttcp\":741},{\"firstName\":\"(UlG!{Z)s3*P8&=,Nyx;,sEFwtx>&Oj!5?\\\"0/'bNrL~3#dCt)i?J\\\\cn#9mH:b\\\"%JiH>q.O8h;;dLF2FA\",\"lastName\":\"qlgoN8e=g{NQ=he^o{xX?]5BYLx3!.T6TS6\\\\5cQ8gCu>)1rtcnSu`Nb CorA'I1_2mg%#CY_iF\",\"password\":\"z>#]F$r[&w?v+z\",\"phone\":\"+/<J@* LzJF0r<065iJ\",\"id\":-2521474697081733603,\"email\":\"eN<\",\"username\":null,\"sewd\":\"<cGh@y\",\"ipznxyfou\":-158.7},{\"firstName\":\"pGI!0tUFSf><q*<Hxh_3!7AL((BfZJqh>\\\"2v-.,=3y>ER+lM^]+VGPMI8,~nzD)t3x%qx?]-v~3c1gI2fm{Bx('\",\"lastName\":\"SA`]9$\\\"f=]xr>P%h%fi?2BhgI5'P:oJ}d~s<S&\\\\$UDP5QzL^sJhIx-m]Voi#TU-NLvm{Do+w3$4g:qzx4hPDb(r4H5[7Dv?w9UJ<Q_Mrc(c~74ZeyzH1S9yXOZfPyIP??md1k%zW~p}O1tm,#zh\",\"password\":\"nz#r_-A/b.&Sfi\\\"<2AeBdY-|cXnIZjpqtXt]9{b`D)/8Cw\\\"{9?*nN9VOV}lq[Sz2awenP*Rp(r-xpMJ(F8mE\\\"p\\\"bA0mg4qLq@w/kpQUh}bgIk@B5s$E1z=$((iX60zYlOu>q\\\\aSJ+UN9UdXdGc.kiF0$,M#*X8c2|>-x`>i(]5}MVi<,Rj8#OgZ8kVOJ{HsAucn`H+]BReE97njQW?i\",\"phone\":\"D,^YIU#OI +;<TNwV~t*,<nD$Ho&[yP[8fWa7d5w0S|?01j.R\\\\t/^L|%e;h_c{iH.r5aJ,uXH8pOqI*aMfRXTVE]5e+p(q7x>I3s;;Rs><@r0UMqu4Dk@jE(xAMT,)D)WlRCEDq58EOXQo#a!13Dq&ImgqG4du9MA}3ih~R2M+D $9;jU6hqeuyW?Fly[HhELHzsJY=(~\",\"id\":-3295252377341513596,\"email\":\"VAyTYv%v!)xq}}7gF}<E(_ 9]M_^IF<L^WOaCvzKd po,-fv\\\"geTMH4&O@0le.3WJ)B+QR\",\"username\":null,\"lfl\":{},\"b\":{}},{\"firstName\":\"&pKNoHCSf}C%6^c-|~6Hv{MpY0;4LCT{(bz8zKbayqVCgiDeyBZ~~O`#V<R/g#'@vVHaMPO+E`;\\\\Zi`xad:m;1/5Nh)*5NzK[R&Jf1MkrOZ~<,WU 3i$mlndG#,y$aBvFrrviYJt?_K8|2_>mx_VDwzxD;i>noLl/oqb%L_jRvL<ZtPD8i,'[eYm37jm/W{iKXg, 3Xn^[38DKS[\\\\1:)CPGubuPP\\\"=<D!h%jv$,aDddlF0E~ c&!G\",\"lastName\":\"IRgG4S^mOIGTGJj=^2GzyW,gH[=HzkhcmRdPMBQa~bK\\\\X{;;>nsb$N5d(C<$ _}07,7W?vY2pmb4TF|UBdImE&cZD\\\\-xju-v39}L\\\\8j\\\"fUe}\\\"C<|GJE\\\\1zv'+pYqj9tk)7]\\\"BEi@ouIGaA,n!.HS(<Xs9Eze^@.a/_\",\"password\":\"'{Pdm$f%m?7$w3B)iD-mdzmOjt'{]4n=Xb6cs>aM^j5scwY8 /.$q!no!/r_,68jpuUpuEu%twNAD 13{zsvob;l#RbaUro~!KR4z>F\\\\:@DntPz^nARDm~;z.o?A(C'N^'lF~eL>m)M*){JF`>:JzW&nX= >](qe]ksv|`+999#Hv}^p}<03WisqI6P6,q;i80763G2;]?:M/CFTb~TO6J{{Ubqf%*9a\",\"phone\":\"x}PcV1_uZ@S!-Bx\\\\|o(`w<cmgtw*($Z&6g8|7[BOBgi\",\"id\":-2774930478256159952,\"email\":\"YS$*1QdKCq<n|IF=5~)jNEgO]/yR[]PVl<NrI3DE<xFnKY*Ta:{?n8{#<ao:0pY,!hbo]2,3;9b6ZC]g@E#J)ISN*jPJn[XW-~([^]]dRKzw6+pPd|alskaGho.Y Wpkmn;Tz_JF II?r7CEBE4+Uy^h,)7*k$]U}$PXP>g^|X/`:!<brp|POm!o5P@n\\\"\",\"username\":null,\"mpgvcffdgutrqjv\":-1007.2},{\"firstName\":\"-JGwQ]4l:r-796ug9Mh?r3$|\\\\D]\\\"%v_e*^n}r.%bSaAGLMw#he~v~@t;St,]e@=r~g;Bd?X)M>n _39Vfezwrju]D73o){km;O)6.f|3GI~HG@+}{H,^t|\\\"8}f3:!WRl8%o!uxA V,\\\"us>~@iw^l<S$?1lO7n8c\",\"lastName\":\"[|o^+SJK|6=:nK6JBD\\\\REc0J^3AT\\\\>=G'lydG+z-*>)<YL-)?)nhXVs.dU5s<*c]lWV^RYrH`T;JI &<QU4.W]\",\"password\":\"n?9c,AIe748!y~Zm=!^'(Y:2XjWKsKkk.@lB-l\\\"3tKY[#BH:qU>28hx*oc?TKRsGK`U@YN^?m#|xRyMZy-Kh#;_1YgZ7DRX/bls0AUA65N.0.[ /n'bT(nAwwF{QL5yX_<eceb4EY!NfS%x4.@7,,]sY3 r)GN6zKRJy/z,4? 2C@\\\\kcQPY=URHI-@\",\"phone\":\"jmz0D2NBVCfL`.x7 wD5=\\\\LP`Y+OnF{T)Iu!'2g<N6I?zVs#A5-/p$>,%<|>rCA@C%mVcR]p\\\"Mq$-O5z0Ko}*>tK<M4.Nkn?OG'3jHCv9(P~|pCaN+1s8x\",\"id\":-4436498337469967726,\"email\":\"^MfE:)tvpXkO]Le}InsIdQ#:%;RGW-EK.qucvk)>qA\\\\IVK$TC%0|N8!\\\"^f u;.8Yw&0\\\\SK5[\\\\iOc#.+[S!}s#C<t<^faVr)1^CJe<]5^B=5+)kcq,eEVMaYsU.yJu4.xX)|ujPw)>ljSZjc>lusCaYvA(\\\\wj{vOoX\",\"username\":null,\"dknll\":{\"n\":-85},\"swlmwzjkcu\":-31},{\"firstName\":\"}_,j#R>$>_KeRd**N)I]!U}3Y4s!r3&@NfgkprDCy>jc:Dxd(W>\\\\BqL^+:l{\\\\KF?PW,m9hM=V'&+c{)*;W#{}iC4jD&>\\\\h:0P75P!;SP[?4<R1zS_<\\\\>_<U^S45*`?$#]iv{(=JX?-IuvB*&QQA[,zl,J~C9V;Z.{O5fhwcDmJ~),Y{y8`a5dkdb7>[m<m`1]2[wHKls]_i\",\"lastName\":\"GRHB4\\\\?99a~D|uN#h}ky< C8b1s}bA r1S1HY'?}'#*]vT.15LrKTJ4E'AN~ZTz+x@D'u\\\\gNPG%cN\\\"6'>jiX-+z@+/J0ZgnOw&!:QEJmC#x~cn]7h46!kUKu2vYNje=!pp1QlHiVt3<Z<3t'H]rYNYb0L)wzY:_^Pbc29Q)Gd@Ah[&S;VkT:E!mHmaPyAC9D{)7O1&3aF -L&l*^#Gg'&iYb`Cj(DAc-xbf)Qu\",\"password\":\"TtV/{E<xuX/S.m4tww/p68xJjxo^G,SM4@\\\"NKUufnOm1FzA:[xM_o+Z&%:%(W9I<g85$lC:$h,iY<~dwD4)ZR_:tXq\",\"phone\":\"*(D8H8n;-/VL8-caK\\\\B:?gWJw.45*d {q&;PJAF]hm|v\\\\>,9!tT=fnlNLv\\\\-fB% e6^.x^QnY{}6}^+A]x{w+HV>/vGof*qS;]SLEP\\\\B$W S.u'+'44kdsG.-v7Urk-BVjlot|m@|:30/^XVM?|GRGW,:V#D\",\"id\":-3061086339525869496,\"email\":\"btn+#b$|W46WoJ$T*}&\\\\W-3dAQ_J~'JD:~}v3Tfy,=9wgP|lD6a&RLs'pVxd]<PQGh#)I@h6#Qf,PY%]@EyD~mf~tGw$>:72)O*d|&A_@*^f7wAWN##x9$a(u9A0C5d@&DX+.Ac\\\\h<tZd\\\"j*3ca/*rNj*,]p90r+fb-9o.V /#(_AO;kP2mbEJwQP%q7K3_T-=o\\\\\\\\(4.mf*\\\"=og6p@@9oj8:`mY*yk\",\"username\":null,\"jaoeoxrthrl\":-686.4,\"aeaxlyuyperlmvv\":[\"\\\\e\\\"[PKg>\"],\"r\":true},{\"firstName\":\"MCIf=DF:m|AwMPF yocSa4\\\\b7Z5^fG-k|=0NgHq#?+Yht2_cxwL2&0@7z29[1Q8*Nd^](qX#O%L,ky;E%K6+Ee~s0u|bu#Ls5/<.s'Co&fnLu_lMUEzKv@ssv`*\\\"f%ebl ZNg4VBT&6Ua(n))!{iEC3:f\\\">^,,P#1-, AK{]6tmm2q#(UR\",\"lastName\":\"qSQUa7v^@=\",\"password\":\"=3q#K,+|~ifNp~\\\\1iO/MH#Lc(P|}1Gip9u7wK@_+S:;[pNJV~)4LS\\\\.qj*P.>016%(K3UXg*LjW0(BnoXMWVI7q\\\"#=:LXO>H)K99+\\\\F-FI?Sc`/V?~<j*8O^PrZM]teLKPC9v-7}H&SH2mfj$E,TFo2 W'1gKXJdXu!B\",\"phone\":\"*shpM8JMl<nBA8/ C0bZji%mH:/iZb /EpL=Q- OpzckTq8QEOJ{&g@)R.\\\\sJJ\\\\/g>UNt\\\\B)mlZ@rl19|}~0TUz.q+@Iw!KPZIC.+jZfw:`NkI<AJZ@9F}3XHL7e}bPeU^LB3VqD:d?W6:UlgQb]s?(7W0E%#/ JCAq?@?O0q{HjM\",\"id\":-267513510920765803,\"email\":\"&D57davl taHEin&,QDt4)]8.-4:MoDj}6?`iuNoJ..)Tu:|O|XGYMQL2B.'EE-X*q_/kHU%FjnWX $E3MvCN@/8NqH'BL|j/J{M=@^WNz'XL9Nt|2OU6l&7*[?tP@wcEw(1]r8ox9^HF\",\"username\":null,\"ylkcls\":true},{\"firstName\":\"0du@O>RGqPk>?16I>FE|56^(UV@Sy2Q^M\\\"w0.4^9x?}lEU'Vz5zFp}F@m{>dD$FF1f]?q6<),.q3O4zpDtnQHwaR[9&yTb/QR4Yk+K2B~[$>|nYSfoRKQ>!VNk6d=xDymdj6:y&d>{2//:FFJ^MJ.`q.<>)<~WtQ! l/'j_snUxzb56WVVv\\\"?<q]&lT~Vf|=ciwp+U|.p<?Ko>mT*4eeILozV(<Q#1I;SU<uvn30Y}|JD4H \",\"lastName\":\"e@L~@\\\\+9+6Ae:-s.52vI>y4lQ=.dp!DI?u2W}YV(j\\\"Nm41gnsRX,f17V4T:6u^K;y Ny3%(igwubhy^2a7{#Whuf\\\"+_r?UX*Jd-5j>Zi_l2j;QR{|u)xA<V[SBdMwD ]ua|N._Zm@Lca&|7^\\\"<u6)WR{9z?j;ij5S!R1ovF.A!*N9705@HJx~d_UPPW>^lwx\\\\zi8'*t<ZQ<k#S,vis@QLUeoH A.-7m$\",\"password\":\"S'o4LJSP)u)4a#cd?^Z6r(8}5s8hQ9_g\\\"vcBY,v`ir8/^/9T)dq\\\"gwbp*x#v0[L3&yO}6r{^u!Y7G{RvN}J1|fK(@w4oQC%Ako;Di=u{j;d\",\"phone\":\"aP=7x&m`EjN1>yzBf+&VoAEC^Gd>91h'~X-9:<~W?G4RiURMLp$X$@3uNbK|mu*(qGk^1W>@)\",\"id\":-992448471892067567,\"email\":\"j1jDeU$t)kHJrAcBdI~7+b\\\"jS*Qn@EK+=|ZJ??\\\"6y'7 /s(n?p,lKj?9&#<7j'\\\\8yd)SF_yr(!lI~okes|\\\\7suF.%yKSI`iaU)K,o7O\\\\o*~1;jTN'QaP`I Mno%{D~|3}eey]w~f s.!KLE)IiK8@MHRx2_yDyO~I{[Dx+>`)}/^(Da_1F vU2Iccg9.;Tz~=3\\\\I<r@VUh[=X4<6# DbJaQsY%?{qH(3EqFC\",\"username\":null,\"dhgjkypuey\":\"RL+Wt; \",\"jrabpxqpzkakekue\":-147},{\"firstName\":\"< 2z\\\"LR$}y3`Zh/85P8P~=yl?g-)^c#G~1+GFJ2oD|{loI[|14a2aPYxI-/2Y]7'\\\\r%=C2@)o_[QIhG\\\\h?p7)ZwjXep}bJ5Am^L\\\\P.tM |@;l*|j9(8q<?\\\\jd4|ULk \\\\=u[2Eq\\\"\\\\S\",\"lastName\":\"~M2p34]Q@{fP\\\"T`Xy1RpKpJorK|AHgF?m{SyZt'CVy(DPKfHc_L]u4RUp\\\\ARE}LD:~c9m]O 6<Cyd`kHy_J4~a\\\\=>@zq`wz@^\",\"password\":\"j3543#B>G\\\\YUR(fV OJMStj}zbQL>$\\\"J~b/(@}Sz*NX>/ 0ZqW|'}$NeH3.mx0<AOnwHSma36=~\",\"phone\":\"TzeDm){+'z_Ijo`<%l(cw]R )(hn5SQNLVeU[{H%{8\",\"id\":-90706505397412158,\"email\":\"2Btj'y%r`4Go>Jp*(~YU}*.ztlgcNA\\\"6e3BDdHDhcnd:#g4\\\\`rJ9|Tw;\\\\jITBGt}h'{5eN[5pjx2[X cESWE20C.x9z$WgJa7 |Hq\\\\{9Mt_z==9gT czd!dw!/Gl9%\",\"username\":null,\"xogkzc\":\"3|^~e&\"}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.username.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesUsernameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"|?)@gDV,qAl<,(kd@s{b#}PbF-P0PA#=Lphni7c]6V7rtQ^4a?9CqIz]6#+&hEl:X``NX|9c538#rPez>Q~ MYGN$Lk;?2/)y3`N)JA8ZQE%nl8MnQIHA_Ol36G\",\"lastName\":\"}2@5=~[^mQoBq85QDoa\\\\2>5>.!UkIDarE+D#hQ0@ __6jrMPE3qdK}.3Dy#wDPRb=A8SJ=O o3:zv5M[Y$bxa {os`@YyG1Kx$!?%twS$N_ZSo V&$&-oAS;CGFMa\\\"aW|~z>O<\\\\_EqJzPd4a8\",\"password\":\"t6ya|N*7`a!`'2yqd7t:\\\"}zFYcWC}#\\\\*5br.\\\"R>EsfMF\\\"9Z!A\\\\`)-w)b8>MqI5~C}s\",\"phone\":\"6RV_G@Eelsr?MI_Vvhg)$}Flkz(<~J;OF38*I`}joL=/emR-|x+pyLKH@%!:B;gpi;^}bK\\\"p2;/lTwI-4a^g}?KWD,\",\"id\":-4341365419124353461,\"email\":\"[[uT^6z_\\\"0G^/U[n?Y%]5C$|KZnGjE{~Sb$Fog3wH-r$U0>,}AzLc&5P[0Ji'Q!};67[@V8H7Qb\\\"F=SMdRQJ/4\\\\PI2mU\\\\ti/PagH a,Fp=ePC#JxK|[Kt(Uk]>#{2+~`q`Dff3;x?%9-k0$~[/|*PUH/dhd%FqAqIRPC!kcv{'8+y7LB0+=Qvs,Fs503zz1-!|4Tx/jbEC32u^!0$JZ<0xn0Jp@|jr\",\"username\":723.8,\"sqojekggotpqhrpm\":83,\"lhhlhtvclrxxecf\":[\"\",\"g\",\"2QY\"],\"dfgpt\":true},{\"firstName\":\"q\\\\<Cn;$Z(1|6[{\\\\'OGc)xyDKI6Jp-$a}?F!).q7lKBH^\\\"JYg\\\"9gUMJ~8U6sJZL\\\\}-Hx}cQuu|/P_}qRoOF~Mm\\\\yOM/F5s~'>UZ.KOc`4A&RX_{y%!\\\\N`0n&8ymnQ'}I9H+z1-3Z\\\"P@\\\\*VO4&6__9{l;`&1.&{VyrR15=W>:iB+b5B{{p\\\"H4QskT,OUz2c]N{1DqoL%@8\",\"lastName\":\"$r0MR}0pv;+f}Pk4KiK/!}gE$ek7RX/?_,7tKw85N[sR/jbWaG3%`}da=ex|zkmPZzDqy`H*v-I}]S7k S^)9Y\\\\b\\\"Xna,E,_;Cyv4+y[nySLUl:^<Tbo`4DjPMagWzf P=2`1\\\" 2c4IX-2So~45)T9Q|2RbAv3WpQfbmG!_.rP[na0S\",\"password\":\")[F`KB{so*_A~CDi*Ur2@d$1D^p#F >ZbX?EQ7:C}#^.DP`<%C+q23\",\"phone\":\"i*?S{Op%WfY[>h]p#lLWsZAiYMW/6w98V~->V-nbSN,:M\",\"id\":-1038772943075465719,\"email\":\"$.}v^LW>2mP,Fj44~#?#RcAg&*Qn_TX==&xY'ElauT1V26N8Aw{g58#fR13Dt'DSwK=W~kNmyYrWe8iE^~!S:L+\\\"n.V*^!$-Y:kt/IdEvJ!R]tulg'a!HPU,VU)j$u}Agz2=RiDxBiG{_K4UmdR_dTDVO\\\\+Cc]ScB}@L9?^Et/U7#ipds{|zN4r9V7v(TV%\",\"username\":376,\"vzilghj\":\"%\",\"aspcgz\":-167.7},{\"firstName\":\")PA72[v0 #ey_XrM\\\"CQ7fi-Q,8YUv^/MH^|[GfXbt914mVSm-S,[Z`u,oig'l%!co:Xf;:Ayx `5}>'%#TGx4Aui;IkG53)X6E-L!b1~p,M^_0]hSnB),|WPHcN_d.MpRWIbt7<>c hUk--hWCFL[vaD:diMg4QN hr<cnh-}DW3I?`6O|(&l2d3W-_K:kkEg8t~6-#]JiZc5P=*AFGd?gUBvGUs)Z<KN\\\\wl?c0!a)l#LUvWM)y|fVB^0.2mO0\",\"lastName\":\"3nSa>\\\"@3<GobZ-~Ns hG|6n1R!;.A:A%}}C!6:B=H[!vS#KTJdHCI)g3\\\"1Z/0CLoLU7!'Z>mK2* (<0~#hO./`Nz(n6XLhO5g(A}4Ta7G]sa,%d2Bg*({nf`v\",\"password\":\"}|2iFAuZoH_o]6HCbIo)?5]fci 1MfJV?mK+*=|p7q\\\\F)% ^)\",\"phone\":\"wxXTjYeeQIFJvOj$Jv>5Q]%r]Es`$Nkt]wzsE3K0z};gK8~03RzR_t,c8`k*j+l`%dCK8|C~\\\\9/9|Y3!>\\\\I!HL9>cB7rQ@0,)^r;zC7\\\"c=^EvrQn=vhGg2;~w(\",\"id\":-384458968480972089,\"email\":\"Gd>wT/*liqUOSoZ>Gk6phC@|Md2D*zr8 HJ)V6\",\"username\":true,\"orqiyocxypdlluiv\":459.5,\"dlqseaoa\":-860,\"xzpppxtsmuytrda\":[]},{\"firstName\":\"HB-6,4#&!3)3wu ~-_^4S3mr=4'.>  H%@c\\\\3aqoXbFJ98i%pMXb<z 2`~vgN$|-SiY915p3}NKIfd)m?cFUou/|I_,JJ]FZ_S[D$y&6k;*QP7bvDJ?KE/~XJ+`G00Z.+$hnsx;6JQg8z\\\"9\\\"@`u[B6G>?{M)]ui?jVfQ3]x8(P\\\\/&<C9-& }+rnn3}o.9*S%A[mHaHlw\",\"lastName\":\"Z-P:3!Cf(t45{HwgXK+N&a0[Vr=HK[Oz;<}44k:fbb`_]W-&m^m8$HP&ApgFu8QqFVHA6mg05=\",\"password\":\"LO}lr@6Wp0hIvEODQl\\\\B>Dl\\\\%QgGMy~?!Q&\\\\Z6S-*UVjjaD2zb]YaY9 !=?mlsZx/m8xm85<`!b?X%5wvLE3-azNl-SgH 2Lhv;S?E2Z!/mG4TVbfJWKfz$/\\\\ 5hG'8%.6F{vn=8c53\\\\9,p]c E(FZY8e,kyJUVIwvdM\",\"phone\":\"h|Deu@3f1IwfU;QiU=g\\\\Qm_(AP/gUNXiCo\\\\W2MHagKQ}aDf[bY\",\"id\":-656773407317408293,\"email\":\"( uR#PH$</*lDem8\",\"username\":[\"AK\"],\"gpsxkuwkjoeoqnc\":{\"krajbbajnxtypkxg\":948.2,\"njt\":828,\"kxvlcq\":[\"}5S(\"]},\"narvmksvdkqzvv\":910.7,\"kdsrjlmu\":[\"P3M,P\",\"K\",\"2dm==ey\"]},{\"firstName\":\"lIf,SJVU&MRh6gLnR>Q:p6(dRv'Qe,=e~2%kEr'+:X`WI;4ws3lZOYk.w(S=&`^diJY+u_blh1Alfgwd0=0hT{>Stx^3hG/TZjk]|K/gJ}#,.w6paOW0(]!5m-2cO}X3hIoPa[+a(ek{7&V[wsW<5:p]\\\\3:.b]c/A|3@g49!LA/a&[#=,$DGYR\",\"lastName\":\"BLxBU4,ER2\\\"4HfqoT0RcMLXD9}:*Tcc@~9rt}LeHh/Uj{'TXL.' U}ggs|ZR=moJH-]f)u*rnSn-UP>YbRo!LROI45o.gL`Uuq~?8m]K\\\"6:&z\\\\w7hf&4BGqZF{ld{I#j_}wRX?@++;$S%wC#iZhn3*mykG9~yv2T92DHm\\\")i1r%Ah>;~-X-.RUx%~6 t)NQCM+'L}^eEgK+-S*RFMC-S_83*JNm0wF8?hZ{wo8R{Z,X\\\"`b/\",\"password\":\"k?3oXGD7\\\";Z9H;QPd@dM>f3t6Hkx6{{9EIvJ@C8l.R3amB.?^g!-RXFP?**ZkREHk$,O%!`fjjNXc5N>5^WHv/(uBl %U@fv<(X9R;Kg:7+vdl5(Hv7Qg'pK0)Plc\\\\~(r(Lz5tpMd3npS<SjM\\\\e22\\\"D3Raa\",\"phone\":\"tplDFn/D8h._IPhEYnUl($EN7.)~kBY\\\"l|79/[p_N-`{f}~rsGPbS:bvF?Qt=@22?s[F1&pmK4&- [o+MZUQ?sfdW0~]>umjE,zk:y(Xg3`k|Y'`LCVFOl@\\\\#5)n7QG$Ejky/\",\"id\":-2322514813821094924,\"email\":\"/M[7>(Oq&V|PGJ@R*ObKicfu[XE'H](s/Nf5OL|V_f{5VBGkr36Cwth1~4?[70,v19*dh;x)zdq]^@!GB6iK>lQ2}za=5>^&)R^A`DOoW5=T=zygzU`8>uw%[0Gqt4<\\\"z=@1N}na3@9Bq1~6;-MZ5>wGqa@74:b>E79!9q3K:,Jn-l9V8-h]C])- TCY#,YNP@IznLC4w{aTF*N}N`*_Pl':LiA<3`M4\\\\UQ\\\\A/c;F5Q=ps~w$Q!^p0O'[c\",\"username\":-941.5,\"lfrhwkoisxaksrj\":\"a\"},{\"firstName\":\"\\\"QDt'zm% ^7rX=21 S#*(= `:<wJM]$nUu5m ove+:w~@v=xGBt`6n0692(RPSWcDdV3AXD<KoCzO\\\\p`U<`Yq6LOSUSL4|Cl=N?0$BD:s^eqTnIh8$rXInqFo7AWo>mCj7&3[7B~<IBO X5_MQ-}_6}h,%+N}Z&!e\\\"Usq(9C;C=[B3--?#E1_fD84{g{L*9+;Iz~p)k(@%iwJz4b:hX|t1zijc{@Y\",\"lastName\":\"b>]9+}x2zq0n*h^H'\\\"fq2(04,GU[I*W*`^gLtMWa[-md.IMGZ^dm@Vhk%h\\\\mMyWK?dNAW9_fK[\",\"password\":\"w23qA;U'G%;60v]pSL6qv-P<[.MZY\\\"Ve jwvz-*t~wSK?pJS2~.N0M2R1c/81&Y,>[3ai4[/2^I[J<w:.=W8oU_$Cfn_F!JA:3S}vdTh/Fbx:]9\\\"9j/ \\\\k(d2^[++OBj/8a2=WCg\\\"{)e9Ts!Xf0CYM 7~!\\\\PhK%B7L$Skdsw5D&1\\\\TK=M1'h]NSL~&HuC$f?iKK$/w3cabSBD3]*WrLl\",\"phone\":\"x@F=+w?]|=UH=l{'#=?v?Lh{\\\\v[y1D MF@jmvRd) x0'J3!M(+83*YJ(T?WJat}@(E{b3U3=Te]Uljw>^Eo^5:X0fI[P-@r+xd\\\\V#|XM\\\\V@TT1vk'rZ&t#Httb$;Bm%;;8rGD4#nrBIK oRC+=@l]Xo5$CLiZ{O@emnzP`~@p>;<)YBk-xmm\\\\V7wA(*mNN.-9|s*J{DPNJ/j/Cp2xQc0PB<\",\"id\":-229521494419652513,\"email\":\"S`lesG #Ph\\\\w~7qHCH'|F*/.ow( L2[MRnikjAuSGP8W*xfT'Vm1OP;GUVq%kq&G!{w+Thru^^tT>X0x%_Qwhs+9fr0b\\\\OH 9QgDc+VcVT{b[&7u>JUJK,vS^%6E(c8~7Dxue/}w7~D|qIr\\\\t=`xho)!RJn/p(YT\\\"a)/gQcjHX|a\\\"W<#\",\"username\":{\"aqorbr\":-367,\"gvl\":[\"L/XmG}&\"],\"by\":\",\"},\"b\":[\"E2\\\"hH>.\",\"\"]},{\"firstName\":\"/d_<ho/V]xK%^/gU*QwP+7'0z/Pg#k }:6Vf5!((udM~[e$5lL$zts4=*al4aTa&qkS2lgwd>1DqiOE?X2AU!Qo7;*9CiBIW9z%19-L--GbOd|UMc-J1dz\",\"lastName\":\"0CGw,e,j2`N:>w:_>$R.y\\\\jgVuBg&/E[qD;JS2sLUo[lFu%_,Omz\\\\\\\")bGV5JbJ&>bYu.a`x|c$2Kx!sGtU?A).m)p}ULQW-4cL4g[2.w&mbC|L/H@sUFL|>9\\\\g}2x=gWT,!t*h>[xe;*1 #+p2nHfKRszR1.)u$HG=?V566< \\\"*\\\"<oL/m{PoQf\\\"8Ol b4YPn0rX01M._\\\\Ixmi!sd?U4jW@UA.ysI==H%1,DZ[k'-5PG1{[$I+\",\"password\":\"_y.: fAWFxNuQ7@EciMT25|Hkd?ZV>V+\",\"phone\":\"MgO6r}xIb+MXN%FsG|&6s85|r)+MMCs#ZklWW&Pow,OR~20 (Hnjp$O=,<NMfyM<osLJwsty;,x9/'?%U5r{h{\\\\LR&'Z,NGv[b&1rh|%I{',\",\"id\":-1070474831803420688,\"email\":\"VY8VgeP/-x|A&%$>m[k9:w[}*f%P\\\"W*wj^xUN7m%o$:/Ydu#JPhTr(v,VNoW,O\\\\C[@FuQ[`$avlxHn7CD1:|@xF&bWE7BLP*\\\"rReZ3z]$4[46h$y;k\",\"username\":{\"cjsrfgtot\":396.1,\"jnfrte\":-268.1},\"nvetdcxbzwfcfju\":true,\"hciqtap\":[\"b\",\"Y5\",\"9d5b3c\"]},{\"firstName\":\"'l:;sL.hY]'k06r^VP+lQ2etl!h'ZTm$g>)@( CGnFX*2\\\\l%7Ve#,X:|?a+_^PJ$oT9\\\\iLOS\",\"lastName\":\"Kb=OBN/.za{,{\\\\XwGE/:*Dzg\\\";sG{a8Vs%4?y0aC$3SgC{^t}Q+P6VR8G$W8>+zqD#6TQ@*9:(P8;^KWz9 I3ls9_W&.#|ENie\\\\cY'6)w &M/W!c*#S`%cI1(6,OgNw#CmOmEOp 88o{`*\\\"<.!k>1il:hZHm )4~ F6`*3,cSz9PiyAw8W,Ln_e\\\\M)StJX>!P(ZmvUeD*WNA7iP}*m Wd_}+Hz{lSA<Nt\\\\Bqap[^-ieS~b469>``^AMgE*\",\"password\":\"b_cp2\\\"*NqfUhDoX\\\"x(P0_v;L_0=y63X\\\\}H2ly-Wto,DN[+:Id9l|b%!4l=B*)G:B_l*_c^0{(hKkjl&g:Mo!1t01!LSZPsvt#;iTalc9|U~y@?\\\\WTM3t.Xt(xvS\\\"&(!^2e@pPyz>W$TY*cp#roCG\\\\Zcjp @o6G\",\"phone\":\"LMB+gU!%;M|Zo);wV:{v;H#qlTmuBbVsp8PL\\\\iAm.`aVZfcg\\\\C@`NMWsnt/%\\\"2E*b`[5P0;<IX92ez]zNAol0TlIh2Xc1Tz?4.Ii/c\\\"lD~IOL:`rWvD=6Fe5o\\\\G#-)T}c;0\\\\6Jc`.C?+' \",\"id\":-814726995283039796,\"email\":\"7ZZa<]UTIe#O(Pa*\",\"username\":-506.0,\"vpgxpzjljdy\":818.4,\"fomnizeg\":-179.0},{\"firstName\":\"Ux,V\\\\t_l3ewM{P)XNo~Evy?6% ,D d<8bu=wGvU=6,;(X/``_X]_)AM.\\\"E*0?ur!`8q9*U-L9,3Hp~Szt;{9/7z+fSc/(p8\\\\US~5?4w*/M=}FH\\\\${v@|!N3)\\\\\",\"lastName\":\"Pc{i7k=F4\\\\|'T7AOx01^d!'.hHTF)X\\\\l_!#Jr=58nYAncXF,H3qSP;&20[>>uP#lX%]\\\"m^DRs{FMrS|-va*#>}HkINy4R?P/ux}Q'uY,v1 3-igxT!2wt{XS0VS)'H_:^sB3kQEW!H^J&-X87G-:mtn7Dy'5]HgBWXTN4p%FYC(vX`Y[\\\\lT.)4BOt*S0*cr~R2NiaBGz`|\",\"password\":\"vV`9UbOg ??8RQ-}xhR:];l'pwC3_[\\\"E\\\\wY \\\\aWR=v$Us<#]UA@FGBA\\\\./j(odk;V3FHCV$Y)*% b.ul 6>lV''1Za6ePy?='Rbocb`0>y),|_lZM'NlEa\\\\?P9,(8]g#y4*s\\\\=q\",\"phone\":\">w=ji['e\\\"2u5kvG7V{9txEKf=q_2.(u#OrIJ~/M)S&:X4Um4G`6L)v0x>k;:V45uK/uG$whA'!![A5Dk+<R\\\\cz|D7+5(~*SjRE~/h#1:c0B*269;'N4wLBz7LEiG1C8#5MsIS`9':e !j{L<# Ff:&&0VCwOg&9WWycPRgWc+B%(Bx#dEpY?A\",\"id\":-2734774784141249853,\"email\":\"rs2GKk~Z>[<=*+t~Z~6e0RV~od<;U8IsLQ<8'pQFS!JQDkzSJ`M)bWAQwIibMIfb)H3G\",\"username\":{},\"etaxretdagteam\":{\"hosvpfwthffe\":[]}},{\"firstName\":\"vUel:3 p,n>^,]:c0QQ1Ax%9]{O)6qGs]RIKp-p0YE9zm_1TCZV#mXzruP+!?#E\",\"lastName\":\"Ee2H6pL8HeA&6 g\",\"password\":\"5qvHd#,,S^J1r$[E?),Q=;X,ap/;xx\\\\jYa%]{0b/>gd@j0xE;b\\\\$bSTv'Xc(t7X|X:H5)(z-f&R@+b'u(ETyfBo|-j)gfAki sS6re\\\"S~n\\\"u<[&hY\\\"'=6qwLcjs7G<8[\\\"1@5aeGWIea{/um.#gkPbxt\",\"phone\":\"ctBP:?Bq{-y*|#._~nRM }%{yyH[VT`c7ZT&j*-z:OB:Fi@=h'/v*#ELGMtFWY ZCG+ryj#4$bN%>* YQ;45B9lm/3qjL~l{`Y$i%_~C2iA\",\"id\":-3992963954071511131,\"email\":\"@ZYX?]N(6~O}f^f'S8oQ8}$L8z]SWKX)K3fGqi#4V']s'JS4e+vmd.=@_Fw\\\\imh';_}}~HI^s@I#Q`n']lX<~P@]8sX\\\"Z^hI4nd)].HuVSZ\\\\+FX[5e\",\"username\":-878.2,\"lxbzslklz\":846},{\"firstName\":\"{c!`W]9_B-{F,j`bXIYt|Ah-0Tl]3KEv]$NyP)%r-3/ocCE@LSrwMVa1MOqMhLHCym:4CSj0O0%LxoIITQ6E^[r Xwt0ZCCC*qL@OR$At\\\"ya)2E_0.sJ9M@@W&HNL8\\\".B~PmPIL\\\\jb,vH1|]f%X@n]`\\\"9.^:-.V|hRP-r<-jo|tbvu_o3ULW*X?u1N%bxHYxem\",\"lastName\":\"+C;{vg|&D IgnOGus:Yj_-|I]>#Hutp`^k.5M!.4^?#i-T@%;u+KLAV7fT_+ZQy7d~%rqWWh9rs@ C`KG5Y@*63^BFw@TQVKxFV;KSw7%:MMyEB*DbvP%oYNhi{]Lf-cn?3W<3UX)be%9}0f1Y789hhnwchTK~q#(!d;zdI}q_g1HKLgzrX5I|#45\",\"password\":\"C7_Bs!]i9q1x30u]&5/$#&07M.KoskApqrZ-2\\\\+/5Fo^mH3L_*\",\"phone\":\";V\\\\-8WD);`ivCQXu>wHanp*D6^Z7IX,gX#11qY6o#]3y<X- 8AB9V^6h_~|lP6(.$r2<kf0,v#rG*&:3FJ;b#SK$t*G*w0pSXyKBPZ[WQ[5`H6LFpw{_[pp VR'2%^7f7Lc}&qfj^)\\\"f=Nn:x TA5_It1 G;Yx]zf^sb7xbs3&QTM@'G~a*\",\"id\":-2106940507266516765,\"email\":\"6#Tt}U)nKs2)Epim0kxqW$]'YexE)c}Ld?`h4oc?KkH/u !r!MMsBK|l&am\",\"username\":true,\"ojmmdadcyqlwg\":{\"ljrp\":true,\"ddz\":623.9}},{\"firstName\":\"ra?@D9+j>L#-v]8&%i$a. >TI@~BvsV- =^bm/|S\",\"lastName\":\"VX-D53ge~<Fdg6;)ec-hYX2W!LcuCk Iz2<a|q^-x{`oV_{ e{j~UiOVIh#\",\"password\":\"V@t):}y0xLoqVY<>SuV1ftHhSA:HzQ/4U),t?6AI zNGxjH2<sH$qUFfSSP4SLWR)#5v>)_usi`=G2=Vk&sfQ>j_ yVh3_kO%s$&^}B]G(D!/O?>9DU+|CNML]{u:,<h@T,Z,f^EJ/dN!P*,Io(dG(x])fas\\\"|T;(f1`b1NA~1]wR*s?&vTmw0<%aH%Zq:o4d/$hXi[^hUE\\\"\\\\GpbgI_j~w>(Gz{;;<#!{q|#{F@KA;\",\"phone\":\"<E -U$a:zl:aH9~pmIdEo?j>t};$VG\\\"ivA)JNe]p~=slc(VyV|4!~rui\\\"CD\\\\ W2l`s^6E\\\\R</}zM13k!wqba}g\\\\F~WD[`cdub4szA;JYC'*i7itm0I9@X=.\",\"id\":-1136014281936572427,\"email\":\"T;7Cr|oMKOdCGmZ)9[crCo:OuJ)BW6h6#6?}Z/!Lr`n~]%JD(,/$&RpJ1A@TApR4|;>,ABLIv9>Tvquwr~\\\"_J8#R_q4U=y?>?h{At{P?$ikc+*;Kf(fo-Mk. 0%X(.*Y+V[XrqT?\\\"a!gFoP]O#N)8^kDhG-_-v3ciZwKBWVmDts%'E>lLc8T'CkMSM7 )ps!O3=U0wX^w~C'&B 75-8nl<p?*4^WffNO.-}h2K{fVA\",\"username\":-242.7,\"tymgzqcioy\":true,\"gqef\":{\"ibygjfygcp\":true,\"ti\":364.9,\"evlbqrjzdjxxukx\":-860},\"bodlufkeexetcvn\":[]},{\"firstName\":\"B rf;_^^I}B/VPmxsLNb96VvE9p'id/)Oc\\\"[(P+b?gtb;KZWlL[6lUeN<gc/L$gbj7BPJ2`^EwG2As,2.h;Cpj+y.P}IY,>c*o<'mmQN$!]]Ue5LEK0siYtZP#S`<BV1k(\\\"CJ09zdtaimr+l\\\\@cUpLJA?A.sy7O\\\"Lu9UOoZ$`-u@PV&^Z7*8B'`4:M,1{jLYcKuap%MyDuxJ1i+0Z8ogWV`2CUo)T&(}L\\\"C9$e[FbW(dQuZ4Z69MB1<J.2A{\",\"lastName\":\"[BjT'Q#I,iYHO\",\"password\":\"H_VR]Fl?xMS??.sQ=\\\\)xZIbgg}AwI'/]U%(X#_vAwtkM2 JFNiP<0@PQy$~KE`P|U;L?^16CFA!klXO;Q,{&kZ1XmW@Mcak^?mPdr,<HM,Z7Q$,g${{S_Q6H{[Z[2D\",\"phone\":\"EfOH'i7)Td6!K0jOKH($}`0,w@J(J> [TGp1\",\"id\":-4519859311479938376,\"email\":\"N/^K/`[:;}yR~;g`1#%7%%rL^0-P\\\\|I/A>n0[u;\\\"rL6nYWp~IJMyU?)w1GC*^+4`CiVb75t{i5k%u UOKOxy2a<\\\\6qFEHLKcBLmZNL@OZ\\\"qNg?;B,9y+Utr((.ey0@CkW[DbHj9_-X#O;uro45'0\",\"username\":true,\"cushm\":true},{\"firstName\":\"3TJ0=X-m\\\"u%`Nd:P%1$l!o#h=4d3_G0DCR!qg0-[e4,5x%`VEN#MY&$q/3gF]+3'hP>ggev5pVD8.{!qh2' \\\"7{!aoJDH6hlYG$AslY~F*}tApk{AV)thHhmK]e*.oIRNn:1GijS1EhxhI\\\"A[a;/w4/71%fyFOqbnuTsP@FL=26dMC[e=^<K3FF-yU2\\\"dJ)j\\\\||a#=nnsg0A>wl>U+_\",\"lastName\":\"ANWU$#r\",\"password\":\"& 1SW]ec?Wx(}O_G\\\"[KI/xfM%67B!AH]-+*@SC8MGZN%ht{&:9broFu9ZKU8T#U%^ei}?\\\\R&NbG8q2^C<y7U[[F1j6L>R4`TB%O`hdBiZqU/r+D.@qa9I.S>Hpk._O=tBVNN9q&<dcz7>8J;2k)9P\",\"phone\":\"61Wy{zUIV_j)i\\\"U16Cte{5KoP5:?A(68*;,4}u?X<hk:4M{rVz|TygXh4zR.F]p:)LomruRIxq6]w#^68vKiA$U=5LI_|x+e$9'o@wecBLQfeNj~&:Ddbt>!gATVU4]]OK#g `CXFJs`.:@D%x}b,aa*i0gS:)Ml.&Enhw7SGA 9;n}N*n7,I!jFud|/edP-3M\",\"id\":-2625598721533035010,\"email\":\"x9b(EM,F2TNogr;gorH99r`nz[-||lReWz-sqoZ/+V*jYJ+*O6(sOe:|mxt-:e#7!)OJErMk0RvO&'(4Z^sWPbrEr4d|`x-!L+VYhm^k\\\\wn}\\\"%a/#S2?a`jY]?5Z(|K9ilGGH}\",\"username\":true,\"upolwmubqyio\":\"\",\"dyhzxraqsoo\":\"\\\"uUB\"},{\"firstName\":\"v)S6Cz\\\\n/q4mKp\\\"rX~T$E;dCW&JIz`&= e*+QwO&tg>_8I%7^,^\\\"ndvY~F_BY[[L/F58\\\\]ct?a|F_T:#Fw93d1(f={F.akncoVI\\\\eq lx?,8/G!!~Y>/g\\\"vPMa.uu9dMKPrs5>P1nt]i/L/w2y?qX a(\",\"lastName\":\"E@bH,Fat;w0ok0F<k27o&zFK;@I:&g29!|)C 7IIAy(ISYfd<6}HF3@,&?\\\",dPB>:3-0fHlSqe\\\"h\\\\z|PCi'/9D~wFd`.m&.^e\\\\]\\\\Vw9`o:^\\\\e~e5@6|n\\\"tWmb=*vPu0^w+x/4T19[Np&?TZ6keT~19M-,3rqVG8[s\\\")NVYmeN\\\\]\\\"3uqTK\",\"password\":\"r[Nc  $Ex6Z`S{5aDQ7[S5[:otb]oW:n`US>x}7,}7b`Hx5q<wq`[|icKs8L;V=iWNkl>)@+/(K\\\"X%31vSx^|)r ia7I>3~vUH*|60z<6vN-|XQ/Ume@^|x:WZ]+f%}R[~tNd?k[V{#wb|[s(pcBD/)uYWq>lrerX3LJkxnH=DLXmS<;E\",\"phone\":\"mcXqwfA[xYvqH|.kK\",\"id\":-4499055524430606314,\"email\":\"7V9?=PK`hxE,>VhuWG(YcGS{W;n:r.E:FL<sen>\\\\=n?chK#Am^7tp!jo1;>LVX+gc_9v6.bswBcv4N9L@7zaTuGu<rtrY\\\"O$NOB&m4!Wn56{_J=N2o}1r6r>\",\"username\":[\"50$_yX\",\"/\\\\U8h\"],\"gdmd\":true,\"bjplevywbqogzce\":[\"c(\",\"Di\",\"\"]}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.username.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesFirstNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":null,\"lastName\":\")E{-#*,$NF2$J~\\\\=.(<o<erSwKFKi}k#RD?nwc\\\"p1:i}q(l~LnCu[s`&_o'^7zGw>K5G~v=ag'EG3j*.FM$~Tl;;=G_kSR,gSfOQ.s7 /_h~.Y[T[rTBl7s&_G:a_>&>v-/d; +,-\\\\Lw6.{M9M$8gwf~r1V8HF_!-GZk0en=') 8%8f&<6c+#RfVoyM6hg<laL0!jQ[IstmO0Avt9%Nv5#%Oa| *tgHaY@',1.}<pu{4S{o=5{:?Wf\\\"z\",\"password\":\"5vN:RIHO'Ju:n9i`dL[ufQ;:)o\\\"(zQHS[Ejo=-dH\",\"phone\":\";eEkcF7ZE_\\\\:\\\\bJ#2q) Uo+niKoh!HG}*bd-3$V^siVOEHi'j1Z6wTaR.2i;~7So[\",\"id\":-537011780192074913,\"email\":\"=gp@P ,~Ri'm5 07]8f/!4Q<{dX6sxlT8]<5bAZpzUnpA2(k,`cKuro>([^Gww2dvD+%o#e@Yd_dHt^V0Br# rLDP<pD[{`nkIQ(qo:7#V|`AKN)]L^'\\\\__tuo5!vHBUG]_Z t${qH>)&sl[9;k'v6 !h+yQE\\\",+/%fti5~3>\\\"\",\"username\":\"Zyt#<ib?A2EzV/F5&;EHp[tm?+ZIVb>faJ=.:) >|i5O->'r7e*ZExR#r&PWjKzi'i$H#Qn1F+.`-ixUQOUG0f.S`%0<P\\\\'gcOL|T)~+CR,\",\"owndvrcnxpqy\":\"}(q/7\\\\iO\",\"wdjzmrueer\":\"CL9$\",\"ooewbxqzbsqapcxl\":{}},{\"firstName\":null,\"lastName\":\"JHJ?fCEIm*,8T2+L#r{\\\"::d?&{5w/ H^LO[ZMOya)lxI#[gj4I|UW NE9CO/Icl.S[dq_9X\\\"g_qKo-lDZln\\\\EAikrhnt)j-Z$N6oLj5rOxy{D3*uD4E`z>B0;)|}x{]^&+soiHPeP!5'o0@PUp},!M:EV89'DD{Dy#UW(^jDK\\\"TX6r*,2$c Dm\\\"QN[!dBU6q\\\\hOJ\",\"password\":\"~_wZa3V#IaQGG3!PtcodwNhU>`}Tz%Hk|[=WP;y$lB@uA@S@ZPU(y0gQMC``o^5x\",\"phone\":\"(M9Fl YgXPcm9N3+~]yNmS/>p&WB0~z6dBANIB.@l.;-*3GPS=pSk\",\"id\":-1337382620093024754,\"email\":\"Y6gKbHj 4,9\\\\6:,+b!k?Q~9JgU96}+zJ`%D>gBQg}U6fqD5`ZPdEWK0g4\\\\P70{Km#>xZ`ls`mT*.m9xt4nV~I8.zs$^*$7\\\\@p+\",\"username\":\"UYHd6|dA]~7MZ{N@BV{EOtzwc=]k9tUI3UEClW4MCZJ,vJ4[8X/&G-'qlxeL_b_GQ=x)\\\\:^\\\"g0*fx/HRHpdI(;Z&d4Y+T\",\"s\":\"v529$`%\"},{\"firstName\":null,\"lastName\":\"L\\\\1*<T+S@\\\"u@,R4o:Samy@K3@j2[/%(.c&O#5on6,0ul+g44\",\"password\":\"Y%2_7dXtL;uch;=JbIEwbCSX_1EaP AprH]x3+|<([|nkAs=P6mpR*p_`?;y**&FSI]<Lr>bQSKgOra$7CXElC{~ti{LFc-r0]HG~Hi!2m)GkaSu}^V=D7FHj\\\"Z?YfJs|5kI)qc/tPWNqEr1.elt?O6e4m#KLUn2OVYMdLN=3Nx,@:wG_BpL^cBF/9.R97Rm2_ZK'*? +peMZO{Rw\\\"#_[_tjji(oRB!{G;w!#gVCTO~UrfoXK0gh4!T\",\"phone\":\"H~l/.U;bvlR$smN*t$9$8<]\",\"id\":-3942618381809579401,\"email\":\"?&h.459]2CR[em2\\\"XoWfGG<g\\\"Pi2ykTub?38`ggAx z/Gb-f%Qi/s5@`<?%'t N)P),]JGN0_gyy|?T\\\"iK~Qnq/)rC8'm'l2=0V;^$@Cvc)cz7|;f9g0M!|l:%YCthD.j f[-lccSbbkRq:?7pe~)M;ylCwk9bRgT%7VV%m*T5h2vAvr%e%Bi(;`/44\\\"59DShBJjpX`np^*9/9L3FhQ\",\"username\":\"i1nApYu!hmMS*z3%Hyrd0xX%E\\\\/Av!h$5M%QVG+o/?\\\"=q1k%u&`UeHMBmLX;KtiB1W-AGfyo?/)c/D/F_z?&NU&#c5I`0WvZwOi~\\\\}A,VIVp^?MOdjojuD<;OMDa{gWrt7xPCM5ULM~3 \\\\|>LsA93veKsDr5HI</];9>Ck:vI_/Tl>rbt@]gDTK8eV=N?<N$[rsZ-gdDc]h,SB~J_?n!K0:p;l,k5)DFlMQ03w)hR~Zg}5)95.){_E!8'u\",\"aybcc\":[],\"oywnlbkch\":\"(Qh0\",\"cvnrdgkxauzfgqu\":true},{\"firstName\":null,\"lastName\":\"x~g:`+>2lkg3U?E]Df;$r,~Pa:TzTL@*w@fP/)Nef#YE.5m5LTI.Hk@y'$&HwsP-\\\"ug{ESe9'lWG>H\\\\K3Sf1SB8/y?[=3Ar b#Z4pb1$&WVdN]:ZHjj_da\",\"password\":\"Rp\\\\B\",\"phone\":\"Wr[gw>f2k^5ZuTXf&ZjzvH)LI{m@6aYUJmW0NP^OlZyI85r7/}q8=&2t6T^lZK]dNy_=FPf?.sVD\\\"+<8=K#k^Did@x({\\\\KtvCm]-E,@!,| m}4/bg}Pq-fo--R=_&p\\\\Rk`wOajKbf#NK3$|bNY\\\"b5!>ii.X\",\"id\":-4220202895173463566,\"email\":\"Bt,lSKm(A=nl!i*YQ<v{nKQ_@^mpmZ>S-eCJFvTB}VV\\\\'<f%L$<K#|Eeq2*BrSmq*jPr`A$#C`(,D;kAW}pH\\\\\\\"TCC<HG]Y(CjsMA.K/zi_P{[J @rOQP`+i}b&XB3]\\\"dKUY5-1XX``J'##2r@OQ@'r&)r(;J;8`1\\\\g5j%|c2hdW+Vk]]XMWDa|{x4+-d&55m0|&)kWvcQLbR>X/\",\"username\":\"!%`}h_oH4@sM3ux&k gyWvcj}S4RtYO1g1wc.id/+&YL:Uv2*g1`SDFS-cWf{>JhHyQgGFOdnjtGGQN^5^!w.F6B2uQ3N7A8`}0ejyMyb287,EOec5_GyB]Eh\",\"nmeyckkwrzzb\":{},\"n\":656,\"fxgbtyn\":-139.2},{\"firstName\":null,\"lastName\":\"Bg,*j7T`W'\\\\SM;9e1JYrC i98AZrSo%\\\"#n{dF=VU\\\"d+RW;p3F&{)_$'< kL~MzLSS,y*5x::n}ZM0bk&EWN;1Dny$*'l\",\"password\":\"_2MDRwd|_\\\"@w>q3em('jrw~,&]a&|_Fx|P}<sZ$PN#>N5h|n->*vG.|XhZUmP=eG#5Q'0gw6rW.hz]n5.41t.UD:[vJDQP:WL`/`Bnx<AFbLC_w^\",\"phone\":\"-xGG($'3G#{!\",\"id\":-2748371954984386715,\"email\":\"S>F]!tX5_ATfv?~\",\"username\":\"=j`mhc{mugtcG5\\\\j_s6Wo&,UL?\\\"~x^L'^.3qMU0JGaY<%ijYo]h/}uTsDX:x-r_4FO1_<p)oe<gT~^e\\\"R5^,&UEff0wY,!ml#[u`{vfm+Wzdnf+\\\"Bnr]C#//Zk[sF9$rr*~WAFjoQGls'Xo)8p\",\"sp\":-685},{\"firstName\":null,\"lastName\":\"d!Y1k@qDoV({Y6k/FpvwjBN?puyazC%Q;!;sJ>.9frx8Y4YTjeZi\\\"Zc? |g$2N4gPsUB<y:SEadF}1}KLfSSR`C}s`Wyk=/pq3-hZ:D03Dpf,.hLp3gE}23I^yRWY2%fOLI'\\\\la69D@G}f]U~yG_l%h h?Bm6^!op\",\"password\":\"lJBA(=oEo3`l1+RGAd2>kxrNTeu?W{$PH3V{U(X38PA8f,dW;d+>dD=QXQ;iG[4'dRxe$u:#uz   L\\\\S57Pj[Evr[Q.J9d\",\"phone\":\"NWiXc |CT6S]K~y&PF5!D/47].Yh_+o7 yWb1:Z{H\\\\h!BJwz`C-&%PU4+%2/`J)]`7i?fkEe`PX-LTt4el(v|V*'a/-HZaJ'{B]\\\\;V%4=qe;$Hc;z0p3<_4y9B8RcuMlC/< {ZLylC\\\"J>O[{XFb-7EPOkf&0I^asCfE`wt>15'R]Mzy#|>R&CmuDAMkS]'R O<{K,Ho\",\"id\":-1485284320255814006,\"email\":\"<[] j8qvZ?{,TgP-vbozToqO=W&M0h]lM8H+5dCXC!RA*3)0jrI2LERXB~3Q&iqe9G_9C@K59^]OwP*j_r-P:y`-._^esfaI<XKz:\\\"d-Bri*Q3Gk1k5}LvB;6)N\\\"!.0hSzA?F,zr/|Bv6s7,{1~/1Ez]g:'gs7g$x*9',k_r)a'znyW#^M:\",\"username\":\";Zh{7\\\\G`v>AqAG JdWm&\\\"T4{C\\\\U+<bkrbtX7((=s@WZpWmn|6a<;$O; 8??3(fqbCmsV\\\\s:s#yqV=<e;5[MMRRfY;^1[)cj|m^sL6qyY*z_@+/5~+]e)xink O@Wud]~w!,|Z]RaC(.wmGW#45znp>n&zt^3%5u#O -B:H SjyTIY9-Lxu'pU@& Br\\\"3)=)MDB1CLThdm[|'Ehjr%PM8(Y\\\\]a.t6mLW\",\"tyfpfjbuuo\":true},{\"firstName\":null,\"lastName\":\"M4vb,M QX[\\\"NhEL{&D1),?CD\\\\rN944+T1![{Re:0%+yCW_1\\\"S}|0guGY/rc]\\\\3^/n8eB|ZwZ{&6'iFf^E3#Iew{.9CXG$Q3KJ7t9qeehz<0Y~&{+C1g'~v*kS[!AoBJ8.p{TO*T};o0^n>BIw9rf`N(Q~||8cooTLd\\\"cqc6n>\",\"password\":\" 1gY)4/)5;=$|HhJm&^/HB60J$@aj30K.m6L]d \\\\4v.E 3;SEL4DX^/$o3_Z^t.-Fjav>=c0tS;s<S?PM{Pmw5//'|a mf[x r6:Htj\\\\m)>NMzb$!81fmxrk&K/:x\",\"phone\":\"(Ht0RL6K4\\\\P\",\"id\":-1810792734946019419,\"email\":\"dHbJR/U==\\\\*[M&tA}V!J8WAF\\\\h'dkcMOXy+-^JmDuXfzTJ>Q/vtJcz/xWi;fKI]S3D=T]tRN)]9+g(r}H=,.6VY8@w\\\"}xDs|LBOUod3+FPk98RWi%'o@zbb68\\\"5_K[d[D\\\\:8QH%hu@wLV[C2a)]\\\\p>B\\\\bULA-cI)VBN-B&n@}2e%y<zb)C]p% 5\",\"username\":\",!@0?/-dqitkNkzX5R#5_5p=f@t~2 |wZ^#Z.i|Ev es}u\\\\eqzP|U1`H\\\"-Bw8)3xMd(k@,[:0&kL~(7zotrP+A'3z(Kne29\\\". ~;q.@rl{-6OYl36JTP_{wN,dl rL~kI=VB?Mc.b>uGQka./5u-R:Ylw5csR.J\\\"hu!%*$B4bdIlt?A\\\"HA{%(i#Y;As )wPoyZ3UhQCjxg;\\\\[RDj.={{kS$)hUoKs\",\"wygupkb\":-104.7,\"nois\":778},{\"firstName\":null,\"lastName\":\"A8\\\"w\\\"M9~*X1gkGtP\",\"password\":\"z\\\\+xYYzAM2Kfo0w@w=a)e C/v^~DN-So,wijTo|P*=_*T4W8vOi.ltPEsbcB0Jkp7 MUYg<?fe-@)fH?y!:Xe1F2?86I8k/$(H,i,dKp',u*,m}]dV,g}ie=\",\"phone\":\"o'eatz_q'[(lylw%3{R:qP@xHvlv-ohGD+bH'4v=69\",\"id\":-3369523997952237581,\"email\":\"NUxyl:8AGGmg1!}%`Q5-*V/^NS;M{8Qq 5ql)#%p$'9])CGYW,JzAV4NMcRy,\\\"-T=H> $I*{=lNk\\\\DS}vH+1u_n$91#@' V:U\\\\HCCO|KKbQ1'!B;V.\\\\e ~|lbX<4T.DA\\\\(VPv%iNW\\\\kG+8(>K9!(i~Spx\\\\[#:8=,#-/YU+7}H~}t2M]KdngT0%^*2qsUhY15`[o4t%>&thjkKL=:ny9sQv [*BG)SRp\\\"yDR(IdVSu\",\"username\":\"ijyE=L^SV`rOgRkDcl,.U4f(+eFA3^i_YaN>H@BJTI:dgy]bu/Z.Uqx7q&n[Ye4Rq`f^gg,qrAkW;`~_ @+Bz?\",\"uqmxmwixrcfzhgn\":-773,\"kmrqfhw\":[\"ht;F\",\"l Fx-\",\"LW\"],\"carmq\":929},{\"firstName\":null,\"lastName\":\"}*UvFPe2j(R)?<2f2~r.l$c&pHg:~iFp,j/Q5it3;\",\"password\":\"lkqcs{47BaK:;Dq)6U8l4.!#>3BXWqw_Ay~)Sh|PSrp3ma]K-L-1y*0f|i@Js`;N-3jw'Rg0?[&X<E'vb<UfM\\\"1e%\\\"plHU9o//>up_P#gBlo}s;-X%,{9BB\\\\Vv?8e1'i}:\\\"cpUcxXC{R,:3g?2t&5)2+r`_.wv.T'fhcP=Ro0fA]!|nI\\\\(mc0.kzGfGB'YQUtjY~JZnU7~+7ucO,wRNpR)mT'XyYMU'2n$5L\",\"phone\":\"?S5&+NX x\\\"Nk22C%~E@W9|eU0=Ks4b:~+^|fMB:vAvfH6<k3-~IX5Pa'/{&\\\"}6J=ry7;.lGTrCk4M3slZlN.1a]WB(+L36VH2i'Xrefmd;842E;A70O2t5W0t,)m1Anzi+<`ZL0r&/Jw27vc6[{,fijj#AdS:X.2SXXprC~Wg*dQP\\\\S@gy!0.h<`[3ggcbZNu6FLE>QM4=#vOT&h{l_FoQ5=w-}Pg\\\\'gm l;XCF\",\"id\":-2237336581905350241,\"email\":\"r @\\\\*r_SP1#?LN\\\"L3rg#hBlW9KW:R kQ4oF<}<h8 |J+tr}F!qx|Lpxl&?c*S\\\\Bc0gL|@SE;QQ(\\\"e}7>o!m\\\\SMPr!_veW<le1` 8'PQ{wO$`<>l-p~VLH@\\\"edgLQ=.]sJK___ANWsD|%(w[$|[rx%,b<l|BdaRi%^#/R/t&x])^I\",\"username\":\"@-:m}Rwm}4\",\"elrfjlqqakqo\":454.4,\"jzgbsnarqe\":[\"~2*W3^^~\",\"Hw!\",\"pi%.n$\"]},{\"firstName\":null,\"lastName\":\"hO1[qAW$k8i #Li;Rg.rn>m.@1M@7DW@W]&[>D2%V(,\\\"fW^j!$>jT I4%Q.`rN%5nDNp-y|kPUx)d+e_>t-\\\"E9AERLx5C gWY$TGYY(qFkeQT<D3.j~xyQ)2PE+xx|NIe83HdaX4ZjJX0{_Y\\\"$'UAbR=9R!YJrh-j}f3/:8}}@)~i5p{B6{\\\\+/WfeEUio]s<i&k~gE B>:]-iTHVgb3IwS9ePb,J4gIWoqonUVZ\",\"password\":\"a^*4YbT?s(ux'>$|xds%Ucp4T8PiKK'w=(^!akj@2{Ltla1N0eT.<apu]kvi:WROK@E0s>)W4%T;G|k$6-m41jJw_;UDLEPF^xYU>Idw}+f;,=]!|do?6.gsN69=HP{H,]! f#gy|)_!i~hozSSt(v%gp!wj)zU(NpS~*+iBYrzr:zb\",\"phone\":\"Zq%00 &7JxnvFqXSR{jyu'5+4RB5#!Z,\\\"e|&5Z1j4`/Y'$EjM{94I/l.,0| a::v pXS&X}T+!&`$&<}7=@t}mj`X~D]@6Pdh_29RUrL._bOA>\",\"id\":-3798697277715801593,\"email\":\"Oi6}BnF}-)jvpf!*+ }5\\\"hqgSvW[.f2/C+k'9D$7xx:gi{){LO1{z\",\"username\":\"6d)~+;\\\\A|-qWC#.5p!JO@k7k}Yf<=uX;{2z*.jsW.pOv[\\\\2NFNx_U_! 1\\\"?4@@`'b4~Nq#/Jx6N[;J|&N[K75D:+p7.3\\\"*lYkZ9]9og:9`;6>[4K56\\\"lW+HLOX%5=d=Ea-X5?8:.RG0 ^Go|'\",\"brdbzcfxliofxttq\":[],\"orwwn\":{\"ahxqulohacap\":-927,\"vydngvhmpjv\":-103}},{\"firstName\":null,\"lastName\":\"WWm1j?1wR'f=|Xg:`tE#2.RTKc=cij$<d<<DJ7INFL+NZq&v.*fk5,4nWK7_xPhj1xf({qFY*w6-g+HCA_q0B++6X4M\\\\((s\\\"O5f?`]l]rC}~I7$85<xyY{xj[UeL=LXcL</Xst <QGkn2 dZN/:[*7[iR#DiNAkwsE%\",\"password\":\"^3RsuL`VB8CB5v_a]MW8;V5r_ ,,tSp8Jcix%kt^-*bx:ci'\",\"phone\":\"j$WR~;=G}vI~D|_9niEknP&82dgW2U*.&YDY(m.5PCz}Kq\\\".l!?-IlKnrJFTL'QPIdIP_('cf4tJL\\\\>;tP#\\\"<?%<T;q<uB2]3r:t\",\"id\":-3948110357551321301,\"email\":\"DXFKmuaT-|jbjFoixzjF}.AW-}R]J;,w`cu0FmA5C/0\\\\'a$w?MvZop?-4^9HYH]+Yp4unj@5ap~kWW&'<Ua-OHzL79FS_>W`(8JQQ8\\\"9S@#+wsjr#)^2m 61A]bS#,sHQj0$Uj}%mJ%~XStVHj:5- ks$1n\\\"~t~y _7dGu!m>@CK.^odp\\\\J1'r.D;CnU__x;&4!F<jPI/FTu!CJdoFmmZ]KRH3/ZFxwR|>N\",\"username\":\"?P97%GA'~0J2U&9hso\\\"|C_r%DT8f?O$;6-e:GiNr> `Y{P9T}d>IttNT[v\\\"tP%2EsLg,O{lA'M0;^m2If'{L{?lP9N7@,VXTFVH?9x;>UF'&t*g5S_\\\"#YvI'?_K#ikEs3ps;C,MXk;..Wz,ar^=q2yJOH{*3;X\\\\'L$|tYtYS\\\"_AO!-T;%+!od%WK:X+6M=!IJ\",\"ygivlegsc\":257,\"oldjatntmhdpdug\":617,\"atfpdsialzr\":43.3},{\"firstName\":null,\"lastName\":\"1tc.-kiIzr_\",\"password\":\"7S@=7wR{!+7Rd=^Ot$N.IE-#KRrH>'`(22e#9j/PxTOU!N;jqIbJ&L?;-_uj;?Bvk^;D_JwTeV~AN2Z:0b+Xa8@}Wu30,=9?0W~KjO$Z_4$-p$~2QPN%P]^_]MqDa!Q5wx[|?'_x*4A~'D9M[vuO:\\\\[3;<zJjBQ<l::Laf}@>ex3RIAR_4(\",\"phone\":\"kETVR*m97_o25Ec+cL)#:jMV0tyd<pHnqUM7\\\\D+Jz*/4,(;'@%zD(Qvip#vk]5/]N$sa57Y-Lf;cI2{_q]wmPu\\\\Yh_I?dlCV}LS=`I\\\"Osky!y1X|w:jyB,LIdNq.{z.Zql[TSdXun<#FkY@6/,sCcv\\\"@r}SN7wOgo]\\\"I8iR&2~W<B3OVW@,~%zkU0'I:t{UTt(TCpZBaufu`m}?l[a~v:Z h(;>439HmtYk>rl-}o{hL\\\"tCA}~3yScTA?Qw~\",\"id\":-3809197138453481981,\"email\":\"xSuY$@/@wV|WM*Dd0}\\\"gV0FEYc;v+f%,%&x.+#Yv0%vd0B^p&tH9M0OPC}fY\\\"Jh0R(Nz[dQsufiekln7t_#{m~LKoi7GmOI4Zz59kYZ~*~$dh8blyQ=ogl}a9h?/3|u}Xh23Q{}3,pJeveNtF:~IkwS9z`R2,~\",\"username\":\"pCM]`Dgn~935-M^+'4:yfT~yJlL[9Yb#Y8scllV2Be*Y0PCTpP':-4)OH:`L0)mWUGV\\\".lXf' W^=@#Ufojfm8ee?}a^9A\",\"vmlmvx\":{},\"l\":372.0,\"v\":\"\"},{\"firstName\":null,\"lastName\":\"+)T-sg%^2?fZA\\\\oME-]Zh8pHVs;f0fRV1{:7ISQ_X\\\"V:QsudNywP$;h]#!#kmjoh{fDQ)9f&`gP~S[.yG1dMa+pwQy,v@Y_,He5Ty7/%'$W1u\\\\qd/@aOF|7<6nz6sKscM`5BdA0\\\";\",\"password\":\"b%933a:Yy2C6}KB3+!TNHi?(Ca,9G  4_veZ;D6&u9%PbXKiHs>KfA&Gxi8=YbIeK,LTTS65pkCPbXETX+$Zm$:awdHr/uyvc<Na]\\\\L7*Gr^NQG:7`<};1|*cW@b~[&;^wz/$n]8n,(tU6a!`eEh]j`5'jhMXIh6=Y>:\\\\BKZZ0'&^@\\\"S.o0.xgtsx(POvRHlh\\\\0r;7q-Y@$[-:.PY82HK;=m)KqTU',F'y$2Y=55HW'e&s|Er(R+h=k\",\"phone\":\"t#4r.Iyj0SS<Ge!'X|!c6lUWk2lk.\\\".bUzI?N=@w9Cry6iCdocU*{b|tD[1lgX7Hxa/b1{W5J`R,~'i9s{Glv/%.yxKP],=5in$7/S@\",\"id\":-2018696888286993431,\"email\":\"${F(m]}>b|P,gbD}y[J8Mxq\\\\i%@'/NDdR6O5N{*=4~Pb]PKMV&l_K-Wpx,Ew:n1{wG/mo0rN+0#hw82JypWo@uV;#'`\",\"username\":\"8rOAd@P777wMhF!EGA#qD;Y_yvC#/:4hpt-'&(F\\\\+uEq?rsyFVUP|\\\\Ibnfh~T#b)sx\\\\R'\",\"tpyqoc\":true,\"okyxikiyc\":784.6},{\"firstName\":null,\"lastName\":\")|ni88{T,S.%;5\\\"j0j<}fy2^6}vmR]4,q^Zy K7AtMvC$'\\\"L<CfCW4PSkkc+HWK#)&Y%>zAT.RiyVH/'p!m!12\\\"E@4.ra0\\\"ll\\\\`*k@)t>F~z4LG\\\"M'lpsNfq:vwsp4Bz;+Jke2IBwemZVbDQwfJXC!1MFNI_+[CKY`\\\"NL73YAy\",\"password\":\"h0{ yWSz&^*h!+}XxCg4=uA$effxs\\\"P[jlb:7fUe<|UmOPe3ll%5qZ8>$1a5NojA:&k<qNb:8IB<,]9,G7UG+TG*Iv3yPT?cFbz7g{`G_iBX`U_;N;4RAr70268S*v}cF{Dq&j\",\"phone\":\"\\\"+DcMNd;7)ja*^#h}=4wR+W{{ra)mcQjw>wI}_zAZ_`'QNE;4GYIK<h0Od|R:P9LAfj-C-uG7mkDk?(u/,P[#ZV>EGjfoQV[VJSU66'LvOl;NM5b9!X%`W97QUZ#Hr*d~('}F98~ >j=Knb;gkqp/72/vx''J[}PV;H52<QWqqH$CR/P\\\\EmhqHCzjnCB+(lgT7loJAlI\\\\0\\\"SV8K/A;_6s`3SXir?kSx<bG&~i0vm>>$-3hJ\",\"id\":-641556122236847125,\"email\":\"Msp4A12ZBip\\\"\\\"W_]9 k+\\\"qv0C7w.;k\",\"username\":\"oRCprzzn(^v8_^JtHx,=2h[}8[O(wwh_8^AUnD#-OYUe5}OdS\\\"dg2iUBaS.\\\"|/p{UiPvW^96*d<nr]Z3e\\\"YL:o&'0dM4~%:vl;C\",\"swaxd\":true,\"jpykjnpo\":\"FJNPg\",\"ndaxflyh\":\"E5 dh\"}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.firstName.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesFirstNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":true,\"lastName\":\"{-~b|#6AvZK\\\"!=?t58=hNR{-BA9X(r\\\\*p(5X*!zQX&fRC;xe/~34>Z BbRac_>d}A+6W%RauVO)gD6hJG[B[n;5KrK#4\\\\))HfR?@eEJ^T~Ahc#k;h|vaMy?g2',4d js\",\"password\":\"|hq8E~9\\\\8~`ym,%x;IRs~R+E(PgLKz'E<:0P\\\"@+?2<qOtP66-+I*k}PF,ccku).66lx^!`e1_0)7u E=q^?~egOuH_[$Gf_FwQ]B8LDx[U3VZl.3iX]Bk$.)ey@[Z<qi,#|#Nd@!-VLExq<;k%mi.6.R}\\\\mkUJ\",\"phone\":\"p\\\\y^P(3T3'~mwDlP_z,QnHi:f3Fn:\\\"Rvr4T99.OqPZd]g4v;L!]-&h&z%-7D,aWd3Nu%b(8cSF_8=RuJFER4T`@4P/\\\"S2j=K6tz,zudL\\\"N1/K1'rSuH#njLw_hAfd\\\\c&>'-&kxC|Sy>yy{?Z*s97i3O1GKF:(PuSo\\\\{f;'l-V6U}t1?TJ9jc`qI{zBud.h\\\"ud6/KGqi>!=5WLU_C?a!$:Tl9jrVDicqe?yg]2H=y\\\\VN/h~%c- yc.`{.M7hHF<\",\"id\":-108134475041356453,\"email\":\"=\\\\H#u9).- y% f+DMrp`{mCrBo;DCxQ9-\",\"username\":\"%aHgw8X3<sBp!8Q*;nuvyv+Ah=HCwcDC31Z)L3R*o\\\"Uc1U,=[8vuLp668U\",\"ugyfrb\":\"rMa\"},{\"firstName\":640,\"lastName\":\"$NlCn5R.Fb#0[mdJ|sU?u5Tzs_Gs0'IP]TKF=ugbOh,o(Z~O'*[ML<PuqH_eu!/3Y4(#U[Xyjx 4_0Kt\\\"R3\\\\THnc.sQ_CVZKyHmfit3ONm7RA`7IIr)S|%9yVfR)Kw1i-5F_VD(bsIY_B7)u7![wC&w0dCalc-taLn6<82\",\"password\":\"8*?$`eX!'FEK2`B\",\"phone\":\"kdX \",\"id\":-3543654705979226301,\"email\":\"PFP=<29Kld 9*sg~;#zl@*x~y]V87 I]\",\"username\":\"W:Ou.O[OGb-M1>S0s+Y3:a.{7|FV]e.rIXzZ3{@husM~6B$U6h|*Q9dUBy 7{hZDb~|\\\\!NO4, =N~CpXnxh]/ lhgXY6}Wo<8![R1Q}82;R\\\\mO[<cAR3=<s.OqS*Ud3HezvK&~&k[;O$|/u3+PgSvEWeH>oS4mq}9u J9<tR.\\\\Ke{,NZ?WcGj<Sk}._;io|P_@AajNrpD0yr$'wAVS,?X2]?Ptyam!2Ob)+GoD<:a+~OWdFou`mYN#3j\",\"tsfdombpmby\":[]},{\"firstName\":-114.6,\"lastName\":\"!U':cq}s:%d#\",\"password\":\"u3n,9Mmx?DzLmc n/V~@-eOu?wxEfGg0Imd;Atm8Qo,bUAne;e^!-0p 5<~AXONF/Ow Fjtr_<z]i.%+hC<cYq?@;8;=LBejm#oh\\\">6ElEOlT\\\"X'x4u~DLt;JLnpL9T'JyLK<-\",\"phone\":\"l4`Gon#!HpfMDk g.hXZd,ro7}lI;1Q9e|NqUW]ULFdiK4/aBq_%bf`!S-@TKJB6g.72:$W%k){-Zm,@@Grm\\\\$CqUbfR6eB}>x-fb*(w,T08]3~&LiL\\\\YSp`~31sX'jM7'Fctw)t:7I[ *]v(Kkt+zBSP`v`6\",\"id\":-3757931885939003517,\"email\":\"'Pf>\\\"_f2,CY5x:vN/FD,oE@#v4v3Ffrb,6FF5Dl7p`;./*]I)WK.^W-#nJ2 q(;8\\\"HJuq%.epI)ihWj/X=G4yjJmPOLhd7=8;\\\\feAc^D5^vF-z-},KV\\\\uw&=+?PiESZ.<I|'1qexy&i?OifXkw~_}6fp.I|5O_A5*{XRCuQ\\\"5S!8J^M'_uXk\\\\:dyJee|xD<`v|RLQw_*/;BJn<B%Xn8\",\"username\":\"l7N>:$s@VlEm?#}Ie:Y=&Mk[}\",\"clevjupzgd\":{},\"j\":[\"0d(I_dSA\",\"OAE'9\"]},{\"firstName\":{\"bencucaiooqqrgff\":218,\"ucovcneilftdvu\":true,\"ohkfzcgomj\":-762},\"lastName\":\"VtF')HyHu@X:|r.vc2(w\\\"ir[a[tnKcWgo0b`j\\\"d/.ng;h5}+ZwQxS#fp\\\\7ye`dk}!.|*!(VqfZUg\\\\Wltg:+[xQw!Q5GgZza]4M5mhV7$)I#IEZNlF^40bmk#OZFZXi;rB~le2d@:+uno8+fGd+}4bSLLSUX57\\\".t&f!7_9-R9KR[vE Cs:t)F,.O[@{umA7H\\\\v7G CP)pYL}j9(Jm7+b)=ZZRB+/Q'bsNsgXjsT&?SrJ0egG0\",\"password\":\"_}tc ${JP)'to=TvdHdJp[l~NtXc1%{=F)sht(o{/8n/0z, 8\",\"phone\":\"D(oLF8`q{`G\\\"V$b3j4QF+(+rv<gIWUc+ R#6&os* O@\\\\7e7o!oCjx'Y{`;:ospQA4t\\\\?%'WJGmv[yk-\\\"+Cw0tTrEX]f@Xdi_F;Q6v\",\"id\":-307036084690829628,\"email\":\"I&*oz!DrS(b~yv]1.:k`dk>#ietK3cjA\\\"dZ TO_~$TGzIaH\",\"username\":\"H)d#D$/nex:9Qi]YE1^4W$CJ,i\",\"gapbzeq\":-481.7,\"nyxdpcocfchr\":61.5},{\"firstName\":[\"]PbET]1\"],\"lastName\":\"#{}r9 EcW;p=Z62 W[]Lz)yZx]oDv$Slum@{+moHsU11gkQgPZ\\\"fIOh{>KINDPfw\\\\g8* _={6j>=I-PL;gZ0nQv )d8`%\",\"password\":\"YOgfGm8[<!Lyz1[7tIcB#5I)=L 6),R,UhBt.yeI\\\\5\\\\/lvxoRDbR#]&dDF_f'_]'TFruM1U{%='R%u>wtcZ)R*aucG{>d^2EOD5tkK&5/pbk`V*-WMc. /aBde8e\",\"phone\":\"-koCD<{,ox7V{12~.-5YaaYVsk8eJ[8n>[@W;Q4B;,xmBkD!FLB3B!Z/r#~*![V\\\"KL\\\"<=[es{1&=1JvAh{8br=jKW`y1b1 /~K;Xjij!SVNuLu>V4fTx{dC~C`)|Z:z#.0.{ oyMkp\\\"X<$a>S@bR@>8 oq1JxKiBbRhJX|XhK)j}I=ZhOV7x]AkWcc|2}/JT>{2)n7G15pJ^~!`r+NV\",\"id\":-4495412381903804058,\"email\":\"[**'/1'!(IzL23Ro{k{5BM8/U()f&(4i:ME\\\",cJf(Zja;l#!IU5c&fW{Q_D$aM5NZSB!XEsF&mP1.wWmSrp9Y3\",\"username\":\"e=W_;%3Lo>#}'kCNzd%sZq}oQJ$vu\",\"i\":true,\"jrp\":true},{\"firstName\":[\"w}YC\",\"S-w|DI\"],\"lastName\":\"`5{b#5hT|JPK psCqTdb*XRaj. ~@o+{b(F:pCFL'r;6@SP6}^7\\\"[K.1\\\"2gAu{F?&[k$iFv}oyunm~<rAQx#'G^HE:$lr)[;py8}3b=m-MWjWvasF#yQb]jI9IK~ nwlWYcIu]IZ+Pha]%*VHv^lzF\\\\s\",\"password\":\")Y4pn.?p-osML3zxbAl]4TXi&kjx B]X988WtN+nHxHF3oq\\\\F#dXSSJ5n\\\\!gOp?.gu|mN${>5J1t|ae-mf*QZ\\\\g#hxfkSG/tSlwjN2Umb<,{>kN2]DM64!A3L=!\\\\q<g}ES\",\"phone\":\"\\\\9jShg2$Wo.MG5V?\\\"Iu(GyDa);J>hNO:;(8c\\\"f.i6}mFNmZ!OC4Y(f|R$phzb@J/,!K6Mn\\\\Pz\\\"M 1W_,xXS]0&D'-lw%DRw&AgD*zZYl@E~ ge{UM ^H:B]j6^\\\\y5!Ko$2j1 ]\\\"!oo@N&!&-@B`T)vxgy#0Ys3es2(YiIymtl6mW%pokrB&xE\\\"ixwc_eVJeW34'|@`UZ9=7|%__S&8YAR~Qk}7bkBAbaCO)0yT+Y1^R2FSii9&cz/ _M2y\",\"id\":-2320824611437300300,\"email\":\"\\\\zOrujJ,U(4=rH|bMtLrBiAXV?IfL_x&eeqjH_7N[_qk$UI`tdo}i@`Fo\\\\Ik_x- i\\\".SD\",\"username\":\"m; n789NA\",\"otxqhebnp\":[]},{\"firstName\":-448,\"lastName\":\"vWm G&)}\\\"'k~fM.|<D;%y|`wN\",\"password\":\"y1I:XrPxwo[q3_[v]9uIZ:=F:V\\\\ze\",\"phone\":\"!VtD9/=2xg5R~\",\"id\":-3261906460464950172,\"email\":\"3\\\"Jw+}V_DHhX!0(:n*K+d^rvSe#Nt8lo~q<D8;guw7X5jM^etJcpqN0~Mf-+/}Un7Z'Y]Vyd%?c]E!YrfR#~gL-d(i2PXA0qLq+.@nOU]&:\\\\`L^.N2ip6uaT/REbSu8Pv6E]7v)3<EDCI0|#Stp)bqk$n]a)P{:4}3hPSOZ&Ed:@)MP3hRQVo<D0Pg=?Spq]4`hN6p&jFM26H{4NyU% yD/;NlmTAT`B{mJ8\\\\|<I&e2)\\\"'D[\",\"username\":\"RWSCMbuD=<szKRDfjY0>d/lXL<F*O1[IbdHv?#,B0@>IpZXLK3Ii`NV&,AO|l,;&$J\\\\W{aa1&#/(1V^r556R;~;wLYnn!f+HE#G|o7W/SYR_-EH?dZE'?RR,y\\\"R0O<G<tatjT7MieK<}n{w\",\"whnh\":true,\"mvamnhfiuhyicmp\":-660,\"sith\":\"xaHZ$|l\"},{\"firstName\":true,\"lastName\":\"\\\\'I;V~V@Zvp.d&(-7]B$5Mv6\\\"x!`m<NW^n-d],LJqFdA;G`&{`N}EWmXH ,]i/0Dxvv0wA5I2e~{RQUq&2(c v\",\"password\":\"i\\\"hQmsu23tH:CQZ`tg9z8D}E9ImO.O[} ,D)4ppy@f1[)f|E_M1b/S'a3/X,\\\\oV $! [+%bPm]7Id@a%$-Q\\\\.|(>,^n1Al9A.#%_%BSm'lZ\\\\spyf[2/t0Agv2\\\\.9mu{n[2fQ)Gh%)X(y|y(z1H\\\"]6jeH+49eUT7n,:ik|ueh=_-Vn UPD 5]\\\"rz.'Aq*:AvHN\\\\V_e5}q{F<g*RByb#-AJDyP69z,$##WV2Yy+/:lp\",\"phone\":\"&X/r\\\";m|_G[E<F##mqgF`HD5\\\"lN$EM%|mm=qCnLVD%HXb<KD(=x|[U+QI<5bCrlLsu\",\"id\":-56705208337891506,\"email\":\"Ln\\\"n&<IA &GNQlC]Cy+=X%z#+{kl!0GM>\",\"username\":\"BmP:N%\\\"chbd>i+>:LCru2EtPki</U!F@,VU_8Sd1bq&|(lIe1?$~(i=th+%kB@v!2;%rSMv\\\\G?g2e2v1\",\"iniddilallpdeo\":\"Oe0XIo@!\",\"sjuchomnrwiftf\":878,\"uucurgqsbhprosdk\":427.2},{\"firstName\":264.1,\"lastName\":\"s/.k`78{FDiTR7MA%^vlU!g<6$&/iL){`&HoYYbDZ`4u3d\",\"password\":\";{FD8}(K{>+ `>AM:sef#rDfb!fBf6kaSX#L[%mt#!f<Bg}Dm4+x+a.eR<)Y|zgJz|WM3;HNz[UXSlE\\\\+?H~uUrRX0HMMY+O$.3j]&j+5`h9wN.#;pRFJ;9m#ys]yGWa)moJ8i~dIQKTO>IU.iT0bmqSR~,uA1?b)nm2Y2X!?C@i<;0t1`YXDH EUOeD<'UxwSG,!:M3IAS%K?y9Q?_Xe]q\\\\,Y3e#)8{5$BPZ2U;!/\\\",pQJJ#;y,!a&{{*fV\",\"phone\":\"d65[F8G7meaGO,qC;?2jW!f$DULN&=kU0U[GD Q[6p6[<\",\"id\":-3833424828231531363,\"email\":\"^Mqm\\\\SLlU\\\"z>)M\\\"A2!GtW0Zbr%f@_Wooq$6k0zvYLH'KwiM]v&do ,A;i~b6DZI=)n\",\"username\":\"GIKOV#6&p~]CHRnOxb]cM*C\\\\p^0B5I5%Q6-$\\\\Fo/sezrY4S064_Ps;PhK{'5#}PZpME7qGGU8;}pYE0YG{j&5x)}a6!Wnx%kbLDv9134Rk1z{i=\\\\?E(Sr_(E+6>jXHX&)\\\\qm'\\\\0,3y?^MG>G+*J@|id)T<E{Vn/j$(,;;HwC^KF9.Khtjj;_+JXXM3}JTompvX0T`C/`6Qo7->\\\"w2%\\\\cu1*7v;3@J<CmBF~hFMVsP;_^H+B1j.#(y\\\\c\",\"hvpiw\":true},{\"firstName\":[\";cd\",\"udW9l9\"],\"lastName\":\"c~7GNA\\\"hUb>Ct|u}\\\"FFL6w<J/RSJoC>\\\"5[Gu&Kq&KU'YnJ@W'(x._1oSHRS_d7%Bf,s{p6s#q9gzmMV)VTFTzga73sbnB8<l^Zeut{n}ik_- nVxMqaAU2*g87;L>2>e@Z)3K-~pa[[+2Ogus\\\\w\\\\V8L(M+.cy~aaNX33k 0<@_<\\\"hjdjM^c<aw:M(CROQu1JE_Un,.vWTu+?bp!4~\\\"<U)-z8#z_:slqv9m)2*pRrUc[R)B_Fu\\\\?xM\",\"password\":\"=y4CmUiU,|L~H3W[}JP`&jV_Jy.H`z/Hb!r8<q@O,zYdv*kY(P>:_D@,5eJmYjNyzy(KkAEwm{W\\\"-.lp8Vmps;+zkw,,>Q\\\"1vW>HT&}]J,YB) KPR[>_K5a4~h{zY!APs3k$0dlc6H9&HR`E;u7/c[767kJOo^K0K^@u'6G'[D.vj|+_=D>4\",\"phone\":\"sNA7_g'Av^[[6}mP`yW4Vx{=f$H?w}borUn6OWXu?D4nj\\\\uE|3VF\\\"pdtbuQ'x&}AeEGAdCs[S?dM4vpT25'09TR[ht\\\\c%bn82@m[SY+{tAC^U)d%?cn8*Z88+78c&o/46zu}y?Z=k{,j=z)Wj14rP4#b XeMrj2Yy-ry#imOkRi!@^XzPd[#tA`I[ r$m-Nfl>\",\"id\":-1099574129123779489,\"email\":\"C0oCnX1${n*\\\\ ]dLWy1\\\"{(Gw}:BR\",\"username\":\"c8KfQ;a[.X\\\"5\\\\pjqL1@ A:#<vFeX|VwM[<ZpP\\\"SO*[0Orwr\\\\%77tyFsrp$X,^(CkNe*X8*fWEZ8oA4gU|tCUk,A)\\\"~~$n+H8uy)BvfO[X'YRK30$`bVj5U2Zl%>769+lf%Oc}G2xK,`BwFR&6cncdy=FDd25u>6)]j7T2XM\",\"rkquszpjwnbjydil\":-912.8,\"tzcvdtoszmmuig\":\"ofucJ+K\"},{\"firstName\":66,\"lastName\":\"OX*p(n1xeZ?ZUN#r5HJH\\\"B'RmNw9HsfpI&cBH\\\"-,P--s\\\"NUa9*B+Xcbz9p,_+/mtb\\\\z](.&7=2_1{h=tM!<l9%NRFo]T\\\\lL18@ `Ar|;m'aMN*]+%-@Q@iWD+b:8O6_Rm?=Z(rW$N6}+q0?o}za,U?12@V:j>I|LJ%b-keTEkCbiKw/_yLlDx7ym0&`gC{I,^Z`xy(L18EkHK7{Oac^a[T67T>qH&s\",\"password\":\"VpgHU;fa781768fA+6$4vh<uY4Ny(4<#b!ju@*,-)L8#PLJKy?';%Vu^HD.YlWg$L)|c;yc)U+  oi:E%zK>d8=<KercK+CwiE(HSXWk2$5^&4#<=%&^p2<8Q{g4u!hG^SZ1[RGjcGt]TSuP~;: \\\"wA2Qq'y^}_S,eFq51!S{.791\\\\6&2\\\"ZelUSy9t.amEDj:Q\\\\lV;j`/=LMdL@J,16| vM5w5$I'\",\"phone\":\"t45`LjphJ.du3:sk7eqX2Qzvn n8K3@[}O~arihTdNmes>vIDj~/)$JitS@ak`=f\\\\+PW$a8'T[9m|{TF?!*B|U|j-$xz'=iXs[TqG3Qsd!kf$SmMc.eW41NLRty\",\"id\":-3605988169183823494,\"email\":\"`-aaMAaFu^\\\\:@?K1&q H-xml=?\\\\c.yk:|3/P9foLJA13;i,`et0$%wwKuHmzZR.OAb5{:)3BzwP~M[$w]7erhE-=[!6-R6f~eL/w)B*Fz*Q0\\\"KP]j{:G9FdQ9?gm3,>:GUgZ@E(k#hhg(O8I[vd.pT4bYBW*-Zr`:mXxO=639,'hILS-!Ef%a#$&l]-zA\\\\VYQ&\\\\iW=N<j}%@yuiHcs|>}&UJu7B#G%99@TnW&[h)UIc!`\\\\-2-p\\\\\",\"username\":\"{I|n|b:/5h)<@\\\"OVJ8,O:V6SK;6Z1\\\"\\\\PG%shD\\\"?]-'DZo~EF\\\"Sw`M''.?A (~\\\\>h4ZSGplO!ylO k_LFT\\\\d>tEr(xK);kyMg@[kCYFLQ4[fGY2YG*t\",\"mtelqtbgpeuusge\":-505.0},{\"firstName\":[],\"lastName\":\"8Bcu?v~D\\\"E{14mRAUq[EWyK*8Kz[%J/:jYz]Wo6a<c-eq>emo wP=7|l^&[ZOE$BbzR`s03<@bbPqOczWB^>`vW9_WAy#3\\\"t?7P>BR\\\\:.DPTbLuxeO x]u9Z0n3SoB:%t*zI#xUk]A\",\"password\":\"7DmyQOTuVx@k*X^WQm~4Zu)PyJt|w>@VSZuxb4bjqcGSY6mO5.IjG(Qk*.BS}]z%k9s6WP3(ffQu5BPQj.?wmvXIbELB;P5@@:(ksg\\\\a\\\"G0C:!c[KX\\\\6Q\\\\28#/yaE,-0\",\"phone\":\"jNk9[@3M+0[[+|Cmi_\\\\1P\\\\`\\\\ BacQ1KuR9Lh)Sn5UL,eY4Fc~|FNv4.ro.:|zg<8^HgiKBS)nAcak{t`cu)|d,f%X:&Y2IkA_y#)_K^\\\"mKunhUOP*Fu9>JWo$n\\\"2nR\",\"id\":-1354717917830441602,\"email\":\"E?m1wUVbxrxx[?OGA|,yu]#-:S{(8srVC$sZBzAm;LO]r4xU2rw^1_2kH7r!obB`\\\\ufwR:UGuYA*x2)[r@ylae9%<!Fz}(oGWBdh5h` ]tC+H.aX>+{r2\",\"username\":\"tq^xSTguyAa\\\\>54Lw;O\\\\Z9<bRw=ugvYB=sA=6vkM668e/Ixw&+9uJy>HyQLK!Ue\\\"K9A\\\\e@;e1K96;u7p-T(0)am~85,u\\\";JDRI\\\\fp=!MOA;5YY[[(C5u?V@u!&x6fO>ULOdt\",\"lpeffav\":695,\"k\":true,\"jbysxwqyzmohhk\":true},{\"firstName\":true,\"lastName\":\"2TD<+5/D|:)5~a]vF{%z[=y1%^&Z]MUU}+C3z<\\\\l\\\\&\\\\'2NsC3H@TV1,qES[7iIM[|Ox-,I.)C9fWH4e-Qa*#.A+SF%&Jx7'})GF*`$?2au!u>Jz?bYF,\",\"password\":\"h'1hU}]Q)\\\\ F]^yB1\\\"4&uE/#(pJ`C)0>zN;U:-L&EWS_mF#fA.Rp$@&!GQ-A|Dn?*$a$DEX@nR,z&#72Ni{_MlrMQ'64=(m$Y=tF\\\"mk,HpHGly[A3=K:%}T1V\",\"phone\":\"|%sNu{3\",\"id\":-3343064466631136708,\"email\":\"bn*ma>G\\\\'.GDHm,`C cworQ\\\"9&xKbOn6!S+lJ0nIyTBtDQnSYB$O3vkorhR14.`)5m.[w5V1gTsEj:r*|016KxK6h$CG+{~{z a+5I U,)BaAMNC5Ez\\\"AGNod^D<1P\",\"username\":\"xV%$}K\\\\Uq(+)\\\\_jAYCXO#.V]r7zG!kko&(2gJ8W#dagMdK(m<pkR_.mJKl/rx7;EcJY8YC395xA\\\">qw7Ia#+IM|?&$,gL{m#3Szp`@)Np1lP]AD\\\"$-lV1!j9{Nxr*{83X54:dpM{DbQi5erf=@,nab*88nv::.;/XMMzZ:'TgwFh-a<#XMq!6XM\\\\stt\",\"rodxyquev\":-254.5,\"r\":\"64S\",\"wxyjigfnjudjovo\":-197.8},{\"firstName\":{},\"lastName\":\"-0LKRqMz0H g/*~;ce5!u_|opowDm,8_<Omd_RN6%E|be]%:/4-P4I8,3\\\\f5mvX]%sbICb3wvl~}X\",\"password\":\"EgaWNilcg)\\\"L<:<~&F7k2@\\\\wQ(GXvKWlxcz3t2OB(eP;-f^koC3:ZS~qAX\\\"+CHm9I%cp3o]+If)I(a1F|sVyH-2p\\\\Da~c*QOLU@<2#{&O1Ek,\\\\X4qkWDj+on\\\\MAa&qh,)H>mV~+fik^]!yLeqVCFO|riP j'y'b\",\"phone\":\")O^Vx\\\\!kNPK&;f{A(pkTSC.>$wPz +/tj)QXLMI`T&\\\"!7z-Al@,8{3qE5UtCP]JE.kRY:_~eG`d+$C!ve3ZM>DzaUs0~bn[=xTRWO#4CoOt'r`2/'oWrYPN4|b%'qNwuahz?.ReFMpDn7OeIA5JU^5xeDfzjWZVl\\\"mE@[Ugcj@/|ZE%Y!PS<shF*x3czL}3 rU8'/>l2/HGX\\\\q'F}/G;r.vl S63'-tgW3\",\"id\":-162059377105653026,\"email\":\"_R]aj(k{S+r[NEKvAK5\\\\hWKHfN,E&x.Zjm/=hdcyz@z'^88Z11 zR^rQr=r_\\\"IQK |\\\\5wn_GcX3i)>%MDD0%Ka/adtBCJz#qq3A|\\\\E;pH*R<Es 3,WaMT5Pe_U4H!D9e/H!hp|y$nY\",\"username\":\"PEKAVgCH^5pC <f-89{df9ok/R61\\\\Zy*y.|MO7CEb>IB=~4u-O!lwG=hGn\\\\`5UPR`xK?o]&y#j+![T*%*iBF\\\\9FF}SZ]_Ms@+tmF\\\\(Wjb9s1i*WS004TRDuE]:>6\\\\2V3Vs)1`,T)8Ligm<]-3Ak64&NYt2IF>XZE_<S=cRUeF>oqHab^SuypC-_=r7_FjQX2=OW!':*r2q@I\\\"MW#j>sQ'rY\\\\V~H\\\"/bGB{MF\",\"leslxbglsvvwhs\":{},\"rmz\":{\"xcjbbjcsewzrefak\":\"}ss\",\"zblvumioozxxn\":[\"K_\",\"S8+B\"]}},{\"firstName\":26.9,\"lastName\":\"<Nm-9'WVOBCdM{SBHH-\\\"jIaCO^^/2/sz{1iu$r:;X$E8@q5UN\\\\6/cJ&0\\\\sT$TPB?c@T9GF`+Y`dVA:fvKJ$[,wFl(U=R[@$40pDueI:xk]?e4;Z5;!!*\",\"password\":\"xat@' $17]81Nu!}\",\"phone\":\"mk+-x5PcV^Z<]=w2~ (|yaw-[-9[{Mq%lq)e7z)(sClNtPPd}Wv#NG%JE>m,?p<@yyj>=){kK8h\\\\DBuLQPrGOy'w\",\"id\":-3823634767504223964,\"email\":\"i-`{6xx)*{dSVRit7f |E5vjl3Px5)$j_?T;UQw%p`Dkl+{+|'T$b:TdES$B|Li[EcL5kw\\\"$=fqb_|OjVTckEmt\\\"nu)e\\\\gn3.$&W}:q_\\\"*P4~4aROtoc# -D8I^}jP$&Ir~@Qiw(p/T)G\",\"username\":\"~1/>0yq?Lh.k-39jF}r<4)*SV~G4^{yM7p_\\\"Q\",\"dprqztbwhucxid\":\"\",\"ccbkoooqj\":[\"$A;<a\",\"WD=J\"],\"bunikqo\":370},{\"firstName\":-813.8,\"lastName\":\"1i.]ziL&Q[geukt=nv%y2dPZP%WLV>82v*~0t2@F^-#deGR'8{o0L7bl~dmm+UZmAM*2=l_;#=SERC~mjbX.|EYlXx|{zX,nFY)]C,V4#Q8JZ}E:mi&L@%=Ok<Jyt%fe?vAe)BRN7=Kx>Xlj0sCB*hTcFt7(? r]Ut:UO(,l#V|1l>\",\"password\":\"[Vl4num5U%Q2%uN}LENz;cFJcQVRz3{\\\\%!<G^v @e4m[t4RNPPW6#RT~<ugS6=WdY\\\\_]0WExgi[eP($g\",\"phone\":\"LS(6X 6ha|qCXt\\\"{TG2$}Bg_zS2Rb%Cd%h?&\\\"2YGo{0,tc,1qOk%/|&$<eT(-mRrmI$}(Q8:]I?cJ2w]zGzP.L_GSe{5@/`{~*u={&7I1Z%uVsW#m,tlz*DqLd<Ro.HX~V@@HYAe'n%5WahA_w&qV-|85cAl.GGw9Wb2%AA0?:,%Gk__[eO4O=|H#$b?9*iG>m3|)v1%kBgw\",\"id\":-1389855392719475641,\"email\":\"1a][JB*M*Z!r%,S:Qilq+a!;CN4pOLn%|^&d$9nNj,sKVm;>o~{-\\\"1Qq/c%b0z!YrMY-T2G??L[/kI6F+!Qd<O*<'#QN{'iV)Yx,; kxPILw:jgB$)q|\\\"P8l$moM/GZ2*T7\\\"GCQH=.  j^ySDHGA9jynnr*<CCTJD^nT;f=I1)x9~x>8KP4lB0]eo[>R%,+\\\"kz.F?z<<xtl$FJ'@_Vtt3ct`18KIn}:lZ<rX@g2`d=yX*P$)=-9lEAP/CSH@x\",\"username\":\"{_kPd@$4ct[{T*t7:3\\\\vZM&1!.TW}VP(\\\\hes$g>)Rv;b+tIH)}vC1CFHbk[&`PCWsFdZC#B](974hVDJ1l+Kd0JZ>^FgD2,]K,FiNHrw#x,P+Er_VkGz$R<$!X!E<X\\\"SbK= _U)DPcec 9%X.P-*gJ#* -:SBu6}Cy3^DjVb!hyR^*?wv.hdpg/vJX43&F^kfpR'$f,$EfH,f$K-X\",\"nkinsp\":-387}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.firstName.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesLastNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"lastName\":null,\"firstName\":\",;;2zd&T}Mq,y:a#d/n9o}1 [@DjP{yyH'i!1S7H|ycY#?MgJ y,qQ>J{-sgx\\\\':{F|pK\",\"password\":\",&cp[#rMFWQC\\\\L)R^p:LY!)@g8swC/~BeO'#{Anj*K[\\\"fO]P\\\"}VUh1gsLe>#]C8ml:s21SKBknzY3fK24ZV)b`;'R~6y%0 1.kC$Wo730yV^$'k1#L`E*6j+A#8+h?/@ynQRmj kUEts88bj]\",\"phone\":\"~4KqmOAM ;1gyZ3Jxd-p?OrgbP+D\\\"{Qp-%WJ2`cOe-:-Ar{76vovO{\\\\Um,ZH5_`j:Fzc(+szt;q^?R\\\\lFG&Nh-G?5nB/c4F=>@qm),+|A k>:bZNG4&\\\\h;WkTD5n7{C vrc4>0G\\\"]:IMvp2a`_]dNwwBGso4T:+CW1D9W]P=[T[\\\"c%.~/&7\\\\@6^ko_aw N%C7#o0fa\",\"id\":-523472160531922180,\"email\":\"t'Kjb@D(*u?pktlWQ+2oEs 3E]Q|x1)8kKu*FHf/,-H6ioGb~jg8\",\"username\":\"-xJ&k7@TU2UBcv>ne^\\\\Ti%i-A\\\\g(8jf0i8HkF0,2jVu+\\\"2yIVj~l@51b<@QOg}\",\"hhjwcad\":30,\"uvgzgh\":true,\"bjxlpaqgk\":665},{\"lastName\":null,\"firstName\":\"!+hmVHV+@T'qqp,vuqhpJ]xLyT!Nk|&*5eW5g\",\"password\":\"L6Ob9i&N0AJF*NGq/?wA3:.^_e_P(3pBv))J@KLxr^N|=<Vdi7+?f+ka3 yRv>t5?7.\\\\fK!/kb;e;r?@s.\",\"phone\":\"ykQar\\\"(LJstm6GTVg[r1A6-gor;8]U$i1wan1+[ef0; Q#q,HJ!'DQ8HY3A20s_OM-wUt?}m8{qpVK^eD\\\\YPtcTQH);n4movJF^=_A% i0@6Z_ B1NPefkJ!qd_*< _yCg? *<co '.zvetK)PPc.IVJB@X3'CCYenbbI%k{UqRkN16:9+&b363tL7H&m]##E.( Y\\\\jpJ-3i\\\\qA+]:{|!=:lGpMsvadscb r[^1`I@_\\\"~?g~?pqkDDZh+):\",\"id\":-737140658826335149,\"email\":\"rzI=r\\\"*<Ej{uiuItl'qzrl|[[0pm&gH) AT=\\\"],72ny_=LAGJ7GmyDtQ?$-?VR0fK]i}_rM)~H-p\\\\IoEdwT]@d*bkVA9(O3KRa/F;^ oS+=8DM={ZgM3tZ\\\"jp^VR~+8]nP4l'+5MB)&/-l&?\\\\M|27}z&=VxM?m-u|c6X_E\\\\4dYP6IQ(rOgqB*G^TFAd\\\"yV738\\\"$rk4PWD;G=G` keC.W;!\\\"Ih3CCcIb2z;!JXYslgeF;u\",\"username\":\".PB\\\"WOpGT%]|]HAAE\\\"HrVFLR\\\"Wr7JLBIjD^`|0$@(PPES^:r%Yz\\\"fDubbvewJPvfSM__,F3/QE*G9!l</{<*L!V)S7clAQMT}Gh %j^k=Lm=A<uie)&^rCPo^~$6#ls>56Th7bQhHFF-?'nT|=h}#WopKi;Mnz.So_<K+\",\"axv\":-939.0,\"pmqfcghmnuajil\":true},{\"lastName\":null,\"firstName\":\"ost0Y_@}mLa:4ju[<$Ql+3|4Y~_k$zyV/j 9!QOSG'YJgHsYx0]YD^I|$p62EC[q_Hku\",\"password\":\"8_Vuo{#rA~:R| B0P~ZszWgEQ5dK&1x97.&XRE2JJkN[&<&e4wDQio9Q&7Yv]-ocJ7--{$Uv}VI}ouU6N5Q{&eJv3(M yA5ca@BE7)]hk.)VG\\\\E9~`|+\\\"etumla:19n$+Z)&o~N2jJjz:hi_SCK-s!kVQ4P4^|?!jDP]/:'-g-)~Ql{IWN.*izFP-%s3?XK86-SgF`qs,*tff\",\"phone\":\"1@/PggV\",\"id\":-1480634881914984193,\"email\":\"9]_7%[y/)tIuH\",\"username\":\"+^F\\\"9kSfSyr]KOsp2ux=Gs\\\"K{`\\\"D3k45Q*}p(jf:\\\\sM\",\"apucsuypyf\":-934},{\"lastName\":null,\"firstName\":\"5e\\\")FgC_?=?B4\\\":Q]QS{Xb4l~-s$z>5Ujn ;&61Tm4nD,'sM*k.q1g3/~3Zk`C,\",\"password\":\")~:Qkyv*dz D=f^w\\\"]ZDE9}3dzRa 6'nPcA;+cCF)dsDdawVxSrz9ylsTY ptt7@oNl+'<\",\"phone\":\"LZz>/|$ FZn!<t*hU:!aIlXaD2Q45%W!L#M6E*A\\\";gZw]9HJ%27=dIFL(W~Dm}awgPz-kR@r&Gx8+D>\\\"DZ\\\\WZr{_Uwx}td@hlPofmwrF[HN!R+35b4agz GNUpJ6@\\\\/)~-^|7DC2cI:wv6O#j,`4'RG_wg}+J_$98(3_cpRX>}*og?A-zW&,/5Dv1m^l#E>4\",\"id\":-2367253433170541059,\"email\":\" lAo~s0zA(u1!m;:ezZq2*5`<oK?|Lh<^<bdiI@|8_6)mIf\\\\g;xsO/=uW@Ne[6c/Ld%'12[f'j^{!ElfetgtV1mDe/b#^#6Nu<n:p\\\"xxtk>4e*E_&z_9XkD1XpLoz}2{'3a?[dA%l+GXd)Z\",\"username\":\":0`V2 p&htXZ}$;L[ Xfp|oyl1+[;ibKuH\",\"oszljqwbmfqh\":769,\"tlzdoppc\":680,\"wao\":[\"\"]}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.lastName.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesLastNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"lastName\":true,\"firstName\":\"7XQjIPX[-X#@*e1r:f{x5cXMjZAFh|Ol._\\\"+^U1pQWXNR3{wcoND4!3>,BYN[?NLW[5=IY{Kp8vJRN*Lo&w:%S5&E-6^o\\\\[w%gb8(~a35+DyvI/oOl D^S;mSM?%#HzwHJ9m,$U/\",\"password\":\"fAcfx*!jTr%XuS|v<dFd\\\"IdH38,~p61; &/u,@C@eUE'*[\\\"#Q-OoCP{ e|4dJ[64I@r-gk7P|LNOeN/oBWkfsRt(P\\\"gcMY^xd,h0:E7U)1Rrr];_aeX\\\"B:\",\"phone\":\"3gZ6KC`EBIx^djd<Y=7y-A;6(+CBm3FE;2]AB*A<\\\\mpiJp%q5CH_)Ha}>:|qxR*-Ln\\\"\\\\Q0],MjiY`09D;kr41A\\\\>Af''NE8X0@L:V=&jj8q`17WC.5e'|d%Xz|-,799q';o?\\\\\\\\x7x>HakUuG/_XhQT\\\\\\\\,@.'gZ4m85h.*#+\",\"id\":-1718889906879265752,\"email\":\"1Ukv}f]o[5SsfwUe9Ti<OcEEe|YH\\\"zVANfYSC1t]=l1B<tYEe>gN?t6Mb(|.1J\\\"K@cf-\\\"0}XeuaMx\\\\}YdZdA(Mls&_>(zvr69K?I^KI;%nuJ%I=y/by%eB%|%^i+`gL?t1(-!^cz*DIu?x6*|k%gN!G0[$l%Hg_6G5I5ZhG~u%Z<o&A.d>5iyKC\",\"username\":\"eA,3dZt%t}8SG/X^v<;*!Zlb%sDhsRGiyHu/{c.o7z e@pbcyrC[z^W:^(l0Akjjj3\\\\J!VRk/),b+?D!O)*RH;\\\\OP>`RFsDc1HX.BXv&f.{2I&7LFE\",\"flsrrcl\":true,\"vacyzqgaaifs\":-606.6},{\"lastName\":{\"slbgkikqw\":[\"r\",\"/+IAZ3]\"],\"dosqaanpdjqattaq\":true},\"firstName\":\"gK:JNvvU8Sc0$*g1;:r|*a1L4?.bNj7e4Dw1wXREyMfF.GKL[`uz%U[/5t388Sg\\\\2kU8/kjT.<:H\\\"!@p&:N1]D}JwoC`<zV5`=`v7a@>}4\\\\j_AcU4OpVFy7^|o\\\\)UMre6~ZpU4[is2nOf2fIeBSEMfXMC>aFEz$I]&S9#PFZrr+=zG#UV)tF:!C/]J:rmB.m2NzU\\\\<xm,/D\",\"password\":\"Tb=0`c[;>5RllAjwK|p/) LggIcOx-DMp!e<X~``I?@Dl>U58='!dnB\\\\%|[xXGOoJsYGI~{FL%<lJCF9WYP0\\\\Wg8mu\\\"D%qJ:ymT;lHR-1SRL~~/g[}Xjg\",\"phone\":\"-K1?xQUuef(94C/pT_N~I+(~+py';MFY@mfw:A],pnEf5P&`q5A{e#PMM,7Pc)#Bf>h5:XLP0%-VoX\",\"id\":-2116541052927996820,\"email\":\"XLJVF03!CWh(67@*V4-b/D^ej,a`i@0h>$[LXsyD >\\\"q6I,Lx12SWz'WMb1R<X6,H,S}mY1uOu}-FNOj{|~MP!@.V/rne-9s[(7*,0guKO0%>8_XpkKNI)%1# P7H*.`ha|y+X!OIp ]H8fM.3=SEK M4:,D{[iGi5sP,xqr\\\\Z/_ls-MThBOwk~D3]~tFNCD'KN%tl+,/g0r4p&9rrsnk\\\"g5'oe5[_;c80\",\"username\":\"\\\\H,+mR `+DK.H+`r\",\"gkwytj\":true,\"pegyijlzbrudfbqt\":-390,\"jnvuhbwgz\":{\"fvpsyylnajerj\":\">zC\",\"mxsgmgvln\":[\"}oD\"]}},{\"lastName\":[\")Z/(I\",\"b%}o&<(9\"],\"firstName\":\"FXDry@{uwr 3KNc*ywt^jZm,x.rZ807yDBSxL=v,yVlU *5:7xD5j2S\\\\F:v$oYc![]/|Bg0ij]sOppxF?x_&mbDD%+Wk$ZK-q*%77\\\"uyXh]O8NjwO<w.g 4Y[PHM5PC:8$+{b}n@3llJ^}a0LC8V/F,&kY']@,5FdBe.$qL=/N)-Ab{\\\"s-]$G[ox(bD3mSnJJ7{#&XDkUj']cv5]&C]\\\\w~dC,.lE/70UB4nl)I;s?XTky9J86u}!dTl?'^XVOhjb\",\"password\":\" p8mi7I0% 6}Y8JvPejX=(=MIbd9cdkTr~fO9Jz],v#Utz&#*6B;Ob 71~[=''%:i;z0QHqJz\",\"phone\":\"Q^/=b3/\\\".2uy/%dIb9>:jVfs!oRdy>FknV|{!`C'pL#Q=r/WV^C^a}4K<n m!M>CQR[+C6;0@-j(Zv;'FwVbB$qKnDKs}a-43NxTX!\",\"id\":-3917169403479855894,\"email\":\"(SrTj$<g*Wv<yyM.|(>~PuQ bmgh?DzEmxIkqI~?z#/0MJ:}7OX}U)7{G;Z4-0Ibz/p)+JC::ETg~WF*@)\\\\EzMpVOW:[ie9~{Wg{&CwBOD}o\\\\'(/)I<C>h8y EAC5uMU&GhZx8cX9b, V%tvd.sgPa/9X0GvQkt1o4/nA_EpW>$2RKZqrxCz[J!{6}n1$QO4\\\\aPj1[okqwF@S'ku]+uNgee}GzlLR'cw$AU\",\"username\":\"K`H$71)pK5l$x(^5!:WlwR}(;~9,u<U|xSdJIxSb)'6'EUFYKbfaj9%Fyt}=8$BQ_R4Z8<_v6@!\\\\2[2D1#gZ'?jjN[\\\"iK@\",\"svrouurl\":[]}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.lastName.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesEmailType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\" @g<#czAueS&to:ZJ/Z1Y|SZe-q0s,hqzg#C\\\"fO@s,g[n\",\"lastName\":\"+6`KRE?J/gU=s~lnd\\\"sjP/&me\\\\BI )5{,+*E2?X{oSV)t7H?J\\\"E|[MIYu`Pu@q_uQ+`.u-RspyI*cP'z?DC{s5BV/8c}mqqn<Y**?RRy3kQ.94s]T:\\\"X._oA+ SwARiA1]~s%.TL@z&t7ng(>OjAbb-MX<~y~qw14\\\\:`L4)sl(v7_@l7v3QkDeTipiH VHBt+4'+SjO\",\"password\":\"'EvqL@i%25PTAK6&-\",\"phone\":\"fN.s`DZTpz.V*7K\\\\A?~6WtKokVD2hDb~;5]:qJ*qco618&99[I'u5Nv@OT8>)kt[{Nrh'gH9M.Iu}8j{(=OxQjjn<^ |<O/0 HR2AD27f{e'R*k \",\"id\":-2141032256621227331,\"email\":null,\"username\":\"~BtH{vk9,G_o\\\\vC**5G!r:a;qeZrK ]Bea;YzYb/i\",\"lwgqyf\":true,\"a\":true},{\"firstName\":\"LUPxu~a=}b\\\"3o`M(\\\"iHMZU%3u1OS\\\"E`>`L@ 1+|WX>\\\\OAig4db&8|rTmq$m!V;8\\\"Ez~f^)S9CA\",\"lastName\":\"*dwSguK|N[cK7VflSC9U~/F<S%N[CUmj\\\"^5YR\",\"password\":\"&3Q8*Nu<}k,+KzaD_\\\\@c^aAJ/Et1*\\\\D:|!@Y+I#c'iZMIU04f ]{h|\",\"phone\":\"^.B~IGoD0rtVaR&WVB3V,I/f)5%@G<2NoM\\\"eQ[7uC9AF*p6gPYu8VN=1\\\\JH-f;H7XwLm@s=90,^r1iYS(t<$l;pE?-orel1D&px$b?9jKR#nKql@anUAtjY6J~-K8a^{qmX}U*|St#w+d_!F*uxp:DLjzjqvs:K74}ek(_NtV4pm6>pHg4=\\\"(@'z@*yv;4pMvb\\\"G8`{.qs|:|F&sUpgO933<W'H.BZ.1>>h`%@H?e\",\"id\":-2435846422334439956,\"email\":null,\"username\":\"m\\\"@KMeP3Ia8GF9AL*zF0#dl^?Nd.{ET9Vg^N]w[Kqm7Jwn+v$QsOjBI61dVj.hJX86-4M%4&w){$/xmMiWWmxkIY'IU+_},e~mC+}-N6m8Yer{:Jc)i_2rE=B.Lc~HnrK7&31i6;lrV<yW\\\\m-(!H#K^ [E;-E[<,N[57p<.KTTp(M8C=OT/}4cIhQ|]<u u<Q$ly-#N_0*2}4Yb9j,]{mkO#-\\\"5bGgCuBFn'g\\\\i\",\"rijymzxgsjuuqdzu\":229.0,\"rsixsnbvhcuw\":true,\"aboqedkldbqxnarv\":-472},{\"firstName\":\";0E]W79:'kjelA8>zjA!]{2ZHHz^Y[,E2bas8B}6&Iynqp?}LtY?KI=4KtjHnxn5hDs|H<~@>C;8PDf,K6@OrHZ(Q<|\\\"z94=5Vz;rXqTVNHbk8VWSd')(Il]if*mg\\\",|VS*j:,}\\\"#a ,^}XF_HQyMB/e{\\\"L\\\"dP>Cg(lJA,ps1#]#iHph;Z7YHd#'&,9$&BlYE<9=Ts5+ODi|C(5Gmc~NK<g$Cu^KfKo~F p=7__|S}2=\",\"lastName\":\"lCg-oRnLep'#c%y_P!.H_B$)b=R|+X<un5^v'cy7cWYgTG_^7p?q$<]BWNehTy2E-{%#!YJ' Be2'q}($;#je@3#FmM_jfwY3]t8/*hb}w+Xi+ms@%H`<?- 1K?ZL{YC-B<G/OR=*KoZH;F(Q_ragrW8\",\"password\":\"5<PH+mYmjt%tQGu$t?yhPd?K@#tO6Li\\\"?}ksv[LtS1l(Ik\\\\?hK~s)+TGbG69p_k.l6Z1z*$eqD*)Pc]z,W$J4b?(.31n5gJ\\\\OZZw320xr{ExJtdaWWnI93sT3n/ Rsw (q\",\"phone\":\"YELMxJ*\",\"id\":-936302411956269051,\"email\":null,\"username\":\"lZ{p3[K{(\\\\6OTtY5D.B\\\"!c:(S,1YU%+W+'MS67|^F:G[ /:d8mi78l)xKM^Q9,W+yN]oj2lh3[8jMhd$_k`7z?!@?FNgmW5&8IbqVEa;)XA:OzDC(7F(siqJQY/K:wPXrXM8_z4P[<'QvYpcJsA*zTn\\\\TS$y)&h iozKVqQ\\\\-5:@5AZ31\",\"hsho\":\"Px^D&P\",\"pm\":473},{\"firstName\":\"FVcmRgLnAB*+0@[{}F{35RrxTC'|SY}F^1P\\\\=1Kxe{n'4b&IH)lu?Tr)[$Qgy*JfdYXMmqpf+pr`.EKSPyGbrxa12wn#a|2|\\\"{V%8ZF@Nts`Tm&7bMkUF\",\"lastName\":\"CMh4I>IdJ$.p8z~l*a,lRE9^suT:z#|7j/+IZIN+SZ =#TDR ;1A^sCRs'?:KE# yft1N:Im\\\"{WnE)<bU*\\\"Vn1hX g2dye$ix::kRLZG'{a<S^~B?3B'e ro\\\\`&'H;\",\"password\":\"R@/fv\\\"7+cD)POu$s\\\"dC0CMsD~$|(iDCB<;gen\\\"Ck#JJ6J-xH;;d93*bhS,Im(~~*IsF=>)7Pr;~?'~`/+40jwm8pZ7Z|Oh5[x=a|_ +YmQRmm-?eg(r4u>p:|2fjJSM-PJW@1sGXT~6KeMhv9wXPw/P$`Q>'Vr8(f$1pS1+s:^^s?7A&OR~Z`$.b0cj~2_xZRH:[}FR|x AC'@-.k7w*1$qunum6?8!\",\"phone\":\"-Y1-:[^Y4q\\\"jBqd.;lN)@nLRzGA'$uSJ=@%-?Q>B6Q@/DD5T[[8XO|b*7b_i6KOi}*q7jMq%w[+QWy0rQ@5sy%cdbI'.rP#;{:!s5 Aq(m0\\\"RMZ&fYr<N#WN-MN}Gx9\\\\JDu)/;b2@Ymdsnh=[3q>+3sBqZj\\\"~[{-J%jB .y!P!fG\\\\Y5cHU3_fLrA6_ [ajsjfWaCM}^4\",\"id\":-885822715365629765,\"email\":null,\"username\":\"-&Cn'{=`~ZGW>7QAv=Kl<1~X},4RHV~uvU[H`+Gk\\\\:R*0wvvsTC]!<Ks~Ea|UBH~qw8!GbA=\\\\*-6N\\\"DDkj1`O9\\\\f,V]|:{owt4iTb.op%9XCQ3QCGi7?(+7#dVJsmT-DNTwlKMV?_5=4q[F^g9Hs2K6*u2\\\"Xf!|~(9)OP5KRUl`/<3%:gbJZAEZs3f8P?'G\",\"ylohrnlin\":{\"bzo\":true,\"bn\":true,\"veaaqv\":true}},{\"firstName\":\":8S(>|zN\\\\ P:m!%e<JoX|\",\"lastName\":\"$H\\\"8+YKBUlu<F!`0>!LgN`rCAL(]FG=\\\"Si^5 ~?-g0pbb'`EfU{J7T1~qDE<x>Eg.b/%ZB9u<]mu}1zk}G %2!C:$m4.-U`vN:\\\"THI{IPB;fxpRa'4gNXx\\\"\",\"password\":\"zB:Jc.}QD3fO&/URGds\",\"phone\":\"6/AR-S&`Vh>DF%qKvr;D~u?1QA}y!(.a'7Qb\\\"d|Qhe4B>@N#W}kiOALc|0~RKcc!vJsE.U>R^n(4'=8qmpS%V (|{DxOU&naW(`NM2/s!qf,^Wle=Z: n>QF.F7c5\",\"id\":-1450064049267504639,\"email\":null,\"username\":\"&z?IQ-rrbT{@tEt/6X\\\\j\\\">DBk(i3Tv:m;I407B\\\"bGkc{RDhT{^nn&hc};Afi`@H_U:anA=7~7[Is9b+;.PJ>w@l/aO<^#H]L<~$nCC`Ct\\\\8QohgLk}yT3aUoED0EqQf~&zpF${5f^|MB$'pjQv*yg1W}[?hrj}7s7 $oW0jv=f=LO3}_t@8ixP5_*m{3Z|5Jg$I|1,+aM5\\\\eV?ez-6Hem>z2Tyt1JEo0Pn,6JcK232b.<+)WN\",\"fxgpmwosmcvbzejt\":{\"frac\":284,\"fmydmdk\":[\"z]'\"]},\"vdme\":\"Z}R*q\"},{\"firstName\":\"YEnQv5pfb&ST@D6A`r\\\\GpWKw\\\"GGdUOC)YIO;VyZrkshH(LQzuKAn?<YFD`<[Ny.b_+@ LifX17^Ur\\\\uox2rCm*Bh=9+<oGoVmk{!D$.e\\\"FAJ\",\"lastName\":\">u?N`T@B@_d`+\",\"password\":\"dem.5N%nvg\\\\cC(DS~@llr)=W,<@rNkz ZN(Jq;(bUc3|mk+FY#x'; cLWY05s|V\\\"Wd8_,a68/TgVELnloY\\\\<epga9v8$16^(dmf.I_%RAYwcW.4-9;\",\"phone\":\"-\\\"j!iH2[@/{ya{ >d%A?[v/@G\",\"id\":-3864749184175505856,\"email\":null,\"username\":\"'f{M\",\"ivwhmsna\":[\"x{h]|Ca(\",\"4f}moGC1\",\"oj2Q\"]},{\"firstName\":\"K$r7{o\\\\Z-Qg ,jS%r:=I7KI+E?i-%U,,xsZt02:<dsOd(q|xZ,g-{8U*j7/FLDtm|lq0@J`v}89l(0_5W6=Lu7 qf~pIk2R;mszpByYy1-l 7lO#B;6T,i>RGa=?x5XwKg_M}`a4_C<^;:W=I_[F3DN\\\\+phGUBOJ\\\\e6n`\\\\T;\\\"V.B^w;e&Z3^>U,:K5lLx<:J,MeX5+x|u:qpgZB-0hHY=#rqJ}QC%B'Z*X[\",\"lastName\":\"!Xkn@]WzAjp z.|yvovs4!Op;l43(oH/xxv5wq)Qib}+slbZTr8k3rFg:s*0a-?g.8yiK&ITX*-qIodWWAl&M|^X&x_j=38zRnz.Dwf2$)V58i2T\\\"t)?m0=GakVpJ%Yi`ru%oer)x6 ^hb5Ihv=apLC -z *k(V |2),,7:W(,ObCb33+:<5qT!9UqLc2$5*wtmXK|d/S\",\"password\":\"r3:]T>!)BMi.Q2p5_]8Q K[q#iR:xb)Z8[\\\\qr0VZw<m1z|U_k$tO%lX*vgHhN7hoYdJq<Y\\\"BoP9yPG/gkdM:sqWJlOlcM9T+$8l`O<H;l0mtqsbtxT%<! {FnBq[$]uN&Hc!b+?H1FFUr9_VT$mm~Pui\\\"|tiR.n#!vV8I>W2y}$-CUE$zbx|)L+I}M_4g>IA)w}PHzxS>Hc{UUK{J\",\"phone\":\"p}[L[c+<4; B7JSg,jpsNT@iml'~vv\\\\[>hw|i#R{Bt^+|e]@vt.&Oiu&}9z~C;|SCJp=N&2r#Cx }ZkD1`#Xs:#CIX@fpp6r*S&Lk7%e+hM46#C;\\\"cvZRJ_T9icTR^OpqqpRBnJ,q$6hzRZ }UdW\\\".NMw5*L8k gf6BqV0.q'X~z[I6?IN(zx|./4P-a*<TZIr|uK]q~(Q3C~`TKx`x.7mz3GU=o\",\"id\":-718820795945576843,\"email\":null,\"username\":\"^5?]g.eV8~JSZ<AXTLoAFf+a.AL\",\"zpri\":{\"hasgwlh\":-318},\"qjiptkcuipmmkvo\":{}},{\"firstName\":\"u/gH_\\\"n;Ax5 pQ`2Ts6&~7x?P4u{`?en%y\\\\ztVR4\\\\|8-k .|s*OyaUZ4^[oxtMWIN)g3;kZ1@S\\\\js=ZqIyMqT1Yd:\\\"!<F]e&W-D_p>>nQ|j:AC/RKSYT\\\\\\\"mcIwp$ypd2T+Of<D6[,-@<P T$B6zBnE 9'2[P~rMo3maSBJ@v32GW+i6<<7<P3k~XK>o$N%eHQm@n!@YY8Q?I\",\"lastName\":\"aGv}2^;IA*LnZK4X8%j?19x7Lw21x`St/cMwk6\\\"GSts'Dd~4<TE'1\\\"{]DVfB[PQZ)sD\\\\Fyx8OmsYc<ZElmjCM/(bA!yS!aX9ptuAf: jiA}Fiv)L(l't;1iX?/,Qiy6]P?q$X\",\"password\":\"Je\",\"phone\":\"|\\\\&0rS*e{hr>zHx v\",\"id\":-701645812984685764,\"email\":null,\"username\":\"gs/24[<QPBnSQ15 bD,;tX~O8~,2A`9bO@V@aW+S||%!g$cC@u+Bzt2/bXB@8/7)V`04Q.7*`vW>e(Ok6.~-gW*c^Q:AqN:Ohd`FYyBWJBu\\\"\\\"]ul]x8|jz8)\\\\*OK9:}uEd]Rge,G\",\"y\":\"Go,\",\"nsejqwosof\":true},{\"firstName\":\"d526nC{uHpiZoyEL0N h;a+_$n]T!n*:.\\\"v`\\\"SPV|yUo#T3K-R8,?-P`MN\\\"m\\\"ep6P[xd?>VL630&B:s7=;>Ae%&n@L5\\\"};G;)zP[i%nbWr^Gb['Pd<6~eC<TqEkT`~.I5?5\\\"eP]ts<L\\\"O>I_\\\"OGPtqduKPGJLKz6z)4[bly|aMURl8#dY1Hum 1U\",\"lastName\":\"<G=}\\\")-t|]dhog~9MKDKn&HhNU~;,;s\\\\TxQ>Tc ++/):1><gA9H!c*W<WQoN~6s6(#Fi7^J(`OUJb`$jw^;R5u[GS^KUAy:Rk>yG1m#\\\\PV?sr4 aQ+b?z@'}YS08<fcW:dW#4?Qn@\",\"password\":\"W&.5Zw7}uJ!:]yG~(,Y ]\\\")T@qz*xIM,+2b\\\\D.~`%8WXu6cE}`PM|o?mw{8eOm[t+RtmG^FhHR|]`q\",\"phone\":\"_LqpksLm$G|N5a-Cbv$vO[+NDwj(E9?V:msHFH&w}vuDQ{pk18{pe]wu30;[q|E-\\\"b4maTxMxP%b[Ynf5|B.{hq?& {.-e,(t\\\\d@Po\\\"n(T&OCAn4lM^u7<>#lG43^{DMTWBY:[ p\",\"id\":-3977750985261626117,\"email\":null,\"username\":\"6:%$A$|8HG.fy!1PK?Q.v1+b)zWvgoDeOL/G`Hf~mI~r`-e!ZY}~y_Q#7q4X<u =8/'Hn0giZv{r,~XvJUirq+xXnDGrY*iR5u`VM]9\\\"E]jV# Ec_wt+}0&xVDz0G;;HKLI)}3L=p}~I#l.Bi\\\"E-r'lmFc<4n#@6&gcg&jDn1vUVt\\\\>@srE` h-(D-+z_mv-4_f].&asYLjewjyLK~l:-r'ktb$Y:w&G9rm|n\",\"xkfiehtipnklg\":true},{\"firstName\":\"Fp~8Nwf;;H7{))}J%#Qa#(e|>dj$9iCd<WEND_yo#t1WTM&xs=:).)7puS>NX/IbpiU&&:WoHG+'^X&y$\\\\  y<8|lc&j.sRsEi$O0YCx)iz{78@0Atza\\\\|_E(abmnPGaS#GyO / g\\\\T4rWR&}AO<\",\"lastName\":\"48en|ybp!O&Zi7V\\\"F}X(<:{[@(b8v8EeDCvnuL]E[mc|qf2 t3azXA7D'~$=og5NP*ouhbKG`CMB$0Ayyk;t`f06^20+#&MaTL&O:m8`z?-}EGLYNA HC+3pMd~8bL}chAgvK2!|7\\\\lSyihF\\\\@0>3wUO}<_4g%E3ks/unA&FRKHr\\\\>$Eo=j>uqyF/%PA=u/\\\\x#kupF\\\\{d\",\"password\":\"spIF1\\\\+~EbZ;YR0poG+SHx'esP8r?/\",\"phone\":\"PSipPi:``XWq.6puy5h/C'Ai_Zey!O g\\\"zfNR60G8?$qmVr\\\\uV|z;!!+|mH$Kgj(j<%\",\"id\":-3548821817950428466,\"email\":null,\"username\":\"wjQ!^Y2lfv*f?,1(3eruNfP,X|Bu.<sDOwP@8a7Bg/VphzslFJJr4ug_?a0DWc#eVa`&wKI~&i!*@VU@F(#:T`,LRU|-r!QP48\\\"C}0G{7nNhS^~K^&`2B|O,o@_):}59~Qh f31<c*Dv!p+\\\\:1[CUgTn(y 0~_\\\\d+q/Ax_{l*8`ku\\\"E0fx^+O-I^%C[oxov|W5/7]snRcge0rzFaN*~QvYD[z&7,\\\\D\\\"O#$XDNy!(J&G\\\\fWQ'B)-MGb4qPYfER\",\"w\":\"L_r^\",\"knodeqrov\":{\"adwkzkym\":-515.3,\"lnhttzt\":-925.1,\"yttijnzogcirexa\":\"x6gQ\"}}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.email.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesEmailType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"6p\\\"gCM/KY-9?R31CLvMYdT?}wCFm+[M[VVy[*J}=b-37xDV\",\"lastName\":\"/ y'FC{~6gt@019B%&b&Z;:j)@|9_>^oFl[(yiT?9SZWJq;&WcKy*P,U~Y|I3k&HBjLr3.Bp<y=l,QCxiHguyBK9>s.y,,-YsI!i)8HFU#MPMlyh@wF5}v+1GNOhd$Z[7qUkQG`IN~2`u]Yt$7|4RD_YZ\\\\'[0L6$+ZUx~[S}#ay8_VW.Q#,M,a`8'MpS1G[/*unn?VlPE+M'c\",\"password\":\"y9T0_U]95hRM!>7m| [qC-Ag5R$GI-hu`p8&Kx\",\"phone\":\"qKZ/($,~s,AAGIyqFND%Ov-U5TY_=\\\"\\\"#kIWR~H;dkK4ov-61IOH]4mOZg~nKs&X`1<XOV~!]<-U N}99:<5:HDXd \",\"id\":-2189051837058290393,\"email\":true,\"username\":\"O9h`Px?ntBBS8=MJFxVjTngOJRM b8B;WJguIpfdA>/u,Z|{1+xs#RuLE%&L>{]MW7'aqc$uqvMm_XU#1(FH;E>kV&>^`n<xJdt$5QF[7A3tw!uhxjaf\\\"3`zt4%  au)lPxLSa%B)Z(mTg?^0#mGRW&M&#Wh33W)LMpRrNYW@^zZ\\\\x|^S 8^/2y^,PS@gQ,D}].gpjO,q(Di2)irJ;B}c$(w8exGuv'-DCm0W-LV3w\\\\S7r@{M5;Ze2*u0\\\"D 6>\",\"xejqdzxymj\":{\"x\":true,\"hvqpqxscrxkqblv\":-769.6,\"syre\":-819},\"jyjruyxnqajihz\":\"YnH|b5Z\"},{\"firstName\":\"Sitkz,n_<OR*.z F~cClW:+Fq/,Bs<M>#8H;MxYz HR}5icn!^h\\\"]~9^Pt2R32N?lG'u`$Bc#bv+]t\\\"xaX1gJP4#<HIHQkYfZP7X76*hG$cfNc6Hv\\\"\\\"*>*X|RlORa0J6Hb*ht;daI2&}?0t S(eli(0=%Mxf@0=SPJU,2ofbmB)@]QG33J''ZvP7UsBRN5ay~G\\\\9YBuyDP:H\",\"lastName\":\"VKfPV&lxob_!s5uexfVG.]9Jl0A\\\"'GsetT5W@v[eH\\\"{Q!aD?qM=<D04(CHQ<J-`YkCQ|?+LaDI~\",\"password\":\"UwAP'gJ#?`d{f%YIX7dDcYNwI7'<BtM+Eix34v=l1f0qtd8x|;ni|6/%azh-3k{oiiMVmI7Ne?x0wDw[+{Z>bDQL+^Cwe,gtnE`'G6O|S@i3f>~.k,<[xY^{IU4)L\\\\INwsoO!Z\",\"phone\":\"Bg1`QTL6+g60y8 M!T9M_nhtTv!<<(5W=c$,O>n,HiHw1;NujF[ZJh`<-(efv;e-^3dmc;sU[\\\"=[M\",\"id\":-2475764188543482749,\"email\":{\"iabwptq\":-30,\"xtdc\":\"7e\",\"ztxhprytzsz\":-987.4},\"username\":\"64V5 8Ru;'zUFY:]` }L;U/c uD_U5_8+M-c.n9t?!ACMQ(.%.8#/++O')6vCS3ZJso+4JoVv?]A&CN{<#+6<0:r%\\\"f\",\"qsqzparwe\":-443,\"bjgxonhefxqfy\":true},{\"firstName\":\"aoW'$vXeU@RJ`>Wb<seBV`l~})|\\\\jp(l2E.>l2G>/o-/B6%/x\",\"lastName\":\"2*-OGA\",\"password\":\"jkb#?_~Jb'Fd-o~nNT&9tr`S_nVA%Kzj50muGN$3:R:@[;kcfD=0EORkCgDRNU-N&Um8J& E5ot^tu?Hps!0bea7j*6n]BGR9yN&2j$|%qW[:z92}ZB&rPBjY:yBmIU^*/$xo,!/GK%O= I(QD#akJ5B}uIuY`KF0C5quL;562bzmQhsA`{W-^\\\"iUJ91zX-F1Fs}GL\",\"phone\":\"Q-cUEUbnp=N]y_^xg>}z\\\"^0JYy[@Jyvi)~Ld\\\\4\\\"o%wL[ij%2+^9uYcTl`]cEjuG/`{@&!3:j/'V?;]2I<5sB$};jK]\\\\U)oNf-U*_u>jf!~-=V6;mr'&l}>[bOivH=q;XD*DQ<XF,,9*~J0qv1NM4$G$(Kah;5zqXSJ,yE\",\"id\":-785539562982771852,\"email\":-869.4,\"username\":\"FiMY3U.<$};s%~!eJ$[2:hkN8gY6T3vU`QtX5?!lpAYUT&C)%4MW+S2E'VEk5(E\",\"ghld\":[\"ip\\\\GY\"]},{\"firstName\":\"Horumo~|[]\",\"lastName\":\"dK0hdM ]KKd&8,Cl(sFM#dK*$Pj~++@e`opT<p3HCDFgnEdGDHRfC8 PXapJ>N#-? _Q=\\\\LCatt^)},De{i3s?C=[gP?-bH{\\\\o&\\\" HIgZ;aH{8,'aV{j1x_We:&~]D>d4&U8oE6>+$R9o9XVs/3<\\\\%WL{#Vw8^SiZTsYkVaj4! /@z39l];CI,@N+/L7v|w}r==I;>T>1S=\\\\p)-j`c>gh)8\",\"password\":\"tG\",\"phone\":\"'al-g@jvZ\",\"id\":-1160549835503979875,\"email\":360,\"username\":\"JV?/UxpaEZ0uD{;)1cLugqU}pko3@?y?X;aXE_[rF}]V)>xj-fJ\\\\id1&t =q3W(K_7_3wT.Swg!;Qm$EOlTX$I~3k I2PX7\\\\GgTt$N!\\\\CT(S&~`rR;FSHd4YgJ 8d!kwx0Y49HO:e\\\"#Jg*v}'*u(v`0~@L$l&Tfn]p$mw:HDLa?+h]6;:K< m[Oa0OC%UAIm6=pYKup=K5-;bScB2<\\\"^TRE kLl<lR];;xkVQ[Oz9qze!rD{_ BM:\\\"\",\"hvygnypgndgehw\":378,\"jmvs\":1019}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.email.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesPasswordType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"/n-Pc681i7JnU;TQfL~FRmz$lb$vi+;^UKizHm*by9iCF_)+V4gt?b_^jwiioiNaxd=jKD*cIIX.ky{4:=jS='H<R/;A[7BM2O;,r)^!80/4~iX!eUcsh+Q<B?L_}KGzKM.Xr\\\\}y.>j#`^]2=xZ%Y4T30&<hUc(-BfvR(uF_ym~jM=,-WoR7\",\"lastName\":\"M u($lvzcmA9hDs)GdeQO[+j[S:t@l|~00gdG0?tp.]iVd&a%{-2$Bb)_[CrT'MK7&5L!u}jK}4+H@JFBnu`,e<SNz(K!xm6Q^M+Gr&)>K{rJMRr9&!Gr'Q7h0-)w/SActAN5gpD|<(Ml%)U2Oh8$-:O\",\"password\":null,\"phone\":\"$QYm}\\\\Kl(9Wv:Zj]]i5)v{}{Gdy qdtB;/{jW=HmMeOpRADdGmh/TJUp,$]:A~N(!~k:V\\\"~N\\\\W7|F_+g%iOuPir3<55e?IY> )\\\"P$\\\"wR:\",\"id\":-3650519575548516305,\"email\":\"5#D=&G6bY5Ri}1&V{[c]sVj,Lj$m&[!l\\\"K7%^(KrAcf)s2tk[r07Z+xjt99*Kws>Ed?x$VVX2etm.baULM MAdZ&?LzSn4Wh'\\\\FAS37+QG9%7/Lwt\\\\;?9sBsCkMyfm\\\"9W)H_O*V/$kna^\",\"username\":\")WJe`o!gQ]rLAv$Llp$/XWKOw\\\\Gesf<?}'>bfD-Gqnw&(=GB{x6i`[2~+fZNoR-QlWVU8Wc4`uuz\\\"!v'B4 g?&ezL8T&)#8 3Z9\\\"A;Vx3<ugkqYwf}h6^NP/.5{\\\\\",\"wf\":\"LBY\",\"ftvrgzcuowpkowp\":{\"yzddme\":516.5,\"ioqfkq\":\"GT\"},\"zcjs\":-855},{\"firstName\":\"E=76L@7.(tj?9N;[J6@4D8POT?|Q4j<iEM%W~COILV\\\"|TI:LNsiCbP\\\\9;1:-dh ANWt[}s0}x=pb\\\\\",\"lastName\":\"|Ru4T\\\\U?u2yP{[F:M-ZgKfMUK#X$UI}}4\\\"u{lO$Jp-j0\",\"password\":null,\"phone\":\"U;8<%jL#v%B v)J;pVA=8H@!*^+ei_qjTsPVnS(K4+y-B2:p2UrT?Y)5]~ESATwD@&?\",\"id\":-3691931589716952716,\"email\":\"G:GCgH !.;vD!e(wy{C[Ln+CIVmXZ(!lWOYQ;[2.|T5; 1|M1uP^zu'jF\\\\1HB||%fx}b^*{[US]Ksw@*vNpqF)@f1,RF_gg^-vTDAfE(*pb=qC]@AqN6T?.y>\\\"N8%Euh\\\"T/-R(&$k5|nx)u4g#\\\"k~a\\\"_8x\\\"j?iVs~NA_<6(o'5}QJ!53CMifPLo|lOT!^iZi~*KUOly#ES#i%{Tt4Oksl}.!+k.|;h@4$GYfgd~^B, jWIOEXW\",\"username\":\"Qy,&rl!+<MmUzA%&Ak %;FG2jE`6.c+G[.Mk;;&LD2K4q3785{E9J|-h W1]+s8MCF'N1?_\\\"DYe <ApH-9.) 1EeXW=_-g3H~3._xy /yf6uM,B]HBM\\\"Fr,4nqGL+;E#n@4=>;!BQvHO%'c`@@#o!/u\",\"thhgzoqkp\":[\"1JLD+MAx\",\"J2n\"],\"alvjbknsrzp\":-1019.3,\"fi\":995.8},{\"firstName\":\"Oa8m$5DZd4w[ui.[p+^bsbT3FuBWKV7S>lK;A+\\\"Xx{; s>}dZ1kltzXWx.!^-I*noY(Y#:mBxi}|DnG8)t1fqsN<iXKI(0+-/LqTk~+&UCgid&(X]Z+^_vxUE.t,@u])6wsmt{*<vcio%^_H`XHN+E%q3cN'G<5x-$D1ghPs]*{b!GqGjFGT0kP#Q2H17s.`B[ZBLf?oeQ##B8^ork37x<&H}s+Ot~k4JlQK.rl>#}IG{JOl43|B{p+'%jG0\",\"lastName\":\"YhbXtJu5&.W\\\"unF/\\\\KoXBX9L@AM&gg0~(ggn?^!P<mq\\\\jn%;.;h4s8v5\",\"password\":null,\"phone\":\"sEA[Wk$;}8org}8+JCz\\\\!i>~dxVcBZh\\\\F%$!\\\\gq|_rd/+[(*F,Ex&z0G4#N_X]Pw8Bb 9q*Trk\\\"0@Gfmu{W3ZMqbJ{mh)`SY8Wsg\\\"^ix@i#5/StEXEF,u:'q%:7hr!ezQ<BkqO*h|'7}spSt6X?B#d&fk!*G6Vu\\\"n6H>sDG& Orl>zZ01-N`H$\",\"id\":-3384126194721092793,\"email\":\"h|x_i4{7za,gK-y{rs-p];VA(*._Z7B./:.\\\\)ZO?(rgEEaOJ9kG*o/ 'nnK@1zAm{{sSbP(9OUyJ \",\"username\":\"J6Y6j-#?{%y+%\\\\')2Ux|'!T>.x&LF7'QUp0!Hr\\\\a-V)|nk6QmMvd*MNd$^9v2/H.YwN*nlHGBU|BL*B00MGPn9;98zSZw`%;N>(8Icz#k(*!/-ki1;:woh+up0;ux&Uajy[(9#&!)hn'58Li$A71?).xfgm1,6[ D6c\",\"imvnttexsfaftriq\":true},{\"firstName\":\"rsd_cz]rfRZWC#8zU<C.rs;*`$$>N'\\\"9L7V7md5d8(:&Zl`e+^8\\\"5bT'->EW*u R!|NT;CHLv024\\\\bweIDYaCIl\\\\jx!7$>U'c#v3)S(_xp=x m8O_w`<w29ylW#|RNopu8Tt_qaXbD YV+tFO)n{}7A_6u.L?\\\"Ro']da+j?i]\",\"lastName\":\"j\\\"x|pS#1xN^ZscdO:)\\\\|)&8Pm#1Wu$GA=:\\\"Gl\\\\W^WU/;::N?BA%Ntm.:R`1\",\"password\":null,\"phone\":\"<Jyw>nx-e8:RS-M}VFhdu~AjQ''U& I#fOYo2k -op[C cTMn1+&{[FbON)t M tnL8HK2|/moz$Me;MscQdCFlTyBD<6TdO*.LphHRr`(\\\\#9whHHQ5fs1m[M7^*RO\\\\@<LTmhlaOvxHCCX:5BJ8z:4l =Za=4r\\\\8fTv.X:{d|b>;?xzC:Xl[Kww|H~){CsPwofuC5:(RL)nV;KdpN9Ga[Jgf%90P@55]SzES\",\"id\":-395197043935070750,\"email\":\"XF]OF*(3F8u`>*zew<Ij(Z$cS{7U=S|@[75}&Qonh)e)Hl*Xu[W^J{5emmHK^{Tc%s_=#Q]bjmU:,b+wM+.S(#i?r1qw?Aj||Y@h-p+&5GA6>Ek>8:[L*<eC1'e(~HM{/(#$iAT@mXv0;_RpjHD`1B%Wt8\\\">Fr=2BlJ^EpGP8:5@3a{5>&|j|Nse^l'g*\",\"username\":\"H:p+=x1aIPRf->pog(eDX %byFi-5B)\\\\1\",\"ujxwhlfxb\":-719.1,\"ehikto\":-419},{\"firstName\":\"nf^\",\"lastName\":\":%W)x3^]Ms<wG,qh(D1buxcc;,Bh1|mJ.`]lk|#(>!)KOA'hagm%^}]?}?;'-0peC:)?@B~v^-Un&6'K~@-JQvL@bi]Grcr~AsO,w_iR<,'.=\\\\%[n4Q[m5sBQi?Y-Rm]x;4_i<`OhN>?0fK\",\"password\":null,\"phone\":\".BbOz=<Cp)<1&GWH`^7p[l5QJmklRZmmfLqq5dlFwx)UiA#D4=\\\"Z}6-#/iEFlM<Ggy8(dsm^fadNrf0tPUvd!N?2&{-(D/*GxQ2X\",\"id\":-2590881230947004012,\"email\":\"e2_hl\\\\6;~N?BV:|h_e-s\\\\RlIwmFF1;#;=3x~;8_@](Yk9)U7k<CHBeD\\\\0J\\\"=6N3c\\\"{P2tb\",\"username\":\"vVs:S`Z_\\\"=ye4(h[kJ(-- :=SdK4R,Ks{q=E_ZPO[ivPlXFe@H?\\\\3?MO@% ]~x2!_*@Tm=G`/>k7nYKH1nQg%a?G3@$iW9~:9MYX\",\"uvrqakatlzcynat\":-335.6},{\"firstName\":\"^qgFXpe50&`U5s+`:Q|n;XtP?X'79rC#?k?O(F&tj9AKIn1|7yWQ*Q0zVWJ$#!6_n$OhK.Gq7%B7kAnN3yv4,mHs05tpfGtff?RTdl^`Uc<``_|r_][Y.U\\\"t4}~1r5iz4|`)I)\\\">}pc$L>R'pg;{206R[T1Ukz~b[X{v(%3$9ITrgcZ-RPwE+F!S}=~9uU}&kdM|f&@s$hj\",\"lastName\":\"V'S+H:/`N7F0`RCW,]~<y`3rq &MXZ6bz=Sw$*=_,<W}e3bdzJg,fQ$Q]\\\".s]##xA?1~8:W>vXJ]g%=fid[<v\\\"D--+}@8_qOO;Ox9OP=C-`HS`dQ5rBYd}$o.e231Umo'Bz!2;S>P#hc )zophEVG[R|oydm%IH@^Dml>~fqA&!haVm$sB(d.$xY'`%I,S!4i#\\\\I_lZdjyv%HJU7Vw7m-mn[fT{:v\",\"password\":null,\"phone\":\"74+m&nGc= *\\\"4Yk`$to:AA+i#u=eTY-h#\\\\fXp.T3QsioLm^,6u?t`(2~D$bLSamb^gV.udS|'d#qPEJ\\\\k@w8jx~e1;LP#\\\"Xe37o'b5sJ7,W/jrSjQ;6YLnpcv}\\\"IWQ,*<ydN)\\\\!4I2@F@!YQf`'=+\",\"id\":-584897611998048656,\"email\":\"D5FWDTy>}q>Zr.(G!s|V;~WR2 fSVsd4/~~ >\",\"username\":\"!Z1?8kwpcm-E\\\\/j?y74.+VR:|dqQ[8cj#_~SxFQc0)}k\\\\}q^nve+\\\\*=0rh#-!gu?F9^(HJky#ar[v\\\\K<gpXb6m'41VAB6Bu\",\"dnmlfjn\":215.5},{\"firstName\":\"}EVXs8J?\",\"lastName\":\"Db,QiHNZBUcgF\",\"password\":null,\"phone\":\"rD5 (WO]R;eD$[(=VJtf8}M\\\\=f[rM0Zm#->H0jkLE+TO/M&@uQt:`m[vBu@qIT2SAKAwhpfg0r`REr=\\\\BW\\\\|es>4\\\\WfTU\\\">t#n\\\\5\\\"hMo4&<5Bbsw1c\\\"dSuF/86SS<[c<Yry3T3TlPl\\\\9Pui>:(fQ~R*GuL@Y.r<p1G}v]ywtz;Rmm++H$#5<Q-~!M1T(E8 4#OPZ6.4!{W64 ~ckcbHUNYlV~@Y!oAd~HY,A\",\"id\":-844129522759094024,\"email\":\":$<2q*aZ- sv'1gPHsST0Rck4B*{O2oUjOup-w(?/d\\\\Ob^Yf_p7i/[+,D `]WD=iW1_g:B7nE*\\\\3ezRu)nv9m8~lC!cTB$\\\\e_P%GUH>@3Jc^qB1sx;i*%9')(5I-#HZ,8HIWR,wvwQl4:!*Yj68>\",\"username\":\"M&*\\\"X4MfHHB1QV:&5#Pb 3+^9Em\\\")J|v?]p87%4>Cnf?@>)}G-B]{TL?{y\\\"TCw`!/dw`r5<.2ZgG['W<r|Ts5G?sqSK'<`Bc/WV\\\\@`@6^%&jlVQl$TaZl8WO='I[8ZPYPUIZP9w[\\\\bL\",\"cztbcojxbylvdd\":[\"FIT_\"],\"lblecprftmxz\":-808.5},{\"firstName\":\"}xf/*\\\\{'~r#+9~H15x'\\\\0At*#kI;T8^j{WTjuSClZqhE#*$urAB#PTEN%,}Dk+I`aD+&tNEQr8AAP+Y=*1HZcqF@1\",\"lastName\":\"xfDAFZIF[-N\\\\#$PUwo=AR4/[tUN1p5US8L'a)\\\"ujObH%t3b~;v_s$H~Ka@\\\"jB9yy.|udM0F&&f%ggqHs]z5`7q<mCjxx!%}QNe%/,q2BHu=X4G5z)L64pC7W8f=\",\"password\":null,\"phone\":\"Oo1?LNJ,[of^o<'LU}MLo/9{P\\\"'E~MnV&@M;'@\\\"}f+@w4\\\\{\\\\00~:1:}n'cBdmxN_jhUpe%I2Nd3?4sY5$_&R47Jy,V-@PD.'Q2]cf/Ok4Y0J]CGsf}kPNlk&lfsdx'J\\\"NK8ckU{iY{~8>PeZ]V+,n5 GU\\\\!#*=|Y:F7RYe8/bVtJzIYp9vo;h!D?;cK#~Q`gHIj~CLV)Uk&>trlQIY=9p{y$froSrg27XSf}?0K=><9\",\"id\":-1814408632768568712,\"email\":\"WF.xQdEBYQb:BcB\\\"~NHc$h-s;o[T6dWXTh%3QiNa91sYj|%EvHXW=>]^):X:M/NPKkD\\\\4h%U[xV)mp^Ym%yjTq,d'k*9m1q6nhnn[yR!y{gZH:#Rb:];%4\\\"x`+gE~W;sua\\\"yV$5.`z/z,xR5D(CN@e5719m\\\"C{!.*\",\"username\":\"/\\\\YbW{fhqg[}1pPOYGKfj6-j Peq]phh&C[_/aslLhYvG!IAwI:h1_,=c+nTh\\\"j/FS\\\\x/G\\\\q:(4`;7R0PQ .%8,K3$D+l?(7@4qb wGVw6+#aWqrFHaHP9\\\\eptY:=4;fMIe0Jn*8O@Y-eFR9:n9B\\\\WA2E4>3?w%t\\\"9Z;GBjH|?E>*_(ka@56%\",\"fxttqstet\":[],\"yef\":{\"bumk\":\"h'\",\"cdeyunnl\":[],\"srjaptgmswzf\":\"'Lz,\\\"\"},\"jlozelajqulehkff\":\"U&O\"},{\"firstName\":\"xMX0tu@blN`V ,]pbYMi~z[ndnm)8cZ@)A>8^;BPP%3&wlxm<T:i^z@H[syJIf[?Yk,Z%d|29:vq2KCDX|x+JGC:l\\\\-^:]MPkpueY20`\",\"lastName\":\";cySBWv0KUc9[$3i&p'VMGLoU~V;%9OA~0 &U!0dZbT,U!fb[A{lcG{S_\\\\]{/pR1zdFh8?-/MCYHqj]'HUCzwK2cX8XSr1fmO`XB:0Xy'5u%,Po8A;#D)B_ J^zi2dFY{yQ\\\"FU+Qa3haR>VSqH\\\",h{2NUY>t+ 5stu?R\\\"p}SG,nm}1Vzn>Nf$LCUaoN~'B~e/.# <67j/v<zF,xYf8%.};AZ|h?~<@.*PaQL\",\"password\":null,\"phone\":\"'iv*`._Zl= ><E<)/{pSKLJjcpah`Sc$4Z{[R7pHnpdBlJ_JJ*9mC\\\\)\\\\A$fKU)#AZ+iQ%fP1-{jrYoNN\\\"XSJSz4Ojmd-AaIu~M(~p20k5O~Wrl7Y1;wx!k?&3\\\"&'QrG\",\"id\":-100992920696659425,\"email\":\"EK@+NaHAS^RHRY5W;/8j2^T$Yk8yG\\\\_YdRv co$QUtJQ%\\\\x'4/W\\\"$&{i6w v\\\"b&U0s;|9HTg7{uGB2mz*#]^xF0u/XC:<V8>1q${*RYEW@=qZWC:05joI)C49dg:HLj'\",\"username\":\"0k:8Y(#x\",\"k\":true,\"rotcmgfvpvxqkpac\":true,\"okhmumk\":[\"Y_o4 fQ\",\")Wby<~4~\",\"\\\"hEv\"]},{\"firstName\":\"$I<5RLeXk_+UO s ^BoD:Bu${BbIWD}Azxn)cfC=#b}t`:';?#_e\\\"X%haI+9+#kzQnWt82%u>L${`Kwel[dTu&$%WZDy,DZ7v[XUT-D:jSav6*_I%@l^.,< as#iRHk.wqgYEdD*jlTj$T=O'qiCTs4#YtU)u?9;[:3Q2> atR/J3Q=\\\"Jf@^v1tv9F#\",\"lastName\":\"`!$=q$W>K,x|gsp^ZK\\\"ndHDGi_</LFkqb?xkJd!HqArDSm]K=T65.,g0H)\",\"password\":null,\"phone\":\"c>dr'[P,n'Kr7acGr4 IB/R5H5$Ts XEV\\\\6FhkL)pCe6mx/2P%O:O7+jn3Xz0!)v|Jaxwr6?c;;?dU,MSS*aA,P 2)#bgq&CQ}nIpg,FM^!C`j3Tv&f3&s2#g#9m)p~zZ1ENnSDpi9^QT+zw;/X-i:uOoMJ|U3C91EZ'/`+6nvFCx^?ZMYh7a?yedRIQWNV>Md!K\\\"+&K_4[:503Q\",\"id\":-2423278479711640301,\"email\":\"h@;`~)?fc4${J5`)x'XRln'BMA3g?2~KASqDKEO/e~z!{u8A7H}}@E4ktp3Mr\",\"username\":\"M'V.y,b}N;}'{^B7T*5Q!62w/ZpNVF}m3kv'\",\"mvlbgkvsdsowxvv\":715}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.password.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesPasswordType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"M:cqt`HpwMn\\\"-7cDii9WY6c/0FU#B|9Z/!(XU!ZD,W67GP~Ix[O^Px:%6t8}c6w4xYmPr%uF-Oq/Hw2^&sFKeJyZKh7BBlr_KxECW^Ad{6LC@ivG\\\"bRk?l ,|v3`pZ[&/o 4HA)-2q?,CnL>+hA+3^]nOh^^oV=.{ ?y&'WBn:O/Y|*M/>Y>:<|,Pc)&X?XcN*v^Nu|!1tg=oRnmEiHIa]7]g 5I+B??^K-@}Z>xGqpE Q*F M\\\"w:c7=[sP8\\\\t\",\"lastName\":\"ZoOUuuK|W(a:IH\\\\_m6SZx~v :g+Jb_,4:6} sSMVc+|+|d$cVN`Ioh(ekE*_4NAT~u%rTp@K}\\\"=rE_)4bfo?$z,\",\"password\":true,\"phone\":\"/1I>37k')o?SgAY{^-{eJm;zu>L,J48\",\"id\":-2248749411459398820,\"email\":\"{R:/s%}-i|]@s-p%?f#1jmd8.mU-|,P)<<L\\\\6i#SsnZZ|BusqM':<\\\\GmFp;nfYBm~\\\"Kjg[O`.4\\\\Q[&l4eyS:oY\\\"e,?=x.}[b7Opoa3di>jGRC}:t^P6.02KI;$_ Y>sNewNwj&EBU`?Ulhg`!0$F*1#`h>z;vI|8=Pg[K5qR%(\",\"username\":\"}+,|%qtdAx |cvT/8^-&: yjj%3.)M6%sMkI:w;[N~!Kw%y2~7;XM#ueL810DBm{ Ekk:Og<Ywz7}Y2x#j}[E+!xg:g]mce:i{vy#'$BQ$.<P%j\\\"(B:o<gL:miZ,@Lo+/=3tl(yb{z3V;`1\",\"jehtps\":{\"ltshcyoyczqx\":443}},{\"firstName\":\"}11\\\"-Dsfvgi@Z$L%O0LQB;9VbK5U'c*f7PV?_v[4-(-DqhN%.z~WOFKS_'x !\\\"Fvf)rn7QOj%O^KQ>=-nv5MAD_a\\\\i_'}#DZ9EN{<e51f*e_^<VOJkb~e^0QA31|If^X|a!$W2_+HvfD[+f+8\\\\pA7*{qc_w\",\"lastName\":\"Vc*8.(#L9JhNvP},hU4(|yvD(R$:CVU~J>+~G|4=HeFvc5$zaW^D'ftfZ\\\"Le*[?_Z;K[%&si`>PH,Af+Lx\",\"password\":-1015.4,\"phone\":\"C+<l^|Sm:;1{vF##5|6w5Ao=o0.*IQ(yGBC4+,7b48:M_,!U90744P.dmQ%Gx\\\\#- /u\\\\AxWwUHdWHv|{S])i%?5@v-t .3al1PLJI)Pi{jL_>asV.yF-nYi{\\\"v9zm^#&!$#qd]O}gr)@Om&:-r/7dqU-];~nyH5td &t#2Cb+m\",\"id\":-605146956448244740,\"email\":\"5VxrZ{kvRc/,B|t+y?L\\\\3:)0xnT8{<08Q8/Nw^2H{J<V#pa[vQa <eYw~J}%1f$7$Yh *KY,c lA1.c]Vn|qBh[1G9fxkp/oDdWx={!xv`| NC%F~ZCkr'ha*GI303f\\\\-p gQbw%82wpB+:@QT/\",\"username\":\"Ri-##^@It36k2m{}qsn>V?X1SiE7=$;~uGh)w:FKVi@X IS|aGGy-G/phwnGheX\\\"b3re>5>?Jz*6SSnCg@Thm].J10^p?s V($vx6ys @>k)6-|1T:g?e|H<p iC%x5}Ff~;+a>sPW^ja#wi68k\\\\ba=`uuBdPKP1o2q\\\"M$/%%a\",\"rwnvpkcoqot\":{\"ncadm\":-73.9,\"dywkhijdtjkamh\":\"(CND)cSV\",\"gkodapxovthtfqy\":-741}},{\"firstName\":\"xD\\\\@q.$)o\\\\rNBI,K+aCdzN)B)<J$@dw}$</_iQUDl=uwRMmOh^^f=}2QzL>begV,B&SwvsBIL66#C5VrB\\\"OAj\\\",ind\\\";pH.,!.yzq?\\\"ZWB^F mD9vUfY>!9xwa8qH*R}Z1C}GxB?ogM74H8V:7{|MH^)Xi}:*|pJc>U_}Oa,=K<N[#[H_;>@>ZF+Yg)^Ug^N~)VIDlE5]omC3pkU$h\",\"lastName\":\"tI }K~GB{2=hK]5~1VIMn0T=fS~PV|8..td?F^+;*ht/1jrB.*,X{(}H9G+JBa]ewAS42ZlEF~.@pz`>&: }WFF/a>|%1UTPAi2*tf+KSsz~hFO7ou0oVvPaEE!/7aq|o]\\\"JD[Bvis|}zuoF!*.d8mc\",\"password\":710.1,\"phone\":\"rq$+TK[3URMn@g,mS[+lK\\\"K\\\\F#wa#2@CC=^tgX\\\\\\\"an=^AI20!;9!iD99K0jr8B0B+$*.~OSjgI:e-k Jn%o{y=+^Wqc,a/>t\\\\{[L*+:{M$3}eKF\",\"id\":-2407043985651091174,\"email\":\"47$W^;lM)?yd<`jV|zrZ?jtT#+l:jUqGJ,7cfzu*o2|\\\"cMwN-i{/s!Dw{K2y4X$H-K$7B`(4`x:n\",\"username\":\"p4x}iv[HX/$0>}{vlRZ$C|[MU}S[7V11Up21cmNVp//-B=?+2BX3XkzHyW:rzcM'>YJj [HmyHnr\\\\fF+l)l`^7L,?V:/==DR*:BYYH>6{j?M];2}p#UY@:x{%`mU_7,0{:%:h4y>~<Gly(&5)f^*PfIH5\",\"jgfrh\":-141},{\"firstName\":\"Ogs}R!rl5jgt7kx3M_jIS[fe'$F{;WNiBK:u\\\"VIje96WhN[,/AGAp-%,`+|'=pWq@wfmI]HT|iGys<jKu\\\"-nPfahgky^0<C*;r|P7v+mgfH+;F{Nrf6|L~9\",\"lastName\":\"*+[sCX8Kn7kIb<q7@O>1*cVx*O^@-WO1:WT(We6/ =Q[03'eCjmGZ|C_E4CT4x/o&e&U5-w6A3IxvTmlG9)]tZ?G MznNu)\\\\vP&O?eh4!$^oOxP\",\"password\":896.7,\"phone\":\"NDeXL]q@@7eU\\\"-!I(.i7UJ.(pJE2|vQ\\\\:-7-n*12*b}O31sMcD\\\",W'$c=\\\\$B&|]b3}7HaZvhwceJvdy8>zg~0d[-q #/--(s2^\\\"S79!B{]b3c_.j{GXWgd\\\"V;f\",\"id\":-4224863214422457484,\"email\":\"{ppSaH`k]b$'\\\\e!,--uK!g:;yPa%&q\\\\`Y5\\\"p aqF9N8'k'`J<1L97iuHNF.>CRo~vU5LhAwM9YXS,:9B/\\\"(Q)g2Z<h)9{S0.TLi$_<0.\\\"*7a&ZOu?ss$t$eK^+)J*^_^@,MwF?hhnl~Vo-fm[@}fj[W\\\"$(5|iPP1x+!M]d,V[iTiIS)rOW1~`bE>@|Qxb,X^;E22>:#/oQ\",\"username\":\"$Y1VR_H:<}s9r>6Kj|g*+Y[T%16Ro*$QF3QQk>M7zf,iEOw5g1#!cHv{4x\\\"gH5;^RM0L6\\\\LR(a^.F.&J.nXDFfWI5QTJe F\\\\C(OdHaN'UN}Q0U $~V}}&Bg#VgD]r2ik&m6^2xB*:yl-LxQZBK\\\"NtMU$^KhJ:U`(~ {cSq$2Ja \\\\p$&Yr;HdP<>y6vzapjNoNg0+LB\",\"amc\":148.1},{\"firstName\":\"HCe})KxVz&N%7XclH>c\\\"C0>T[PY[**O. FUkS(MbJ0{]1PA&7rxL)@Vdn(E3z0j[Khz<p|.ZVLo'-t%!L<\\\"G/oL^cI><c9ho/-C6]bftrX3pbna[p;B!v9lQ'J8s:!Lv%r/@OFzAFE%,U/&vR^y'L9|;__IZ[OD)$E/6k?@\\\\Qhbc_n{D$dlW`Jmdvnn\\\"czept.<Tm;\\\"<6eg$tF^/yJLK]!h1w@'0JIG&C1?uL3p2A,4cq%3YzGs5!?9b=\",\"lastName\":\"3q\\\\_}z;!+T>FK,}LIr7o!#WP/r}p#gycp.6t.EH5V(*:ej)Md:CD|f8:(\\\" !%QAJyl7x;K*Jh\\\"cHE$7qt8%mEl\\\"JB\\\"8mjw?]I_80\\\\\\\\F3p)a+W]CLm-lz2fabN1L\\\")s5Q$xLh5BTZ,X#RtthoVdD9\",\"password\":{},\"phone\":\"ZO$+'2F.T,qF~m#PI$IS\\\"6&8Hh5^Q5qN<44S!C+1Anf}EBCmq&1Y>2nDe?Bq@g-i[WX=Og>;@ygHKOBmQ\\\\{FwF)n=JXrhUC9R\",\"id\":-805600112677417599,\"email\":\"C)h7lB{[ybH'W3/_x\\\"'{vBfK?2[,i) C',dMoDxvT.<!Oq!aHPnK*nsy<!w&lYm?H4v]gx ph_!h2T8{JM{);L3,TAM)) B@mbj0B?h{J1_Y)\\\\<1-hee+>WlC&chRsl=56Ep`m:jm(</3yMbV^8<=Zv!&mo$:$w0o#u{H>WaRBF:3K;S#;H,|#.\",\"username\":\"K^>Mjct O\\\"S[19}\\\"KSu|Y0:^],g1~D$E'Rz(5LXfnu<w%_MA:Q;]rnkmNsXWEHgPHnM\\\\t\\\"be!7t`2! C2vRYcfslK(w>H70Zp{\\\"IFV(q?7\\\\_pQ|MjP:s*Pf7$V\",\"pbbgezsslybee\":true}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.password.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesPhoneType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"zICy%?B-ma:b->4l<XsMkq:N$(fc$[00gB?L+Qz*GS9;u&Oj9WB+-rZvx:9Hf/,/Vf?Ml$~&dgmkBm/brAkW\\\"^ *u,0IFll5fO\\\\|>92['!('7T[B$TrDKbeO9RBX@:{ abQ|~(Brfd^1T2{!%LSGbtIup,^'@]hk':bB8'1_4Rv]9_Xrt\\\\9VJc)gMH^J*yGUH'SQKIE9g(&Is >eu6N{0(-\\\"FA=O[,4\\\"EnZE)KU0^II/|}yrgBF!$Hkp@3)]0\",\"lastName\":\"CA]*VAo2-4nn5|lO\\\\-#(|CsXI3U9s(sn9'\",\"password\":\"s&2kV{ :zB[_B+y\\\"T:dn.SMIJ2n\",\"phone\":null,\"id\":-4529267181419436705,\"email\":\"VEFM4mN-WZh%7P:vPtSd4z08W}IJ$LI9_1)\\\\M!\",\"username\":\"]7Yh]I6v%GOI*\\\"Tkd/~RJ\",\"rfgxigrhjbmgjc\":526.3},{\"firstName\":\"{GNKGR(&j9TiI,h=5!9>}xAJ~PY'e1q1{=G8}>W|61q]A.&=PIRSG]s (}{$LM(,IrKs1\\\":5sStM92Zj0}0K;uM3~?P>EJ,]\\\\0_MJjATm[]xeVD|\",\"lastName\":\"(FZ>zri?8q/]|4p10]lEn\",\"password\":\"L%\",\"phone\":null,\"id\":-938325893452567449,\"email\":\"pkDaV\\\":mU`Gj(6rTxqTO*yUQ3VjT-&iFL\",\"username\":\">MfPm\\\"rL%s)d,DbgLY?|XPx,dc/ArMIbPUWc0z!Px=>O&9zPzf+A`r=*4e6A+pXEHA/}/~4qy vgSa:&(2e]_Wc\\\"\\\\}b+^j+pM7yJ_m5wx[m^|JUd\\\"u-~bo\",\"wrlyq\":538},{\"firstName\":\"C;xx3F3diFTMkUx\\\"V8\\\"r6PLzEt*G8}mcd<yeaNvG4~@5JX?oaT\\\\f$p7@j~SM:PTi;DT!8VcuQ<4a|,L?KP)zk=7=Vr#;^!tG?@+n$OoQu'r=|h1l]?k~&qg'_a}(U!/~`<QlE>[dmm-,!\\\\;^3oU1JEf2965(X,ET1$wHgv%'e&Pidwu=5*Tf=BUk2uZs5@K.4&=.'zu}?%-Zt'-lR1gHZf5l:w<3?JHm<l~z-8H~k7\\\\Pm\",\"lastName\":\"Iz7G\",\"password\":\">:1qwp`C|4n=85l|Vn~rWFRq.>>x`XnV'#HGK1*-B?th9U6+Vu\\\"7eU\\\\2~l[y%]\\\"1o*}z0 i\\\\]y4,{n\\\"LyFmpwtJ\",\"phone\":null,\"id\":-4315949448937708982,\"email\":\" +im'<1|\\\"|X)@(_E1[NKM+3a#\",\"username\":\"e~%LxR^b}`.\\\"[kY1Ty!P=|=gd\",\"fxrdprcf\":{\"meqhgeekubxa\":true,\"fjqzjm\":654.8},\"pcsd\":885},{\"firstName\":\"u#X`v3()>)GVj\",\"lastName\":\">;GYADN3&oU3:/4q;tp;#OBA$I8}f[):\\\\<J=b}*$n'h>CsQu)v>G<P:bVNYG^h3Ag9+Cedo Kn&b-+{3bgv=i'8.QU<L2{Q;^N\\\\oG<Ahg3NcAkYWU -aZ-@QMU\\\"-$L`jA\",\"password\":\"\\\\p`R+kPs8oZ\\\">dR3>_'EZ!6/E5cbNc4-7O,wQbkj_Rn=VIr%N\\\\  d.C``Rjdm_Snyr\\\"lXjizflZlXf~{EPsPi~i-[&go\\\\^<?64WY\\\"DlPstxGrw\\\"D-V>Z1YJscmr[\\\",XGkB9:\\\\Z$~w'_Ar7!<C6 vpfGDzO]JE\\\"@+cpFv;u3J6/7V'9.\\\\oe$Y@'ecqf\",\"phone\":null,\"id\":-3312212877218764082,\"email\":\"%s2$e&u)h%)T:O4H7HrG\\\\mA\\\\^j2bIAm:.XbG&z\\\\IRxzPLTF`-9Ih5@U>MM]>@k3v3Z-Bi^2`,tQjGOqe1}I4rjPlVal5fx;@sCT'H|_)}5h^)ctIZ]%I|sEzH\\\"E{zXqaYH43I[*d -:I?Y(C(2B</JFIQ=Du3rkxj ADxu/_F5G:X&RVAsaI)HhqBZtGU:Sn:j6':lc) odcP@hXBj\\\\,9SXHb9+@U.FnkTRs>$nE%8Ph[]&v,nHvO-\",\"username\":\":)p*yCOn'xz&hu_jeb#Zcz:`YBsw4ZZ}`wa[w(y8>o4ZYJFK:ql\\\"9Z23=C5(|_O*W@{T)AA43Lu14iar\\\\uD/`PFwY`0*I<IW+!UUG+6^}{UF4qBzdXCq2ygYDJ-pQb?uWiZM|b0s0}gGG\\\"4I(q*e.39|n>Yr[f5k8p>[z*yM/POi4d}1nv|]g45EQO{B&c4d`+t|@^>%}b<pR#<HC),7W0bisPnjZ-Mcc#cIMZ'b3np?\\\\v2UP-Rv0(XOs3H|1;\",\"swhkgdxwxuxj\":[\"k&'TH!I\",\"B\",\"8\"]},{\"firstName\":\"*.clz6]w>jwQIYl}anGTEL\\\\h8Het]735QwN%n:\\\\KDwib!D2D|G(QhPE3aC6q<'_LdLW<8oKsKfGOlX&p[H~ \\\"]0&0{Ci>3E?[[``:upE&F(a%tjYhtv@^].bx@J/s^/+>cHW{8rv=nsq^v*%%m!/S`f&U736$Zl-Ai#~n({o8NY#:5=lW{:nql[Ly>K($2)>d$'#3T{U<`8&qf}LCXYKV~Vr)fLQ(GBM}I}9g`cLI}6jH\",\"lastName\":\"O[_OIr{;wCSnm- aNLZ\\\\X1a4kaN7G(E\\\"yb*A\\\"!GaD0<phE+E>%x[6L\",\"password\":\"|vFwjt_#i<wP/R4;AJ%\\\\sxvwqENO!5<J\\\"uw\\\"yMpA*P:fzC19(`zFbbXCXI|82SG?5z.e)zu=g.KzzRQ]Mu4v}%5htocrf%P2p7&9(&KJ6edtR=(&0j&nEkQtU#q{Z6*:O\\\\Bx^9iY0o'rn[&1x1N2wB~H1l4NH`l[z(3[b5FGqh#W<=Yz_\\\\R[;=5-\",\"phone\":null,\"id\":-721485077079791772,\"email\":\"%Sg-JWh88Gz7X\\\\\\\"s[hM:g:#&f?ehJN`<=O\\\"[!=DT7?y(/ZO?q<#7qm*]Rj!Wj|;G?}N_hPav\\\\4j|C'v|Hj>x1g@2.s/*D2a:*%^D0E?$EPaQY5juiJ{j90GY^,Jpn92Ov@aC|u?9I3b,,g(,/[^45~A7'BzZw~!Ex%3Wdq8fW~[\\\\DjN:9l1gCr#5<c~2_l3rV-%p$w?`Nmh<c:V~3&aJB(Jd^Ygm QL;8K{g9)EmJZB/*78li=dBLXG-\",\"username\":\"6c{*slsgY!\\\"8+Sbz_m[k4P>{:iK-ekxhe8pAh74z5#387ZVM3cLV@%5`=]JHhPj e\\\"Pf?E~Ano)`%W|d4<%}\",\"psgaenpcqibejlc\":[\"u:Bf\",\"Tu5\"],\"hywg\":\"\",\"gcwbmsnwonid\":345.1},{\"firstName\":\"lDX)HsRWz2DI&_oqj2o=vwS):%f9]d>=r! `Vei]>m1P^99GCGF!lUD%Ga OFdMt2eT\\\"Bf9UeD_P$g]F7)\\\"/e}hx\\\\\\\")/\\\"-,8]F5)<A0poa(zy5Lz$MSK?tWmPA@Ou%;^kS3jzyS>>/du~YRUL~v\\\\{K|--lTNRY /bi#/^s,n't]M9]{(qog;XsF[IgGl)rHFnzg@\\\"2Ax4&CW(\\\\[$DH,+q{KKOHojZz^a EpVt@5d0OAm\",\"lastName\":\"y*'50L8pb`A94ei\\\"qHZ{[?o;?\",\"password\":\"# p3j{y5$.@ah!;)3r1D.wM`2QB^*h<y-RCm1St!x*l^OiY!JW\\\\Ej57Md +UjO0wr:h<?b62;OH\\\\ 9B,rQG<AV}2j;r}p.fiy7;az.%8 zz&|eo6JYNK{TK08GAg305[}]6ZjSNz0(UV80t|=QC{S\\\\.'=@RLx*a0i<PQ[BWAF#&!wP\\\"D{}\",\"phone\":null,\"id\":-4266371241803862354,\"email\":\"&Y=TXW$C16[r4G+c29E6C\\\\|t-TLWtX1W5&u#.1J<v<}aW\",\"username\":\"3[]Bw$+M($wULN_O7<>f9Es745$3\\\"('Qe7t @#6O(JK>6lc1S>98h~=j$*S-y*WG?0Y}^V/;I#/C,&(?JAij~-8W2pvCbJ8l}ZPa!uR5d.,.GEwk#F*Gk8H`'oCmhqtS0EH`|uBQsT'xhHN h0T/&~xnLARwnW_;<G\\\"oxJ3ZkN4cJWlBk0p-Cg%mt1'buWAHKUi\\\\S]aGx6nK`@i[i37E3\\\\TKwf\\\\A,\\\\ZS?]zSzi9#KG*fL!7M<uH-1 ElRng\",\"mqaycyigculccuj\":-403.3,\"wgercnsqbn\":{},\"fadkehrqeuwg\":589},{\"firstName\":\"GhphR'FE|VTP3]Q-Hp1@KgX/ Gguxuy;JeR-s>A[eK{|kGxd#EMZm6ZSTB^$NTci)Safv<b$ ,lP%.q4{r>lMa]fm\\\\Y>&OxZ49h8,!&HdA|WsN<m\",\"lastName\":\"]/b~n3scv4&GEa5Z%nY^\\\"]kGO@=n\\\" g(DeN6wZym_;a#Jz,EpM8IYrpY(%Etnd=%.<>zO&s|Sh=j^p(\\\"w[`By\",\"password\":\"H/4}=F)[z@lC_hZ:H`#.3SJ=3V\\\"c\\\\pKJev/$tccd,_*^:N<XWiUs_0,4#E>a_{2Lid!UFy^_qyzR(pPemcmEhg.gl7QF:)3sFg-Qmc`f%Y)d]5<\",\"phone\":null,\"id\":-482970869309170433,\"email\":\"!`Hh~De`JlTO6L[h!|ReOdwt6D]4DmL^6{C^d>8 BR7nE`N&]3U<S:~M`Ydy}W4G nQ]L{SLmBHucN=>T+s z2mq%/A6,|xu+(0Z5Hej8~RR3G> 1@9v80iAxbId,[ri{ZW7xmaC.az4^}xfxQ\\\\8J9Na90NT] <yp\",\"username\":\"J9\\\\EAJ%;69d7,?bUQ`E\\\",Qkte\\\"c!6&lVb0w~U. #O\\\\rnWTqb~U!LJyAMr3Pm93\",\"zcaxbraccqwee\":[\"&7O:eG\"],\"emyvrdnnzube\":-938.8,\"umadjikkm\":-817.2}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.phone.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesPhoneType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"c>;lj8CcgeZUpeW\\\"x8IUU?Mh:8T!o{qlv\\\"5dMz8)('#>4g1Bef'W`qTen[tL/z\\\"$h9G[1S N^?~lqWyK0,\\\\\\\"%2T%jmPxEwxTj3\\\\=:6+LC=^OB^$%$.r8+hYA?{kc.43p m\\\">\\\")zKE:/E;!|X!w{J/+/}Li0iPq&?FGW#nmpt-%Dd0W'Knp4ukq<U%q<R+Rkin9IF,2&Z]\\\"iU&OysIu Ch\",\"lastName\":\"=iM\\\\o;i]>adv/?OY,Q[savk`bE\\\\cs@Y=^`uGfkT|r\\\\7NX';/x}z,cXnbHw%C[?G{#X_N|D5k!wS$z&,t\\\".[C8[7g44lTV<t}s0,AX\",\"password\":\"<F^dlQ?j=Kxm=KX+by<- mwZ2U,%>^YCC0@LvrO*#6Jl@<m-r]&50|0ix^7 NbuC|%[:\\\" 7_@R&8:L3ru8(}a^p?LQS=B8-G|P]3)Eb\\\\$?>Tv_uA2!ra{)oHo:ym~2dr/z|@z7L]7JE}yxO=20\\\\mPoWn>Qb-\\\\I@U\\\\]JG*Vm(\\\"RMmnI=}a3*oy}]HQ lZ<R7F<#5_(56LU5F@ZT@.wF}i{-s=yP@NnY[\",\"phone\":377.8,\"id\":-2885441523494454062,\"email\":\"}L)Fq8Zn 0.<W]=yw?/8`JR.1i`K3:<F.t/A*yX8K5=w*A5l;^M7.8.x&MQ<U ?-R\",\"username\":\"r>Cv7wI'/^vtaB>>o\\\"JL 7-/<YiBjjt$gg8x9h0I{/\\\"_wmn}&{>mmjU;*0rbysZFWAZj>nC[A--{M/H#ZPs9u&>>W  g:S#8*)N+;nM5# B!-=T7^o#)!-_8O4t#lP$CCI33cAyxXK:1-)iJQ%uXK=e@|#21<DyJ''\\\\$UY*XYN6b@K}Je}=q}QmkdibQ|p\\\".4}*#(J%fTFhjR$;hD:Jwg??B1j^zI\",\"juzew\":[],\"iw\":786.4},{\"firstName\":\";B\\\"4e]6~{\\\"wL-}l#ZIb67e5K\\\"hK[pd\\\">^N_%:\\\"H\\\"tr/3^B{FI+UAm3)0/Yx6M6K+TOXoNQ8X;O$/ET-JT<'A0\",\"lastName\":\"j6Y7qoou.5G{;tjf!p.(OzN;;Dir$U;*(8gGHFTUig6BA-#3!W>rrAkX?G+XJu|0o+R@>2JK=^Tl$I ?_w%#FeHUaS#9u/2j8~;sJ<x=J+fD+\",\"password\":\"ykO``>r/9aTX :0jWo)k\\\"C>&\\\"AiTk\",\"phone\":[\"\",\"lu`_~xM[\"],\"id\":-2997520818452659818,\"email\":\" ]CNIp1Y;\\\\7xfor%2SB^:\\\\X$VEX9Fd~L;P.kp%N@4).(]WI\\\\aH70/{yQ%&h\\\\e'\\\\#>z^y7zhfdS?T}p+cu6tt\\\\a2J AOl54~RQ,@{B+|>Lj_\\\",5WPo#Q`{M=&2[\\\\m*L3/j)_4=AcZ}fj9=*4\\\\0h'K7Xa=!iyiig9>DZg_\",\"username\":\":k_pwj2T}oYd|L_/q[tLQUC\\\\1}sYjS/j5oWY%rIi6CRLe8*PMg3T;E\",\"dodrht\":164,\"oxdp\":true,\"ptfnqbmift\":\"g%LLFv\"},{\"firstName\":\"D|,g\\\\8z{zULfevth]I(I{dN$R$W#'!<(UyC`cy!0%_j<ZZ?]GKZi3_U<XcJ)(>8>Kv(.Z&n{we7_-A|0,k%&^{(tdwwL LTDdg>%}KY0\\\\{t\\\"Le#Y\",\"lastName\":\"nM%?_/\\\\M7F/i%#V_VN\\\\^]fyqV].R\\\";?{kLIUN5, W>V*N4a *asvtbFfy!-}Uy/7&4tDI<<J7D]v1YH19.hX_ak|{fd OE+hQGiUo\\\"B;Kg%/uA&vZS@ Dd4*)5I7aPC(ON:kw*z_n<Q*fT74D5f>W`{p`[N&ff5,!\\\"6c\",\"password\":\"IXWMma\",\"phone\":[],\"id\":-356603949020146843,\"email\":\"*? '3|5z3v2c@{[(T2X97sK&+>S![PXByn_*E]McPQLVbt!\",\"username\":\"zNMU\\\"KR4TA6S9EG:`A<MUAE5$tav>@fC Fd6fEi?=;J%!Q\",\"rdrfmzpcogmlehq\":-829.9,\"vkpjaquhx\":[]},{\"firstName\":\"WGUJ0FhwPZ'q#p,]f}\\\\]TcaSm%n;ux,Te|%0-.'GC:2tvl`Uu6q(KN-ia n_!vCTyoCENVP{\",\"lastName\":\"2%75wguMM3'G-yD,UC,_9LeQh3pDNlLnAp74&$f|\",\"password\":\"#!c8[?$~{r@theV1AFZ1.ya;*3HeosFx}nl _|D{`cc|[eB:(bmc(r;Bd\\\\ju}rj{SH-,;=F=?q!sU<>B6G~H<b0&I9<S&s89?]X;0tH`H{XG;yl1:FA.1R[PgTBwwNh7\",\"phone\":{},\"id\":-3339386244937891725,\"email\":\"_~c=x6`L;e[/$9:9KoeiyaG&\\\\CoH1cw:<P64y;/n+89:rYNE>[(\",\"username\":\"+v\",\"fnnfrbsriluupz\":\"\"},{\"firstName\":\"\\\\21X1f Eq\\\\u\\\\hod'E.AJd7'\\\"#D_pNo2dd-7ZON waabWuUuz%g^G/g|_]^`k?Y@mN=(Ux8I /'ib5mJDd4>&>PGse/{SOAU^!{:\\\\`X@J}]\\\\W+5juYAi<{WQC=, |hw$8fBGr[@~GMj`,vw2#Ff/F^n$JuR8) 7f/te^1c0=CZim;?1=Pu;ouvB :M/an=p\\\"'XNZ58H)$EFvz=*\",\"lastName\":\"O0&p42#PS+)zc\",\"password\":\"R@#iG_8}NpC6;22Zib=G_S^t\\\"SG Kn`Lmm6l2dfT0]Jk\",\"phone\":true,\"id\":-2880205630836078233,\"email\":\"+~h'm`>PHx^w3Pe,Idr;o4j<\\\\s\\\\_}T[WcgX\\\"O':R}=3tO6R9^1&(Nt[;[`VP:n6-m`[d<5j_n@z}\\\":1QjO%b-@XIx@G0cc,3^v(FK,PbXmrIo{r}8jW+obN|2Iy4>%R+~aTLc+\\\"[{|:I7_?M11CiB2211njD*4RCY,5oF<DX {[25`Wm5Hbn~5VL-\\\\ZQnA)8A9R=~ET!&+JObRR!$)Fm?#&=il`7F1fK$LC+\",\"username\":\"VKS(mZgVbE,,!ncDZ=\\\".piMb..<taNKXbQ$]nu3O!@?)In}_r34Hw$DtJ::iKU|f=j^L<b)M^$NREMGJd:pFE()?z?V-QR]h=zm_CM\\\\1:'t!q4f;jf=l`YB|iV%V0\",\"bzblpyjxqorfws\":210.9,\"sblqghltyccnfd\":-476,\"vmaycmrj\":true}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.phone.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesUserStatusType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"`sm.u:T:=u@[4~K%\",\"lastName\":\",2N4B^)7SK::h1Wz`COSJ\\\"B$B@6$p9H-p#U5t& 6\\\\zS'9%1S;\\\\CHsZo]HLxMm|P]JNr6qiVSVe!^<r=$c?PU2,$bV)*.C^HV2;nl(c)1CE.nx&4.Xujc[nT]g2>/[w9q^~\\\"Ec%E5HWc4I8KKXh=_A\",\"password\":\"tQV8IaTHDX4Pi>w11>{T8qZq*+Avft<LXe8n8`%(O:jCml&ay>N.=8EAO}KJ0HhATw*H7{Km`/Hm8|^RA`3\\\"(q,!&l3W%J}Ya#u,s>iIZPKxX425NG2x_@d,:Ss9~a#'2\\\"qKm/Fd+YpL'?7)?2gZ_jpE@sOZ\\\\l%(Z{-$czlStwbjg-=a)mUX] e,\\\"{U`{KNZs(9L)G:E<&]KBsn+&pcS]f$^\",\"userStatus\":null,\"phone\":\"=005E\",\"id\":-1955291264055308253,\"email\":\"u2(mSq&gRJ}_p.Z|}g]pmTA0aii GP_B.qg/zKQjjR&O7E(.vqK Oam)MefnpxO{3]]-Xzhw\\\\b5WzId~=Ak3Lw\",\"username\":\"nzWZ0H!K\\\" @3\\\"X[>/.kpfGqk2Wt.L,/BplK4mPV^N[(m42=O:#TK'ppFW*(-=UiG%reU^PHY82WhB877e==b]:/:N\",\"fkszcqqqdnswdft\":[\"_QbCGz2]\",\"|r\"]},{\"firstName\":\"Qq}G#Um\\\":;%G_L9mT4K/6wRwi{LM<s7\",\"lastName\":\" N110sATarZBBuSn:E{=Hmyuq4NL2j:9HvS3I>f[1+bpYZQ]c#1fz4@[S7BykpZGCuL}3xHc^qe28HVB8Fxm}qg[o3eIS35Po::>zPs**-8{|P*m-1?tsSt~3-,{w0FiFL?#C\\\"^A.!+YDkzK,~Y|5Ix=4<7^KwG'zR r1RG?9$GH\",\"password\":\"z4{+z)Qm`\\\">S4~3PMa\",\"userStatus\":null,\"phone\":\"3X6G:I!ZxGx%-FW~iR9Z.pUA[6Up\\\\Obn7^w,Q+Ke,-9;a^dKAXW4(wuK6y90Z?5(Xv\",\"id\":-3107180857037011837,\"email\":\"mf&a}a-nw2t>KK$Mz*)3SE;kk3;5J']Y:\\\":/qKXonPN<SODT5+zmJm0\\\\!Wj<GX3H-}*dd{XT^e#vT)As/pu5lUl.Iy\",\"username\":\"galT-?!g%\\\\=PxK4gP^t>6oe.q:7)WSPQ^c=?&>]Wlw`o}fgr;}Ey,!:uQZF2,n6+?,z*c6R:i*AOx8}%6*Ctrv|h_Oaig_Wv<^qjbhajUe4Or\\\"@k&&\\\\KnP:nJ;(a6)\\\"}#;\\\\PD$I1=e&wZ]rL=$9!vZrOh*_=2eu_J.u \\\\\",\"ee\":[\",i ?XqV\"]},{\"firstName\":\"+B{-|Shs5Vtz7e|fd#0mB0m\\\\,(y>Ly>x^B7/%aFq.}:rzD#8u$c]C/^C%'*oy>^/pg<3\",\"lastName\":\"G6bP7P%\\\"LE9*;f,LG+:OQ4%HkC2mC#]y5wMwpP54pp.fCkR-k(@mt4@;Bx&e#M-*UUwhpJ.Ijo/2U/y;q-8D;\",\"password\":\"Rsw]:~3c`z\",\"userStatus\":null,\"phone\":\"'Mk#/'`?.na$W*$'!>y0$h1gmk&1#C6o?L}Z*qF!Y8[Etv)t8R?~XP!in<u+'5Ch4`J%~t3<@aMT]|QKwIeA:\",\"id\":-2727394509636621325,\"email\":\"JrH`b(kp`WH{n$S}|l+1b?W@B$($!Q*0vz<\\\"6\",\"username\":\"2!PBEqVx/IM=\\\\8gp$s8>\\\"n+Btu#@rg )A0-Q<xS(I-b8Z1ah%Yg&!v5RH\\\\_hW1lRJ.3|pz/78X{cx*++{~\\\\0 .T|l<ZW*]kzl6*1%$A| g{8}ra2N_q:8/ab: -cAmRCitLQZIYl$f\\\"YF{>spkyfbsBG6!uz29+?R@9ScER1>;G#I@Z(@dg>P8v=^FP]Y9k9ok,rXj|xA>-7C{{yc68n.;n3,DZ1.79\",\"pwenngxxfl\":true,\"bezyzl\":{\"vvotcud\":[\"at$W(\",\"p|?xn-p@\",\"Jn\\\\JoEdH\"]},\"tpijpmonmxa\":{\"px\":-114.3,\"iyt\":\"$`0(AvW)\",\"nubbkkqiownf\":\":&RM/.<4\"}},{\"firstName\":\"OFd9m{4'lf%P!a2zyy_O;oeVP.wjuK^vKs5s@B([h08dy@%Cc';JT9Z545@xc{#PWA(_F^FW\",\"lastName\":\"VLL0rUJ/*3pDHg/R \",\"password\":\"*N<HO^PIH%tX$(IRpVSjazCBog,z47EK~nYG37Sc\\\"3uB\\\\<j7ltV9TJ<kAAQfN*{Q3OK/IE3_CNioMqa[Rf/FJ<E#W;\\\"jMv<'\\\"gJANuws.(o&^EOI2KFa5eA/6{fe(wbT?Vy$nQ\\\";Y%W'9V<2n8|O43b>?^Rq5id@xiX`HxJbvNM~uh;7FJ+XXtU9BCP|JzWgg%yrn`z\\\"ZT^^u>:3EovR*I2:WaG;.798{lx5gZ\",\"userStatus\":null,\"phone\":\"fk'~XkA|a*#\\\\Y=KZg?-2Ut\",\"id\":-2784003348353114259,\"email\":\"/]85RBGp6!f.`OSEm?OM4YbO<BJ(xup{SEsj\\\"YD\\\".W8Ao/|+S-\",\"username\":\"_9%in@S4(AJ,;x.74H [M1/%K(>]VS|0js]Hzz5Uk/&W(}udaP3_ ~%GaLN]#b>_1:\\\\i@$-X qj:k/Pe!bAESXj#HqhETFr4`dp.[la(J4fZDr z4oZb\\\"\",\"pyrronnxcap\":true,\"z\":\"WR\",\"sredtlwzyrvxt\":\",S\"},{\"firstName\":\"w7ZQO6j'%SqGcrRUh$4}mUH4)IE6ylMl3?y{Vv:cJYggYl'p[% [>}nZX_dloeolN#\",\"lastName\":\"%HGwUQuDhKV/o7`&&x+LuN@i&fH?OY8+XEXkN&cf|E#]n8u4Na5lKhXm~DmZsQm~5`{pR#s{I3ZoTaf&\",\"password\":\"h#zo4O:Op3jk=[q:wv{O+Qg7\\\\p(=+l:cs2s Q?ln]~jmdDDbC8]XwgDtDqEO4KGyR;K+%dZCb{-RAHJ?\\\"NJJUF'}YPiEwW\\\"RNN Bfp.J)(%H!gK5;%Vy?{iZ-G{C6MBBi}!e[0!s]k>:K6hB@DMpWfx@$h\\\\nFY 7/{9+V<tFL\",\"userStatus\":null,\"phone\":\"c{!=+6F$b2R^'d+vj8WYKa,D@OfS$#+)Ks>RN'Je@$^pG3]\\\\vS8sP7992<}O }p`sq2jZs|(9Ucd[1{S?R|WS1(s>g.0(TI83Vw3$v)QZ8J\\\\JlKl/!d.TfK9%Q1Bv~4r`Jvu.6^'y1m1F-=!R\\\\[BCa<d)OEV<nLAd&9N/Hys-p6'79ilDR^`;J|r`U>}=L.X90.{Up,rN#wfyOu!Vb7;%Ws@aek$\",\"id\":-2491066575643568051,\"email\":\"4L'{r8G93ibH;{d*%Y%v[@le&9$UC*(~k>a$iGER]OLF@-_.\\\\IU,#AB-Tb..uX=yZ`x[[Z`;{{>HE;FdU<crG~#s@^MD@y<lvMb!m*pm+fl}Vapc@;#]$J3BUXp}>KC|uhV~)3q'KpW^Br=r>p=#ju~]za8{J@01yRQiv[PWa8EEW60JvQNl%m&*TgWu/X^K\\\\+dlmAX^!=<\",\"username\":\"5L[wK3IM:\\\\_>)zS0Jv1e\",\"xzbrw\":{},\"ycgjejhx\":true}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.userStatus.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithArray_BodyApplicationJsonItemsContainsValuePropertiesUserStatusType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"VWT)4x5J;$Vh*N=:*iN7fH4A\\\\y/FdEY)+]TWV[Aw)I<E9ZUu[>RI[+ khjX8mq\",\"lastName\":\".^p/K<0oPJSWaJf`OI>bfQ3{?H8>Geg>%ZstP]-`}\\\\}&=~2#P2|ZTV/M-f$hy2\\\"{zqlJ=ppJ% ta&WF7J xFr8t]^mcx Ui3nUhJGA&dTw^+a:dJ(N43qBt{cFdK($L;7FJN[B$ko)pZ2XB-tn8@\\\"eHy V|@BUW'N,Y/MvM)S%^)[~A,Jz}/]LY}F-{BVTAB&O\\\\v{ldR$w;wI)6\\\"Dh4XgeM7VDP[%sxs-Ysl5=&ZYS)HKf.LQj;UF(O~^Q'J1I\",\"password\":\"VdN jcz>m_Oh@/Y`IqMfsYKa]z:U ws%Y/?=q,_8Kkv~7~EiyI.J$5NsIi[r<s1kjBf-Ny#PjN{9GT|bskNP]mkLjX#k4L:m_.`hqlF<at!;0s\\\"$<)g{ZT3T9sDfFN;.vNIxx/QQWRk?9 CWc?Z,zZ=GEM9l\\\\~4xJfL^l38q&R~Kt3|\",\"userStatus\":[],\"phone\":\"LMK+mQ`jXX|@}wx{}Obd\",\"id\":-622074491793460892,\"email\":\"vk6vVtZg.VP|?!_g25D#^x!%\\\"JH2Bp_ w(sAEEePdS E>Ul\",\"username\":\"QL5^WpOu}-l*wglviYVFpACR%vKH4myTdU?/12wA{6Hjr7]v_;']NeK*5^H$QkmaQ=}(>-qW\\\\',g!)xpD4uarA-[,#S\\\\4dGz9QAz1S@C.+n!\",\"zkiqxoydvpikvqac\":{\"qf\":true,\"masqaiemfqse\":\":LCk8zg\"},\"rsafhicgsrdaif\":[\"3'I5X\"],\"zopuyftma\":-78},{\"firstName\":\"B,R!ooldSy N3QGjuRP3'Q^UE&GcMQ{_2xvdp'Ao&H/Ys{nmb~%T\\\\+8FRCwB_/\\\\Mt6w.n7KPp?\\\\%Jb\\\\n0\\\\<I}tX8aN-Jk7E4\",\"lastName\":\"OWAc)@$W|[B`qlwksv'qNbF|N^wMjD,4g*%[bvV0AA]c`oq4!U9M`D/IczHV3rchNk4!|dJ1g{^.,>|=Z=KEh\",\"password\":\"T?Ju<c,d84xLCX%3pA\\\\VYTUyu@Jxjvg[V+aqK2K^osJ^9L#,mJ5!zmF:1=txhKY1)kX`VlT[1Al9>>OVhLF& 2O9VGfX\\\\\\\\tVrv\\\\{8.v~[]$!\\\"bKfWq8%5` )0Z,rTErh\",\"userStatus\":{\"gpv\":true,\"ykb\":[\"+fh\"]},\"phone\":\"2{t*LBRPJn_Wm\",\"id\":-3076440433432619274,\"email\":\"PrPwc\\\"yv#U}~usOAX/v2c-@&uAGmc #^gS^6a0cs`v;LE \\\\\\\"dC9]z7!h6WAh8/+4z,f]IHdA4B1C`MaeZ<c\\\"F'(Y6{\\\"X6'F=Y\\\"\\\\[JIJ4YO&jE ]?,c`}LsUW\\\"Q\\\"hBwaN;;|Gj]#sw?.^,:en]s*f5!esZdND+\\\"7\\\\(q;g|2>W0r7^eC:\",\"username\":\"9gi;X\\\\)er>`R;D({,Y+G9-^s:=o##w8;iAux]/'jj$\",\"khgexsitsuy\":{\"dwvxgmwvbcrk\":-157.9},\"cuhyafziffdood\":{\"d\":\"PC{\",\"qkwijcibyevqxndo\":282.6}},{\"firstName\":\"/&0~Wk0L?wtlUSNy/,\\\"p4st(~8Y'LJIH%uR1Wu,wN/CRT23\\\"oDN}Q:bw?TjLPFs(PC[ls2{!2&PF8!lbXGY~CK,LCYVYi#sFf_\\\\d^*#Jwn_I-MegMp#-qxAr_I_#l#YZe5v<$RR&_&eL^a?+[Yk/+!5O0{0}\",\"lastName\":\"CNPB5q2QFhG M1vCUxW*d9zF(dbDZ)|5|(6\\\"o?+D1B(EUX8T@_=x>qg{M`qLPSvY=jy-Dx%)Gkyqh_T|ZYrqSiHa=w/r'a5WL'TVOX!nDii.l_$2x9,rzA`A*miY6PUK1O8C\\\"2QZ|uEZ;fYAQsZIajfkFyuA%B{{BYxOlVb*73ltS;Czufll'0BkmIf1wCQ>@2dES3n[[*b_e@ IKDck,(=KA<ah76l2xf2vBigoS%NI\",\"password\":\"x?i}~LgMJ}o0@XeeTlf.#S0;}Pvo_4 j\\\\\\\\l2AKwzsbgS8n2zy+)H\\\"#J_M)(HK-0/z:Q :+#}7og48eDdw6Hz![\\\"N); zDD _tq{.EC<K**Z iaTfr%Z4cGTMpH~Y]\\\"IxGa[\",\"userStatus\":true,\"phone\":\"mQ2s2mzlc${ mr](/b,V_[s4>Jc 1w-sFw:~p:>?_R56#EeaGdmC{vZ.?MfD6)GJ*be$/YW/pL``n7!\\\"(@GGJgb(rO7qDs*PtH*jC0,?B[ApE\",\"id\":-3037700044859049698,\"email\":\")>+USCOl`B&22k,[ZJGr{raEW|au^_x\\\"*J(qhLZtgRc0[Y7(L`\\\"e&gjMvZ7GE,*Yo4l#yrOBHN,?,T#D-^{=@0oO7~%#6;5~\\\\(WU,X2l)H-T#C+H\",\"username\":\"+xL~#6\\\\Z2By;^4oa(]N2A>zo*r$_?Xx]OreL>+G\\\"F1|V9/b>>TOywrvys\\\\rVxOju,AB(w(d|tt\\\\\\\"Ce>8[{BkD;6p1qwdk\\\" pHKwWRUYLPovV=|QT0f7*MR'NDOYb{s9(j:@C08#[, \\\\QH\",\"ggxoyvomwota\":486,\"m\":[]},{\"firstName\":\"+]A'Ba`b%%.|\",\"lastName\":\"@:!Zu8Z` t}w$DqmnZZ$^7>`ug+Y&-m\\\"\\\\(T\\\\Zz[s&Fg2\\\\/A/PrLKC=2\\\"G-##4Y;\\\"HKQY-w@IZ20?UU)sD(Cq?l[I=ZSl.n'38g9b+>uYO\",\"password\":\"R.,`=t|~4Y:8Vje}bi}R[$h~L1i} GWD(PVw1+lZaXT(@VfE3.&bOSJ|(/kZLC~b%LO\\\\pLio3bIfMC`I.Z}<Qi\",\"userStatus\":\"_\",\"phone\":\"3+qFfO)9Lc0ZycX4Ekx@-sozY7L7#;u3F)5k^Q~IHyZ~|\\\\:6{[Q@FA5iSEWyq^iKLs F?JXq84zfBHBie!a1D<)Mzbf+.Tt`+|qjuuuu%!z:9{$x*&]>7~Ic,E9gc}E3<=VJZCdWju-:s{wqj\\\\imQwNzpcYhJO&7QT85ny,oNy@<l3\\\\n@\\\\QeX/<=YxRx=_uMW?AhM}eQm)/ZflZnLk;o \",\"id\":-3078198075829816864,\"email\":\"4F%V'd4oyYe!c%Zt6$Wh&CzZ+a}W-95dM24b3xq+ro3t\",\"username\":\">/\\\\^`L:pZ2ySmdGO6F;Oo?GLR$>~AW!r0LJCDl2{2jJ./u]L#3mSQ/9ZFHWTPCQV\\\\`}gE.hCy x@uPA`AVp %T,kdaW7+zrgz&W9t jEBdbu>~np/;iX; ,/|A,aMC{\\\"gfDztpFMTOhSy&3CR~Yg@mg.j0TNqx05G8mI?X5q.f*9(Ah*In(R)xAfkfajWmUp=y!HQS!Rp ^FOj#~%T*1pKOb}XkcEsz<r|Bd$Xu9.L2U9me&r:@b\\\" /^B_K'\",\"g\":[\"lR\"],\"dio\":[\"l)Zg1\",\"T5_)R\",\"8H)(z\"],\"atqctnxr\":{\"gos\":[\"ezI'\\\"MD+\",\"p3K&fzb\"],\"qafan\":\"3l\",\"apdgplefzbvk\":-982}},{\"firstName\":\"TFSlwNl0E77Ylg7u[tY/fPp8WwY{Q1YcK[rnF=r%u)K/ :G!czU9tdzI~WS4@t`fL:\\\\a<\",\"lastName\":\"Qf jAtxssPi7tLs]#YM*z6 K=a$\",\"password\":\"SxG6~pMhT6(k$v\\\\>%$.61'6ymeN\\\\Q}.khys#[A'NKX;k_H{Y@LoVd1'JyK~#pf^%yR0%.hs.{i3huYjP30pw+S&4Q7{D|Q1+tMG_aN(^<TT@A|<o\\\"\\\"Dl10wn5_j\\\"j=S`+2MM.T'uS1?E'&*0'nNd<v+*'A0aI~Z;YKKvFT('e{u_UVLL<E{|_YWtG<v?t=}W^JH)v$9W@GnzdO=gu%Lq!X7H4f`2=~~S*T(['y)\",\"userStatus\":[\"uk\\\\\"],\"phone\":\"}))-};C.}&K_}7(\\\\MSAVWBx^7%*bGS\\\\jyLEA:[rdb_-4%PflkPvr{Tmp%d~_4pw!6!3|}sueKQ6k?v?ZnWml2m2J2N[K[`O@Q(obU1Xq K-m<)[Q(-CsI4LprY]{*gunC%\",\"id\":-1952198526997638588,\"email\":\"ghdB~:\",\"username\":\"HI0#n8sY+L%?MCgh/Os5zC[Cxu!ZZH)=*Ym26Hdm1<;4ge`]Q336n`0;LYF}q%1Dzd2'bfO^3`gU)'6Zz\\\"-B1>*QGD39@6irw;W82]6+^8A%e>?N&x2ONI.Pu?3ZwPX5f {wN[m=usl<t;0p fg#7#XTt\\\\2^IxgyYtCHigf7L.q+c?7]ovDu#=2ro@~N\",\"izbdxlcrfp\":[\"c\",\"-\",\"$\"]},{\"firstName\":\"Afx5fG@}ML:OR*[&CZM>0-b,`q@3zNxW<\\\\1Gw2MHQINFR*uf~KH0gG6;|/'z!_vHvjltvmiz&0a6o#kEL7iIIeE$]/3&~YS.*|\\\\_:OT`)/ZKTXZ^O!9Bb)dh)qHI:}P{ e7=i7d3&4/^L~5\\\"znDDbt$dB]ock;hIc<$#P,Rr\\\"g]4EocA)Nnq>6e?@Zs5a_K#U?\",\"lastName\":\"m(w(MFsaJ;\\\\&;RU5&i(+2gNj8{_<ntmJ,\\\"'^oL/d^]|5klKS,6vl7R (eF@EO7Sky&R!)'Is`j^G%b V%6%Wv&&a@xaNvv,Idu(HhZ9W.%YF*Hp:a!uq&XC~1{*fv#C}5d1iQMDZU15M}/Ru$s7^H]]P`7m(Q*2I7C9\\\"mXt\\\\qd2.c[94?.w<AUSW-t<m\\\\#s.^'{<%UEIm4\",\"password\":\"NQ+UeB<Um%*v^LVoyiA|U-iW#gzg[&Y;H2E3EZq@Vk4\\\"Ia-}nZDPia7#T+j\\\"hi]2LU0Op|~2~qW~qKC6C]7m?ua|:npy9/43E L\",\"userStatus\":[],\"phone\":\"WiSZ`,nD+Ef'qQ8:,e`,_F`Eg,R.:P#J9!HhFUa^ME<T}W)t00=w>TJRS]!hO*g4DFk/Gf_}]lY`'zJRn@aP;5Uk5v6T zOMwou5kFq+HO,I2Z0rQC^(kQ7s69lBp<GSy.@\\\\L{<qWH\\\"[_AA2~^7%@y^^.VH@tQ&\",\"id\":-1211530987874358925,\"email\":\"Ei0rL.658k-Jk;saa}dagb)M.$9r]6:@OJx3|4;z~W{IBf_)u@0G\\\"IC:v0KC;u.]r15,[IJ'a<)zlF_3D#xCO.hZ2h5y6#BC-3TXo/Qt^)[;@C-w4]9SO9&\\\"y5za%Z=$.Pk'/kRa{8:t\\\"!Y{pEUdkvW9lg$^FNH*sgvL58]Fv'{>I\\\\Ag_tn:DR_2JQe>7{OwH^\",\"username\":\"zyw~\\\\'u?IM%`HOSgnfb#o2TjhHL{i%Y?+\\\"'|GYg~3Py)C'yami:[cuz_ge&3uQ&cwoX]560~\\\"=vY)#eFb}PoR!%jBBMR{A@d$EBFwTO,@YV\",\"hsbzt\":-414,\"ibujcisnth\":500.6},{\"firstName\":\"-h~P1oMA4K0*9k9Wy=]u4-JU50&jv|o%A@2J~&|uf&TJ9D.^T!,!9pmW;; Y:M/Rbm[\",\"lastName\":\"na'Ud%,d\\\"=WD>Go!|Y)*/~V`vi4yg]6lCodbDkTUO7Qx~.b%S{OH>hHQVy-N))t+g6eO=sc*(U@t<gLhf`{>>H}Ssw@(\\\\&tnXiL\",\"password\":\"ekp:po)%^#h;uVTe.\\\\\\\\HO5v: :XLzE48|$Qd'Y)zh#]aNa;JFJoiqw^3WZfo1OgXqkjBRT9\",\"userStatus\":\"0#'>\\\\=\",\"phone\":\"6s>@>N?VK.)bqtD+_cS#3!|G3Xx=o2QkHmXu0.1EjRb\\\\I)o jESTBc=[.w/EJ|\",\"id\":-30204258836034643,\"email\":\"!;9 y\\\\sN#EB0<KIb&X\\\\),$]?$)C:Y-Gz5k>e~a ~+8fdJc*'nyUvl(Zcbt$&eMJ\",\"username\":\"N{},pj6JSzHh-@}2~T^lABDLVZ\\\"!Uvg,Rq&w)0#(\",\"xtwmqfsvsyincl\":{\"gzqnyrgmsjtcfeaa\":true}},{\"firstName\":\"AU'ADB1qVgv*1lO}%XUKq Eq^ER9PrO8 ~al8n<I:N\\\"[B\",\"lastName\":\"uL~tb\\\\s?9SU3IQnw)R e/5v738T>j(T$nt}Bg4p|BK|kL=y]G?EIK:$=ZZV*v\",\"password\":\"b,Jx9;zYRB2ppz8l O3eJoFg$x{%j\\\"e8MI!\\\"0eLp%\\\\'Z(MXFp13c:Wc%.nXdxh)\\\\:+Ax%I#+*b`6~E6M7Df\\\\^N[lBrOf+S<d9-W6-%a<p,T4Vkmb/ER0-{\\\"2N@83ziXen?sCCz||O-KyPw0zvd,^8s=CfeAQbU<H*YOP\\\"dS4:FDT4,bY?Se#ec ZF8^oKYM\",\"userStatus\":\"6.\\\"X|\",\"phone\":\"q=6uw6[AC zV-7miY8Q].N{ab\\\"4:l}%cX[68N 4Jx-$KP~G87r;HFFZ+7wzr6<zLWJL}kw,/V#3,[TNCqc]I3SG/!se5g0+lxA-#0GTv'ycm`z(Uf5A;hDzLeO^{HqI\\\"Pine\\\\i8D62`<dw.95]E.3v}g>fA<ok2CY=#t^p'9k5fU>5=F\\\"j}+#,]d(0?Z3K5G\",\"id\":-3528861963126682461,\"email\":\"k<>?$;cIWd+9. PKBIU@y0E]l[V|aG'Kj0+24bJbuA=KiM:l}6b&rJf`ER0avuZT7_:+EXH,L&QeQc=$xi\",\"username\":\"s[S3+QR9^=:Zk12mt:]j}|:hhw%oATg2W*'``$4oM_Qjr[U8x6uiFUJGNo,#r)jIImF*])IQPDT<}.>)A]W`)0\\\"guv}u-mhUAxWHalR>4@FoqMHx 9|h3+j>65qzd4'1l-:)]n$\\\"Y^+vA8hKKoU*m;pqCf9nvuz!ZnKBYjBurH?HV]k4t'$WZYlt\",\"xkbtugks\":696.1,\"lposcv\":{},\"dsxkzjss\":444},{\"firstName\":\"'*#9S xxrBH}61nXR;aIF+SwEyWcOVMDh8DASoE-$*%8J5&;{9O5zZH{&l&L'XjWWd],[2%HH:~xy|hL1\\\\TF73,7L9IR4w<`Nws33k7DV~Eu9~d$g~s<q|,ZG;Oj~8Q/ie8%Q6TLb<+9+P>@D mt+%gtgJy~_!.!3}5Za<Kx9#Q\\\\h.\",\"lastName\":\"27[ 1V.8pBT\\\\ieODD,{O|Zy6(K\\\\QuG|EUCA*N6=U*\",\"password\":\"YBJN*jWKR}LI^l186R%#\\\".C=X^}117J74l~~q\\\"xXH/'9S2hX>j,@9?i~+ &2E~EBM&jaY_36 S2>giQuuQNqn=rQq&#EDc}|RVJ.18Xx=KV6^vcve_99t_hC/3W&;XwxB%Ig,pLoU*q$:_#U1#z-c=xS,!oVF2l}-CnA\\\\jd0se%{dh\\\"T^J3WBy-z$1e.\",\"userStatus\":-821.7,\"phone\":\"3-vb UXSO4m7\\\\h k{+}FZ:a'f=:-o_^/5B]9xYO<)rST[CH@<z\\\\,KlmNP^5*8|?f+jDR&K#s|><Gvq{T!<Diw'|pE'5 dU~9F>$\\\\m5zVurVJbro\\\\}<#*6H$iKl\",\"id\":-886845685020161681,\"email\":\"48Am}qe9Xhy}mhG+.q,~)SsfO\\\"*B(}Tiu7@`0@S.[\\\\A@Sa)Ygk-M>Feg)H+`7UY,Gc/ZM~S3HJ,Y#c~k+SQDSSM1nU|p>PL4w\",\"username\":\"akI5NWg( DXr$(RGFA|ufK\\\"\\\\JQs\\\\r5=AVR3rY>2BuEq^nerC\\\"&3{]}MxOnjE8b\\\\R`W(# 35$BZ|j$;*>xp1kb_X_A~*Ac@H@#c}Ko\\\\9p%:/YBvW<6R,b#@,yK]gbfUwW9rSAMg8[\\\"P;V^wy%BPfgj;S3ix@ Lr4+ZpH\\\\j[8gz7 ;S}Rxx}G&\\\\3l7#Yu)l-M(D>2`.je\",\"iqnsqcnxueijqbf\":851},{\"firstName\":\"aN@wx&G<Bb\\\\eTEvG6 Q^*Y5b/I6Qn%v1HU_d3usah;Dph/tveb#&?N\\\\g!~44?#{4s^b''mI],Urv,4_4QN~@C\\\",-S]xqy+]AO[%z[C$!QxbWlGAJV-Psulh$KDBY,3MQry@|yS0mVWMfI`]E:K^Q@'\\\"H&u\\\"/u>VKnU9tpdx=%G>eT?J0J\\\"pJ_Wp0FYe=A7\\\\ohQ+W\\\\cL1Sm93teL1\\\"g}gCl`@}$!QZ|:d$uW??PwM{a9!'IT3l%yS6LuO)9s`\",\"lastName\":\"R}T?hfUhZnQ$,{x@ak!])v~K!619g'V{o[X3%M&Np.Mm=pd=BkisypzDs Qi3cuXjl#^w1^IMK2 3Nk)*E650y,_R`sIu1ve=H?deP8/?yE85){:\",\"password\":\"Ybed10{-XmoliA]vC/AOi5@vd0\\\\(wC@z0QNEp55C0q-RLCI#8.%<M[/Q[3YA4)}E*a*28B@Ltk{n3Wlk,LoV#4XOW`Tr'dax|v+Y7URY(`Ut`\\\"xceW.vxQ:<BH\\\\bTN@R0F-Y}Fy]I>r=H\",\"userStatus\":\"h;)}R\",\"phone\":\"{2uhZyE{K+2wopOdG{z~NJnD{Y>l3k3uR8pWI]\\\\@8G?;:kqT;&\\\\;hbmn0L_E]mySq7eXjz\",\"id\":-837573203101708591,\"email\":\"x,jl)c+S)*y~09g]N.W0?~mt<GINpPDeqW1ytHcszg}6?pbZ1}hRpp[]&C]p:wxJ<aob[Z\\\"O'{%O19':!g{j^Gco`#QVi59RfH*Z/>)c0V2,ChTK*KB?-,zTh8'~EkHd_VW(f#G[T@EQCs@kRF2?M6^TaXqy3KEVBR}(m?w+&l(ltEQ^nO[Y(5U !$nH@dX9l!9{G[!u>Yv~A])RcKn'UAV`R&5K7sngc`5TrIeid_afr\\\\-qbJ\\\"a-!G\",\"username\":\"'\\\\GIS;))bQ.Vpt'9i)oa/$ZcOQmtmW}''3V_F[r=aED0Pd\",\"mpxpzdtfqixuen\":\"}i\\\\S,\",\"syanb\":{\"gsqgfpcxo\":true,\"wptcepwoquaj\":[]}},{\"firstName\":\"'2B1i0JNVz3pR]s3#U]Rt&Z@*Nty8M/k2 i $CdGB@!x@W\\\\GA?\\\\]U_#*cL&N55CA>]a/:4<'-G4Xzz76!=5{/Lwcv:D9r& d J1\\\\dy xw5E{ZpTz[9Y}9xZ6^h7c97m]vx7dgqgO_d]Cj.$LuluH#FA{~|vGM3KDzEw4lBE@-V~fOovD,w\",\"lastName\":\"Xe^7vVx<9Vh/$cZv\\\"yio5[AJVLN_S]<M>}'Yh9ORn]S\\\"t+ET%?|*8T%o[g#q/',XAeSD<*z[F!./Fvou*^ TcIw:{5iSBYml%Yj)yW0z{'hL-ao_D.Gs:V7M,^Q|M#(s%k@}9 *}.,vs?b0qrQMa@s|j7]#ifXqDnh+H<> \\\\nS%NP$hE9o4:dT(oM%eLh%eX71TXx&%}i2P>flU^v(<P%'\",\"password\":\" D;4W6;;&HqHc-ZSd,Zm]]U]W5[i\\\\1wCcV7e|Kxgswp&\\\"/k\\\\LeJL+Fcp(*>\\\\0eF42Kq'`=sX:eGFg_JTT@1BOO>ahej9urUn3{W?4yhP.\\\\@DhefF4\",\"userStatus\":\"Tv\",\"phone\":\"]t+d6Zl?|7HY5D,[+B~v)0o\\\"6K1/DE)]@|z9&=.K`t\\\\Lp{<j_QMr.e1Fa~!IN@(W;\\\\,d]aHi%:=F-Y/p;s`KH672TSJ8i&Vkp;y@R=d'WPQJK0vB#kfhpr]QL {D;(|&3\\\"R=`vZ[!ev.k7[,p:YgW:aQ4hn0yv2au|f OUO\\\\~3~10'/?O$X_-\",\"id\":-2523878481512932240,\"email\":\"^wiTbR$r6;RUa+rW9,jy}93gqBEfWG>&CP&LwR?#5'KPx1M8GN8HqB&!e;\\\"[\\\\?#(y_rlSQLT9>SnE>hDp-]54oO~#\\\\o#CQQ`;~V@;%,oEZu0t]7)tNJCk/0/\",\"username\":\"]l;4^\\\"6<k{Pf+\\\"g.i$L>XovZ+x\\\\@9X'{@dtn.bziKT(@&{/%L8Q@8HJtgdhcgCt\\\"L^{:Z3tccaaPnx}~[\\\\$D{<mGemx$6hsE!I~(-@SU$u7QkROft/s(5]qZGY-z`{&SX6+]\\\"tH'6p0G.Hz[nRPzg9ku27085P'x8:t2,6f4Ri[\",\"h\":\"+\",\"phtvxxqgylsstk\":{\"vq\":\"EA?G\",\"x\":-630}},{\"firstName\":\"[z^a$(o&-\\\\MsJcW,G@9oc<Tv\\\\ x^C)ywDEw\\\\HP3\",\"lastName\":\"H,\",\"password\":\"W8kRoi 9>@SeqD}|KfO|^H4-D@+/`T9JqD0$<2CnTC2?{><;JnMM!`(\\\\L8nrp1\\\\!n\\\\[If\\\\Evw]?}{/z\\\"Y7y)*WR=0eIe-}POAQ<l?_I'!3QY*Zy<W6%6=a[|U\\\"dE<4th|e'7yy~h]\\\\t3|]/3;m&,#)b\\\\f|/dR&eo1A<|#E{rS=%7NDW,:2@0dyoASS*s[c<MZSCL@xX>Lyn(@Y(T-^S`mYA%=0\\\\h&6 4jH%i=zz\",\"userStatus\":[\"\",\"YIY\"],\"phone\":\"+p~{l!\\\"!g;(iW2B 2c1 {kJ&^C8U2rr[*)F)wSZ-#-=CYLdZE|.{<%Xda=^,Auhx;Ui2/gOTZv]U}C0EieVurG=T7X~GaOC]-}F=?O/NA)NX xh'S='B'w6ANf\\\\z,lJYHOH&44P*CL3K\",\"id\":-997290024932735647,\"email\":\"|pOl1'_E8IPr9w,~)5J;.\\\"J@6T_td!,*>*T:pVPV.R\",\"username\":\"K~e$De1h7A8%1V&]G<4SfCps(tB!D7~H;}Jt .5b_?wGT!D{^I%^j+TJ325qiTH0+\\\":7T'_uD,vWdlAmEB}Z?cR~p6QXHf($@W51Nt[536ld^Cb34Z%Bwc\\\"]N';#fpVl .-2SDo\\\\|AynI0Q< W-q'-DV'h|PC<*TZG-m;hz woq2JJ?CY~hJ:}K'DbO)Ss'JW3B4I ucyrsO5Y%z~UR|4^l\\\\j7Agzs\",\"c\":{\"ljnzvrzgg\":-43,\"hy\":\"C8W\"}},{\"firstName\":\"xlO4<8\\\"<me%(H[|+nJ/V!d+hvHSI[8x0%7`'T4Es&A/e\\\\91`\\\"\\\\z=2IM{#Xk$R3u@ ra.kEp+BpPq:`%P'OFSvQd0_.$ZQ~:Q|QKUiP!Qjun<m#m@)2=PqEyM}d)u[\\\"lV\\\"^Ox .@mYs\\\"CSF8~7@ _-hW#|-7;;w-Q-+:viC<Li]C\\\\jElU#v+<L,O3MJX3U{67?xbRC_/*)^SO<h-nuSk`X<oMEq)>\\\\\",\"lastName\":\"d6|/HCEr\\\"=_<PB>j~\\\\Mh8|4AeJUX'5JsJUOKiPSBU|8Xi&'&Ry2fDT\",\"password\":\"|J7@{b[m*\\\"pz[\\\"by,/<--uA f|&<e 2^8_:9Gxp\\\\9in617y=/KRKLUk.@F{K;*e?J;4NX89LsFe6\",\"userStatus\":{},\"phone\":\"eikk0D0|QmV}d{gOsat@zN(iKN7+3kDGv,K&r(UbYJ-7,nt59N1:Fbo,7`,eR99nI}4@a!Zugw6FKSqs6\\\"'|PM\\\\\\\\]%lgFApa8/WS>Uk=T}d[l<mZ(EO*I)v?*_7\\\"0*<q8Y<n/Y^qLd/KC(t%h^rXU8=l`Q7_CR}5},erTP-nEztdr\\\"BL1k\",\"id\":-292497788785296553,\"email\":\"5`JHOhgF1?wZZ%) X\\\"r\\\"Ww)3{&?LHtJ}CL&`6!</G.*{~t/V\\\\5d]\\\"W,u3Qn#Nps{UyG~N$<-`g|iYOHMdnQS?5[^ExQLfoDV`*i+_n94P?6{O1HOTG<neUNiOZ6Mxkn=(*AFF;PRx,w7ybaek#d|b,&S3),]7D.22T%Ef`(V {gcsT46!:$TBM{\",\"username\":\",j^+7`>}-Hr^\\\"^PB<VZfd?I)O0Mw^10LNkw-c_Wk<bT#a&09/-^r 0|!|'W#WwoPl? `Od&}2W8#L3@2ux^$AxUXoJ.1E0=OjyY`.LT9#D'Xgb 3-pnlEd&BO`=ck&_cEgUG6X{V\",\"fsiwbsfjsqx\":{\"weftxsaktajowozg\":23.0,\"lycjxoxeatfk\":[\"6\",\"%+'E\",\"%]z\"],\"ogjt\":-629.2},\"gdmdvggs\":{\"yaxozxvmno\":true,\"teexxwslulhv\":\"$\"}},{\"firstName\":\"hO|r!SQ\\\"@hi\\\"nTf?l(tjIz,6n ')?)p1X?#H8p CyE-^[P ,H2Iy+Z&qRd(+f[.~jfi&4g=GMPx7Rz2Bd6:h\\\\LdU^Y5XP\\\\>$cp\\\\ Xj<DcAz[0=`h@Dg1_ag>)2\\\\0$M3<PW!KVCZa{^/FUO%i-A1Q_<*`]1\",\"lastName\":\"BG6LMDC8+qb;sW3c`/e>cOASS?/g)+151sS[uroR,s~&mPx]\",\"password\":\"KeSmmoKlJJ48=8q4u]yh.^+,aX?C9TyRSZ]*.vLakZtz3&U$dlM;DOMrz:QYC4's/Kw5Elow,\\\"+X7c)!G ?.ztItoQqT==+W2[dq<(<gYg![[6&W`F9sc7cNo9|8=s4:(?cB#UjN3M-`x+S##TyNC0B1J~kM4@K(+EAw{2]eA#s?d qQZfv+hB+Eyqzf,{I<D+yrJh- gO_Y>Pz[]&;dz1>'t5u&o0}8Q3#N:AH0Jtx:aL@8)E{,i_B@qK\",\"userStatus\":true,\"phone\":\"90fMTy%,rWR& rs\\\"C+!%U?Xuo;gX_yzke+f~0Hbf4w3~squtdoo4sn}G!,c_\\\"9D@yTpV. CQ^HLJ~_}!~PeS+'`0OVV`` 6p3RGU3k;M2g.cSOj]yo_6DkB!6\\\"DOv2S**wZC\\\">cGiO-di`G5$$:jqprQ!MVJUjG19M}dw@zO3x]bDe+r?X4PfG$Vu=kB;^V!)|]IAxBmv~*!P1Zyx@,AJDa|8;S\",\"id\":-1534102639144835851,\"email\":\"]7#<vz&7,[+U'!IJK'+MZ9_5#-06L$t$zj+?@VJ)*qB7j\",\"username\":\"-lf!#@KjZ-|{[Az@DHbN'~:.4);`0+n,7?#5'S->1kXb^!b_%3ssL-msF\",\"nwmfza\":true}]")
            .when()
                .request( "POST", "/user/createWithArray")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.userStatus.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithArray", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithArray", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsSize_Is_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsSize_Is_Gt_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"j8ONF/#+g+TiCi[[Z9G1PCEygME3IpveJeU<i%0Lr0(x.'}8IRYk66>?bkg^|O8!N$h>\\\\r\\\\yjehl*oM[17V0K22QW+\\\"=jf {uy(\\\\f`'rAZZuWlkW~nyg.4tX4l;,bx/x+\",\"lastName\":\"hydf?<SSW&\\\"dOI9+-`44@P_JP<,Aioigy7qb}FqKURW!mQ5D,Q)9a=K4#p1jBvYQZyRSuJ<@Y{>44X`Lb<''}n=DzR$hb{Rrx*.P'-u_A+o4LJXK4LRS-b|<zBD`_hvMJbl1I N@HI?94;R1e@vPDfKQ:#1WX[dMjI1}'y<Ao9xdv5nJiKX_/c2B[2NLoB#GI}Gr3_tiu2iO]Y$K80HL5= rYyQDPC^)oa-lt\\\\IjXi1L0R_+=P5?AfVs/Gu8\",\"password\":\"qW!]FF<.WtQM8_<['95)'|oKIw`y2*=RU\\\"I%=oH'`2H`/iNXv._H3{\",\"userStatus\":-209480255,\"phone\":\".Pd:|\\\"xAA*@`D]45A=6cW+^+;4Of;Fi6[#o<5nu.L'r9-)V#aY@U-)-[g'0Y!KmvD&cXcrX$Q<_z$H:R9p5z!er|'!ID>;-GnInuDq#_9a_LpGe}sL]FR6<Nrf;}yk:H}>@N!1#t\\\"uzp{Ws'_]CcZgy0Vp)9K8>XIzoa(VK|i#xsdiI`vPR9-vq_xY\",\"id\":-1570767408784972951,\"email\":\"[L|JNwdOU?nC1ILETkEJ8H\\\\r1YE|2*#bq$Re#B{\\\\`+Rj5GMIi#ggA*%GQB{N~n<go9cG~\\\\\\\\,5m9wUSAB/Br@V=;dEAx|UrhS5jPI\\\\PZxj:U>C(Za&>%55%\",\"username\":\"aNDQzz#%&,F}5z@^=KBMEO|e\",\"mjhx\":\"3VzK'7_\",\"isxbyaj\":{\"jtskbtfw\":[\"\"]}},{\"firstName\":\"n6>p9R2OY7QPxuSb0d^#]Z*U'_Bmr2rH1E{wu^U6Imr9H@]KE,Dx',Xh=T{YG\\\")lz^O 2Nq$,0a$f2Hv\",\"lastName\":\"<R'-Z0vMh-=[MHB+f>aVL=q@)jt+e`OvHTvi^_c=Ffo'P_0`/k{KRX,yQ=vYCMQUO:v\\\\i-jx%U$MZN\\\\;VHv#/. -\\\\#lZ\",\"password\":\"7TeZ!HD|XsL!cekNQ]Y5RXl4q?u.0j{(CDK7.Zy5l\\\\M|gtLB}Xifqbf&=;)9![ly~z]EIMwL],%Xa}@x{`+Su,K?XCii-9`qQ`B>A0to;vke'2^\\\"=fhm&Yv7;e 1;K|px DHaUn'*b+>|tct*SB5^0x9No>Jwr6q$,Ef0_B:\",\"userStatus\":-555989618,\"phone\":\"d$Uve%ek&zZP[]\\\\PN3P\\\\_KV$%Nmc?#rl>p700{[71`wUD&ALPPCoy%)no:`x SRMDh{/G;L]Gg-Fe8K'Qq=_v6m/g-LyTCVcF|$VoZ9+[E:|!WcPpkd`cl-}kTA&U5~J!,Xv=3^r8x~iTn_FH&cKazG`O>Po=-R|Pgw;${6P89 9$tVZ \\\"LSj)}5m}(l7l`2R!z(oR(#YFmi/L$cTdZYi}T^AH|LWBE&!RJ~_V1qFxmMLwwI&@,*z|9t(0]H\",\"id\":-4503685849227586290,\"email\":\"}&[-]f%EwQ_Z>Uxw\\\"(#g3S8_a}W,U'pakGU~kvwwcpQUnQOS8=HQ\\\\e!<pT\\\\x]&1L0m-y0AfM>.8mfXZ[V(GG\\\\B2Um! !w%XskkS/g{W$KLNG$(B2~yI+=1Kz8RX{!g;q:8.\\\\Y[w6Sz[w1VLwkh?.%u|e.3\\\"tw\",\"username\":\"|G@ u+EO&2hU!%}Ja(=PWn[Z.hqR!c8;>c#NX`:~.8 *5{vVAp2/yv<-\\\"wrE^<^eyF/g[KXqk$u|/OT=a9)0^gIjye6.;[>~U}oab {s]:}7_k)hWQlb0;0xs5Z*E&qEPz 9\\\"}in7/XpmOQ3dl6V+Uh&ZYXGDj*SHA79O7_wh;tTVpl%`]^Xu(m]\\\"b!\",\"tfyrvhhcrl\":[\"r@B\",\"5e&Y\",\"Mt_?F49`\"]},{\"firstName\":\"9%z8xv*d>J'(~RGa~):{Minpa&BGE6A Lf&]'WZ'QwG??TBs4(mPn/M896\",\"lastName\":\"fq_ujPm#VdK?:clnRj}8Tv>$mH:)$:1xt`jh/2|(v)nbv~1X{Tke4rL@,5`c+)e4TPP_-\\\"E6d}Z`*CwEx4{&l,B+{ 1hs{Xf<1DJ8y4]oO%^/Q<.Lp{RBy^]QgNRu$H#h,d8}QG Y{P~ie  $.33{3-WegNgWQLZWl.-HK./X@Xy?1OD:er~0jws2-hbsJXN\",\"password\":\"*aNMKoq1OMMb;d LM`TFz:#s\\\"chr~SNvGm''JcpL-A^\\\\EK}eAeBPxVtC#/-4$BEzn:-#'ee`t<I'bd-^vN\",\"userStatus\":-1017663405,\"phone\":\"aYn/XW0fCT`Q*}tyRFf?Y;L&(2%%;{?[H{<WG=ez:CD#_K$VqaoR|?\\\"4\\\\0NDEx ;R<~Et}J2Z$WG?FsVQ{e%O#%+#ztBt1qcL~:Dcc^4M@c8#q+K++T!V2RJC`C!b!d+r\\\")@-FR>}=]|QY`wq@,V,wIDmKi:Qd|aIA8Dite_t&g.rzzJyI}o&S[9'4\\\\W@1@48?F@~1#LP|O fiw@Qj#]S,rXUF7AMf.M\\\"c'MVk/'.U:+&#/%'\\\\%9.+%h\\\"k\",\"id\":-3540289708464207859,\"email\":\"y}%KKHa:Zp(m0Fyqe@[i-VIR.Tg=35CkNd}]Q:KS?GHiIZybyaw_mg~''O(Bn\\\"6(A\",\"username\":\"Vb8_i,Jl4-kyDRH$Ta^ex=FJxFyu$Vs]18WjSlD[sAVIckPbkT[h|!`qTV)tR50N=C9C~*^%nZ~s\\\\'I'9Fl|p+A*[\",\"jm\":686,\"vwvqkougpck\":539,\"wdqybefoedr\":{\"gu\":[\"YJ%I}T%\",\"j}P!zo\"],\"bhmmppwutmlvmz\":763.4}},{\"firstName\":\"8v`<u>SyvMD58\\\"cQFrtK70_B.Q!Z^/8]WZ(@sI'B>pawD_d\\\\xW-F[?F+/cB3fl>t}ZW5x]q,(5o1x5Z_[JM5$m68Jb1D4.)qU@0fKOPDjRT8V2%CP\",\"lastName\":\"BvA~x-;2#65]%<Z\\\\[=/kY6a:xwUQ^5i%:\\\"'e93UI[KP 'Q.]rpbYy8?SX<gkJ)Al.\\\\)O*'Hm:L\\\\5iCi{5qmy(R$%G(>tlDsqzCPop=a,'>AAAHvQ+=}?h]Y[*,@jN08@q\\\"^[_*RH=2|DH4S['a\\\\A+!-x}M+Y2&e,:.D/`Hm-&Uy3b8Z]q(W~ j4NqhO\\\">5]jg/i;H{@5k\\\"PLvzP}xB7|4o\\\"+>%'\\\\-VN;,RUjK{7MKbC7|M:T4!;W_zk\\\\\\\\,$|;]\",\"password\":\"EMHTw5Q Xo>U;jt>V#UE!PK?^C~.AFho`3MQw\\\"_\\\\h_4TOK>B)EW.n0Im+bzD?F#_4)|it>>Z`OG\\\"\\\"_#rRMwd JGSi0-B3nI0'C2r<0fpShwB!d,>(ByWAC=*&40 hOi[=r+UDgnQrBF[NxWL+-eDv9+aBDTX<o')x 9on<%a`AW/34!(G-AILIv7[$1|\\\"\\\"8=&z,F6,<3bX+}MI,c\\\\M8SV+=6yjTOKpG6LjE1@j '<}V@#\\\"U9-yMYk5>E%U|v3f%\",\"userStatus\":-908720160,\"phone\":\"U&>HXX({uFGi^P%F %?K#~MK4\\\\z#2|9C\",\"id\":-3419632515064584957,\"email\":\"~+#8JF69_un0y3JeUm'II&gt5;:w;/58=1Y#04:K_(_'=^osVSSTwU1(mt /CP(Y>c\\\"a_nmB90uLs&_?aE6,}*V#]}[,R5JpW*MI -\\\"&a[tV|](tS5:[S5cV09NdOj556WAX:JSc:Y+TBg@sJ.fi9GPpn-\\\"'On{54mWM=ykjcf+K/@P{Gjt8y_,%H,h:'+U\\\\P`\",\"username\":\"F44uRLe9|:snK=jk~/[g9~D6u5\\\"8ObQ/X+d-Ov0u99_=om%U,~>Wj\\\\mioTSsh:%\\\"hx 72r46/Y-R;&wlcSc<]}3! _kKfP%}(0u-qS^vU5T{+HUt~/U%hB\\\"C3y~ 4(c(Pl[Y87_e9s'q*z}9SY?S1l.0h$~_3(eEJ:aB_?/WxPgv#l2Zg{;omx=}^.A!`r.B-Ffm\\\"aJIUJAj J0289dIF&T==~qohI]5(M<Y|q\\\"\",\"rglsymkeyxim\":958},{\"firstName\":\"V(VysMr\",\"lastName\":\"=F<g,K,4_I z8uyJekD\\\\1cE:bK@UMq2lIteB\\\\?l{JCx{\\\\/hSVt0O ;n=S3.WS*EzwQu L{\\\\oPE8toj=kfdi0Y*SIIH6Vm!e($=_v*Ln>?2PTh`ltXGY;cA]jU7gapJ0<rjf]4>9T!l3dZmuUV56zXF~iw2v}Q*e))WYHRzUn9cw$\\\"\\\"0PT5T>qu{u_GF*fU2LnrS9YgGHU6*pKgqE641+3veIISu2<Ilk?l:TwUc,^Gj64VKWnqk:h.bwT?:j\",\"password\":\"LCEP,zM'\\\\%C6H^}ot88]Ah|e#AJAh9_>'Jm]~Fyn7 t23Oa. p 28{929Sod#[.?V\\\\ie>y6_Gm~dojRKUNd8`HlX3[hG/fH?#M}ovLBzkmO5~I_cLb?$aNBC4bH[9\\\"XBmsAF}o{k,.*#55(Q\\\">Uh,yB{<EJGNAAcHJJV<|jC<STn3uo@V+Q-d.%/+P/Bl^ZHLI}(q}8xmw,}p(*REcG;Q[(z\\\"b:--2{#qD`V(s}WSX\",\"userStatus\":-100659055,\"phone\":\"W{VL$%-NSI@TOVn5V:\\\\NqUJ9gOZ+Pr!B=m=D+>xPiu:tn6@Iz[FUIm<402wA\\\\?'5A~9Z22d^WS[D~tmz>tM}bS/^<Cb|?q/uE0MNHmvJ;p\\\\'l}7e|CfKU|:0$w3//^~{Nn6<-gT}.NH<6WDe65#=8PFtM^Eaii}#SqM=;!%yXJ~C3+'KkF6g7@NH9@aT@3CP=p5``oAEdHW}0JN$'s&\",\"id\":-3809572370627718827,\"email\":\"M,v*Z\\\\?G28vvc;5WO CKE^\\\\*8/cKJuhIKSG/U1<_OzJa%o}Xd: 8^e33?(?63g+)WZ`r qEchFNdEP~e {O:7b=9uTS?jA%S$+(LLL5D+AYo\\\\~-63idMWq\",\"username\":\"]l(x?R==g7U5e%,:/|Sa*]:k=3(dB\\\"7P,3vJ(+e6D*NOJs<p+;&<k{I;b:y.8O*b-Y=l.#|DRq1q&M~Y\\\\_mvm7ID-+4~JjQNb@_2_waA2Ymfd}20=^e+1k~Q|!kNt{RAH-s$nOyOE_,mfa:r,tcb~25uRu*`RHPN8:K9_@e5rR4!PKIJ6g<iEzT\\\\JEin<4'\\\"p\\\"/)bVSp|Y&G]_UM?_Ea1%.J%yFV^i-q)7&vWzJ$S^?L_nf;\",\"adg\":true},{\"firstName\":\"VcWM!x$B33Y8Fq;$*&zXny&EK`$Z=IzE=m&QL71*wlw$bj%{P2)~i0muKlwp*}LPW;aK2qDX[d#h}jD>O4\\\\7=&S(:IEKCd\",\"lastName\":\"12I4'bQ<JDU\\\\$xQ/busC:Q]# .*MW>c\\\\U3+YP,/hdUI'cb@R&kF<$l_\",\"password\":\"O$?$b GQ\\\\um{=1D&|g}q)g@h)faKfEZ\\\"LGzFTpbvrwZ3,0JC(.]r$4u)meR2k`~uE_*&2yL5b|xs'J)r14`pF'T1+LLPls1Fr~|NEe5Q3`ccz.n!x8f-tvs_w^Cf?O;ENb_1V\\\"83P~uK_:tB>\\\\irz=1$?WP?Y&w7J&$@YN^,FvOH{yqcW\",\"userStatus\":-210880907,\"phone\":\"HS7Ec OZy<\\\\iXXr$C3^/BcY*!9/#njo#6#\\\\qP{XKY}q.|BtD`_>SNsfaHO_,1L?X{;*1?=Y;>gHKk%V+/S2 5CJ&*JG~Va3d~?,8/Qy^cU58)lc[M~;<q,Jd)ot[gj,l8nwr?bUAw[(a97n,Y7Z8)u^yp!3#oi??Idsdx5CZ_T{E[b$r1@/k5l\\\"\",\"id\":-2665476482825903935,\"email\":\"7dU|0-Ma1@hWEVk^_Mfo=n9:Tn<H%q~z-a\\\\88sE%D!B>:cO$<><;7$!<v_1R?DQl/3x$`[S,9PAFk^IK9DLM`KUTO_s'SxYph+=VX--K%:'gZ7FJ\",\"username\":\"eJD%Cd51)Z`'~%;&lvKo8*}O6Mz{Zl SWwY.P6H.8/x[&l@]{^Y&R9RGbM3d\\\\nGIStFaLX.6r(VK|%nNU?ftJ#(5G/Q8C4zS-PuX'Fh?e#t `c%J' mLd*2rYh9m} M5^17z&\",\"nmyjqbyre\":\"8+$sY\",\"eybkewnfsyddpg\":true,\"eimglvlfsdnuulei\":\"a8\"},{\"firstName\":\"eb1`{a\\\"`ArtBgo%)Q9m94(M\\\"!$9zJQO$,1+5[zCtk76jw5!%G1~dDA(s-M?*ZKWa3mJDhe\\\\#w#g1z~#34*.F46w H*0:/d-P}BEB# dJ{[\",\"lastName\":\"EgH2xXz{BLm-\\\"i4R4y:0@;.2qv]avi{2:6Uq<sQ, @;haC|-,connDqr?_lEEng'K[/4i&o46%;(p-vDsE0i7-Y9@jfw>)jO?9z!l_Ac#trBclq? (W@[3ft]16!L<wFH{[\\\"KOXZfaeuQ$mgwh[xo\\\\j )%tibf}jifgJ AV$mYk~LFmdoq/@@EsoiBS~]o,/{=\\\"!;# DV@-]&tic,XL`JSZRSorn\\\\9SG\",\"password\":\"w-GKiw^8y6&aUZ]6*bsc*BS}v}*jY>x@p`pw)44tZafK.+Kt;Z^Gc!ja&:$bLg4J7B:4Eb]SA\",\"userStatus\":-583697078,\"phone\":\"\\\\v2RBI?B?`|*v~8U'Zi'Qd\\\\wkMn4hb}y)-gHFgY=mJmUm3MlD(q)8<s{d@6C!(<<6i oaO{c_~3mkYbaJO}Y\\\" 0yMK]`&Db487]djyT<sD4xBB|JYT8sNq3)ONu)(wSig/~TN=eTp~2PQ_)p7/B?[Y2\\\\oU5J92G4Ab?h}(<QCCyj50oz2KcC^ZXsZs<9zIgA>l<H{M\",\"id\":-3069756982236407706,\"email\":\"e?qMnME7{]Dcf)|_$0!c$mY_R&.-T!kSQAmr]T\\\"sg'\\\\?E<}j@]Li2\\\")>eu#0~}/f0Y@&~E.qr7}H:WCC6<Z:xm&+&Xn.m_@c&'UEM#3)[|h]VllGLFIx]AOCTpLjm3Qwp_!{e.~K1$9Uc-76S8eeyE+\\\\$tR\\\\a69!aXa&E F^.$M^f`d1bCFfn[9{_-\\\"R6F-i,n{->fUA88V-!>\",\"username\":\"H=0d+X5Y5iX=eiO0PeBhpuBU(x+J7Z2)SnTN0^pR.*d8B$9TXEM^jTD\\\\UUcwp4`q}-yj`3\\\"*)`!Wb7|@1=q+I7%l`#t?~BfupG$k2\\\"g/k9p6KAsP9n\\\\gdD&.%'3a2T_@)C?%WpYh!%/17i-xdoD`C](B:)_iT^m1=)2*hu3]X$E+n1dKZ\\\"zy^0_*9dCNCe~kd+\\\\3C0m:y*<gVojBy\\\\ErIZyF{r^jzi,5h?xS\",\"vvnp\":\"oo#S);WR\",\"gynhmvodgdmmovys\":755.1}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"id\":0}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":3633884213522961327,\"email\":\"\",\"username\":\"\",\"gezoi\":\"@noIArz-\",\"hj\":\"(`op\\\"\",\"r\":true},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":1875853958820860080,\"email\":\"\",\"username\":\"\",\"dsjiovjayqjykc\":\"K.Kz4]g%\",\"dalcqa\":true},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":3440094535072239676,\"email\":\"\",\"username\":\"\",\"ggyz\":true},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":3443996569154581606,\"email\":\"\",\"username\":\"\",\"jhuohgkw\":\"l1P]q1\",\"bc\":{\"shdoblvmij\":[]},\"u\":\"bUkq#XVH\"},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":1930454161207581887,\"email\":\"\",\"username\":\"\",\"mpbmrnj\":[\"2H\",\"%Yq`}h\",\"QB[h? \"],\"fu\":-581.4,\"iabsurypmfa\":57.4},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":2508010172365251591,\"email\":\"\",\"username\":\"\",\"fmzwffbnelm\":[]},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":1753517018315880236,\"email\":\"\",\"username\":\"\",\"vkgl\":-627,\"akqlupf\":373.5,\"yzuky\":{\"onzwufb\":[\"\",\" wTy9\"]}},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":2236208569721517459,\"email\":\"\",\"username\":\"\",\"di\":\",\",\"zlknttyf\":[\"\",\"bU \",\"8ifQ)q\"]},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":3555521146044114293,\"email\":\"\",\"username\":\"\",\"sxatbqhqv\":-942.6,\"waq\":{\"qhmp\":\"T\",\"idvdtgbupqexp\":\"G5 \",\"ubolutdneocdd\":true},\"dcwfvmpoguenbx\":{\"blssgyzj\":-729}},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":2236205171182303838,\"email\":\"\",\"username\":\"\",\"nfrpmtmyj\":-587.0,\"hqnxwmyngllvmj\":true,\"vmjjwfql\":\"l\"},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":3440094535072239676,\"email\":\"\",\"username\":\"\",\"ggyz\":true},{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":4193065088590645319,\"email\":\"\",\"username\":\"\",\"zzcevlagxbreomb\":[\"aINZSf\",\"q5hIHuu}\",\"qN!.\"],\"awybfb\":true}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesUserStatusValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"userStatus\":87090507}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyMediaType_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "text/xml")
                .request().body( "443")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.Media-Type=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "null")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonType_Is_NotArray() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "{\"ilhggpf\":\"\"}")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Type=Not array
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[null,null,null,null,null,null,null,null,null,null]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[-500.9,731.5,\"Y3GR\",-984,439,true,-650.2,900,[\"fm%iX+o\"],[],146.9,-290,-684.1,\";Beh\",[\"ORiZ1\",\"+\",\"}lgu/\"]]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"t@%0fS0s% >v|R&*)L(S}Sx_b}%MgDQw{u0DOXxm+\\\\&\",\"lastName\":\"xKkJ[C-d^Iw/xhaZ>KFo2|1xuwUxf&N+lm0M<oMx]HPiL(^WD%.Y}H#?{O\\\\\\\\|?m^U!j%V\\\\`g5_*q\\\"{w2Z3^7\",\"password\":\"_0B/%=jq8nJP(J`oOr\\\\2mG&]Zj@a'7C#A;\\\\he2qM)A#jC`r@>q)k+a'TqD@&1VV'VVV&[FB?B@$6Qm>,2qFca5'bnP\",\"phone\":\"o9|Ekdb]>GmryDAO3gCv;M2o)m+Q=\\\"C#-gVxLL;DF]z >LpbHM&+_`]/I[@\\\"8a.1dK*M1h18#7DI vAk 0 _4Q9mGn?M@e9X~8OKKL$5uXyWe(uhXRWS|u2DmWO*[_448}q#YoyZOyzAn^66NsO'.q0I8]NvK8L3K}Gt^UB>N7af2%5I}%\\\\RJO=,.W>xK<j?63'#Db^($Qz! nz2[=vc'n7v8'1}ZnWh'pZZo#V\\\"PB8Nz327iju{\",\"id\":null,\"email\":\"cUuHjD:y_k'7VPYeq|HA;_A8wV'-%YL>joTBkVE7>dpY'bafIHF>~1z<ksZ<\\\"&b51i&7i<#n=80'R\\\\+B;:HOPeqv`F/T<w0aIle5r#Lxd?yB<IOfCM4/OMP/R~'^OmNJ=:>*.8Q44g}x<DW&OjS1|};+HX.j;y[TV\\\\Jpsx.-H|)Qi;5(/)k?Zrwud;2I54XXd4`\",\"username\":\"8Jo'I?bY}M7yF\\\\}'3i)dN`^X>cx;kDuK ^H[,TTjwP,1*Si>t:~?i'=uck1e%%9;EDeL9G1{~U5=5SofH I.0m+qZAzwqKRgD ePU^~0~C><VNCg0^<4SA~0OfS8}HsFmcEYP0Y_k.pV`EgB=,>ZUbjAnu|(i})7s].;\\\"FM=BrX8kBMc\\\\iDYaO9~l@q*G8AC^q~W4(t>W@hVCVB2QZ(J\\\"?1ZRu|,h|6v}y0AR%=PD-ogIV^F]aiuH|P3K_t\",\"vpomzaalgdvcmec\":true},{\"firstName\":\"annLu,TOT4+d]bmB|\\\"z%@>nQWfBs3KsFY'J+id3]?7/a:4e,'V%)$c*94N\\\\$pm/m&(64sp`zr)gZ|&!`p[@-PJ#I@9x@*}EO[nL,,L3zl}{5qJL;5fWy)|!*ve7Mm#_BomXo,~OMeCw[ VuIyDH-/2<.gqC!y;mFi;C;-[H_waq[K=[|i ;bR{g}x7%iw6nvp;4D5GtMu,c1z\",\"lastName\":\"\\\"<CrQ1#*l<l+W5F8/ZU\\\")drpWQ?VlFI}o%E2ZRC~mF.EpCR3GxnNxCk9\\\"W^g}65Wj1}vd+q*tCk5}HpZ%KsC;gakjV4'~23{rD9U;.BUkkDm_zKtkO2~?jWuFoz3.`7)lmA.gA\\\\V`^_Xo,)yZewVcY5f~:`u1t:cGGi|SxEPPGzlv-7%S!zh6 G%KZ+verxBz6`45oqCV\",\"password\":\"$8^k41A2m9M;3o*G&wV<4BTQh|hM.Xk87[b:D}X</^CTp=8IYNhCqr@s[UwO5@W-~|63$%kS)`e!p1yXaSPX8h!&VS%*=/3QWTZixC$\\\\$IS9ZpdA5-k<Jqqgd$cU9r.WN/;y.&`9P}ETGjgZl8{R]s23r]f#J;8zLPO6AT)R1#XId8a62rh?[\\\\UpEX4^wpw?fC,4!Y+Q=yF$u{rcz\\\\eIl,uS+T%4qy[mtYVMW483*\",\"phone\":\"/nIz^\",\"id\":null,\"email\":\"+DZX=irs($/V4Y4!@rja^4C3NU\\\"x;f`,*zDu<Pr=,l;.'Xvh\\\"I$z6f[uv\\\"1+xIA&LjO2b$B1o8`qUc=seW-)}:FCQIN;R$O%q!).93wOn}*3rq3?5$AHIZtpDK1Dd.~>~)#\\\\G$Jpbi'$'):>)&\\\\E0n7t~sa1I?L]s:mK\\\">0j6<!xRZW1t^Wo>@v$$m*0f4@oe>~oy^iH&$fg\\\"IvpA0msM[#5*__Y.6bIL&dv\",\"username\":\"(Sqzq8fC2$354&KB'5`{m5CCuJ-rKx O8::Aj?R{pv.;5Upwjfc`kQ3L|Vrx5/.&zJ#S]duB\\\"LA][8D\\\\99W2^Lg)\",\"gisiklq\":true},{\"firstName\":\"zh&DL_IiI?39pssezWAlnB^07f4|A<y$LDJb3/,!n_zs9l5{xMqOr(v=A$eUN27;OM[\\\"umk@B:*r'<l`G!!a3[:Y\",\"lastName\":\"09DG(k'# smG\\\\,JZwVeG\\\"jG`}825GSB!;Gk/Ntu~\\\\lybo> 1|F@h ^F\\\"L0HT|#NzR/Y#&21ty-%)@Cko&\\\"}=KP;rR?cD9ErY$.Eb9[i\\\".#;Cxj%H~-%;17l=1iu1#o/f/3m*r8f;-I9;oXpN63XK53\",\"password\":\"K;qui^,.#OAh\\\"t/J+1HCZP`qsW<KLVenEvUHef|UJBmZBp:A3\",\"phone\":\"}R9|cR$+[wAGUt a&hC46<+)T6Fy,_BmjySS)'0]TRxQc<C`|Ew@WL{Y\\\"-[Njs-D-NQ|I:9GAn8x2<s.\\\\t/y{Hgr*>BgF1S?66KrPyv8ya$xMf~p>r<q7iX`].,m2lXjF8O^2%u\",\"id\":null,\"email\":\" O:=ggq+@{`O,YZ;oD|A(,!I`qVt8$l&s\\\\PseXL^!_;L!63H:`3KF_TSC#)}!\",\"username\":\")@I1X4BI\\\\0_\\\\#SnZy~6K;U_1U3z:1:e1EVBlyp2JTOA^?WC',@}L)?&,A$([ha,YIe}\\\\8WH!-Vqq$bANf-fD<VB]Z[h*#LEW_fa_y!tm)(* g\\\\r<(rb318EiY&URc]@_#ui)b]CRK{*nU/VZxlHu[Le!S/>8m]B75h}m-v5wA8%80dU|FURQ9=3Xb/`vCX'd!+NA4f\",\"oajpcghejfqqaihs\":true,\"hlruduqi\":true},{\"firstName\":\"s4ru5\\\\p%um1mC__[Bh1K0a~=):?+\\\"$&:ja&(+%}um=5l=Y@Z0q/'\\\\ok`hvKXeN?n\\\\}.%&o*Pw}#{7y&l?t;/_XA~=\",\"lastName\":\")f?i*;)'F3&p`t,<@:&k(JOt?a>xFkO7eU3msl4nXd9dq\\\\]/V@inw^=\\\\Z(pj,6H!p+aW\\\"P,6K00 cvwquLm+$X0uEb\\\\ tA6WDqdnYWbekpb$|/]^uZuKv\",\"password\":\"oe=yu^?+eo[i&PnW8|=CcKb#\\\\\\\"hKOH@0w[yKRpSFbOKNWKg_2`?Kf=9D]W!2ga&Yfs{ j}DE^Mle%HxF^#yfh3b2`N,n5<\\\\QStlIo]\",\"phone\":\"=G)ku0@5E4#<b<rG_moLmiCY]hLq7K_]]2@i.w1IHiE.nY\",\"id\":null,\"email\":\"TJIEx5[B$Tl=l9Ru7*=,.DDfBK{U_d7,H[O'8eDt8#t5\\\"\\\"O?efg~5dY;@~0.>Z]{q.e.mL!Ky`9ft9xh#J$De.&#K`*I9MxC6%_&'\\\"A/Q']E}nj`UW!+=N:H;|eFg~,zjoVroO&`e~n>N%l)XG&HjBx;&|hdfq8GRq?:^?3C^Ulh9Ni?.v3>HmwfP[dPwyjFBp{R8\",\"username\":\"M%}KmU7fkR_+U;jfD2 iXht}JjmDLeLL{ZDr&\\\\U5Nb5ZW]nt6klsdUJdwr|Z-zU0FqVR7ob^$ O+}sCx{(*>B;9!u# cy{On&26NX5pSFZDx5r~yg;+O}6dAMO+poTR$BtU)@|dA=1C-R&+miN_^YA{sA@b^yUYF`_uc{v(h&L=LmJb@<[')~Q>Dgg6C=Z4L5EfH4>Pg\",\"h\":648.9,\"cwvsymumyr\":{\"pwkverx\":\"Me@6;Im1\",\"iasnq\":[],\"ed\":true}},{\"firstName\":\"?oig79fk~V&`WX7{`1\\\"kY^UsgX}g 0W<1KM$&3.RA,tf#}!OW}IXCf6/LY\\\"\",\"lastName\":\")2:?vt!_7't':u3!>6]n%c5q'x &p3`Y('e8Y Y#t\\\"|AAfi.tBfR1Oy>lueL{}!b00449IEvpZ}zU(iuI=+(zdv{t}H^\",\"password\":\"z#\\\"B8Ovpc_yreKH5(R(jhG&HP1\\\"8.!761^$M\",\"phone\":\" W~T|AGQFjFx:Q\\\"CNLn|%?<$]fz^OIWoH-p1&Rp6qjLhHw3I'y~<+9h\",\"id\":null,\"email\":\" }m3-@^ 6T^vy?[0EJ1|upNo&ex_/hP-D8LphB>0RF;AOkbOsmcrlgpRr)VpL+\\\"1YY(}O(~%)_r:7ek14R\",\"username\":\"q\",\"akvuun\":true}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"VeZ.&)b3j`l&sum)j1a(&E'b'o*8tUO`2a5UD20*,CmHb]NnQ;]!>'3S2Q';*;a{3PG@q3D/r3x`'i={ru3J`NwiKK>SwA0N gYh>Bk<B.zt2Y4(Z'Di0 )g1zut 0w3)8w;Wu-!twJI]e&HbwnC?s}Wix{'mWH.V;Ie5|fv\\\\\",\"lastName\":\"W0M!=o ZuwgLS)H605 ]#qK{\\\"=sfg8IwR4'Cuz7n*sEBMIkAy>D4hrZy=]MRn*[(xn:Z}UnxHQ8|epIO\\\"*+{Xkl\\\\1Bzx25>Ad.1*Kt_Q#o;;QA!EEi@@!gsGMk]mfaJ>|sQ/n%#|Q8 yoSa,s2sh5v@U*fYRQ5.d)uda!oHr'.?SZ~{tx!MtDk0-GN<#gG7 0c-;M/E_q%!:01wf84/.^\\\\dG~:+$L?bxVvGZQ ;^)lMZTzf4VR*/<|1ZsdY'>;J\",\"password\":\"lKc7W82Bz@nZ}*Rxz>^\\\\B-qto=Mogx~8F$:{np_kfLo!;(p5d:b&lM&^2^y.9K_'@6j9vZa/g0b5;Q6\\\\Yp>hmF)@&M$F9-:x;LxEVw9yq#opG^<5U|t|pIT8d_ePfw\\\\L@6&e|MJ$R'^\\\"1$*;!%98frb!I@:9s`ZR%q]TW6zwSh-jWr}BC'O\\\\J`\",\"phone\":\"+U2[]~|[34E3.W[0k-TNl!]aoEaaE~pG\\\"0LSi~v1%HHwF<Ec  <O+IO|!Wg8T3s,=bO|Kl>[WPkQdw1PHSN6]DaIF@tCd6uJ;6Zh=(3Yk=\\\"*=|U8n|=':C(\",\"id\":{},\"email\":\"3$*&wB+{~@&b/H(K%5vTgRX)8FxeLN[9:}Y-Zbo+Gal]DZ)oV\\\\j5 <14 [76}wSk0=oFAE0{BSC+eG+\\\\:^E3Kti,MC&oWRy$^/dlUx>StcM(mnJ9H~ m\\\\c=D:YeO0eU!mpl-Q'(BWX;rn)yqc,1 dy{KVn\\\"x-#W}D8%FOhjfipS=\\\"(sT\",\"username\":\"E0z)FA\\\"jm{EVP9BbOFI7Ec8FE~p~*!T7L2zr:<E4dNYT_!sP{r}o6_bI7d2RQacRES@`r( HnPUIbwV.Y@7`-?1m\\\"[)G]B&jH`bABLz;@*R/%YWfY*fEC6sm9OXxZ*pd&.||Qql#1\",\"iegybpjdjxzc\":[],\"mn\":true,\"vayctnljwjc\":-657},{\"firstName\":\"[dF2'{:C,q}ekv.)UY*0}Gi@rnmRIE0$ 4~\\\"qsY_ha=59:f983aPZJGgPh.YH>GKu];ZstASQ{8;e:#}z,.={Et :@k`m'3[WVstOS04\\\"<&MEM|G`|6^o.6D>==10dNsr;chHNdb,#Xzft:-anV\\\"Uwg{`rc(](O/j\",\"lastName\":\"`PcNVmeB(pRg*LPB/Aj9VIDKCH,,lKfXC9P|5PYrP$\",\"password\":\"jh#uo~6C4yclVwOYhRNmEd!v,abR,/_3n#HkldwW1&`[a5!'[V)kgT89g89h~_\\\\2)81]Lp8x^hOC%<{d<`$)w:ELT\\\"Xcx4ZG$/6`[z_CzR=9pl1tou2e):i&AK\",\"phone\":\"Yg:SEQmy;O#nQqTdr6{xzKQ?`E[B'iSW$aQH%Uc.e6BReq&geW({:D_Ctq;,vG@Irv4ASm>wW{5)TheY5[yko?G-8@mxR&~\",\"id\":{\"ynfnmbesolfifxcm\":[\"h1D7MS\",\"\\\"\"],\"wfezvxwbzg\":true},\"email\":\" 0!^`('pETPg-_yL.RU}BN_\\\"p@yO:-}0sAgX6h\\\"m|}<$W:&tnyRe7i`+#$JGv!\\\"n[L9><y!,bmi?;+wFZ>$ztSR12*S.s4}Sbz(f6'Cp?y}Z#X7KcWYW<Q)ta-b18$Et^on`D67U?noC$Cgp^jKwZyMQ2P{r='D$=.p:h\\\";!Nxg3X=eQW|gyZ~04jt8q&Q>YEO|XR\\\":%A5YT;(Fi8FMJ.Tgv,*9\",\"username\":\"RE^~HANw|tzK1?3~ 97&<l?_?)dAYc!T]iiXiOop4)A#aL,; i()7n*gmGUoz&0Y*~ [k.VSL*qOs/!Bzo-\\\\OfGT{)*Tmf~vx`cbH3KR\",\"kvqxphuxlz\":\"UJbw\",\"etwejnqxke\":{}},{\"firstName\":\"Nx_LcX`NJkdOsqkDR0)xM)0j+IJ))EUHk0(9p4!9Daqr`@~wASHY\\\\f1m%BX qW]+@!!5.8-FQAS1!]Di(OS\",\"lastName\":\"DptX(4^.*&||2p%vM8vws^Q}a4sj@UeZp\\\\p/J/iIw+uf5bt\\\\H=15\\\"a9y|4Nv\\\"Ic#ln:jG=M0>%{2)aeIuB4&fL1dON5SZ4yL/`s&<!b5+AS5x.\\\"MhBFf!HI\\\"tY'eP$_U932M<CxS/S*'B>&rW+Mek)sKcnT`; b!2Md<i#HVd3q-Hr_K?|.({[lI{U@0z_|-i_v@$-J'&r+{3a]gMC5o*5O(pdIgaOxjKj5h'N|<EXAqpQNhk $q\",\"password\":\"mbmGLF{\\\"+HA$Mk{^~xjpg@YN+!-a!ObUCy5$}'~WfZJ;\\\"s?tN>2]UJt]#w4 e@.fPnc+IS1rgMZ;4S-eA_InVxpFz?=dF(LVsw{V.E}eu!OfB{G/x3uY:>-0gM^t[%HH\\\\|l.r>c/vEGy@+f@^v&\\\\#x<+z16PTB5?jMD/A~XY*^ tYV7*jVnop b2*^W[wdyD_Tx_u;4;g2PsFYDm.=wv\",\"phone\":\"sV\\\"Geo:$-vh4Bu 8kDJL,!9p\",\"id\":\"H=pEie\",\"email\":\"b%8gj-'uxoGbZ&Y\\\\,[25Oe.e#sY'QLZI:s+}q0p {L\\\\,BX[SmTOa]kq&]a!tTy!lI^88^bamp,l;cQyD41)aO]2~~sQi,Q[[q]yDbDb[X1xqe,Qv1XdP%L:CF7DtT|Fny(5$A'E,k//R:GA]rbedBtYy&_, 8O%`5}Gwf?Bb,',gq~BLSkM` wD&4%5gj7rML3#T]COuA_9KqL7*5EQ?b;*c +GiYZ#wo_\",\"username\":\"g_SIU[puSPNm@wHz)Dfu_]~wAAB8bOcq7Af50c}L:tc2{1k,+]>3g5UG^)3w2u\\\\H(D!;kpFdO_x@^lQfq:<7RwCF^-FO(\",\"kgijmczgeoat\":true,\"qnbtecnotjmfyyk\":692},{\"firstName\":\"k<cj@=:\\\\$66 @gu)0\\\\n\\\\n#<UiA|}R(Uw>Y)TK(3]ZHLe9,L}'BZR}O[-ghO9G3H[O.ya>EXC|6U&A !+Bk$udKN!gG7f'cDo1#HOeKQpYJ\\\\R2fl,N+,Zq1ijlK?fC8dP'dvN4D9nc>n3mZK=3| ZQaf`s@P~2@#Ftv9:|1fc`3~R=N\",\"lastName\":\">G7(S H6ASr5^w1Sbuj).&+E{oV\\\"|]x=Ynn2a^P\\\\&M1^rB~X'F_<(E94~Y4Mr`UazC.67 b*vfF3E~+UH\\\\A8D9-$MG1r Ii?Sv1\",\"password\":\"+St_PFCzC^J,:(sa%xs1L[nz4:ZnB0V=h!YBsQbGE[S)(oavRud=gX,4-Z9s-!/[WDkS^8~av:0F_7Fr7j6D}NnxdHE$PEO|^\\\"ZeW2o:[ybTu&.TQSN9(4?M`3J,e-t2Xzj7,t>n$:f[Oi*,=d80HCWN*{J cbV^*{V~[gE;k(N?qbw[>2z]E#qd}CqIKR*.OyRzX%[*ETPnCP2~s4n[FY(O?.7;\\\"by-s;}:)4XimmE\\\\M`)2:U_&kd^;\",\"phone\":\"bYBZwH(@)vSu>$2s#O*2.Y8l8s?awF{eNT\\\"Dhz\\\\na} :gW$4p^,Tx%M4=2EzV,Pc:BBL[<M/\\\"osc@ 5.8<IG%jl$xCk<Y?wUuotIIE'D6;T<@0g\\\"}}':J6#1}rF#*Q}~Qz/6L!8P%%y +YQK%dK>v`@JfXhNCY#Y&4l=`'[\",\"id\":-1021.8,\"email\":\"XUdW$~tPP=T^0o0QX:{ZJ^x0P:{l1BD\\\\C%OYCN6e l{Q&ce8H+a,vACltl/I#)Bsra$#u41zO4$7,+$>!D8I #T>K@,!-@{AxJYA71x&!FI2I3z>\\\\-UA<I}1v:DcDZ- \\\"r3YqmkvL|d'@LcGs|H-&8zs|D n~>+;${tlTnNEodt7OO*F$=0\\\"?c0j#,!!xJ~@q\\\"d$R-T={[X2'[SO\\\"5(HeqTp>QN^,D!Xp$8CSdjB(Xp#1)@t!|YIIPBY\",\"username\":\"1K`R\\\"^r0/i1.?`MvM12-DH~<BR~;{e6hlDRqX&&PNqIE&/lJ$.v~vTk!U%8C&Gcd\\\"]_S_aD0x&UY'$lKOm,3wyE)GPN$Nr+_SW()\",\"ytawmffvqgddo\":\"?o  \"},{\"firstName\":\"Xa$a9-f;\\\\StTX)ZNgHt,NUytq~\",\"lastName\":\"IDe.moL:93`I7*lcyXas\\\"qzg02oF0'KvtbVnx*|\",\"password\":\"s|AC`(Vk;j#tNY9Blc?TY7r~[cATRj*rxIHNSwD)jj$@\\\"X4B' h&F.\\\"dZE|}/[Z)ZT`1H#;)02$H/y5rja|2T5UM.wu%8ia\\\"t2{F-^U`s<gF;+@dk)kb6jlDF9^X(KVk_b>Rx`wtr>O70B%3tNon-DHm_^MO\",\"phone\":\"r9$H44/Z$.{}/`$uih&0i[Tz3Wqbhk4fmee%6VeBMm(HibkGGv(\\\"Ujc]UQ:rkpz[=iq!Hi|=0UX:ir9sc|hYbKLkA'bG|D#[J&]r;YDiBhg8 gU@t|$|#c]%uE#?C91`aye Am2=c,'q!{.Cix\\\\Vd;ELKTFNi5f|ZPUi(/^UE90Cge|'[iQcfF\",\"id\":true,\"email\":\"!Zt].Iym3-vz@Wpm8|,A&MtgH<;#,gij;>A1{P,_B_dCZ\\\"C-IBPw;pEC&D=~'W\\\\gS\",\"username\":\"]~- v}<mr|ZW%U2pin}kJ> G#Tz|IfNko1~CJte2>.y~Mm5&B >=L2j%zxB;ppY[AoXkPj7oALra*i/T9x\\\"uxl9}\",\"mponkcxdgdtm\":-691.6,\"izn\":482.8},{\"firstName\":\"Zbx_*F#u\\\"IG{L4Q<iy}@Z^U4$yq7\\\"f?k>efuV~R)uVG_gG/_u->*v]|Rt1=m@wal~jM%Dah\",\"lastName\":\"XDY$<z=ezLhR}1N}]qaE^E`m4ab7o1`4?r]$c,%WI^4BQFxdaIZF\\\"7\",\"password\":\"#$qmRzt~xuN+?Uwb5<Y|X-_y% rX>7J:+J5=s1-'6U%=VsVH|DOHM#fh&f,Mi*zbF@ndu I_j>mSg7+HyG2@DZI:sI8xyLa?zFZ74-*,<(B7';E_y+wv(w[geGA_>h+Eqf)La>mT%wHn%l\\\\7[>7^Gilp]Qd`}wtyFd0U:WfJyIIgr7A?~i-nH%|<\\\\-4Pp#/eR,t>`KNFX%@k^pVV1\\\"ZA1\\\\%tyX]#ekq!|S1(`MP(DViHy!NBGH>+i\",\"phone\":\"mr?aFSF~M/hUWK;XX;GWWM=LxP>VO1.p. wn*U5&<([k7IFsVSG!tm}m6Ok:A{ rl%],PL(.XEH=SyW77;CnG.ZDq=Y\\\"HTT/SNK3O:REVhe {T*@T=>[6&2zB sTBzUbq#/p2&R89U;Zs@,Pc)|Ar8%a#gH=)Lwo,;w;/MF8%}^)TDA'}[/6qrrUEMcw|\\\"SZ!6Joyy-v9Fz9o%T@1GDJ]mzTX#iQ=H/X]jgRO)%%;';U*\",\"id\":true,\"email\":\"/`L.*r[Qw.5p <\\\"#tq-m<nkx)u3fo'?f>L{+=\\\"'.Pb}e8!re[9D]Kz0>prF|epcr1VUV~R).s\\\\U(=b@itU_0EfYG=-C,dX?1AHJ5/8#HZ2$MHVSAw;ji\\\\uZ|~#yXf]Y*^Z/P}7eq[)W--Dr'^\\\";E7IV{>|b~p@RI t$L\",\"username\":\"}~U:i0R*gOMi9|HGp7?6;P$\\\"|+TP+MM*+&H]A|n1N#o~Ew@K\\\\X,*khb8h5}bfl8X;EDio@.}4zYk>~`1u!%\\\"6gqlnJGs.wGgVMQx@DCr9I-NQa'F=tL'=TpJ TINK`/a>k?gA{'I{h2c`R[haYE!ox+7/.vzC|sk8#}M.[!Ck:R-:-81?zF4M-f5mFNrGKD-%Dt06iS_IiJ\",\"ivkmqfitviyvlu\":true},{\"firstName\":\"'_@5w:\\\"l_aLHS=w<[jZBS\\\\.i)m]2 xz';h!G?i?On97OnxueL35@}71`\\\\]RE[N!z{@U=W:yu5E8&s7gf k]p6D^idC@ 4.ey!\\\\~Gqh;Er5gxTW1vXDC7\\\\w**m.&0}[~WsSjocD]x619:@>`nOcePs<2v[Z%}k<tzAWcy(L@}w(iy\\\"!/;|5C~IGKRw%:e.\\\"?.Yns^ygp\",\"lastName\":\"/'exi)Nouoohl9|Sc(Fm(WS$X[^/T`&`yA'6p}m_YnX_{RjB\\\\)D*gE$~5Ksz?nJa`Z@lth$-jx8sNt|(1rqjl~J3BJw&WK0>*E4sJ,k`\\\"dFD\\\\EBJJ20^U<SjL!m-S&AJT-i`C([wU'3aIRIc\\\"[+4.eACq5d>E2.Dy+v%Y!dn#bp\\\\A6D$]#AktqOm|I|\",\"password\":\"h2{8'}3\\\\F&pQx{!=JXL\\\"ZOJa/k[ w7]'r3TOxCG:8>p@@zc5]^Vn-!cNKOh#9+{GJ0;I--2P.1<cBBEMgu&/HH`!Og+I|4\\\\T0\\\".vI?D][Laii,H']b Gs7)e,UdjTa`:l~!|;#]\\\\z`|J?SyXyI2zQV\",\"phone\":\"owoF/PMc<#nfkV2Yb=.@$B1oY#g#|.* TS8a;~Gt0q>79>e@v.>Ur%M#^ZG2WH3V7r;{LSkGDq!i2^+K),aQr\\\"tL!K/i/Vmum+_ks/G\",\"id\":true,\"email\":\"[]u2d$?!l,:ADsmmbAJ59]PiCh*/Vx1tT-bfdR+uUpH>68y4`P=4s?Mh6\",\"username\":\"q\\\"ie XXB{C~?v!3\\\\e\\\"w`JgcaE53Y;R HJ(X.7d+0(}EJRh*e<I0=^bnetD;NPKn_e'^)o{;UN~F2Uru()OFUpjM?H4uX2fPdRzP1BkydLoj<)\",\"lriarvzm\":{\"u\":true,\"ikuurj\":459.3,\"nrvlfgrepyjugexi\":true},\"bh\":{\"cbzxeexmttlb\":\"1Rx<]I\"},\"vniirnjvyjgaoio\":\"0g 3b/s=\"},{\"firstName\":\"I?P3qS$V7KLJ6'~A}ZU1]V9;C$%.KT,5RM}@rKb}GFb,k\\\"SO>&'H2|q-Gfu k_5S{r1SWo$>tvc)M1~G>>9ZcC{XwQ#JZ>Ro5X\\\"rG11h9;^(\",\"lastName\":\"OCFUE'C9!ACio@B~1DJBuf3wu+MCh#>C1v)9YlM\\\\q8[UWQGgKzF[_[Dc;}Ri*W<t\\\"rvgLa!GD{]Ru)\\\"G6.g;A,{I9A1 HpNE&.7n7X4<%H>!hoFEioWqNJ7DB=VP^`;@e)04B/hbdV\\\"H&ym*p6@4DPdS<jf\\\"z]@./9&\\\"Xw$.=i=C`^KB;_TQ}en}m|^d,/z6u5_5wqYFdz\",\"password\":\"FagUQNY) Vd7iF1}}w[xg!J*$A'`E(r{sf;P2-\\\"t&S%.N}Fmt%DTFC77PGfoYp8@NaEoAu$ha71UgFRr#K9c`Re)m>3h?Xe0&4':?Ec9;rq&_7=%C(\\\\PEcfV$(M/Z_krXq:r+wIFO<$.W2!,NsJ~[=#<MPmh}2\\\\m\",\"phone\":\"_%r8a:,EyVM(iJuQPt$iJ4]4MP^L2 fahWzViz}!v_x_\\\\+Uc$K[/?}{[W&0v9jsYDe%}K\\\\U'Yiyp-bK`R~<qQ7}$.ReVp_K5Q8\\\\\\\\Ce)u ~xYk:#4PasihF;1DztU?]b!?RH`$0VfTnRCQ<<v9mM@\",\"id\":true,\"email\":\"?nf1Fn\\\"Nbr)yeK6_3>>bh=/5A\\\"?5U(-V/5i{^3L%M +s5dSfUMrLyIdU@QN%ZtA(Zz/*ijpZo9b='k(Nt?L*bTU-f;ut[J`6`9vo=)c$mZH'xv7=zT<\\\"VDyE~:0~.'3<}t#ll+#xDHRTyNJ&BpIilKoj8'1>Ne ANR>`Rp\",\"username\":\"W)[Q.`s(Q8v1CQ|I__=l[+L9T9`TP=\",\"nsl\":-176.0},{\"firstName\":\"\\\\*OA0rId+wgUliA>ohc}n(Urbf<=-\\\"7j]q09Zgsk\\\\1C};q<-x6b;@R8O<iGZQ?bcvnaO[?tJ.rb>0?#;H5tv,.GVn\\\"mTNo&NrR2xF8:`=Z]0gJy)8UUbdK.j@0*ee?7Vv+G8gdD{,bb!uGV0NU4E.a@/j%~$ViYGp7(Z&%qc1upe0K>S4ba_1& _E5SwS|oNEqW\\\",r2%>)x$6WeP<O\",\"lastName\":\"V,oB;e79u{j{@vc2V/M/%`ZG;NV|Z25PE9&-~\\\\(HO/\\\"Dh+X[BL33DL%' :=3 1\\\"&KP|'AW35I9ufslb4\\\"eZWS|#_&YIn.m]%f9KUl,nGJP-|Q{19H_xI<$?'ZqI?bzdMjY\\\\)b[nD5WR-[Q-)d<\\\"fv3u[=B/v!qILGftA|4rv~.FKFW}8Cju/J$Qvd&\",\"password\":\"}[zt/Gi{zPo)R7O77-chFr[k]t2 LXm;!?M*O[hG[:f07*HTt[t2M7c: Ab/Yli?oH 1SMl)79xj(e!Pbi1WM>DZ?&yIPbZil>oQZwq6;]$C{Y&'wB&K>mYmFPt4TF`GVW&*s<K5)A;e1Y \\\"Xxs\\\"Vs9][@vc8H~By\\\"bhz\",\"phone\":\"m4R^bDU)`#YL]Q5~(\\\";A1Y.2;isLKKn9>EU P\\\".nX!GM_$=|0l<@.I/$[;vQTep)-!**ut3_xJ2y9YM6#--x|GCoKOr$0+&)*(s2ho4F5xSPw^IO 39Az(uIyyRClVEM1|DCj^}6Ub\\\\SyMOKIZt8qb1ToWpUU$W(`R/=n\\\"`9T?kAlNk&,\\\"87F#\\\\<W43:7tL?9{z1<T)i|SeU7-keZWo\\\\<4JT!h,]/YU,yb.R Us_w.9\\\\Mx?1aFT|jmx^>L|mqJX\",\"id\":-744.2,\"email\":\"]~'g8lx5zLa}~X|mV[{n$Hq/Dp}E=V<\\\\teL}YftEp^3w.fj6yLlFEnYBmr}l`_c|OI-e0~DFe)A9+sCS=u)>7p,141*|J0*H3jzLnVRR2Dzedz5.xdn6W3HsXeYcTT\\\"YIQ|d/vR]C5dj~3]XGh+Oj$/O:&I'6XPHTTd@Rx5*/9bCF0Uz$;E5?>54h%m~,rwa1:OP~tsZry\\\\f<qD~w`H]/^WilWQD2YE(si[)'qc#8T.%\",\"username\":\"goF1_rnYZ[JuzQ%zR&\\\")dajZio9].[/$!qc3(aVt6Xt(/44CU(yy+QV-:;4|q$(pW,\\\"J\\\"*kZ/Za 6Qm{ ;-g?:qb)!U%,AVhN,tfH2$<t+_Aui.osjW6T<>o(&OtuwK]r\\\\h#02R1t,iX`)usYn\\\"9.}t2!iqm4U6MNS]OaU5+Tm.+<P%i|~g\\\\OJqEx;e;_T\\\"bdY12uRKW%=BYG(,,Ee/(pD$D'zD#s)<a%(#*pS`w5nu^qHOY7Y\",\"riqlzwarm\":929},{\"firstName\":\"D=mhF'fG/V*#kb(|uSotHnKoXzo#RBZW4S2v\\\"L,%r6ur^@'HVTzc3hJCBwUIpE|s<BQ@;$#pg]@H:2yZi@U#Ydf*o%MyN[CQoMeEJ=&d!3$08+?jjTtw(p:{$l.U+~eB~%YU3L -\",\"lastName\":\" ozfCh&iitk3xE)*nB+(1>|C\\\\Wv{k'H)$ov_7hUc@/i&_>^vSda\\\\4-%N?]dWSALT4j9$Vkb|`BG{_q::)_/1-z0:Wj_UhhBc{=h}Fy0!\",\"password\":\"+H1/~p&\\\"5|q0cf`TuFkUtS@. 8U]-ODSpg:7SUDbais$<u1^ldW|hSHC'eck= uF\\\"k/6{[2\\\"Z92\\\\w8F tr7r+Da^lIT\\\\c:Ae{ri_5 f-N94)VFist`D %]IAsi{)]2=WN\\\\g^WpP>K;OqH{,*9s%;f7yG? u%8F%?y2FaX0znA&f\",\"phone\":\"=aLTl'7;RYy>0X8;ER2;+rpe*r^,5/Rw[-XM`mhR\\\\lx{ k,3oF4\\\"JTLx:BP~3^V`g/tngZ]dh}B(,\\\\3([Q=C9/BZe//cC{n&1*%`E{@,-lm$N\\\"jnS5w8,#>YgMEXDQKmL% VY+S2#&$#TEp:o.m8C dDCQxD:tZW15F`T~R>FOwEOQ] 0F4dg8rypi/qBZ?G|t|B>$$cmb3V`sdcR1Vh*S?}}13RiAFG7Du/>uDRy}94?~n>\",\"id\":-98.3,\"email\":\"BcfPB/{NFrfU)@\\\"2a2;3#tyrOHr,BRF0</Wo}VI8PM4qxI[ES{{iw,jd2uK44D}eur<*qI3iZ(2s+$Yb([hI.9bsrmEX=#mEB&`)7lq`)i`OXG'2S.GRn39#+),d7&^>gh:Yh1z@\",\"username\":\"z|#J#hD lL6!! MT?ji:>bg%#=t_,h:x0vK36l98J9lDWF6y8:/pFTm+YG9yQ@Z>Kq+B,|P/(hh;o+}hU)!p)T[3\\\\!*ln_Ya.yh^[UTC#\\\"Itdulc~)YOxGPouO7y@46,KM\\\\<um]JA,E{VHq^pt%5LmZob$#*#(*t@.(..d*0zcKIE)xvh?rr ^_=W@C>[*%LJ^EuAI+_~\",\"jr\":\"Le\"}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesUsernameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"^qLmk_Vam:.Gp!3k|\\\\I~*g16f-irfW`W~#v#jaap:>Tl_k5'nTb%s!QF)EUFFdFXr[rG i{{nqpXTA\\\"\\\"Hz|d{i67v zJ]<,_lOPzylM G%;o%|iYMj%EeX6U]TslCC^$g\\\\xEan:N&f/|4954 X/Q/13MnZQ{~r\\\"nLslCWM//0G=/H)}10^:G?Uy@R2G28SE*[BDl8{<9pNvxl<Ldu,?6\",\"lastName\":\"jbyD/?:A8Yb^3 OX|U$^7Df7y#*Bfo${\\\\UQRz@A:l\\\\D2xNqvsK{ke>(u~O!aB4?HWcUA8B.Kwba@9+2;4o'sPf&mo7E?7.6J9a1+~&rbOh6H^ge~(A$RH@de$~K@.9(#4a&)7At,Hw_Su6=u4[8(~&m_. )u.ITLB^;(^uH_Hmvwd5#0_'a:}]H^F+=D,E+FdNO\\\"TL\\\"\\\\K\\\\=\\\\WyF7>P(5]Q#Bf+Ab8@#Hb\",\"password\":\"<yH=hOD1%>,_=ByFD% ]!`rno<zJ,s\\\\YUZVB^-l];N+,bu/tj*rX;P&w=<tNG0.=)kt7J|P;TAuA|5pR3_soi;ZzrDSPvHFeTWRH\\\\azr-\",\"phone\":\"(m8;Mdx4?6@ijATwVQ<HQO6=,x3#:$XFMa-^ f$HzCWTBsMW{(]&cR=Dl@2vON~*[^B9Sry=WGhidT[7),(\\\"H_.*MG7`4q`7P[5tacFYds}\\\\M?ii*_@uUb_j9fic?qe2N-H|NZ9sei79q@sS^\\\\ThO/+5*476N\",\"id\":-4527439244492957415,\"email\":\"i]3DAZ%qORf$FTI+sQ\\\\u%7kk8J3JOFG=NRVS86O&=RIXVCUoSK1/\\\\<}(A1(\\\\4&J@4mhG$v= )J9{K@t$VleQ|w4\",\"username\":null,\"zekjxbntghwsr\":{\"hwissfilfiznnkk\":[\"\"]}},{\"firstName\":\"E[ctd/'RR)3sz&ckkw+dZ_f~'/YL5MjRPT)\\\"^W%5!n]>x%sB9<&$}~U3w989cRl<f(T'O1;Z,rKh5@ )NOWs:-'K- I\",\"lastName\":\"A+P.y=0`h;AA?dM7tQpX>x'!.7%9UxCD:b2z3bpE7{znC9lchCM[6PS_yMC_lH+?G?9zu=~}73:,<W=2ZQGzWqqWT,@K~y>3H2yk7jkA,z%.=[dL@'0]ko8vB^7`)f30o d@(L1$FgPd%U-;*TN {!*\",\"password\":\"l}aW[#j1-Ln*x~~XSVmvj|-42Z)f2J$PW?p#i\\\\$5/E`YM$*@nnKV6QlunT+z.'1`y^($% a=N%hAMZ^1Gd9f(Xe)z7,>e|v9D[&{AwMI+wxUXR2p1{(R5B#!mua!bor1D{)pE@>63xxg':3uX^P[ex+KHCZ%[2!lk_M4q$#Sl/In;C)JoJeS:nS;!,stGHG[s3q6XTjR+^G>}auGZ#qBhR\",\"phone\":\"i6 v|UwqU9w<EUK#&>$UpOSMc7vG/&An\\\"6=\\\\Cw;+Bh>Z53FPB/3aq[v&rTHb&yVpO{%>7rq:cQ9\\\\\\\\*K>}2Vi]UmmSv~+t;WO`e;THInSZMb=]4pF*B^uS@U1V9huBLD:PCU7yK--B*`w?Y7y,`9=HF`_]3Ee&uC_8\\\\\\\\*O!iee@(;9DWwW3ZlGqcK's<4%i352\\\">^-\",\"id\":-1483404942105375319,\"email\":\"ssvl7Q.6DgQTpL+zW)|ed,zpL(AvaaUsE\",\"username\":null,\"krf\":-226.4},{\"firstName\":\":DL_JYFJ[HunEUkwZ\\\\8;J={)[\",\"lastName\":\"l12+UlZ'~<&]_>DT}1VdV9A=q>\\\"&CB{i98o c)FR]%0wau3y&2e]hlTMiS_=*A^p[\\\"ph6&DX:#n[eM_mLd$V||W}8$?T)jK:@v1?g<l\",\"password\":\"JgwAf<_\\\\$} 9N+zTr;&t9-V1Un*+~}n=wJqwDwKF(0j_X#(4'm/f%:P]9k{c-q n=V'D<*'|eHp?QtD&d:jky9LmB:j<\\\\'GY.s[y;4uu&du'\\\"UTyZC.1qT9{IMyk~c%Fu\\\\)9(/[)y:p(K5_Ej5T|:&~*JdpR9bpqJ'(?y^I44y\\\"MAbyS5-]#{-j@QZBtNf_KoJmaVBEcnwt9f[/6=9P1[)XD*C\",\"phone\":\"*lQ3H+6!\\\\A)<f>JQ`iQZ95`HLK_(a`ko<Gej/S\\\\RKM'U]'4a\\\"3yu]Brhw \\\"<7YJ eJj,/|Ko^S ^6*%tl$43j&60\\\\:qgCNf%#Jut\\\"QI%B$EY ^+kL5<@KjUZnRk)[xt\\\"|t38wTTPXOkkZ\\\"kb=IHGum^_^;1CTVk)h;08XZ(/k*!.\",\"id\":-3576184776075256826,\"email\":\"H(gX&xT5ls(\",\"username\":null,\"rynsort\":\"/\\\\z&:GV7\"}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.username.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesUsernameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"8fg&NO'Cg+-Sd@1McvEPl#tf!vk&U/-H,l)d!kPZ,;0*8=MY_gfE<:hXDUO32=6w*+q'A.YmqAsL]_8X*'OR]@/<;b$A>d;H&v<_S5$(&>GFPISD]e\\\"W2R=47xoo/S4m@>*fT6xs\\\\\\\\/~q~J:Xv'6`0e\",\"lastName\":\"'a$h%)/t$QM>E?==2`e~#x,D)$P*z{\",\"password\":\")vY)lQ0E0<yIt $M\\\" xV\\\\,QdD-e0DRd,:RT\\\"(VV&tW1p \\\"lOu(h.fhLgg_)253=G9:80uD)E.X-,tM[U$5J3o_LyIH}KSN.H[*<,i7D_/3j<f0\",\"phone\":\"RR<Rkt_kC~8_HNvwp`\\\"h_&X<axL _.b62`I.I$~r}3bFMt<f\\\\WqF 8WE(s$I(:rIlr`<*eXtN$,L6ioQI4MA;Fi]rrq{ni@YJy1X/ M8\\\\4O|@z8y3\\\\1D!H,E|<l;tz2FE:{.0(w*u#=AW7fO$bPe}^GZ0N]S}Jn,`:Uwr<{zDp-PAwb-4@ON07S1t,RTy/uD9Ha/`8br\",\"id\":-911730756497683448,\"email\":\"V7:X\\\"ZU|;sV_f10-<t[UHb70AT#l:oGZ9-XZy6M]y%c#Dv\\\\Jyeecl,?{>R'l,pY^<Qi,j$*y>vw`s{kZ4B}H&2AuZ9zkMm^ov'OBY\\\"luu@+ky^N%>KqO^vE+>NR^cVEuI_FM\",\"username\":[\"c\",\"-Fwy+kY}\"],\"ywudbcwfkqmrfw\":[],\"d\":[\"5pH\",\"\",\"+S<E8|};\"]},{\"firstName\":\"/%w,{s1 Bvh%aHP13V&%+3pUDkz4mY<LF*{sVZnnE'A39%i'Li&q#%XKwO#A:CpL^*2(OCj./]#)X?%WE:AD\\\":g{#an;kN[~%u/m)4\\\"@e.)\",\"lastName\":\"2~%4J6)`]U,6BrSQ\\\"a?]j+KT^bj*2qcx-#. Y>s`rKF~17;rJ),0\\\\xE?8W*z('0(RBCJd O=R.8T*j9rVqRu%l&h0Tm#r`]uM>Hi>xLq'hvOHt,@</{&^OjgCxw7D7^ h?AVV'jTzUY%;!@q)Je#R*cB>Jk}.A8Y$'+R!m^6C|X\\\"Gb7PwY&pl#g]\",\"password\":\"14vqxvct$7\",\"phone\":\"iR<1t=3HVR,H8C,H-Al0 )gJB@b}0Mx@)][G :<QfuA[q'*sYwCkg4f@,VvGLZCI@dF_tCXr$\\\"0aG0q|}w:~a9Cj;HOt[ZsH#;k'vpbL<KZi8:n>,5tZ[h~iiRcNIUOfRU]]F^!-=?0Df%&d6yD%(d%&AP8Qd,$hbt74F\\\"+vd>\\\\IK[GYA-cd~{26iq$gtDT<:@M;.x*SrNT4qdO.qM16Le23I)qcN?n>\",\"id\":-1970699952554425887,\"email\":\"C}6C8)BhMw=Nh),4hz\\\"65aY5]0R[&E=\\\\2ti]LhTodR#y;%cW#h?_3A^U_;@!,8q+LGv#k~%O,5AzA%#LKU(/4`*I~2H3 i-_B14XsA6e(}5:YYXP.SGRd/Nnn7l\\\\}>#$Wtekpft3Hr8O,9KD{=Mqi+a|G7'Vj#!aLr$Q:R9%cf#OT]^H2ZM2~@gj6]H`,{..2y&3rqi9hQOrWKLrQy%`UwU,lLKZ}&N?<5v!e.H96]TD|T%x_J6>iNcUYa.6K-^}\",\"username\":-982,\"gur\":true,\"cteftwtue\":true,\"d\":{}},{\"firstName\":\"=FVgPE%3l}3^KECqh8do-6it\\\"4ppjv7FHKBiQr~lm5I>T3;m!FF>.X3+|x:w^saQ.xL0A}Z'bu`|4\\\"BVI1p\\\"\\\\THD@c\",\"lastName\":\"3$phIX/HtDLm58\\\\j(7T]vqF8<[1:~4.hr[ZO>19l;7A_*.@nkK\\\"I#$,BE~%qJq%\",\"password\":\"h*h'$`XAt.p\\\"g!w n96;0^ $abok*\\\"-dJ<-4x*K7K1kt@ Bnh(Q[Y0i!6}x:V+$sd^rgS?y#93:Kh0O;D{/,!yRq(k6HvAkrD&Jsxci]{Sk,Ndl]?9ndV7&(-j3Wfp8Ox2qXq,R2[?7GNE^Kz[KL{MmJYdO]\\\"i+;:qNz1Jmn:q!O%:qROcuwC7p&,b4sZzwo></RU.N:_BYv`Uo`A[3J;ohEG;p8`*QRf7|B$3CGJ\",\"phone\":\"/^<XL9Sjq+B:TNVtKA!T^)<m%P5Udlbvy_x24QlVG<,t}.!ru!mqr2pOXz6O!~r$EY-slP3Mw'U[Akuj1?[Ye(UY?x|c}j}L=uq\\\\L$j}38[ba]?VjZh%0?`(I|^LMI79\\\\B^ZqHi{Z-py?}yt+IuV9J}x!}?'e^yZ$h|}~RFiS4R^nhD0 o{?+^=Gm7aic_r0V7\",\"id\":-1165314414149822885,\"email\":\"Gu}p#0{,z&|IL?C._%3[Y%sJ$q^zV@S~uUXYF`qXWt#\\\"%9@IKd_v,D-jGzdX0i{:M7\\\"uxFmhL1LwkqR[}4U.Df^v:V5f{$K=ux`*FB_}=[5No{5f4K$8%LdKORF(=4Wi=_/~n~PC\\\"BxLsYe]ia(y *@3djZ\\\\I1a$?]rA47`q}84T\",\"username\":761,\"m\":\"w|wvT}1\",\"hqxryfeuqqj\":-510.4,\"jsjsdau\":\"6P\\\"\"},{\"firstName\":\"Kd*i8zn%fNbowx&^so?FGEvDv-q<FWHH)1]!,P`OF+nVoMDe`L|;Dk-+T=\\\\iPG?D:B' q4ie^q/M*1)*9_e.43CRM'S#F(Te*,mY:3#j|<}Jmy^eU,_8e_wx-IbjPA@dx!UeS\\\\jgE12};OUj%\",\"lastName\":\"s),\\\\-+`&$i*\\\"kC4)t[CBfqQ*z]j*`(`BS0m1 _\\\\:RM|i4VRY1R8#e1`XZLj+IVB7wIWS=b@1CYOR{|!^{LSEQ00Iva/$wVR%R?aTh;up5D?.}jPZL@86anI:CPhb0UE4Cw(8ju0IO}8\\\\z,4[_9q*UI;Dwovcpa<^E$`Y1lGELHvt;O9lW3]47,(unJV|GRq>iPi6M4jfMlJy^rN_.Y5b[)~=X 0RcZ{/e-@@C`;9y}(A%S@t\",\"password\":\"hQ09F6!TE'c{G^~vzgTJ1|ikOtRz#}b@moimZ>;3r|<1##tL9,39)BD2v|-^TDR Zd7j!@j/u\\\\yz<p/iu9,_P5#|YE6S?g!C2Ps%R,d}@e\\\"dK0.N,{6UpNXKr*X$uu[=6f)v<r{ZVvJLJ`TR{DNc}LEY:fo)!x8>}[ I-y}d!-gcfANS.?e{ CZ)fW[NKjrJ\\\"wz]7Y:S>1D+e6&uCh_v{'d8M6s`\\\\F\",\"phone\":\"1x!Q'-0wV75P=a%mA9>zYR4x hB_<~HK$LZm&l=Y%3kH62nZKUsNbc0f~r\",\"id\":-934017388213898535,\"email\":\"3Ug(bC3,nOj./pn~:~85.=FgA%CF8k%q4g+=f7/X(=*WJ\\\"irz*rh7.m.]*CzRMXf5\\\\'n5bk&+l2[,.=\\\"VY_@@JomL\\\"8f6HJn|#? Yi?w5tg\",\"username\":[\"pL\",\"1_\",\"O\"],\"mlhrvfmio\":-60},{\"firstName\":\"C<&B\",\"lastName\":\"=ifh3^6Q[Hx)-l%ME-U3d-g}a6~H64xN-?#_Y_`Q'!@jJ(\\\"m,c /i$O[:jW5U\\\\K#^L7/?+%:j#3t0MZ2|r^he8ubs>|yeeb%h`}s=|?X9#N{lW~.i8.?MorY/ 93^,$@_@\\\"n./BJ( Vna,vr6dz\",\"password\":\";LU7=4?>EZBg;B;\\\"dzaKu9m/ /4E)8AJ@4$,VI#8X|{>zFZ)X[ip.:],iTPva1!.l,(n#SEkmg%z&V&9g}4l,4K9-Mo>+P+F;jg3tug|QNJW6kMLAeO/yR!;/w`6iamRSntDw%M#b;[\\\":;4r`+P_\\\\II'xHg-*RM Z>tG,|5cLZ2'e269~sdW<60va`.|B>B(N9\\\";)}C]1VXW0$^4!:=d385PqC?\",\"phone\":\" KYZr~&%1JqX_C9d@1~qn@Zh.EHNz4Gx0&<RJ6cE<t`OM.|nMVKKLGe;`[o`cMGP@y<\\\\Xd d{nLAr4_!y\\\"wcH]CvM.Jh'G\\\\mJ~:~B!e7XCiwUGX,$(Jp9(l|r(}g<08[AT|Yi}fW,=J\",\"id\":-2716491403613695277,\"email\":\"h>wH#:;XMs+#]unz],s7x*hcDt-j[N1vV$`Id-P)%>4]J@E1<l7 r#$VTrij.-Jt>mf{]P]0HB4!59\\\" ExvNZYl@4?]/8P>\\\\4FDntB.[Pl,~%n\\\"LX(mDI#P\\\"LLM;V%A`TE;G-5S<N$I<qB!.47)N&)*idrND}]PsbZXH$Ye9})'`-QpUxn>Y!aYhow\\\\H38u6VxoM9(L\",\"username\":[\"\\\"q\"],\"c\":431.9,\"iszyjkhmdjsfv\":454.4,\"hi\":true},{\"firstName\":\"QZM1?7~Am.G.g<R MO.R+~YDssq[>R]WhFNbo8IQ8[\\\\-Ez5Z}2^y^dW{F(qX?hv]!!?CK'{Y(Fg:b(;TGfpFP/4uA}QUp20`Ni-|^4[ap?Z9kxE}%ECBsG<?{Xh\\\"P`~+CSQ+hFoHS,<yL{d-e$' -1}o67yARD$U}8;hR]%I6%U(CN;li=uvR\\\\EBh+Qqw'jIQ{&<>3p1o$<\",\"lastName\":\"Ul>_sXPjGlzlmH8@/#Yld6;Uu|w4~x\\\\@xKBmwU{Im<YH-,0}+hRL~6jkj[\\\"NfDE$^ZM$iZ!kBHi+[0<|2Q|2Na-SQ7rfnS|{a;\\\"((]$,`KeK^:qInFC0\\\\#,0>^,hRMnuCNf}td:L3TEU_4=-,@9d^,9eW/D*%[1QxO#(JF@s7c#v\\\"e(<*W>~Y,E,i;#KY_0D,(\",\"password\":\"Dd]\\\"AdQQh=} E\\\\8H123CbK[\",\"phone\":\"Oy[^_fX}F4F?6&`]duF(+E=)]I+qJ:c(B\\\\6*dI,AJ=\",\"id\":-2554081790854141038,\"email\":\"RGe`q:_ BPmM^zn,A2ramkEB-h,E}~S!-xW$?gPH5eX\\\"bEe5_wl2RzJ\",\"username\":true,\"hbgtfjriihwiu\":\"R\\\\lU.\",\"myywxf\":\"V2K\\\\\",\"yip\":true},{\"firstName\":\"(NL\\\"H.\",\"lastName\":\"f!*ZZH]@\",\"password\":\"EtFzCW)*\\\" qoO|\\\"z)I3_6] T[$U}y>$cvCp5K<'icU2UXSw~49HJfByjVEh*45s38V?$wx:I?'^Qv+3/AKfK#0~T.)kNSeo5Y+]N%~m7xlvFyN\\\\f/9jHi6x-SG_m*tFBIqI>pzE=\",\"phone\":\"yh@z\\\\Y@):\\\\_rPVv_6j}aF~>]JxIi>|PrVY$!\\\"l*jCgd1Fo}Ch4n\\\\%kUDM(rU%`IWo0//%l'pY8~#QTIfs$EQ%'%75BTH@t=}dpAt$8ykg33!f\\\\Wr*54vOpEQ^,g:$ez(n6QW1U@kgaWoHmoN?1xcekXN.XWb=cmiv7xK~BD1Pj#xiwG9}#(ywrbeT7gj^U qTo<\",\"id\":-1031932839348688479,\"email\":\"hu&1y[>Qovq[1xaosyw\\\"P\",\"username\":{},\"aok\":[\" \",\"dln3So@\"]}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.username.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesFirstNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":null,\"lastName\":\"_1i^nc24N APJEAD(l(U{itN(>O( |){,l /e07,LI QsXM+06JuZ2N# (*#q(YM`B:OZe~Bzl]}i|9A<[JoTH|{K:|fiHc>nM)zkbmaj|xNU/AI>!*#8\\\\)GJyw)1seT$m'~*Hc3>@737-hK\",\"password\":\"8^P,|__VDVd#RV\\\"TLA3F{Q5J2'ML+0l{fEkl~NJ}o?(ojH;9` %tvQl< Ia4N#*:WO$yeH1*cmbOIYhqDpez*y|-pE9t=zic5sZ/c788tT>fl%+%gCmM%p70z[BcOweEM_CU)TrvN-A:pPumqvgjGu<N8.Bo#d/#/;c#|7obm`xW7S>yUl\",\"phone\":\",=dEl\\\"')Fe0}{qj9[k9B4sDZSYC@HiJvhTg^2XT#dl[\\\\bT`'D~'WI#uMI]Q\\\"FXQzOW#L8-b\\\"(9?Uv;JdA[*t, dg,8+!c'L.w\\\\MmLeW'm}gqb_*n#9w5a,d;7muC}cQ[\\\"I[7GwJb&[:n<LlU|'T*(8`(m5KF[O0;Y&N1A) 5R5LP-t5\",\"id\":-608780889931701080,\"email\":\"Uq0OHns5X$!|ll{Hc3-JXl7^n71='L`k#z\\\"ekU>Y|:fcaMMy>M|*b?4X$(k8PJQ0L6 *d>%K<j'Wr:BnS98ILsxmpJx&N*CVj!@1ls'0LnMdd;=Mlb9;;@~HIDRl:(G'a[` \\\"P$+,Q;25lST\\\\>1SDKKb,3QiL\",\"username\":\"I3[bEo|edNS\\\"HOuOH$1-[Ak#4 ,h-OTttW&8H/C*~s`>@C^@]=LLXoxIKu(xKv sk13M,spAN?U|\\\"iyf}r$$3irL\\\\pm L;QNLOtjZi6u&q%23<-+U Q/P|*X\\\"e2)DG89&y7<%ay3~RY)J?<ys]h|.F{,F XD[Fsir2UGaU{QO\",\"odieuhwmrtvgai\":[\"]b^)M!\"],\"nkliepjnhxsxwsq\":56},{\"firstName\":null,\"lastName\":\"_%|aqwk^ldb\\\\tXX)B%<~C]Y^cN5h7P^F2Y%*T[mC;m8/{wPA\\\\;M>ve1x~_>`P3KdG6$<b\\\\>E5PlK#}jc:4O:M*~~(YCUt7Wm1`,4NI_Y<'!jkqq{sAit:V'>f%3oYX#I_$#c3=#?|NQR+U_/K|R9=)wQ3QQp=KRC\",\"password\":\"WgFmD\\\\`U-c9PRr${\\\\7*UlRY$QD0\\\"\\\\b)1M<+NVq3H{8D]~GmyBotPI(?L,y^QT-Yxu]NNbP\\\"`~5o+/W xx3vR$:Uch\\\\a%n#%Yt,6,?~;IF,Q?L9anyRfD#1'b#lED];U]U0nO~:(N|-OLXfkYKvcRDE&_)j|H`9sEA(T`:6S@(Y}S@MtV~gWh6D*Jm?%#`B5q;Wv!oTHg=\",\"phone\":\"9qag!ogKUW]i%G[Q85bflT\",\"id\":-2894672945632451915,\"email\":\"\\\"]v6lrfA2;8vy6u;_n@($({L!!<i;km7$2'@-X%EQJB;'755E5y!M*\\\\Y3gNb/:}A^Tio322sPE;bP.IyI]VN?%v!0zGT\",\"username\":\"h$D}_pD6{ZuO|4)4`3{*\\\\!Q[E-I:T3(Ku=|Nf9z:7,yFr7F)UWF\\\"0I~&-^EGoxn1F!7r@|\",\"rjoazyquuwuoowj\":\"/7\",\"tusztmbzoe\":-301,\"jjkfumfxnxswv\":394},{\"firstName\":null,\"lastName\":\"Eo$,0,>\\\"/nCF<]J#'ON;I:RE?$jUO1@pS^M:f/,xr3n1_KmX<\\\"q6YL,}?$@[T6/{dGz#b_F,KnZjdF1D(3ks!]]W2oXpqP]X2Py sdaW&H`-d8]fgc _*qk\",\"password\":\"D-ZGxcwv^aWz$5`DluV!LJ([YLQwJ[rMR9[wvj\",\"phone\":\"g8Ulu/F AYKD:&E_j|y.9`3-rKC!u L:YrMLh7htD_#PNo6T}zE68{z.4IxWD0c*Es# krJ#H,LDL*.79_hS_Tqe7BHF+:oQC..iX1+Twwoiovh8rIVxr)Ks6}1FO5!h!sh$wbO|m|FgQp#FPDBo sxTs;F1F?We?9pEiR(2?mniNrL=7|2(#_<*qd?Io)*fF,@N^7cl*0z'@fwUcrlgqr4eN\\\\ct$~LLz`2~#WC$9C}:t+H2\",\"id\":-2603695752186484014,\"email\":\"*.$bVgo<o{iN0B]YBl3[AUL1G y`b*Wwb+[-pule(n]\",\"username\":\",])!K|mLW\\\\\\\"`r9:cI) \\\\sEDiO\",\"eeorirvsg\":{\"mdawxc\":true},\"k\":[\"YsLd\"],\"xfxk\":{\"uwttytbxs\":920.4,\"qqajdppzgeerogf\":-519.4}},{\"firstName\":null,\"lastName\":\"5>V(fKS9kXN$|dtmm1^>!<UZ|C#@6GED}#;:\",\"password\":\"bmuqW[=Bv3jrntBH0Eni{gryy]XtFw2Wt+m%3n[sr23\\\\ux:UT+VrRw*Z>~(8p/N,UbePY+7dzI@q}/\\\\:yg~Uk+*)zz=\",\"phone\":\"$AI{ !2y+~vlOy\\\\75tDP1hj37\\\\~ucUZ*|*q0$p*F}7na|05/-KLey21<T oAr:I5zNP,S.tkL5|~b&Fu1C\\\\I!@_)og\\\\;wc)E87qP\\\"[IW\\\"sjRA#,jY=I?;cCId`:n@%_nE2Tz$Y13A$z19sFLv+GG/CLa9.;H[8*K1&k!N*Co^og&NynYYz;bcgN#^97lv)V(O@`x^-Kx4,HGV)ryJ#Z|Vv4,o^RT,q%R_<XyKYGk?t!E8~Gk3g9,E o\",\"id\":-3782432644050011299,\"email\":\"Q@[&2yTQ)u3ML(;/Cv^#{en=A_kMUGT4vzAUF3N8?gVaNUL@]LJZ/!|s1D+/Ckp`dsQsvQg?oG:S(H@IoTe>wm4&O`sGHz:lUUgtZ1\",\"username\":\"(S>]35/tWkM]-%HH&Wj]+[h8N'OogO2hQQ8+,6mS4CnbW1Gi|$i^<FjZI%rr!q;6lx*\\\\$|rw.7v}1<@3!7B23CK\\\\t'v~0=}:gU'!V~Iq]@-'Ryc1W3O;hd`UHT~YDGg1rK,nQb,4i>HduE[$SXfL1=F45YB0H*1}8GMe|xH1bb?.4u+r1~WhL,q ]5BC2oWtpQ=3\\\\><7\\\"vDLr|rIJ\\\"PYf JH8'tw!Q<M+B6NC~\",\"uiiqqdryvizpy\":true,\"mdodeeu\":[\"H+\",\"x4#rfj\"],\"eo\":{}},{\"firstName\":null,\"lastName\":\"7`]at'(^\\\"&y4ZU'sJ/feT3~K>0?|S:x*Nb$k\\\\VJ=]dCQ,e\\\"3]8W99%`)58C#cTIiR+V-2jh<P|+O2I#81Eoa\\\\tEjQs|m>xXzr7-JG$F~,m34I1=D1X*l?e)9/wRbZ)1%&yuqWV[sx* >>Vt\\\\[X[f=%pa>?mQKW]JvLiIsJTv26)yh*!h:(.j`mOB>qdoz3U,ne({%<=l{}ori%]{t$#>%0u\\\\#Xq})Za\",\"password\":\"xNeR 9Y-p\\\\Ugeh';c[RblplV#` |Lj=dP*UV 4;~PmZ$T#XhzOuomw{08~ZrgT%Owr|u-BAr%KqFHdJ$oCahqK|09Y=BZwp'\\\"=|~FQ%|C*-R`af:KI$,eNRA)+$YAkV[!bL&p(Oj*g([\\\"~]\",\"phone\":\"4M>S~|}OccLCb$k(ddqv[)\",\"id\":-1782272846580309062,\"email\":\"+uBx.Jw<4,hBnvzw|0AT8zKCH -f&Wf{ka7C_!/;M4p`,IV;Uesph\\\"h%$;3/V?yySOT\\\"{;s,#q.hO\",\"username\":\"K|Yf_>FU@*EL.+tNW,Q~s6GdX:hQ/V923k$}+UJkhR%([\",\"wgwyvinldaasut\":[\"b\",\"U3haEY\"],\"aalg\":true},{\"firstName\":null,\"lastName\":\"aFQ`4_0POaO<q[7FILwC%aDi;Vu\",\"password\":\"|%p,t#5:\\\\ T iP>Ek?S|=N.$ojnpC+}ETS*h@vwgDUF%-,lU*)bzk(5YAdi[)PER9^`lagru4)P:)<Z5WbvlWYG\\\"FZ=;lJ*$;8,I&~4O.5/>pV2y<lH>zFu|UP10H3_OMhl8;?3r'>;KQ]WVGJG#evKlUYb@H(?N55YUDmGHw,'R&X\\\"xYdP34T+{x6mF'9?AfC\\\"Uy{jNSzT+YJ>Qnn-@0'9M0e7x41x#mpXR5]Cu8\",\"phone\":\"}hHyt2kf7U_R8*EsjK*<N([\\\\n^*h,d$\",\"id\":-2968523239324944297,\"email\":\"pGHl,ux0/sl43'-k)>Uw$RO{_bB)Uvp,2+MBo\\\\YD1)n]AZQu3uo-+r8mWj#*drAI ;OyLgh#\\\\bo1GDR1Gm4,\\\"6sU%D1Uvr!4Exr@f`JD2:-s><]H$GVc.LVk ma$%s D;OK%{dY<j.C8trA\\\"pjw T^%b:F=d;1fo$lyba(P(~on)22U]\",\"username\":\"1!NmL\\\\y@qII1ExC*(k[5xQyI&/E-]qp<zH?,:1m+uUkq3tqbX3PF.}z4;vTJrvB;t(TUt~n%Ja3ha\\\"dom7a5'&q3nO}5breP-@c!yPPIpY|mfoT,TPAm2)3Y_m{ofjbaGEUusxe \\\\|[pMgy-MN}#Yb/0Z?`<w{_4d8$jWt:eU2w vqlJ\\\\\\\\Jb8;6l;!s =Y$DQ0-u[uq!o7>I/>>+TAx?]i|dBT7)X)iHON;z3\",\"vzgupxbtc\":848},{\"firstName\":null,\"lastName\":\"6J+\\\"ysMj{.m\\\\^F{^]f\\\"AN=o~c(|41&+*^$L*\\\\KRo? <O,fZez!)X6(Q.{m@&\\\"BZys-\\\"+Yp{ty\\\\5uU^x 3x:zGCj!!Qc `n6`Ci<PI9$>C?l*nKcw.'g6s>$J.5 4>pzx<t]G(#dbITF`LB,wHl9O<RNV^=\\\"/=QnLL-OC(7)2+d:JzzQ[Nsz03GV#y'EmGK;Z*,9\\\\}?CD^\",\"password\":\":$'jA5Rtz2p:dnNA+X.b6p}!})\",\"phone\":\" R@KkP{rf~0\\\"D p[VGpP(&!Gio{+TQkX}As}e&t[_egB;~OLMO]+o+&h3yE5LAyM|?DN%vrbF+#y;5Ee]2\\\"@S-H=vBDN85{=^vYsBUG<S7!Nluv4di}s!n2OnW+wC:FeoY\\\"=-}ov0w`]K& FVHQ6d,[+/_]Sgm9PH<3sHD0u[pU~>yB|E_Fk\",\"id\":-3716572936389551325,\"email\":\"21>ifhz?dpTq#T.P_1d>;^fOXnc(^|<FHb2(NRUD6/3f/AlxzP>< KgXtIdnsz+./WDOxb1~n^n3zGidoRc_<Rx1mZiIOEzZ5S3+_RGjf!EqgfQC]R!;&4kyzhhSL??n\\\"u&[S9)Sj.%NsdLVj,\\\\+Vos\",\"username\":\"Lf-JySSmama%m<sfgKoVi-~EL&*M(NC/~dKPGzX5J[Px@~oZckbP/^V*(6%f8{GQt7d%Qc\",\"nyimcvzllqqexyd\":\"B|$8rZy\",\"sazhlmwdyyheikrk\":-386,\"hi\":true},{\"firstName\":null,\"lastName\":\"cj8/\\\\Xv9*n\\\"yb\\\"'~G 4e-N7*X6>%AK$h#6raLl,}J-tT[^l_OlXhpgt2'!dmCFn-)F20JiUnI#)o<:>kMMN6g&5+FHBhNFq.CVhSg <);sM`$D/k\\\\%=~FT$#ELlaI\\\\-q%5xo zf=b%FiU@+yX^j=_2W4>4/uY6#3nM[i?pRwPO|JFkN9l3\\\"Y/>&#r-0}8x&W;Ovi4g$]7J5t5j$O^bq(+2zYf:Y.Jf[%G*\\\\ 6T\",\"password\":\"5>F\\\"lzCgG@KFEw<r'Wy5P/({ict!f=D%4vVv&!`6;#Ve7&i8BTo\\\\6\\\"{k*GV+V,|\\\\K_\\\\b:/QBO,`vYt6SbD A@K\\\\G\",\"phone\":\"LCD<(~hV9a{I%Ts`\\\\!%CZ@wYb)d6 <C_D-)GA+w>P[:j3m\\\\dU1kF%*-\\\\9B<?Z4__uBp39I~^5oYH*{zB[\",\"id\":-1282812384741700248,\"email\":\"$:EU<7x-c!F<ePle.eSn%9{5Xq:[|{%@&\\\\C<SD9B;L&<xy\",\"username\":\"5A5:'oTP]@d,m}Yeelr\\\\D^C~V~!7}>pgCM,*We\",\"qbr\":-583.6,\"sfaevnzjcnmdthyw\":234.2},{\"firstName\":null,\"lastName\":\"Y\",\"password\":\".8yV-/+E[uW!$pH_#!|1uyW~M9d,F>g([eZ:@npd\\\\Bo+|H.Y%_g-U!mXj\\\"O*u~-mr;]|?b(<UlM)#{+[%QXPt5|S)JBQX?Y_3+DFFG9q'Gbc(_aQK*rsAH/MNE55/i7NE$pyI_IH`w?\\\\,|WB}+T,tt;)6`XY2no3<&Df]*zrKZAq\",\"phone\":\"q<zmmM052I^%FQBy1ZW.BJwUKbR\\\"r`:wlKEdcBrD~zSXrk6l$Y\\\\{Ugn)AQ<1C!_>2Kw?(,+3;r]Umo|pZ$6+0Y7\\\"[\",\"id\":-185650640617481949,\"email\":\"#+5RzDBFY-K[xv\\\"e3bGw``.8Zxw7)$+0k8OF]WIo2lh\\\">07{D$kY6wGOFDYfmzwadZN4&)<\\\"dvK@H*gy\\\\#,4Ss/aaep5~,mtA:]@qV!\\\"~IY8)3LrN*|4qMJ&*m(F6E<n+9eF%{RZ^{!K@*&%{w#fp- 2\\\"cR|Dmaw-bZ*Q]+\",\"username\":\"D\",\"bwffjxjn\":\"pn#{37?}\"}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.firstName.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesFirstNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":642.2,\"lastName\":\")P&P]2dVc:.(sen#lRDHN6Xd5tz,Q8((D mN9PTJv6!z`/cUXZ`bF{eJU0.onqL;j\\\\&`qM9uWp(}=qFXMC>H\\\"H~{PK/N*VjD)7DHy^}3&s=8]v}|!z)%e9E x8\\\\5fnnR(u<[GI2<E:JsI6fo6rkk^kmq.KJph&3 g,+0I.'OxK[vIm!NYk3/JU+ciqk\\\"{\",\"password\":\"m}VNIUTD%TE$~bcS.Z-aBRh0/eQz>J*\\\"pWZ~eTxzYI1>Iej@1-cK~jSRi/~mS[6:Fv`_X.D.jf{Yh/y[rGR@}[O|C(s.jP67(Z5+)\\\\~m(TN^;\",\"phone\":\"E7)rhHrt\\\"zL'TTarwv%D><pe?V@$r 2sB^{?7Zul,n}kIv%Sy6zt?'-{5sUN!$`T;\\\\sA^`a+L!W9r-V9.?7]z3b2@4%*BB%t$2\\\\bK~D n,> 3v[P1{gJP{f:%)H1\\\"[:jnvZL>}l*`fk=|`nw;v5fl;?q4Ec1)nJ.KkLML^rAV$Qc4k1`5[BJLK;923j!/~&G<7?VP_sUF\\\"Z)K%IE[vp\\\\HHEd\\\"7E2SE$cLTCR#>7.KYs\\\".yB-ArVs2\",\"id\":-3233709941791624048,\"email\":\"Z_nQ1#>E]p{XhF-hF?z3}^%x?j/F1*ihvF%<K[TV@0-;WgTP\\\"*<X.o47D._gk'\\\\6X1\\\\,m4.<\\\\/XhvZxF!<|^ni`#R&NQ\\\\g{w7ZtD{pUD:z$`-%d_9r(*ZVFh/A=85mv;B4|45!ri_U35Bc?aN!Bpwb;.v5Qo>n1bfe@7<=O iTy9!sp:1\\\",;d]([F[`_HXPARvhO-^={w%71)w4C\\\"*`!n_2X=0'DfdHe(u\",\"username\":\"PGy{Es=1c+{>-Iinwgs`Ucahi^%S'.$8Ps LQPKv!X{PMeCtI8M udKR^UE\\\"ze1GDD+%ir\",\"hepww\":998.7,\"xxoavas\":350.1,\"sgmqw\":[\"DrS6#\",\"WSw(P\",\"JXtW4A\"]},{\"firstName\":true,\"lastName\":\"#,`'Gs}nxBeF1+[_&=EAQDlFdmQfj&AkA(za{hyXzdG\\\"?hzv$#_uYL:d2{nL&:?pS:NZ5lKxRVPx~5.,`-5X7}]wTUJ~^+/!GG[FYAB(3<oA9\\\"LlZf3<e$[B41/F?v4Gf$UXoC;:Ndc<vE!R{\",\"password\":\"1%`w7^<U=;>,,\\\"kD/Ti2U?bt>99&e=$am\\\"-kA)PBO1O'dF+A3L7fN+|Jl5)%:,f8LM;&8aiW;{\\\"5pWR\",\"phone\":\"@*#P7a7'JdI/|=5cK%7wj.d:I[%4nx@&S[%azU?@_Lag/zC`2+nGHZ#{#N4rGc]0}{\\\\db#8]6\\\"C@ ,2d=1\\\"Jy=cTs(ObP:) fV'JTfAnq^;9d4:a;JSrto~p#IK-=zlt\",\"id\":-676746495754051070,\"email\":\"u\\\\ mTEuK8k!7W}_-)fU:Vd\",\"username\":\"nZ3m'jnvh`0_)]<d-|=} ,9x~d{Nkf+7 BL]+P9rDu?DO~iPz^_A/#yed0VI2#b'?l'K0,8nWrNhcAy)~Uk(5 {(_kiGt84[,ma`F,x!A4zql#x}oVSuu2(lf8~A>NZjVazxjE?cgf<>j4\\\"zqbTD:W^{JLqFy H];vI$4FuP,g%}^2Cn8IUS(ouKQQx7<Cd6[<7lq/B5(4yBK57_BLz$b}6\\\\gG-mQ6/zxFBHj{X&!-`D?KM'nineDQA/Oep\",\"ujuhkblycxegyg\":[]},{\"firstName\":-178,\"lastName\":\"yE+O7U{*:\\\"x8<mq11*k/SL^n[u,0=J.1j^WwK7Wo,3@y;\\\\Q.xMgic>$F\\\\w^_;Wh@eNk~z2 Hu[U`DRVW%Nx-O[CN%D]sqxBUZ\\\"OVi5JxH>k]v4v]@UI>\\\"^Yo\\\"o\\\"k8{n<;\",\"password\":\"T-]+i~gUmZ#f00ezQG@UywgKe\\\"=HB4k_-\\\"/vGN({b-D12C$~8?)W=uXxU\\\\.?{%\\\":?&G`|5_h-dGjF\\\\?$`Y6BDpxs4d+@VQx%vx#9m{^SXQqmT6u4\\\\M($6N[y?<OKOO;1uFhYDGs=CSkN_*K 1\\\"K1G.(E5vfwCIu\\\\*bLN=M6q{\\\\[)\\\"ab'co4 lF \\\\%x;SJ3BU.hSBH\\\\Y]]Qq!MTiYZOe mhwkW1'!LxQ;)FyQH=\",\"phone\":\"eY?znxPSSPE~v: %GA>M(lK)d{HT$PRdNeBNYs m<<|@@ka8HB[vH5P<<.fwG`]2;19xu3HjTQk+H\",\"id\":-4547101078731143422,\"email\":\" 3a,(gxF=pIuu}?Ub|FF77\",\"username\":\"&?h!rNl>Ybs6u3K7R\",\"uwnwdtfdeypq\":{},\"by\":608}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.firstName.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesLastNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"lastName\":null,\"firstName\":\"]MgnI2:?;PPFDz$A%PYZJo<bP\\\\JmxqNlO0O)E^D`J<&%GHw{o}ih#+Zt zbdX'E^4b%K??!OrvzG&\\\"4L:!$Bv5NS}3G!JU#7ITFH{mnO$,\\\\xs2&b[c^]Y)c4-Qykm]mlZR^\\\\seDS''M96hd~k{St3y5\",\"password\":\"8XYMe7H1{<m4k4UvL.f.!\\\";nb5oPNcS[5W4!7#%,$*bx[`jR}(@jY9JxrS5cZk$6us5T?;QK${!ggp:hQjOU=+~LBp%45VmFd?F~Xb^EXA~,C+@)$L1]RQr)>p'T[-5){W:2])^;JRIh!58OUJ_1$=PQZ|0TMz=q\\\"d+k=(OfOZZww(VU \",\"phone\":\"B-!SNw1$T/ fNf5$Xt<d<@q+'Ir'nW=&Q37RC]XpqUy/E@]Bs2tu*3&#W2XY_'O:]U2D-('P}ifk*hD}e5+e.][iu,ulW1Qmqp$BUHxlc<(m)b+Ojej\\\"rYFJn(9fb3X1.Nkh4{D>nL]0}@uAc='E5~Juvj$`E))-Iv-bK~eBEY[LsW|( ?-Jpho:DyDz3^qn^RKC5U#tJ.l{KuQ;8mxqR=Z9%:Lh#b8'B\\\"bzIQ6,OHvUUXt:+t:JE#-z'k_\",\"id\":-3831314279211308851,\"email\":\"E^k0><QP@-yAL4m_lX~|A X^,)o/#c]T<W'q.:?KR@w{gaN'2-%Ws-R_L<rgS~Js=,#*#gOY.QAd7~Md%(@$7&b)NXVQe-$t+F:lj+dRZ34a=Wb_\",\"username\":\"Or_&6!\\\"&X4'7*Q:B+ITqjg30U\\\"CJZ3(<d'iR|q*?EWTZpVZ[)FM|#[IV-clN:}\\\\W?4AqxBZk, ~s?][$+ |}il6hXJo[,\\\\>r8oPaMZ~^k}Jbnq;U;}25dFD7?.l8YC|Xz^E|44X.&6A#\\\\6bI|i{FUe1]lki`9$%\",\"dzkptj\":true},{\"lastName\":null,\"firstName\":\"?aPs>`R l{zD(5laBWZVZ5]r^'iGx1ELXn:j2.y](UZ:9U03UfZ/I-Sy@E%B!L@NvXG/28GfR. )XVssL<=W3~S_CIGfV|0LV51,i7kT}Rz73J^JW6Av\\\\Oa\\\"2f{s>cC6{jP<n\",\"password\":\"^%D:|w[CkVy&K=R>l=\\\"zIQrj\",\"phone\":\"|Q-K*WE|[c/^2m?#9wlyp&%em;(Qc1q/~GNiJ}OL=W1,V<P0?O=Y73k'<=}A9b3M=@VXd*EH@&#'Oe6fW`ojW: m$,i\",\"id\":-2443418932871621371,\"email\":\"l~\\\\J@7yZ3@^/$D)dxM%D|u7f9RcB}\",\"username\":\"0W5);x>.M#BU..M\\\"0~.rb5!Fc2'd!,6PbQZH? ?`cy6x3xAW-~e=NvEhSNO]sIa3zh83SQ&/>A`^!/_9H?CQlSh3B,Dv_)=OU\\\\9W|j%:UN8$o,:'r:pG3G}DhaT&jP_>_!$2(H0v.1B1Llcm2ihPTx#eN[=s@fH_VFihA'}l*ZbsOO(G{HGHN|T|G$_*8Onr2@Kxs*<b3E;ORU%\\\\\",\"wq\":[\"wprlb@^\"],\"icoetlhd\":[\";iT\",\"\",\"F&A9B{!S\"]},{\"lastName\":null,\"firstName\":\"J(<vu:n'I=hK4?e4)pDh5P6I4\",\"password\":\"^Q|Szgi'Y#8G/mzq1Jz!a\",\"phone\":\"`dJeya$O)>[{v^pq<CP@q\",\"id\":-1552297357483813079,\"email\":\"A)s~]UHk]\\\\41.)q~$^Xf{DZ/kD<%+|x1+}s-zSJb~6QdZeD+9m!aAWVKeKF!1_]b^N;+kq!>LdS5KZXD]\\\\*kI`.1cmj$*3SxW7v$tB\\\"(l,UdAJu`{/^Bw|?Ma?8K#<WQ:GZ+}d/sDgbWe>ok~7.$]{Q+hZ~e(\\\"6=-9UgUzvB8N(Qk|)D1+goJ$Q5\",\"username\":\"#+S_$>^b>5x@C$;?/AoaB1<~c^tlD2W@Uv>%3:1p*^`73UprM8@Ua4`{sI8;4\\\"?odWJ(sVDp8.g}7L-@FSjXZT/:2^^{|KqY&VR+}8s8R9O:\\\\jvX$6x{~Yb=#LzO6&1<M*7HLuMtp:_d\\\\Sx,h~i-z1~OgS[>FRQOrf(>VGmOYuY,2||stymTB8'-Fm8V~P69'y\\\\7R=l]lfZ\",\"kobvdobcfwoylxu\":\"\",\"jvcdw\":506.9,\"didubidtxwx\":[\"y[:d%%\",\"\\\"ycA)vJj\"]},{\"lastName\":null,\"firstName\":\"Dx=PVIwpmE3jX^oH7b+pHr:SC,6'#5y8)%ZKj/wa3#ie_Jc}8\",\"password\":\"av'!_ L?Cm*ya&RO1Z,5#Rf(wM?s)qigj~qCWyBYS=}URHH8Yh>t:RO)1+&r,t7}=&l~I/=;3{e#x$IdaorX>e\",\"phone\":\"9wIWu~4 |u mxX8;(Q{h6R-CV-^(0#gt:Cl$nP[E^-P<{L\\\"K|c+3fkQ_*1Rm{:S$\",\"id\":-3802836888750197345,\"email\":\"dcfI$+uTd5eaL[T:YK\\\\4q)GUvuA:gm'4P\\\\Af'w =gf/!M?z:#\\\\)zI\\\\O)/||4),pMHL )(4K% b=/:Zl7,&GC$'.m _Uf'yb[5U6nDDWAc[]E)).VwVqjSY z\",\"username\":\"M??Rgmt}feOkKi\\\"9Dn]#:2E>V$fO(Z9WLKm:z:=m` 1('Jz~5NpqVmMK+ >|LSbt:0Qy1)PMoEmIF;(/:n-*}+byv]wG;AN\\\"]\\\"UD@)I).E2q8hMaHn\",\"spfup\":274.6},{\"lastName\":null,\"firstName\":\"wQzeo0nZ[ZrSERk?,j}TRX3+.r&$Oq;2[!1r'9:9:Ygaq0*uXJK\\\"\\\\=.^}C\\\\h$I;hQmy#dg!}eYEcl&p,^D+^>;3%+X+<dLi8jr&p\",\"password\":\"<,<|HjTZG7/3Yrx3JVWwaq\\\"i}ej'6a1No)\\\\6c2i8t/r=&'ok,lR4LhJ(xZ;&>DV&IQB/K{)~\",\"phone\":\"23xXON~K3r9=UCZdBRrczm(y#/C[Fo3J&>I$Wpmei{hiJJF}:^X( de(.pZ8iQxsJ1qHM'[F/U,eviBUb>,z1k\",\"id\":-2600510331557560871,\"email\":\"I3\\\\-G;lO*}K}u-0:Kjss$R\\\\4 Z?wArFG:*r@{w`Vd<m:n9N&Mx`'C4<ckK*rA\\\\]?y(Z$:.1c^`!l{_N]V.<z*Dp\\\"ntV+cgsjhk;fW|b-/s\\\"h%|xjFTE;&rsVi}_x9s<=If$n`.\\\"br%=o,r|sqezgdCz6&W+1Jghj.,\\\\U8|lUgX\",\"username\":\"A-f_yd73E f}Q35TGRh#_`}*ANt!9HDj{BJ9:*'S3s(Vy{.JW)MFv+U|g-5DP9=1\\\\\\\\<[/C?DVbGVCLVlLy;(GXKA`.Ag'.*ryW9\\\"=J#2;3,l,(_+e\\\\}\",\"hmk\":true},{\"lastName\":null,\"firstName\":\"@@MgI}#YX'+\\\"I5F0]-Y^vlPJ=TEUxFV?n)(k8D^bKKhvzX,,5Wiw8gtALru{y+uX2rE]nZy1)?3>o=zCx`BbP_i%g;`$6z#&TO2lEw=7oc 3]|'&\\\\+`1jF^7(}~ya?u_G$nxx>vMsT~e3)Do8K6r{$ldUt72@%I4Ci6^Mz>~dhdk?f+2l(%o!y>% |Qq`E`?b\",\"password\":\"+xBQ*_F d;?rUc.PbHnhalP3qHfWK)avx+Aj!\\\"V;k}}\\\";w3Ku9_'#@znt^;YCg{e%mC779!G nNU5oqm9sy=\\\"EZcE)t)f4THV*3\\\"nkD2Aeg_gFL))U{,Q}RX PoOR$\\\"AOt{nJq4\\\\e5\\\\C#D}MWk^ V==X%h5]<^;WFJF~_q}i3)pRgHm%.#RU[i<jE%[YH9>5V\",\"phone\":\"xmWjiJU;9$-8&2}kSr`\\\"PXBD(Ei,{>f)Ope5lqETGo):YzsC&FjCfcx=bY2X.Fp(HFhCL}0H%|r:d!-i&9U{AVhx9`5}Wzv\\\\aE#jSY.{~l_ACQq>}$}@^ESC'nSia!qvId'7]_0v6 s5rE/?%K5yTr,<:*q[!T{y%c}&iq{Erk?M_M2RK7alk88x>a?-zwu9!bdkOJ{1m#(H7>S_^X/2e@q8QKM-k-}\",\"id\":-281230784572372938,\"email\":\"@,n]#Y\\\"= rs\",\"username\":\"cf[Z7i_\\\\^L/mn8:>/1(q$>\\\",/cH;H6#}~C<ek.EAtu#w_5Bc:!eE8uu\\\"hAq[)#A\\\\?y+rLEY\",\"wbtk\":true,\"nkflpbbpiedhqrt\":[\"l>\"]}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.lastName.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesLastNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"lastName\":[\"-G\"],\"firstName\":\":VY-Fg;985jQ^~e@r;}@fbS8\",\"password\":\"uJs=[CCBAG(OggH(CEAFtr^+J<03$$Q7VMSA>5T/>rLjp6;E?F/[vh'k6!=jFFXSSS|&~GlviL\\\\>K.3NpY}W|qJ1&#W-3d){Wa:0ywRGaf05dW{iQ%wGiI<dpMbwDAt$.y\\\\)Wcydv~>?<daLA.=W^Q3A/*A'2:t\\\\Ez~]:wS23K&d9&qa3%6RFH@jW*9\",\"phone\":\"bx@^sx 2<TAgd/^:olLqU\\\\N\\\\mH{.vyh+o,T7MP#EO\\\"ern)Lk2hEDCdy0$i%bLUD1S'0Nd DCVhDmw/_B%}\\\"grizww0snK%]h5yE\",\"id\":-4098528997239204693,\"email\":\"ALt j8q<v>KVfZ\\\"uTRvSa'4C@'(0=?9fnAsfW\\\\CZ~1.w)bCIXf$'AX[;kG$R&6L]R`\\\"ZpYjURIHhSPinb%Tb7K<yG5YuirC7bJBvw(5!U-/9m_VqzUMevM/=\\\\|%[]oO.\\\\H^d0c`V1cl$8G\\\\=e3o5|}R*fLf\",\"username\":\"c14_]T{0`_k`&t4!DVq5%q&.syk*='e8n3f?cO+jF/Q 8SHPNQ41}<eJ*#VLa\\\"Fo5RZ(^kCe>}9VA>X'_rjEw[Quk<1J]\",\"rxy\":{\"ncoigu\":-428,\"jtn\":\"k\"},\"wk\":{},\"oiukchpmwn\":-27.0},{\"lastName\":true,\"firstName\":\"*{p3KUsQb!z&Y#fIt=Wp}fCz>lvC?Wet?>jvp!!0V$\\\"IUCU)PjSi#5%?4*)y@DyTBW3Ayz^je&BOH=.q}v,nY>P -iF;[_lix^Pb5Ih$>^?A\\\\z#yp}+0tNmWy-36MJJ2,!mcCDH1y\",\"password\":\"bT<\\\\[~>XW`1Mb+@hD.#7qT'BF@WV2r7`;T)TpOi/X4;K[n^uemaK=A? 2tNGs`{H.Ub3`|_PB<+e&D Sv5HAHv9.@^Bv(9$l R8NcAc..p&>#P8T5s*^E[N[f\\\"o<n$? 8%GzJ@t'(8~%`3AUh^&qXb-t[!_uoj=)9j\\\"T6~,#[VnQP$CnU78dmgw5'SEWJ_Ca#+o=D|i7!1jU74nqxDm]{CL/tZc_Q37wE>_~ :Bo09<`?r#\",\"phone\":\"'A.cm=8I dw;DTs?UxTEI[iPf~>zPdQYbQZtHO^Z:,#~jjA%xeS\",\"id\":-4215225860219693600,\"email\":\"/$YUZ`ZD;um-Y:@lwm:{}0SZTt\\\\\\\\(IvHIr?g:pXq[dhp)T;b#mzZJSY&\\\\~!FPJ'-kgHH/0`RB}9nq4CeP2?flGV<4*!HxGLvH<<NqltY^olZrFuQ&+S\\\\f'[e]QQ$'E7ZAYt},{b%]Wy7P!u$MsD=m&(AaUEwiyH$T!BQ:vl],F~J6v\",\"username\":\"*#3HY%I>zCit7=%@54TCXt*FoF8d{K&o,+CY? bumLs3j9I*o:h ^1M5^436w4oWAf/JL21qHg\\\"pcQxZLq6o$5tCPK.w@AOJ8o5k&{ VF0+(GQKjS6HP7L&de;uzitPB.gcnNO)qQuAp+a*>Ao2$>.:+:*^/!2,q<H5%=]##|ja2=BYO*Cc/g.]J4f !sU|x+ZsEOP5dn8w \\\"U8X,-q4:WD\\\",I#sA5dyn$\",\"tlqtzbxfgzxgdx\":754.8,\"dbvmd\":true},{\"lastName\":{},\"firstName\":\"Y7UMl0N|kYF43.ZpTB^/ec_bh%sb^el;1\\\"xA{ P!Vk1U%K#k?78KYN%p|`g0d>C`I+)DUgRc>vQhVdhof1o,Tbt^lob4DA,~4PkhEY_Sh6KnJaK\",\"password\":\"@.!xj+(bdGc;PC1fU2NWNiY,zajq&LZ6]o\\\"x76+\\\\KbA)\\\"pM#9a)yuCJa4o4\\\\8~O:p%QJ&+m6l6D_dV%dFK_yCF3YF6Ef=-rBa:?snx||_]>L,k=n\\\"\\\"|G4IJd\\\"Xi2<eAYy%QM;;C\",\"phone\":\"O4/MZaFbd#-V{Wa|Dc>uo<yq4SS0I,RA`X%+Ah3RYx{*C6JQR{bb=%Peg7^NiR/@??+ko\\\\\\\"f(XT@\\\"t_7TBurL5wP WR=b7*N748l8GFe|TMzMvDr4Z~RB^03:IzlYf ?/q0a4p_9Q>,Zt4n-:E5^i&kiq0_:e8Kv|[5pHx'@L,x;6.%*+bLC&,Zq<\\\"e'eHt*D5OY]1*~OvW9z&[,x`}E;U\\\\w>C[N/\",\"id\":-119133709705346391,\"email\":\"sXshnSY$TDs!6)yr5wQhoy7@f&mcU7MFIy4:?p1$\",\"username\":\"y&yljgG'%S4?E[;'nGUW?2(+jIV9e9B{3QR+d=/K2![;BCO(k!kM54X=m{4(eV4VFiX29EbGg87Y\\\\Pq(ea]{&uWIXsgA%~n\\\"U92,)CZDBHW%$]\\\\3\\\"I*+SZfsGJ\",\"xiqvfsvcsfmd\":{},\"nrdh\":[],\"kz\":{\"xmgoxwkuvjoc\":992,\"hujqjqdtsvmfwn\":true}}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.lastName.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesEmailType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"cyA!s[KMw..p\\\"A<>K/^6(n!/d+VD}?,hVYoJ5M^bAFh(c$|t@Y|-|i-\\\"xH?Sj:x<w E\\\"yt=:hIt\",\"lastName\":\"BT6gaQ|45N2#&WEv;c9 cF@Fps*m9f|gB7c`]'Ed$v:Y(L3(\",\"password\":\">rbX0i5w:m\\\"x\\\"CA3lc!/z.F{U|/PsM9t;w!J!} 6'$\\\\A#Ew.;(}&]I(R%_GKx1N*+eor!^u}$hv#`i6%n0@tlO\\\\!lj\\\"@V3T8<sA2VL8g&@t#4Y-=\",\"phone\":\":>fz5h]!N4Py[0:Rvi4>;)s2m*e4Tie{G=,:WN3=Q:Us_y?\\\"vmdu}Zu)zlP3o[GITntRu#4;=nmHI_1!Jbjcd>D>Tq_*2<eF'g^2qV4{Ch9T88lY48ZSxAWwQ4Nkj*=obRz_AJ`~vKRXa!LoE43)[AS\\\"*u.mvA!ye7Ru9/8dV1j.?XddI\\\\b[R[.[#U|XzL~IoU>shyJ\",\"id\":-2274817077948022116,\"email\":null,\"username\":\"3S(A!$cfQ(Q_SA`lTovgfjyopG_zUKciWiGCFiXX(Uv1<F5\\\\?2#(.ZYqr8X$8%CiW0{\\\\^52JCaxLE`p-[NN:\\\\lnz#xeBCn{GqK1<I\\\"ii&B2\\\"[pd'P\\\\c)=d9`4I_E.U=>,;>p*fe\\\"Y<:iZ]GD5]x=,ZZV.Al]vS~nuWD59BA\\\"c`5Ss0dFr1D/)PQ|jYi:2X!b8\",\"nzhoubuvaagwo\":[\"}L[k\"]},{\"firstName\":\"c@Mg%uV78k3=Ot?2&g%d2'g:Z$h-}@/RVk)w+$7c@`?_p!DiBM,95XEHjq,31O'y=Hpt\\\\J)~PvXU#:&kO#/pdQvw-~uN_;2V\\\\AKDJ*NdH%_+bW[(aJ/t`6,(\\\\^%SQ\\\\$[,TZ|^o^`(4BIvnzC=KL|Fu'i4@8EVr4JRr/FVVyEi2y\\\"(>N7c&\\\"zeX%C|j%Sp6^i{LwU,B|>Gujpz/oVI_'H2QaW_(H\\\\mNh\\\"+(cfTJ:\\\"*S~v \\\"xwKUe$O22S)Cj&/8D\",\"lastName\":\"7\\\"fvf~#%6'>C){&.kmhY(0@SwQQ4|fRNML5LRi2gWSC$Fi~L7[,xq4UN!8^G8y5Q^#GN3ZYf:PgXT0KEA(/}$*.fL^FnWG{GJAb}0qdIRWX%/_I#ZC~F6G8gDigy_<;EFuO;MK9/+!4#Q+\",\"password\":\"Z{;tMS4wwkVds`0!3p)i_J<:9 +{7k/>/06uC~*CHaCqY1(G9`2]}[lG C\\\"&j#9`:yh0px;pF38LLR1??RsSLU!G5~0.\\\\$H8Eo7mF_Wtce}y3[q/b:X<gC#wkw:>|&tdpQ<?`As7;E6`xY:JW/9||IcF2Hfoi\\\",CQ8AT>p?%56~MQPOs>>%bx]hL>\\\\kt#l5DBen,9m!q)r;==( RbgG}Tw5Fvy}SJ/21MeMf;}8_4t6TuR\\\\Hsj:/BQEl\",\"phone\":\"9?dXJg)tKY\\\\%TU}.hDTI3;sx}:N\\\"vg_Q?&gi'7y.m*qXh9x-CCgr__P=Q?wA9dXISbP0pllR{T%yNI4pyk5r5$DM*8 $!K7.ptLSvg~w!|cO>v=[~G^H,py?6\\\\Em ,)0I]2Zj3 H0y0F8I7`BeSH5IVOvl-Q)ANr4?_hc\\\"hmf*w\\\\5hzH2e3s)aTx&\\\"pY}L_:%l7A4ci=g'_1$ }oFs}ggd>q'ldHVJH^7X@O7uUTIvr 1-rm_\",\"id\":-3006054795515028968,\"email\":null,\"username\":\"|O}G)A4}bsd~2(fA\\\"n1r-`yt/Nph#MZ;~8R\\\\TFbX@od-WrQxp,w?<wh-I6%57l<[hD~\\\\Fuwhy:qrg{![Znxjs{'=<KNCNBJ,udFaV,{3`dLq_1sgx]+1`6.Y!O#zl8/Dp7cA)`R&AKD>oUA#E<6s,K1EnOMt~e4u{VOCJ-W$[pnQ{c\\\"V+EvE=e6GZsMFFY2B_CZng2\\\" i3i8[@++d=\",\"oyrjhwvh\":-999.2},{\"firstName\":\"a{Z^\\\"b,FDt1tWnlw;4OE>4)<Pw;9bFOM4g1{)3j#AqpG&ct:sZwN.S/m@?xfn9!0(V;G%2Nn/R9?l43::}yNywPT]RdBniAv/9?;|,Dw] e8-,%DaL^X`APrh>koP%vuPz+y1rc^-JuEH9j7B+BHv1Sb3P*(~j`DgR_Y54Ct H>o&CS9j(>v6fwFfr@C?+XBOzw\",\"lastName\":\"gN67daSfV^?FZ?'WlZ}v?s(y\\\"GH#U[BDQM4t)<|<.\\\"}pe+Q0;8E1XnbCZpjkH[I*9P1q,2X?SGmm]B:\\\"q$A3wp7PPVjCk:s XFb/&nG-C5i4|U*-Zdl/E5Fdb~4@e\\\"y7i4AM,fOgIlH\",\"password\":\"VKT.oAv@&\\\\^7gOr^R.IbN?G>@cs;sng)H\\\\OT}FEq;XzJgIQtu]\\\\ hQc5| >u1~0}BN,:Fp(N3}v9F7:2ae/)NW]\",\"phone\":\"<BSn|GrW\\\\?i,SmK4SdXd;&Kx?iV//MzblxO}`K4,(vyr?Y)_1MSJ{W[@Zj\\\"rWK@-`s.Q~-B.7pT\\\"h<QSGNYMV*Da{@ZLSUdl~4(AG)+`\\\"S8JWGjopV&b !F:Px^i3{H+ip$+)+l]PFcDII@!e,C{]J}\",\"id\":-1099438778193310035,\"email\":null,\"username\":\"x3ipAW*AhE0/^.0s?NtJeyP;1av:|V[bZ\\\\!'N!*_\",\"wotulxnymlachrg\":[\"-,xs:@\"],\"keuhygqwches\":[\";v`K5y\"]},{\"firstName\":\"Kn\\\\&6:=^w+(< FqJoA+qWIFa{[nRmCSA_Tr<Ub!5q;}e]u#CHe`_05Bck>'}ne0[pw!-%8LiFQG4nb%l?>n{ZeFHg 4x.h~NL9\\\"e/h?i5aA2]N$ZsqnV>Q]+Q$Kke~0\\\"EWnN$Y\\\\c(V8/FX_`;TN?xvvo/LQH~)c`Ev7EHae)9\\\"5%P'4eRwf}GX,s@dKituJNILN%2E3U=7/Ql'I>a5Hle1@Say9y*s;eCIbrkLjd:#/w\\\"jd@13xb1~ndO6lq\",\"lastName\":\"<:%K(s Q\\\"?tDr&K.@S?znzD\\\"FFuV@$K99 \\\"&d/O7L^a.(3U7o%Y5{Fkg1w%;CsM}!\\\"JO3=&:[T]}u9X0{\\\\!Fq&Yr6@ncm7~l-ChiqKx^eHB.UA#Ld%YL2` &]Hg1kbtQN1@F3F^VW<zB:+aU'XgPSoS0y6UgMGi;KR#^,^o$TV{\",\"password\":\"6EYr=1BrwpG=YTg>bXfY</=CmY]ygrO=\",\"phone\":\"Ig/Hz_#*vR^~\\\\}C|< fcVm4w\\\"_89\\\\wk7wU'S=[ja&3yG!&BDe{B?rPkv`$W8:`mu[@gs.GY)A`(P&]& n+dw3D$8`5s4NqercHJ}F>DH|$Yyx/FAB 6kr:M}V.G71_Kac%ZeC]P$K5O9Ztv.Q9/S`kb&6d@8-Y8,*9n&h#\",\"id\":-2197428006848458850,\"email\":null,\"username\":\"5R>J</>iw1iN1h2LwkAm{^lrL \\\"T\\\"b2=M3W]5a -:i!s ~<fy6#hU\\\" +`Y/*mAilS!~4E] (AXm`.?M1O#fO{S'$}1DS: u$`P\\\"wx6JR/S!sVAfq_0!{([J&;t8R3'lb|Lx_%eJ\\\\$w+I.n$T W+;\",\"lo\":[],\"bapthsedayqoab\":819,\"e\":-332},{\"firstName\":\"D><3\\\\f49AtN#P_r8&-!o`;GB:*G*Z5 Uq<EcaZr 2fut g{Op1uR%m\",\"lastName\":\"$mhF!*K;(E}3\\\\NlC:pxLwC%7v\",\"password\":\"ip+-44]tnbI_qI1dp(*wa_3V,V\\\"\\\\_/S(\\\\/T4rTIfz/su:l0hMM&Gk\\\\!F 8iXH8ck{k_H:L,:7iE:4<rMOOlzBR88d1jTwYkMR]w-;'RiV3Ne+)*(:L<kB;D#N-DzcivI,/]iOY4rn<_`c3wg<[o6kd ,ZiWJ%mjN]&8Dm4-6xvA[]F\\\\\",\"phone\":\"IhC|p \\\"L/)Eve{OgGW'cC}7\\\\dmr*ptY<zqnY)h3GA{U3E>KeVa#-S)bwzdU:2Gfh.p^r>IQJC2X^'25<9z^n$$N#rRiw?4}zp@.kh28g.(124J^/s5[~MMS6u[D|08K[cD`[vHKSU?{@cQZBZ.&<pn~,\\\"VuR}<Fa;8.pLOV-15a~gODqUFD7LA3xAT5K2C%+[7@p/&0{zD[iMpJW5\\\\8$tPws7\",\"id\":-2782083925042333748,\"email\":null,\"username\":\">)}~|X%Vc\\\"r;3iK74#tC`Dm%26%HWEma1,c.~:Ls8QGnWCBx*!;>1Q;u=cnhXZ{^orV7r|J-Em|'>ohy|W;)Gh;;g707'xQz~ v1&w^?VGVMKz~B?OWkj].5:@hozg_t'CV}!|q(riVN><gW)K?G(Vi1!%Ir6=$/qe`,>H'qD=\",\"ikaluxgpecdrdth\":true,\"fswkfewpeea\":-882.6,\"lctucf\":-748.9},{\"firstName\":\"qen?nU^EJZe\",\"lastName\":\"S'F|zI/Y?RF\\\"jS2Cflqf$K]Dq8%h=SB>qBRcJV\",\"password\":\"fEhkP\",\"phone\":\"|^SYgAU8kb/7t$n&]%K9gbAoF[91X5C>q+4a*j< BsPJwgynC@x|:dge u]aHm([O1olJ>i'$Z3'l0~-od47aabZ:VX10x|YS?)gB^QHDKc+w|Ad[C.,R]05,Qb3mg7$3/\\\"gF3> LBDZk@EIC6Zd8-V3>:1dLv@'+Y23hri0LjIv Pb?^!.K/E}Q>-,2k>QB#\\\"GSoH2|uO\",\"id\":-2144340999038541552,\"email\":null,\"username\":\"[#!Z4hn@*5.y&7@R'%}/mbj$+ox?zt#ur^^W@YHSHI1!w4JP]i4::QZl,Op}K2`M%]Ur/).o;-h[//Gt! .f|U*m2(\\\"Z!R{kc\\\\UO#ryRag)bt+E])k,v~\",\"fxq\":445.3,\"drv\":502.6},{\"firstName\":\"iBb^m7uV39Y/k.e3PklFH4Y'dJ5 Yv ];)p0S/j}4YKQ7 f!E`Str[aYO:<&9e5s\\\\02N{Dha`DC:`GsA>Ob4)%bpoE,$H;p>5sU]k-l 7D\\\\>do>%`|>L:9v_b&KppB?](Z>;P (I|.}/J6VH3=j~./`?<'O%5Mw\",\"lastName\":\"MG h,jbC9niD2hdG~P|`kR\\\\CqJ]N~)*PVKGFN@dRFEybc08ejCC#[%i|4\\\\OO,zU%$'t*';rQ6nk`[.fXk}GIUJ9,!$H0xUZL&oC@Lq42`^R\\\"MP ahsx,]}EW|}lG4`yf&7Q#s`_$IZmVy1;J7D*]l#i391j~T\\\"7 xBT)x<K[8Ak~n;4[Q\\\"#e!2V<6IJ:bzqXq!I#>()cdA4y~S.@S$(vR,u\",\"password\":\"D'q3#NH>m,NnCnwQ;B0}!3`0B_t7f98u;D>`G&UpYK;-xHe#68s%.?as t/\\\"v#<20jH9imB5:LD^}SsvJr|jc4 4Efs\\\\E~E#6?[WLM80ca{lM5nk:Ek/iD9> (M,9aV$V[4Y*%Ax~6>o0H$*FDQzHrt$I6U1w*TD!' k1o9`1b^jKk#4VRxl6hF']XBa)xg}M\",\"phone\":\"`50.fLs513$~657~)*G<+tFAcbFZT6-;@WNk&u9#pY0QeqIR#$y3dR#B)+W)_^\",\"id\":-4593408422343981267,\"email\":null,\"username\":\"y|uy!r Gk8|hE>&`nX7P7Zrt[a-\\\\&',GT#Vw;Oymguc<<jA=/rRRwHMYBze6PL OLW|#^N[DTu?;!.g5X\",\"fnkuez\":[],\"ljcrlaepkceiz\":\"\\\"[]3W\"},{\"firstName\":\"}MAn*nOzWt1.4kd.tV|6-&hr&NwHvHzvRXN9^CRE9e'iQGEwz]knh|h)gNlVY,L)DJyT&^;#v-g{kwWR9gpp@U:H$~PLf]9z9-vrhvEL<x\\\"Ef,=;tA]Fo3~6(K_G)G)07}AwAq#& J%0gq0ex\\\\Zu0D_CS{0lcwF-rS|%LV]mq}|lG4]?t(uFa+vLphld(a\",\"lastName\":\"\\\\B!N<(yt6w_;[IW$;m>i<5^pd8K;$bB{7a$/>xadCP@V#EP'.j~6#g?fU8O^kw$w:VhS|NnQ`jzFN,N^5WY\\\\x\\\\nFxY>8HkutN.BKn#uY 2q0\\\"!saz7i4oNpnZefWkYWn-yX2LHFpHff%ZeK-:2:V8Dg@x{+1Mb=X1HP1hk*OVs8D\",\"password\":\"y,if&DC;/u=Zr[6b hiQZ>Q[m`%+JU_ZK6=O,=bUlny\\\"[P*@a2Q=Lx&|N#]9#<=JR>H3LWoXf.sXF3n{jmthJSY7d~$EQ`mj3(x!TlVkMM(ShV/_N:RZJsHytf]=|l_`/(v#}5yx+l$i\\\"$ |!CM'EX}j3W_-]BveWN(),_QC6v[3md7\\\\\\\\rBdzzoonR[Q[<<@1Zs&9>9XMI12V\\\\`<QJ}`e4oJ$1lM<y}\",\"phone\":\"dT)GTxc]T|1:yWe>nw,f\\\"{i!p/+]LAy|KG%9Elkd*T?;FP:L7Shyj)qF}@';S_}O !>Xs#)}}@zMoEj5'^Dp#zkT7;iI!{?l.g}<9 T\\\")v{..5(hw.mBc&vL~GIw;/v|94W'e\\\\p} 82Ol6<(BG=K!ng@8l[To@2lWsB*>$\\\"(xb-TWj/_nBp*s&SQ}:@2Gyh{~W\",\"id\":-3823852498013688773,\"email\":null,\"username\":\"6uw<e;X-5qo-X}8+M: e4D}ha1oU\\\"1uIkV<C9]`n0{}6jU7rmz YtvFV7\\\"\\\"%*>W1huI]$vPD$4)f'?oM,hI_<6MVT)Hm8T0:^-~dbqX]FxkQr9 \",\"cccrhcpkd\":-56},{\"firstName\":\"sjGU/RyRQPMO^X6`g; ~.J@pO\\\\<+I(Qg:DW27e;3?[ELL(y%T\\\\]R;'Gzf,IB3~Lkz{tB3hP;#zWy(#JzY>}&IbR/+Zj+3i_3A;w47oz5!<Y},>[lUq}/Xe2vr_t!<!v8Qljx(hgcr_I{p&1>7>:6zY {ahAJd^sf 0`)eL4/R!DC,QY(yFs]yc=w^@r6j0y\\\\_x3UXox[{+tO,q\",\"lastName\":\">4$<VV56QJ'd`0,/eRh=6AA; the7q04!tzsz.'3=a;Bcv|U4W)!$~$%<O<m~S.*+]3p'3DO'g\\\"L:o F*wxSs]Eda$1?,*zstJ\",\"password\":\"H&OkPH0U#'zO&cc;@m`?L.B;nx%`(FoJY@Xt{JiX,J&&Xo>zR8K1c/@e:.w5l3z&6g9*u?tKHA>*%}>\",\"phone\":\"/ET&1+@g'bi`T?HWGkPZM%E_Is)lc^{u3U;rU9N;LAG'G4'\\\\LE`~]5M*hjwcH479vv(`ty%%>>Z_9s=54tfuom-Ni5L;Q\\\";A(x *B+Olhu)IPIUdZP -&w-YQwivb4f{t=*ck-f!!\\\"UQ3O85w}z-Dmzgp5H`(Q>4;hsXjh2Q|v1Q\\\"rp~)q5]Za*-vw$z_)!n8,Vv0Z]f2M^h+\",\"id\":-3075403960784597642,\"email\":null,\"username\":\"ml/k_bM=qahHp$(&M2oSRwPyL'CQx\",\"vfsfaxlwc\":{\"ufiohrll\":852.9}},{\"firstName\":\"pwk%5.!SE}r+LIk6iL*c5bsw@Y|hTM(aXZ-iVIRV9bNCF\\\\<_@\\\"w2`J\\\\,%z7KK\",\"lastName\":\"\\\";a`=B[.zcL.Z9=%#S|Z7=r[A(0J;OX^y(Xzn,o0paigAuc=}8 -^o$xr`4;\\\\b1ku;6<x#}Zj2'L4N^a\\\\'jk.p_>BN6]HU]vfcw,y+);/CUO4}:(RM{Z.uU?)^KCbT sb:Ys_MLT_ws7)k'H@G2V:cc0](\\\"fuXt>IR<Tl\",\"password\":\"8mI$B!! F3?!M[&S^I^AB73>')Gn_3@nJ\\\"iHQrML7ob(gD\\\"0nOiz|sKXnKK_)dmqJ7kcYxva>Z,HHiyW>q6S?&b`?oW~x2XSn:@}9.85]i~Mq::{I~g\",\"phone\":\"R:*p70:/l_Eo~f'#M=&+/3;$%{~v/ouH{EpPK^{.Wj4eUzX;Ii|p~<iN LNNxBc;fEEj_MiU2Q|U,tvim9U7`%rQHSc^LI #)\",\"id\":-622933538529070777,\"email\":null,\"username\":\"0[TD*qK+Ql&bl.Gs6r3w>Qhi|Zw*]th>gq>2TN]\",\"boi\":{\"glgyi\":\"5\"}},{\"firstName\":\"Q]pLT/ qZam`\\\\`~#J/'^GGqjc(LcNAHCNh|<O@`0?KXM-%L}nW4Jvo9Y0F2i\",\"lastName\":\"F4\\\"7? hdB<P%^%r%?jvC?p?<N>)R)?Ze|Rc@kMX]Z<hG%.H{:ZRtG*oaE\\\\(Z;~.iloU7eFykJEq 52I~UMR+M!].|:.2v&,.{ H{#G6.6$~PmmSua43-U+w$mH>Fe\\\\l/l=|Qd7.s<j!1;\\\\yEmc1/TME?S;WZIXaF\\\\aDTAULC0yd.Oavhu.ScrjJ$Pc7ZR Z]!0[?/S.hyM+4H]'qU$JSgPXy:Jg%(tu?,nEz.?Qy`Vu\",\"password\":\"{~M#,2&KwED=HeSA3V\\\\ISD^HQU5O,hQ/sUspdjjCkyC_W<SkK^E4+ghP,W]gUseWi]gE:<vr(6b#/DIy1LghL*@1MswR^4[^?m=VaNk4zm\\\\~+jLPI%M{7rP^Z-TaZg3t4eL{xI\\\"nOhn}LBIJ%c?+>8.JG@NyKTH|[S]X+5F'p#Nc'vvG<,[oHeCszuq!D3^hK;l>w.~w]_+qb9bKMxI\\\\&xk7>M72EFuS\",\"phone\":\"\\\"p/JGX9z^I`bxY5C{O%\",\"id\":-1408684007506295333,\"email\":null,\"username\":\"zB{>G{V%\\\"tL\\\\9p,gcnIetv(86Xkm!+>e(p(HPsa1cg!BR8w{r}{?a+YTe[Dt+/6Gbb<E)E.q4|u:>8'2eAiUmi\",\"incdxbfclfmib\":\"9_}`|Y\"},{\"firstName\":\"-&,e/zs4yz5kuFy9H=:r21=xeh4\\\"&$%Km(}7j\",\"lastName\":\"k33`<&+KMf]*j~{;]S1iX6*0gwWSO~#['%jS`PsoT+X'V._Zv{\\\"=^ZK[{9e@R3{wvl=dR'WXX*wMzWCsnob)89&A-TgoK%/+T56(_~h9fW+K3#1WG]Rvo]:3?MBFYfmF^tg{)^\\\"|_9#Vj_Kv>JGcT}|vk sp}$'u}lh?u\",\"password\":\"v$Fgwj4#^vqKN}pM24fr9tTJ<tyKD7/ndUKV;G|GMc.9}sf7xdZ\\\"F4yhvTh0u_goFCXdQ-Y-dl_J1YkPIz><*bTx|~%v_)rUjxiQ5@sFs:B(PD=UIq|zB?1`-CBN|{Ck8e8Z.CP}*@zvQ{MR,xc=7$!FvZ)4at}!+OL+&yfVbT_)9]i8vV}E6<1Ff@6uOOQNU#~Y9t:s]QULe_7,z|nS\\\"{d'K}Q5g1<nq]WQi\\\\A8(Ayk,1)PbJj8hEmu1BP_+?<X\",\"phone\":\"M1g52/Ko:9:Pa Kk$Qqz\\\"pJYM'X&\\\\C`_Axdf|,VG5\",\"id\":-2768639632680564748,\"email\":null,\"username\":\"'v<;u@+ODPQIaXwOoYV):5A/#p4Ql214|Ys&gV@Y:Y +&l6kTUBfm^vH}qw!j\\\\>epOwix2nz]=uCD:'$F,h,y6=1Tdf#5D{J.GYkoz{;B_)QkQs#EH^Wf8[cjC\\\"u(GL&^R5R|]~dyk\",\"uutuxrrhk\":[\"qb\"],\"jwzebchr\":696.3,\"nhjjdnu\":\"\"}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.email.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesEmailType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"yI:hVyI%c-V)7bOHd50&P)%O;$POq(B3?HX_!4f8x|MPEx17/3E;#!!Px[ULKc-\\\"Yjo2*b4eSwf.dS\\\"aItxcDa&B)]mH3HWE!\\\"\",\"lastName\":\"*\",\"password\":\"li`J4=%5mbLD3 -6'K>GzbI[Sm9.&[0uHia=Ci,@<)hK[DD``?\\\\y~A?1|u[dfGDKgDEwYu#A<Y7sR6KaeX`MI%N=y*R~c{&a^ =l6ahc(/s,{[lv`NmK12{wXbS0\",\"phone\":\"e*Kx\\\\ im,<fsV54^7#{6,>7O>s+fT];K, F3`?!;B17uF?>8ceN`u-t8\\\\Qa'E5X_V8bPZ}>/TfSaJ9/x*U=&_g<Nf-MF$X%iAD`pr'G<3LGVSz#C9paE~p' i<g{)g3}-A;-p.X**&?x} 5n2{Pm}$U&]tB&TCOh3W4%#4T&jYnyFj-[$MN]=HFX~pq</8sh5?jj6 \",\"id\":-1912946293701385177,\"email\":[],\"username\":\"151+%]4Ubt2v!nCUdL4f\\\"wyk,uNynu/.FF{R3.o#5I-2n0zJtUq-&6\\\"~[eZ3y0DXGse|LI>-+#5]qKpxif6R)Ck@?(%&nd%X4K7A3q7&iJm!.YD^FdBY46J$:{I*NG,Wp,`:U0dcR99]K'd,Xk\",\"vzso\":[]},{\"firstName\":\"s;K];o}\\\"UiH)m32&dUXH31SO1GK\\\"I3Rm%>j{4BKVWg^RTWp66&wDS_B]x}kJGub~+Dur:eGHrgY9w~WB9#!yoxl=*7l;cHj\",\"lastName\":\"+9O_Hs0\\\"o]?\\\\9[B#r7Ll9c^`/vWv%n2JU`Q\\\"R$] Z.gfr/0j2wCTM Oq_a{Q*Fpq[+]cJELcc`2<B%P,NT;r`5['l*'NyDX>]c`>6 \\\"704jYF$n]wwj6NIqxj{:zD<zM^+\\\"nH^U,Linv?ON%a)|Sy%{z3|'{/!qT8{0'K(8[[^!}Ul'njx`v.w,T+EH#JHgWY\\\\U\\\"Nt=?Wcn~U`.GhJ\\\\\",\"password\":\"{`]Euk{Tn0FHtar|{|~g;*L\\\\;_,dhV3NND(w0^k*Dq?OM?\\\"bfrh-<.1G&' .*p7WWwD9@F|+(vw8wanV)/6#*b-C5rf+/SG&43GR%v^'VD})c.t)~)A@iJK|u5ups_ZQh'i>Td+*zY+XDPD'K@>#\\\\2 7qQdk`U(R~K`]tb%T=t\\\\W}(3z0UpHyCJ+<\",\"phone\":\"HMv \",\"id\":-2563528684147102987,\"email\":586.8,\"username\":\"^+(7{#%\\\\NbqV,Xtqt$`;[$7dX7^\\\")b%o+`J3MJ4w\\\\[JCU2&6B0t~Sz4=n])sFPhHbEb{Pp4n M}{l?Hy!\\\"s=bK%5ObC:xT'&Ur#>Q;X1~ R&b:RAI\\\"mUi#g1V3?b6B&[pC2]~yPTMV@r[zWxCe\\\\1L@,fmc_H5$YS#}+W_\\\\=U1/8a1AE$mJUJ>s.ftg|6s~$#gf:QU@m]nI$/\",\"koqm\":true,\"ctbcxgqifqsbv\":-433},{\"firstName\":\"P|\",\"lastName\":\"{wVx`y)_616W0rGX>H$>Z>pPJ*'kCr:E>3Cm6B.|6/F.\",\"password\":\"fv])&6H#Li\\\\NJTI6T=F[\\\"\\\\,qcpm$ \",\"phone\":\",hEeOjX!fU6fx{]tC&BV{/+F0$Wb8AG'{$u.G.=6AesqWUX)f%L%l@P| |`p4&{;TQo_LcCEl4KpjU(O[]F|eY`~ysBV6[B#->B; J}QC%V<|2|/,A x;KkEMlC:UX,N?oR1 oW`II\",\"id\":-3115461347336352129,\"email\":true,\"username\":\"eM7;$<qVC7\\\"vW$*<~wg2G AEw@E[Uehr5j/&j\\\"XR$Yx&+%VFr;!gGJye':\\\\o.Pd`tz^,o1v9Z):X=)3i:Z0.SJP#`.0=[+\\\"]9-oda?N\\\"%b %/F|4[&_4mk]fao.bn(9btS]M{_\\\"=11yT`:HNg \",\"h\":\"4O:|7n\",\"kifq\":{\"vdwuawnjmkmucf\":[]},\"qythvha\":725},{\"firstName\":\"#2\\\\9LOd2:FvD!<bu\\\\M$e6|qDV3Kt^sp8j S\\\"^nUs7JJ}>LZ&Bs\\\"Kl?hirxpLWTYD6jUq+8Vf=DcD2X0V1}m]9 2+WOoq3P~PE3!<*&\\\"sd:#2$>`dtYaBA2n8Ft@Dj1~dE4ld|\\\"X/WK:R\\\"Fgf:+Y8^{AEQoG3tJPYs%T1g4>n[\",\"lastName\":\"69t7N(9bV_>VJA+E'd4:goLQc#g/D S_?tAT,'*nC?EO0cR=+totH,ad0{a:<_,=(t.(;8S1lrWqm#B|c%[<TX=^f`xKw_ 0j,rHdCDfD}eB$uUy^PC#/9l'(a%t\\\"x=+:('{>d`0>\\\\aYNsZ;^Q&O[.H~V;^2Bsmt\\\\'b$%4MT2Z\\\\+[YKS>6o?gH>g_A\\\\hL9}c#38{o'CBd:.X \",\"password\":\"^@uvvJ^%<Tx%>*2fWD]8^GQ{5k@l]l$e-^r.H7FeYb~!KzX2+!_TpbigzAv4=rueJmJI?3@$G*zyso\\\\_|n%^QCxrLdy-h# ?=%hVgp1':]H`ycI\",\"phone\":\"-VzjN`.5[pCb#'fEkunLp1wK8pY#|26vnQPWX<|_?W_G)}\\\\Qy!N|$3@3$1Tm~>oXeI<\",\"id\":-3835020761768201496,\"email\":{\"tfiuppv\":\"} nK(A\",\"l\":\"UsCg\"},\"username\":\"yJ@@M\",\"cuew\":\">\"},{\"firstName\":\"#`HIf/J/$2d5bY<~\\\\av[.G:_BbeKeIFcTe.-kD5$x=}ED|aFte.0G;0pT<vC]\\\"S]KlVV\\\\G]xJf~)MKl^eG(och([#`f[D}$.>W2=/\",\"lastName\":\"oiGXU7V:(~aVgCJqmfs[%WP/41G|Sj#!BL/S_0z\\\"N2`~!=*J:sZ&{%&A88B{hb^AquFoS#Z<UnKjWA0H;8=r^%}v,T3km:xF%8d ;j\",\"password\":\"e3>n8\",\"phone\":\"'AA|j=ZUY@;C5c{hYJ|}VrV3u@22EN\",\"id\":-2252585763708130464,\"email\":[\"`ZAfZ@6\",\"{KQ1\",\":X/$[-M\"],\"username\":\"Y&OGUaL#O&;^GKE#D\\\\t#V::+E)*ki;Cf.S)v`FlFDr 1e-k=af>d]`3&n1zXLEfZ9h@I\\\\Nsv#7:UA_HKYAD OPsWvS47fRt5p\\\\a)7*ne-\\\"k2h98QCsw/#^\\\"/4im=wEl&h3Y<8HmjSNL\\\"6O6QU#sqnwy!rY)G]Fa4xV6\",\"dvmmgmsgetxvujt\":272},{\"firstName\":\"f(RYJB$^KQ8tP,U]ND=rZj?zO-}tIZ-%dvF*GTkuUA\\\"?8#{aG3@wBKyg*/bze7/i&JD}>jmyYJ7kQ7ib*A%ga\\\"A<d4o8hY}T1;P&jJl[FkyjvD@02b~qTfa,5@8}6e3e1;C!e=1~qH{Rm@}H::Hy2d!.p`tD+Mz2zX`nZlT}B9(Z[qy]$t=O6Q@mt?g$yyA;V$)y\",\"lastName\":\"yb\",\"password\":\"LoFsqb_xX?+[e.M-,@yV[oy$rwKeg,W-8<2LmN*#I0b]A^$-)?4olm3m3lT9U[#[xVLJz\\\"YdR0j8d0_l+@<fUe)bG}ad<{>`TvtBFPGp8|V[}Q}|*=.MeR/$n+snAWPYZ*4<O}sG0m'j*1$G4o|ER:$[KwM2-yn:jVI1jm\\\\ps@OunzVdBRYF{r[3WkqUBjUzX{ D1B)Lc<8& u=h.Z8b?fCm0u+d;IwTEV1<<nv;.U9ruxWd:\",\"phone\":\"R<NA7xf>.{vc\",\"id\":-214046607074995564,\"email\":{\"idcwymiaeadwrkz\":[],\"hdcexsgigd\":-103.6,\"ou\":[\"l\"]},\"username\":\"gxBlgU^9ER|zTOj\\\"6GfR*}'euv-.h1t`fIIJ\\\"dZ($.+}!NnU-w$kC1.DtNWm,a|uAndI-As&3VKnZC]w7:B3%n3c'mpihW>N2Os<T&19S7*P?,<m%V86Tlx:GTR{J\",\"enxrytertzf\":303.2,\"hjsnfplsyjb\":470.2,\"mzcjswbgked\":true},{\"firstName\":\" +YI(Nqp[zc+`#Cj:oWI]u TI+X,uEZ+Zb]@y,k}X3C?(/ xiYrwY32^ISq%]_g#v6(bA#Zlrr<?D6Jggaru{3,$G}l#kAspkypg 2HOR$<DJh#!Ge_rm:Fb6+Mcbb%dBDs~D$U-mGo wEl;&|a^B%y*[`l(G&hdn9d'W)xwF-S33/&DYPqhYwG,!Ez\\\\5krn'WyO/o}>nHhg9Hi#,nwDQr#o;Q&:OBO\\\"FyW\\\\HqGHD$_'e\",\"lastName\":\"%we>4$\\\\*SPpc\\\\Cdsr='[\\\\3J76w.XC3XAJpP(C'5(fxB\\\\2+7O@c S:>iSizc+hMYy[P}eJh_.GcEu)e\\\\M~Y3#>ie`02h*5~|OayM;o*@YY`)JAw'R,d`]2&RRQCm[7~jJ_ ~@$Tm`7d(X>77s6>U\\\\HdxJ`12dQ3oN,U00('lZ5CP\",\"password\":\"upK4=M'TW,OF]XV%P_=(W/K36D&`f!n>@y+r%6X2Lni;cUqc\\\"sH) sQ15F&J9jF~Sd7\",\"phone\":\"rp`E\\\"0qS 9/XF@8SIl)'8ywxbxJ~ 'ZIZ3|GUj{+&GHLu.ZbK,[NL\\\\fzj-UA>[$X\",\"id\":-1774109808049493301,\"email\":[\"z*bXA\"],\"username\":\"w>Xr5f?fUb{NNG;,\\\\6Yr(xv3y1$29+Diz3'sXal4xs[8ud}%K:-v=MU]h|w& HDU?+UpY!PzhP$ac~NC@,>WlU;(0w/fM-!Qr;4P%/HYeL6;ndg}=*SG`akpnCK!(M>~{gG*p1HYafUf9.[cPnlh'']lTlrxr9VlSZ)=z!CUb`.pi4*@#!FfReb1uE W[wZ36bRXhMbmh%}oTpxLH$/j=?[_q`/5<Y`7\\\\^:4JZz|Kvy'zX$\",\"xohllyt\":833.3},{\"firstName\":\"iTMKp-ZQtTv.[s,7=iUhaL=n:Yh}\\\"vh<iYe$NO674rey@GCvjxV{?P;g`l4@dov?E\\\\4+cgA^{bT.yQ-IJXFf^jEE)+-8\\\"=[VPO~aEu &C 8&\\\"J5K SXJheNI%;a1x4gd|d>\\\\&Mw)VN^lyn5\",\"lastName\":\",YO80XL\\\"8hAH59-cbOTDDRR/B:h'tYd+A@o@U|@{YQkV #n\\\">\\\"#SJr>vt[Kl\\\\g+\\\\Ac6MEwH]{;HVI<pm&Po?{]kmPZHT'N(>(\",\"password\":\"5PA[zba~:}p%.Oyk2yy6?]$xKIxM3X5\\\\8*:]:\\\\V=^k-ZB:0i2]LUf()V\\\\*TJQA8O_PXjU~9m\\\"'k]`*21*weW*EDeN4.X^<-.6LvL?Un uEz,SPQ;n.@,k(WG^XUs~TZJN)ggD@,wGR-<PlD uU{4|_/EKHl`!tg\",\"phone\":\"C4/o<{Fec$-SjB:pqdxPBF@k?m+K~GKOw=8;XNEv9VK(~,55$xV1G&F2l<`veA:aF\\\"mWcJf8Dbv|n5urm^6.o~$2O'%\",\"id\":-2211282301486171533,\"email\":-698.6,\"username\":\"B}Qu$&ac(fQRqI2'TxF5c*Edp{/>^9QgYh(X{7dY7*>P+?*4R2.Q,,*}W~\",\"uvdhhbl\":[\"phe$P|\",\"k[Ze|Y\",\">W\"],\"shgstciekcf\":[\"GM\"]},{\"firstName\":\"p=Y.42wH!#d>if#SGxyLE1h>wth2d(mQ\",\"lastName\":\";n(H19^k@qY/5kVG.2AIMM\\\"Q)jpddL-{jb_9UCq:~!!nC'IPZcCp5uK[6.F5Hb=&CJEF0P*q+-QZ,HAlWSof,}qM)``>\",\"password\":\"^\\\"M%8GtC/B4,\\\"F9_Qh|_VhDj^bjJ>Kf\",\"phone\":\"#F9B^(HPMFBFDd[\\\\,-ecdy,{R\\\"G[b-)/u/-er$Iy-kKb.4tF{`YOu'3`>3Y,% #F~_|@oUr7(lQUHPxBjfxbV4Xp;R_\\\"t#fpp<\",\"id\":-1171467857059048942,\"email\":[\"qd&#\",\"?\",\"f\"],\"username\":\"5)vw.ESAJ1_a)<oEaamjrXLfj=?=Y4g)rr;pvF@ggC69f IR52<w1B!pz|uP.%He.CkPt|`^0@97=#]Az~!(eIw8yPRO3CXRF]5k(n7?Iv6~i.4$Ff{zyN->A /;^K4=xfCljN\",\"dwbm\":\"Qk&\"},{\"firstName\":\"MX8WVI2)$Y]o^VvqRa2_.:/f>esL{x/XU\\\\#~Rb^U\\\"\\\\g&_|L9\\\"./D*CIDi_.RLw\\\"Es=4AeJ>%L!5GhOlr\\\"`'xjMB;]<E DFNO&>7E7M|;I%cK57*l[88F&k(Dy?_\",\"lastName\":\"aof\",\"password\":\"QU^$^ &f)0\\\"CUznG'c&(WtrMZ^xqNH2Jppj)Eq|`fQs4S8PW?bYH`W4X^_orWtzAX><.@uV\\\\n4&owO0*fONe+)g\",\"phone\":\"Ql'mt#,kVmt=;\\\\l$e(gvC>'Y& `_k#:6\\\\0a{@CpwZ3Z{)PWmZYTVJ}3VakpN?bR%g~Rt|k-`oFKTF.Y^e3<~L2(`|OXoa+kPt!MoOgE.GDY2y&J=~LqsZj'P\\\"y AVNQ]l3C<bzq[[,{<x[t|1$IR|$X>CzK!_BlM,~&Z!MT{i,A6MHy$)K%'W^&IKS])\",\"id\":-1284357676811910350,\"email\":-125.0,\"username\":\"j[0/<_66br@g`SA?eBgF=DY%S)zb=6v>,HIg+J(|>.ngR\\\\LcDc{EZ%oV wD;4<V6bB\",\"azhqcmufcq\":true,\"uttz\":true},{\"firstName\":\"YA+?ao.%UF5lJ$@eP)QZ#.kn`8@V,7,amN&Xs,(orW0E2frfZVX1bk$euGG^3D7N0E#6IYx-p\\\"B\",\"lastName\":\"=9@Uzq'0XX@rhPaGAza(`tIEG3/4JmH4EaS:{a?M}_T:l1-93ZBd2$0YeyO<<S[<2d7SuN*g;{UQ2!|Phk13`26v8})]8ZVp#\\\\<Ui/P:#)l-X6,Xv4%611J{yO3/Qe3;\\\"j+3vEdY*m~bjN\\\"ts3PcG_NO`V WKHMFy;Nsl$iL'n~n1!ur#^Sf1Ys|@=\\\"EyAV%3KNdi77+d`e):1)?2\\\"D9Q^LFA|vOLwpj8J^dcRrMmy= fiv:Q,Jfe\",\"password\":\"wNYzBCXP#}.Jf_[e(:n.;L]=c~'ptB[.Vp\\\"9vt61FWI90IOh`~0Q%dDaJNg=n93_.N3OKtKi15F:C%`8,!62?SA}@/pmh6PG2]^M Dt_i9W r%^0.`jhr*fe$**EwQR\\\\-YQ@oE]z<.VttSY((3T?4rz%u<G8W2V1)mW7x81#%^']0S~]+VyDZ5%OwcmSN<a%IHc\\\\5':t+\",\"phone\":\"6&/4!U]OpK+>v^`)L-EySgmYs#L1\\\"Q\\\"OH205:aU9ftn>9Pihd!.|, 2[@PFm2OV )p/!5s8bsp\",\"id\":-2078617230530904375,\"email\":-654,\"username\":\"5y/OS<XIVHIR#?4MY2jH=_jwfag?!^;x?uH6Jl'Orb/kU>6FOI3v81ST=7'!jG_0rYff/@}Q@Kt92mylnORG'd.{-%/(,@O9:m@Jg hJ;uM^nwY-nw{\",\"tivjkzmt\":\"!uyLANl3\",\"guzqcqxuadqzxbp\":[\"R+LOF\"],\"duljmbdvvp\":[]},{\"firstName\":\"9%BfD65+[-!~B~HlWss|>f*&Y\\\\)3.ceT[5\",\"lastName\":\"fN!I;a:iU8m7\\\"DF@i%qs<K:Fl`&:O\\\\#'&<S|[(oM_ FFuI-80Ah`5}=~Oil.=0q$#>l-SppaZ*_><z*&FN+Q+[_TbC')pKDK[vk>(y#Ya$6^#;gg\\\\\\\\L~h'\\\\t]]Gga6x,fPf:`\\\\Qb=V%8}A<A\\\\bxmBzqBnXuGGOys01)&ZS%,`p| ]vfI]S7CSyXmB[cAAl6z$?Vr 2BN(e!%r?\\\\0ZhjA{d~A+fJK@ >#u`'P1{{,\",\"password\":\"Ud\\\"Th_;iC1:\\\\X\\\\OD4i3u(|vJs^d\",\"phone\":\"\\\\NV\",\"id\":-3508308119407596714,\"email\":563,\"username\":\"r}&KJO,@*+V?Le! %4Oek4,w6,tFRH|?9#kPhBzBj[7IW\\\\(fe q&t:0'Ob-PL(jv1YDepBJCFt&~(T[P*D;B%bNervJ\",\"ue\":{\"vpvl\":772,\"c\":[]}}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.email.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesPasswordType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\";ZAq9IK<Sy\",\"lastName\":\" ?]5VvK-(Kxfk]sf~pg]N1)\",\"password\":null,\"phone\":\"^$6*98!Rzrs'\\\";}UxJXvL},(uV&Kf3U>:OD5mFIjdfwPcA^> .NH|O{Q0n|l7f5oO~lFKgi86?,%+~;JiC-g(/9K`DZcIq*vz?;RNf`|KmR7u3d9?[mX\\\"L6~1M`PtQCT7a1[%Eq?{x9r5I& >KEsd:A[,$:OAso@LvA6]J\",\"id\":-4096615162362476995,\"email\":\".2:_NSw\\\\Eey)UV.D&P;y5THBJ{vvmR3}9&0AAZbv\\\"6L\\\\*o\\\"0,p,AdoWZhQ4&+,:oI9 <6H:pS ,,1mS, .=\\\"Kl94S$l[iB}@bl\",\"username\":\"8g)o+?qIXG dJaU1b|{wf50t[\\\".?5|q;W:dR.BA5?I!w NpCLn$C]3I 1_|T'\",\"bbbtgysfkobj\":\"=\\\\\",\"oywxlcknaobayu\":892},{\"firstName\":\"s/*5{E%PI[ON6DH@Y.?EF4kv0m[<8aFxp bb2RQ_|!2W2yQ`@:h&N#%f%N{91CIR/6:JP6(%*@!jrz#_@:B2-o-^(,]S9< (!GvU+a~RY\\\\z\",\"lastName\":\"pvGzo8So0po'nM.\\\\i\\\"35,joo8rHc%dW*zn;(+HRMfssHJB)7#)L>q]NvJK)HrdW7_s~N1U2OZ{qbz%IJ*drn[p|c?=z0xN:owSw7Y?T3wX3hy]qca3_-\",\"password\":null,\"phone\":\"mO*R'l{[KsX\\\"J{)s#d?[Mff-Pk_YE1\",\"id\":-3371309706990900933,\"email\":\"^&7E+3YcAEe*d3zCX'B.3&YW* h0\\\\MmCZE]3ZwkJ(&P<pNJ<4J/mFk'zbo;d<\\\\?7&g/N=r,WCw*v~?*0UU7w2TZ:7J]*fah3.eZH92ebAbA!|+L${l,TE[8F\\\"J\",\"username\":\"@5c.Q,E~kH%O/$Ur+^%>t=!G~BqDf: 'uD/)> o@\\\\XJCmk+;Rqf-@_r'6C\\\\{u-,4gtjT[n,(QO6$Tf_V/)?)9VxGvnU5=\\\"C\\\"oSu,F3RgrcJ!M[WL:Cw\\\\_|,Kn1DMrHjD|0|5+)onkhVW.p^7hg|~TW\\\\/$sL\",\"fanqywg\":[\"y\",\"8;k;ao\",\"8\"]},{\"firstName\":\"wTA;Age[Zdoc~2sZKQ1UQi.'%MOlckqOU0|Q&@F1M(!G)VZ/C)b3IY}E91S}TmcokH@iV7x#$pC>_MK]QJYw~r&-07d|#$(n3^%Ttgiq6{-}<_v-z'bZUTP3Mu_kSuRHpk0j[bLc}H8&3E`}waLEf0y_T)-''`5[ Gu|y3~&i$2pA`~)Z_N Jv^9<oTale[Z'< 'v[,oaMqd=|+I<,IL;9)s&\",\"lastName\":\"6^@f8eH/d^Z7EZXJ;D_5NWVk\\\":/pgiOXO3C5b>>$B}JGDO><fRp=FW10zd2^??~dM+02(L'p[O\\\"Vv{ZdQ!H9nqwuemrG-C%mn\",\"password\":null,\"phone\":\"^'/{ LP(l4P)#tv>;G:8s|.:5b7!mV!HxlA]\\\\\\\"rck<f;|`/p}TEU2G::do>t{7U=h4I0pw_s!B*n>6Q?c}bbq'O#qRQAXb~i8<_C2lxSWy,5B~4z#R8Kz)69E` [LVTCU/7k56(orvbYJF[qya7C57#^]GY%>Ibxwc_od_E)]%G<G`136:`Vpg%`5grQA!HbHrV'8hSe7Xo\\\"P*cZ5Shq`df.Z\",\"id\":-4174797274236121141,\"email\":\"}4>6KspKd'GZam:%M093ywT6Z:?_Lm#2fVE,][J<d@x.}h%v?K_yQhB&@9<\\\\s#!V:/cBOV74;f.f{$P+J7Fa@*6~^oO`yw@?i.fFgJ95T K3fmRW\\\" |VxB@QC.a:RZ J/dW%&Ck@HVqC\\\\HTp.R&pjtE+X?>sRT;:!Lz#X9/NC@TgHcP\\\"/x!>B`t8/Zg?z@+`*[j8018 ?XS>>yogY,t4D`UoE>'\\\\ZWv,YGo{y,lDP[SE=}Z^2]wNRTMPDE'\",\"username\":\"}ZQ~+) Afi3]GDid%XmnzRoX`hIN7^iP#s$Z,U3*-i>jqo4B0XXv|NBv/6 0{W1io-3fQEIhph^+{Kl35Jf?5WBCsPp:@~g5qesc=:5M5,[TL;y{yL0aLi]v9'coMlu[oA/xM:2mpQ4\\\\f5np-\\\\\",\"lmwtbtvcubgfxla\":true,\"qpgkbmkfqfv\":[\"2( J\",\"-}k\"]},{\"firstName\":\"ILt,e26v?2=b:k@(*u`gG+*g8NRTv[z2zrYP,yi:\\\"Kxe,F;X&s?8\",\"lastName\":\"Vc'qG'_zOv&PGj#p<h!F7hlK.3j.sFK|&.0*>-15{ta0kI!X!kDs*<?fA;F;a}@6T?]'gfd<y2x,r(l.~od)\\\"pR|y*;;0a/~7:7mqW}D`4pYc:%/46!H*&6]HPkqbD;1[B[|9Q|?m9#1@^sc-^d,jjY`< GpAr_R_M`M8FT@yAEUz&d<**IzL;'qI1-A\\\"&)luYs)wnLcPwo;.BO5V2c{l\",\"password\":null,\"phone\":\"_ceKl8Jjpga/!*+`xAUeJ2;N}(v{oB66LI/{H+w5|1_\\\\BH\\\")\\\\7>DFm{|^8MwkfC05{Q`;)C;9+(7oKZ/?cg.[;aylB#=-<W!J#\\\"\\\\'tY&r`E`g~oi\\\\SATpYa7;}A)z3DaI\\\\^kzh7\\\\79`\\\"fsFL`~?wd\\\"hB&TMjkU$*g,kOFYxy-R?Lngf<}vD~AmMBjtk$q u3h1!V(\\\"X]iLr^%\",\"id\":-3077490502057312536,\"email\":\"r)lJHI)]&6':zn0NW NYj^nJpK\\\\P>gAfFM)F@s7WfB'qh,0K1\",\"username\":\"h7j8p=*3cW:G%Hd*-sRM'$t8>RmF7eQO_ni-R|_rh=y//<!xJ2}g'$hV>.{up ?vcC2E-SF\\\"-G5bp3jpACv~c!Tv~lEPSgd\\\\)HiO?=mg!Bz>/E]pBNY_<# _W>/a?b=VZWl`NPXTBy,'lIl,v&JT)*pga!6XF/@_-_NHG_NMCnK'&VUs_5!hD85.di<LW#7Ypk,/jUE&_Q3F9]z~R~VZdLo feg~*Z;;,z4w5m6\",\"etlewdlgp\":\"LRyY`jS\"},{\"firstName\":\"(:SY/DJ d5/h.R.&.7{G;JEs8\\\"?}K}Gw@i\\\"8:ekdS`oMe0VyW==.~VOJii S$\\\"_KqF&w|u0A7`x}DAJy|i`j}E\\\"6LYv#FkZB_~~\\\"QIGvRg:A85\\\"e\\\"\\\\T\\\\0&*van1Yv~@v2Xr<Pom/v-s!C/.,jvgLRE/9XYfE(9;uF\",\"lastName\":\"dlrY|_AJ2}CeU}]nuGgm1U^?8\\\"]9,0%Xfkdn$alo2ZZScHl<fXyLavb]>aveDpbHvnmNMWOs'exU[ct=Rv~}?9dm0)O0C<7y\\\\qoh/`H!QLtnBGn/513U%FDV^,<L}[p'{m0\",\"password\":null,\"phone\":\"sj0eICb/>s.('aea;by+UArKW|Ic]ielKA8?X5\\\\%FU=\",\"id\":-3412500505590920157,\"email\":\"p}4IvpFq$.'PkL[i|2tuyRV-&Kr2KaqfL~IDG*CN2ng$s,j4.]J<#?FB*r*w=-, 1,O]8vk<&,HA,ou~nERIZ~ IgH\\\"UO5bgo!x :A ~uk\",\"username\":\"2g\\\"]4I4Yb^DusT%JI\\\"Z*ZFU-2f#1%2Hc|y=8;4m.IPxq@'b$Yv T|;@as(O9\\\\yq:0Eof-5K(o5WpKbnJJ?Ys1BFZf\\\\BB'CWy=Ap-VVd_Elxph*\\\\[biys'$]zuIM6Mqtxj;PDFnKywDG(_>vZ8g>8o3]R]8#^[-x$8v$XFs#2.4q(GD=MgDirH0hiMpBO{~T\\\"dk-aYCiEp^wwvKD_6SOd$T)cK(vo/\",\"unpswmktodjgghh\":278.1,\"niipedyzpacyrk\":true},{\"firstName\":\"4'vS|\",\"lastName\":\"lTmepC2D|)6fdeEQ?@._l~b'6S>3n/b8vTwb},J?=9;Q&XV@lq6zaRI#A?wSl?Z<A;Hnv6N}^PJj$E2-B_@:amPvf}Z/&Rd&r&TjrXN;LNL@HtTY-#\",\"password\":null,\"phone\":\"Dx-'G/xiqfE-,TF(m0Y^@%W=/+2dqD\\\"]5 (W\\\\b,dKE3!5G!-E90H\",\"id\":-3886325984581745806,\"email\":\"-]?bOW$s-n|_9v7nE-V*NmT}cfO^+!\\\"u0<1*iV\\\\2O?fb_<kTD6\\\\mB&\\\\Kn[('3lX\\\"mzl9W'<eSNZrh\\\\F.mfTLG~:`X&x.#o73K8`=>\\\\<p2F1a2.hm0`%c6AkDEFZi\\\\^o7]|1(iydG4j;,&:\\\\sY8LhJjPXD/((GL/|%S';5sWa}D@A|f_,@M2'^4_s%Ln1}CbDc![wEj/H ! o5=7[[lyo\\\"0zkgxA8<W5Smw\",\"username\":\"/Imb)AXqpjwfhU>9jxrA\\\"o=FPYCYY9|Th\\\"N>0%{L9'TVEid'?p6xT\",\"qelwneg\":true}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.password.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesPasswordType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"'KP\\\\KUnWQB#wV%Md7'mTzW>f_&r[c?|\\\\`=D`D#_J>uT-=1OK6pyFm^f-H7DEA1;~'i~?\\\"SFA@#nd.k%#gO@;NJM*mxsQ-i:q9k1C52/e[BmmuN1[G=p~y]IjlI['7:M7{$CJ2x{=1;pa<?};RPX<ANj, ?AWsR*B&I=6BhFz}I}ES22v,ntU!HdfB$Hp@T56kz.SyD<SMlw0zqJ%H(WpVd6Dk#$tXK\\\\Ut8\",\"lastName\":\"(juaQ;@:Q,o{'AOB8(B-gA~)GIdW2U5Y`TP6M=-{<<y1ME6,}Tu^1l[DA,$g}{dR;FeX3<,!~qRROZ>74AOAg)=;jctH.dEEa2h<#G<*q9VLSl3=!\\\"y u0TmzJ|4rVu_PYJZ[\\\\Mz#:=>_&U=4 (;fH>2j?q1ci|_@=G{^{c!s=ph}ARWdjul|o|nG`K,.U b~&m6TD#>&42meEF1Ck,P1U*[-[XOcXMuqO}cfz+\\\\z8AJ'hge+\\\"e}w\",\"password\":-176.8,\"phone\":\"aGKS<q%S znyDvTY=zzQ=s%G4Qm3.?RC:vSHE?nJCwb4^I}:\\\\Om3Em4@axcdfSu-V@?,p)3^Q;AcMSgNJa5M|d2^rt#PZvaBy]}YWAU_y+RWJnHO15:s7PspCcj<gO`sgyetA!Xm.^b3;O/?i:]*%*/k{;69\\\\Tar}exE8~}1#P<sZ0}?Qs%+)1naw'oV/Cx.(LJg\\\\\",\"id\":-1377040000524645259,\"email\":\"  \\\"Xo {7b.7[WzmN-Xt>$z$W]mMmISYb2zgAj[{j%_]h*fAN#YG6_T-~1zJZ2O\\\";QmFd#8-_;FUmRw(`dfj^jen|(yt)1m8<T-)g@Yy:U`+7E UzAz]LXj(Q;zz&>&%;>Fe)a@'ho7c\\\"2ODNdMN1H+,(9Yuc>cKf/6PZ;yuR-{)q/ulLQ7_+9G:yw5P`PJ3GBr\\\"8D+`\\\\y8<o2Dz6d2mVHKGcJ~;5{TgIS,D*~$I'D5[JhVa#lxx!;&|6E\",\"username\":\"\\\\='VN,<eW%5aQ70T$=F&jlP3oW8B7aPLcjm$G.E`DWh|iM0.MS8\\\"zPSh,MN=$jrz>$/JfY1Qxo\\\"RT4uS3-Vb?z@~kH0c+^s;fM57=QUF80'm6_uhXY\\\"]6v?0 :K#UQA.,ke8w84yM}Xl]*WKZ`R0%N|(e]l>{tRm+Fx}46M/JiOAnP'/zDxK.+-^\\\\_-G! ?h/\",\"xbssuxwpaxe\":true,\"iezbxdwnyxbwuu\":-102,\"kekoqeexpqohuveb\":\"(gsnfx\"},{\"firstName\":\"yg].8:s[`R=6F!8vmzP586pkJw4hI*'&%x*QW/Bo\\\"c$S]^g#'`[)AqA`lK+mWm?od4#kQ|>MU:HQmM/s?7n;3V0wSLQamy/6<3l%ccHNCj^OqX\\\"V`jhbJ@MZDB% @^j\",\"lastName\":\"FzppebNVy3gwNr*Am2R4z8Aa\\\\G~TSy!wo!AaB0g~eoy9,L9BN-oYU0B]/`WOLd}fP?#F W:YR51f,F(Rl}8f \\\\Z;o)`dZg^$hlf|s5!On2*Ygu6#-Q{KEnoax;tJ`,g=8_'QY?}\\\"&8&b)O`$:6= d(BI.JDRi53N\\\\wqQOr+8) gO_8?^*2u`c9_$.t8wFO!VPzaU'F y>`ngCDx8&2\",\"password\":915,\"phone\":\"kTK1#;Vs[l4>a0vQ}]ty$<]oA5/zqsMp=n~0M^iuNMVQxIb0vtf0A\\\\(-21knl2{$Em1O\\\"TgyP!3S{4;&SqEADb`\\\"0_\\\\Kuk[nO=\",\"id\":-1653959555890906181,\"email\":\"1qB}%e@O-fM,7W+e]`>{;5(LHDY/@QVhM{~JM55jjjQVI/OIE'}$Oy>XO-V^1wO%/<S:2px8pvl(QZpE(cKGtAhN-=Z8Pqk&RjZDc;L9zc~|2=\\\"=:xDsmbSraXDSj5D8nM5lnu87gNSHNl1S~\\\\oG6\\\"UF5`V<B4vK&c<g0sD{`>9#B(zCOMj$lCi+K$Z{7!R,:NGS jl:ix>U:c0-t #)#7+\\\"DM`0S)Qsj3VSepg.\",\"username\":\"N\\\\UPyfwe8pj/^DOi%h\\\\=+]WQm:PTU0umxx%LqZv\\\"+A [Cu/-e5.?!#O,H]j(38\\\\ 0@%X>QLN0zcL>$/Y0Xz1~'Ng7pa&R(?{.N\",\"navjr\":[\"_e--\",\"C*\",\"\"],\"wgyom\":true,\"ty\":[\"&;E/Lby\",\"\"]},{\"firstName\":\"w6jEym/dG%LHH9{Od+*Q$6pwx0qRvE79|5%6.^\\\\]6Jcg1%RmRE2pElMo|j>zMaIucWS'5r=5n5A)-t22bjG9(3zX k+'tzG\",\"lastName\":\"qx2~,<4K`c.N\\\"50I,GD,bG%lswS/,/Ks:xD <)\\\"r3>[IjUT>-8ZC!;9(:3UpS',IeygBZ:_(fQL_,zqxsJgjVV%qx%7f|^!!$/9y@{MyTpHby65F9&tA$w\\\"_?AGn/I\\\\uMnn+9;jW.`4iUY]@S]qqdhVzw~0!1UKKciuzSu!.)lhr7w{hZuU1;;]JWz8H*y:eu-rg*\",\"password\":[\"\",\"PA\\\"M\",\")`\\\"\"],\"phone\":\"(l(m%|O\\\\}kj/?2N6lV *%l{&%+7\\\\EgV?t8#e7|p^PsBDyn~X\",\"id\":-2579236768377301288,\"email\":\"sm\\\\#xRX'#CWfO5&e^~v?T5 6W+,#Uv|D:<zkN_]jf0A8q!%D>:ue]w%VoA<cDB5k8j_1*&9VvarXVEe-+\\\"),D:f&Au<1J!PBQU+8`Gy6TODrkotUJ\",\"username\":\"4 p~(cL[,]Z6=I.+.y~.OZiX%*i8;#G$EtR%LRzRW|Cij9m>PBi-[.}[t~X;{6\",\"jk\":true,\"xymtgwo\":-330,\"hfduadwetmcehnp\":[\"I>^\",\"1\"]},{\"firstName\":\"86$M'w%6.?'=g(Bh;!C^&Y`IqFto3O8sH^O?mQd|LtWzl6n%<zTZ~DmS}F!{tkk4h0>2kE_N3sU^m626Q68ept_b#IC.y!`)\\\\?b}PB(nKWzuczI $7ya7=7|b60wP,VLIk!N2z!P\\\"h0q*<Ea_\\\\s+@%e3C UxmJy*j@/?mwDB<3\\\"C?]ZoB(Gs3RBlf}^NOd,f[br]odT}Jz!!l?B9Po)rZ%;\\\\}x^J[jd$mJkUUP:.\",\"lastName\":\"2qQ]XH(#xp,T,)\\\\rflJwQ./HRSJgKJH!.2{E?|YCw1p$B\",\"password\":574.3,\"phone\":\"VOaR4GQ!GnjD\\\"v.Z]EzM.VQLzCurgrbnN.w*(AsG5}WYxMo%v@x<q6RCc-VM2K`'EQ1[/5#;bXWM+[:14]\\\\3 YYH=s>;7x{D5?WMCT-8}fEtP429$;(B@f?hoBq'`\\\\rp'yHXL/=Upy26~^g:wBD|M!4+EYw}F(jU$eC)MVyjoh=ydzt}[){ECS(<%[$%J.l\\\\9}goXF./2=,o'JDH\",\"id\":-2747051890201854435,\"email\":\"fKgAo!g'9w:P`f8^$eL?6`C,Mxx3[#<EPkZvrb5E(Ji6v>a3Vm|\\\"s=;o@z'O_`zFW&QFw%T?fyW;qF4Uel}_qi_3J^au}vhA:Ygv/*,^&QXr7zm{B)@fW~r=Y%RmmHjpl8'nQ6R+ghCVm2,lS(ejF0{QSd0X1qHud+gK6x3'L>$\",\"username\":\"HQ\\\\R^l3n5$pJn=mf 1Hhk<\\\"b5K^79i8/t2.Gzj \\\\jk`2q\\\"c7Lxpu|O74~_0B!ib]z5D\\\\i'MOmfOp*3Nj_?>RZ`_#@ .,nUr+<}PrcS`i/40,*Q_-_hDZlDEUPAO&[WkT]#C$}\\\"lfwuHj?}L4Z4k|7/Nl,C-]z\\\\;BjiY-R*LX5C@p\\\\4dbCP:gn )2l^R0Z/eM[2wk*]jZ3)q\\\\,?%(5(ypt<JbC&x#^j6*;Gic\",\"wujccmqsqvik\":\"H=:<_2#{\",\"xtio\":338.2},{\"firstName\":\"V(vQ7l5`t1=H<07Ypqm.w76C@!'/4gs{{Qdrwy/2/\\\\nY$N&NVX<#&(#q^E`K&Y<&B:!j}(pfY ;*1ee g4c+4n$e0<15K76O_~Y,VtaGj}#(r(Aw$6h9NcinMc:c+eQVi;wX,uv+]QGYSk7R5WZW`B;::M@VSf[\\\\Q/ pqmK];G7\\\\jj\\\"qx*U&,Edn,1kMWd~o`oh^K2\\\\</l3h~4Zc\",\"lastName\":\"'47-V<[?#g)%U!#9p5lE;QO u<f~C^Sa)7*\\\"EdX:ljr&ZFGfF-yK}6/{!:l!C$fTU/xoHPVv@+vW1$Zh,P>QE8yai%ib=X*Mit\",\"password\":-708.0,\"phone\":\"jYK~q{\\\"3%j\\\"DOu0 BX;(zh@*@iP@m`xc\\\"AFH)/h<xsu^s{O{] d-\\\\4|G'p.cQKH$T*Mt?F.,\\\\{s11~* OL$Af[:fu)VsQ)qt>R\",\"id\":-1037381463484409299,\"email\":\"I+D^rJykU_{i r)mnY;Tu)R@!~T*,wFZwslmkZ? 72aoXK43Y~q]\\\\d-zmy|j@rC|mYg3vUO;V*@vB-eTf(w/?3 ~?\\\\vmAat\\\"d@yHoA$:F~'(/I2[<mYQQ7~o'$J\\\\nS9e/T4/tAaah/sK ~LI2Q4g~rA,@ja12FKtwP&]pL)Gm}w\",\"username\":\"\\\\6y@gtYg*X;*u)<l,6^O8b>$F.p%>}0{\\\":NxuCw{Xw=MB]/Z9vJb>0Kr@=[kTM?(#4\",\"nzyohwkwwznpoyut\":\"?;8j\",\"odlo\":[\"WZtYjArj\",\"\",\"LfAVG[4\"],\"eomyisrheyyyafqq\":true},{\"firstName\":\"d7NC.gU\\\\5}e@Z$%l(ahian6E%4wZU63;LBRnI%A&=.Od(V=aCz`o}ZCeCcbCGk5Nj'C3,>;u#R35'W-TZd]<+bqSi:Osk6@:L-z(2~83ne)qgD^7.L<j6'={ugXF*Oqu?zX@9]|XM:#j#x&}5T)o29;DW]KQ&PH=Vlpz34El2f`jSdgJ9J^Ag:#=UIyT.:8R2Q=yZe-\",\"lastName\":\";Md_0\\\\8ooh.]z9L\",\"password\":[\"$XSF5\"],\"phone\":\"yx<J+e8<@.laM,O}_?vP^MJaL^49R]BO|+@PfHp>vZBZf|foX#%s!URl+r3)Dpc#;=pKgKn# T|:}Q\\\\Q\\\\{Y?BD0R_a<g#:,J_JFg%0~Hu]u@\",\"id\":-2060650514513187901,\"email\":\"GS9:U&1y3%;Kfr~[nRa6Nmj}9`6$_K<d}xs&N[!GZ|OP}<cWmP6EHA&R;6m\\\"/hw$ln]=6`~6fZ}Ml`m\\\\WBBuJn_Oh!hjoJ5*oLy[\\\"M<jas#h\\\"}Y6/-Z~kc0HU-)%Xwz/\",\"username\":\"oR8L4<f~dEW<W..sG8)e@`tQ;Eg+i(U}U9\",\"bph\":{\"inodotay\":[\"61ey\\\\%\",\"m\",\"U6!p+\"],\"bmfkqyagigxijx\":true,\"pdodptm\":\"6P\"},\"hrge\":{\"wgvrahhwkqmxe\":14.2,\"oxhumvfddd\":\"&42%\"},\"xagvfo\":241},{\"firstName\":\"^,X0O$unvku[DgHq0PduMZw<kep4Uw?Y!F|}fQ#f[PJsda[+|\\\"G_;,f>z}-+T`rmk88__y<AyexkBJ|EfI/B-d{76rLvg\\\"5C2?WX,I(LoMEa7Uh?\\\\qM_J[%OAWrN.6'RiqELPLT^6`~T!Sg9.jx1aP:>pg.O)vO#hK~y-a'\\\\_=T9i4=q8h#Sm4(Ady >vH=^;G_YmK5N;YC@a[S>2u7E\\\"cH6>Sj$3xT(?F  \",\"lastName\":\"uNv*&=(mD0u#'u e8om3SL:.u3q!#}|sA4i_Q<J\\\\*r1u2[H1f-O )U>4A%aA_z#>Ai^^)`3rJnA]$Jb>UU|BI\\\"bao x;&Doh&G<@%DwwF|?XvVja=yGyl<~5X!2;;owqIQQqZh-_0O=X;ki;(2vMj5f]{{43G=WvEwyyiG;{!{R|0@I;p_/dVtsnq,'un%i@,$oysB06tlms*i94'{_ckrC5>3?cchLt7>-9=C\",\"password\":[],\"phone\":\"/@_9'xl`x1p |q (Dqr^!_5%jTt'uzWeK \\\\3f \\\\/\",\"id\":-2821353100624435685,\"email\":\"rD+,dY,,/@/A_B\\\\80cy<x 9`>1;^zya-*e;},*beLFoN;_*P-G?7-P9;I$Ao0iAs#z_l&-{z,kkUKX1!Agwc0__\\\\rx[!;Ae^qITnvnmvs-sG&&~!4;5T}JrtG)kQS'^LM/l7;5 vRQ'Til&{RZ]_aZIW46[c+s1WAR%d>j=-_@MD}D\\\"U_G)O,\",\"username\":\"VIAU2-p%9yXgeo3`3ty^r=:y3kI'&BE\\\\@\",\"ndrfhqiusxl\":642,\"ar\":{\"jlty\":[\"h=\"]}}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.password.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesPhoneType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"\\\"?!i\\\"SpkE!wWbsK{mR#_F/%/uF|GuZq1.#u<=C-]=J6Q<,uRjlo\\\"#OHt%#nTx4HAVgAu/ 0{@*;~{#0a$Qpufhugi%Vr76Nl6{qmpD?@&F!#F_m>j$Gw{5KJQ-&Yre\",\"lastName\":\"dEk(SjzIS;Ph9Tz@wdg*dY6.O.hHTce,YBB(`1)plvc>F6-*)H/h;}B[X<_P|jWR$Kg;^rbj4^'5O*9E>YYbhpV\\\\yaPBgQm #0 h6\\\\tAs\\\"{n.fmc!~NV&_;mr5?;Yv*CgLiG*|<Ly{'\\\\/1O@Oo!JfZc1?`vh0jvxk.tr=s2J5$EE<K!q^Q_3+>b*iW1,\",\"password\":\"y?\\\"c_Z^I>5W1/VEZX4?=Z~[Iw2!Y?[yhJ>yResA\",\"phone\":null,\"id\":-2260402934693329747,\"email\":\"H5w9R\\\\I-}7b7R5{)UBi62aN>9xI)7J?\\\"}.8xpD>2s.,*Qls`?Oqx2Ss3gh:$Q-o5_,xAK|@[3r\\\\cztsB1RhJ:/rgU2P:D?sK51@{)26~{vrINQg/3'8TBqA6~*Y[G,*+-M~h1lI`u3~gjv~X-+:l%svZZ:|: wOa?TNq7RE_Vk\",\"username\":\"Pu[gwSF}]]_}\\\"|Q[q~2Pi3S#p/$fE[5;jbi3/3an$xHZO\\\\}<*>)+y$]OfM=Hk;]D'uW\\\\<W>7D\\\\GkBY+EW}jP2XG![b@61(OZPTe,9O}?&bS2aMyZ\\\"\",\"tnsvmglcqzgxfv\":{\"p\":-709,\"kpdachjwhdxa\":734.2},\"rcxgelqttsgqoi\":353},{\"firstName\":\"sS0s?*3aiM}?!9N c^5#|(zDgkW~bo&|,gc;t1M?inR`.JuK4}~3H(VU$}/Ml.Nxuh/wI0L/(>Z,sTPzXUoH0W8yh_i) e1l|JBT6Zj>ky__Qj?Dp+Hee!rfxU+kZ]%+xR<~:@dN_s|;Vn)LYpR]:ysu9;?1zTtYuL>G;9F-TE:k?c.!Osc>k>YOa)KSHJ#|[yYeYAk7--?i-a-VZ`F\\\\[nvj-kYun\\\\:Jyg4_g3+$Mt'kRf\",\"lastName\":\"'w;-O6k<]doZ+GP?G?Jl#Av8W!_-'I3nyh.|:w EaX`H{\",\"password\":\"{\\\"`t&M6^gWwO-`\\\"dk`v2!8Bwh|}a}z(e*G)J(?Z2vU:=aCH!*Q`c2Osr>0'>Gh5L&c]t(KS;{z%GS4N-D5+J~Z7zHF~r  #_i|%(aUEbYiB/f0IF>B,sl;Kr\\\"CF KBD3qGOUCQ`v2siJyR;\\\\u\",\"phone\":null,\"id\":-969342796164270884,\"email\":\"iL\",\"username\":\"J>rN3d=.llt3tG7M\",\"eibzuxmr\":{\"mgds\":\"NfI$I_r\",\"q\":[\"J%}Oa*\",\"+9{\"],\"jcfujetoldrmgls\":601},\"fwlf\":869.1}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.phone.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesPhoneType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"yT#=44K;I)r4mvd<W`|;VAxxsQ&wF-l>3k#0mmk-D=4C0'-\",\"lastName\":\"mzGLS8#gmOn+nj!WHdWyaq*aS}\\\"\\\"<]eyJ|}w6-eL:dH'*e5g%?|_o>u@'M1~LAqrfBu'=`JRz}UI*tS5SWQfnBY+_DU$+q5+q!k>dy3*GAUHJrmFGNjtewrEArv>\\\\_>Jk5U(m0hI3T|rz7Un?KhMkn$OL]'%\\\"N1|%YIOk!a@+IB9r}JVz/zx/Yo;CX5@=- Nx=uXwr:.=XUMuJroc[{&)c@hO-17`P(\",\"password\":\"A6m{@dRXNi@nPk&jOu{k=@imwRm$4DC_[R;A@!iA,09V~C6,8Zn9\\\"m&suOtgOK_pPrl9G*hPn2.|EgL;YV.:{B&Pr)P`k[G[86 }Tn#[QHcjj\\\"/D$zi yo2-or*?&'eE\\\"Nvze<pTgFa~%DqYKSB g9:pZzBLWKD{12]&4<I.1h;B*q6J.gN^5qGsuuAHET3d$HeM9Sm`fa&#S!9B+QNh ^8Z(0`H:Uw*R#`e_\\\\%z3&%xd\",\"phone\":true,\"id\":-3550087502927436168,\"email\":\"'2g-J9'sDi?kIZT(B8g\",\"username\":\" X;W)C6SVJKfJCnNd8m`@MOW zgko<2i\",\"twhtbxiif\":-672,\"hyt\":{\"zphnhtxet\":-921,\"ilhsc\":-241.8,\"sesttjslcxattc\":528.3}},{\"firstName\":\"-6OvyMYwAk9h'_a7#^BZE*k[])u\\\\/Rz@NuRZ<;GNFahyU>W]]+!CL0VUKH|j!kgAS=YRT{un~.YVb)?&=K2KIRvmwE`nr/HINBJ8t447oJ:z|b}-9\",\"lastName\":\"*s.&v0x=z$_'ohT<NfA;hONUh3T`2$uiW~6h!MEySh?1DqCf$1EOl[3F*\\\\j%Ac{Y=Uv%_N QT]p^DcyrvXEfIdAs<8e|UN]s+rK-]^F~m\\\\O(@j:8_w3j9^H&T/mOH[\",\"password\":\"DjQb@I$OWZS1CEysM2l 4{0N.!/'tgF0oN/y8h16cS;5Kc.V9!TyFs-*fe\\\\\",\"phone\":true,\"id\":-1742309794279195911,\"email\":\"<hOnBP6~Mc8s'>\\\"B5,rS4$U7~c%D~Jak#+wOP!>Y?B]4P2-y{ml}tR0\\\\!@K?=o:hiyh|COL@S(l@q]c/2+!I2?t;i>d0uk$S@pI%e&=[ApUaLM\\\\P)Qm!=k.,b^2&N.luU,\",\"username\":\",\\\\s-sUwPaZc1!{?Hn.8~nel~,\\\\R&\",\"fajzlrzicimdjbdt\":[],\"ljfayrmbrebbjcx\":[\"WxDChc\",\"G\"]},{\"firstName\":\"a$ZF >%!Bye!NHABR AJ9Fvz\",\"lastName\":\"chB*RoMoNR.r()08T[[Z>jXeQ0X_g<{_$|C?AoHoDC<7I[\",\"password\":\"08Kt8ZW:N7eN,=qg.R)?`W%,`k}@EEQ^dM=0Qpup8T~xx)FUN(!K|>}av$V~L}!PO*6cn=V*SK`\\\\dT)nRGn'8I=t{M56Aku3Ogiu>{7UC\",\"phone\":true,\"id\":-4029787175358754028,\"email\":\"!Amu3\",\"username\":\"t./, `|p{bAa]oW~.mPe#/gIn:8i}2njP{S4Q8ve!tu]San80.<_j83&T;]F$%!]wITwrY/r!<`Jg_WqX)>4f@%nF_PF`5*QC>yER(;V,C+Y(03yiQmp\\\");)scvR~P?|(Fg6fbq.\\\"~:\\\"G<P/A,SWxuQlQZQ#O~W\\\"@Q]Y[Jn]cd*u?c Qh[.*0n*;ls@~,)8(@1cj<I;g;H*h7'&pILA.CJokTI3R\",\"mcccebqg\":944,\"ixxkdgjzn\":-787},{\"firstName\":\"=j08X{\\\"^-+#FziOT@<]Gj]]}V/u1VTp!})s'qrL2[Clfp\\\\+6n7EZlP8/ ^5i\\\\SF<_OR`SCu?!#=CuIYI/`{Ttq>0M={J!K5LYiT[83cmA9^BXhYiFz3_dP~GpE`W/U@I|<Kq0z/iZ7:f6\\\\V@\\\"4iU:g\",\"lastName\":\"P;;[kK{n[R.9A\\\"Zp0C0Rb?K8F_TAmmQwP,}BVgx8alNN5/x9&Q9a>ggWM'PlcoXp6XX@=\\\\e]\\\\,O%)4c=VsI?&`WfFJ4T32toF#xGl,]&sq]45db(S\",\"password\":\"gRm-W#^5V|Z9~?y:t9%jh#%j74]Fj>[|YrO9~y26IoD5R.lB8&50,WqcZkwTI<Vs~#>9sU0807#=m*@B\\\"eN}9a>/VTI{CMbe}.o#r_ow5%s9U1nk:P]K<p=\\\"-0uj$;:HP)>ia|;|pvaiYYgfaHY4Jw>Z&_(<r+T*^,wb,sV,+/d{mM8w>Sjh*zmm6%^@4zP:qb[%EiJ}p{@,\",\"phone\":333,\"id\":-927714277415913527,\"email\":\"QQ0/7P({M]bPT7CcP=P4OeVz@k9\\\">e~+o{>%c0$=ZX6t7+kkp&;]V31Y]'#hfe]M<8k#9mk'=_yp|ASs-\\\\-nDt`%a^DZYOG 9Ic36{^#z1`cE\\\\2TXjn{8-'&P.ZU]G,Lq!\\\\WLIp__)pxz5Qx;$:VX/Vmi@9[{\\\"%nPf\",\"username\":\".r4I,CAl,|g]VBBl~c,rnQS9RM[1`$,rys%<vs]8:yab%M+Uzlk19yf!yy=4X ]Mk>gOS@/2;^]g<Go$ZXi3zG/W[~YIdi'&N7>>'C*$mJ&dg2ZyJ23g&B#}Zi%B{\",\"tbrdhxitwxe\":true,\"qbgavizqlxj\":true,\"ltp\":149},{\"firstName\":\"u#3JcfxSi+r-hYF'(:3oE\",\"lastName\":\"fJOe$G`@}XYUSHIBAOt97q'A\\\\YvGK06s0.+2<]jO5M3t}*XCEv~q%aUca{3f$l\\\"5u&]%xTBo;n8iw#hH8Cp,=n4c]*r#/!+znTixUF0mvq?ZyrQz;]Mbxx:~/b!Ov3_</BCWC%Xxx1T9@`n\\\"QQir^mPEYr/Y1@\\\\rLBL.J+R[5n`X}6G/4z+,Gk~-4Mo[|B\\\\_3=kal&6qtSF\\\"'[<v+QaC/b<=f-qy%pqTmL+e35Zt#OH;MX\",\"password\":\"IpwYsG\\\\5@wcI..NPCsLw|owMo3DXkrK^.f)y5,6.$fSxPH\\\"e&-hd!q5Ngtil91)Ek}2`/Hxgh7<AbNSawuX2)Px{!y 7-<X ~&z(rGX@x>>D]qh2p@SA7563L7=(!alv4oQMe\\\"oXj{b:ZVEn0}8{&BYw mER%T^o#Y%8A'O\",\"phone\":true,\"id\":-4025300116523382562,\"email\":\"T[XM$5F,u%*7'eU@SFi*L{d.=by)X}AU~t@}06t|RWJnmKJx]G7H)OTs]#uQ7[a;k\\\\j2B>)cICdzq'\\\";h%GO1andGkq'\\\\w_@(\\\"x?8e6,shVWy+Zuh%hfV%48? dOV?P3E=b\",\"username\":\"k+tDY;WOe {$4<]94$A7\",\"gyzx\":-937.6,\"qxciovhxn\":\"l+Uqj?&Y\"},{\"firstName\":\"7)+(IDO!CGQ$GbifsZC[\\\"(aY8!-|% }>uISkY7,C`Vn@ZCOR2A9U0fE,C3un7\\\\h<Sm/lf<m.dzk,_e')[ex?~z4;0&L{)e/as'].de<c*o,Rz-IXr<42{x@ldq:T3g#3#H)|`\\\\Ev2|dK$WNZGt&;!O6s7z2O4sO$[-ZlHVq/$pj5<hfs*Tl_o0+qi\\\\`>v>2l7K4%rsyuF&kI1/1NB|DK/v#nh`|1Jo0,9N!-Fj;1>i)#x;syo2d/\",\"lastName\":\" vW xTY@\\\\Gd:`#FT MSMF>wThUdW67/qa ~wWw_2S$b;@r)F2t=3=A$HcxO8g6pVvR3XNrNAP#4!N)xDuJ C^'\\\\/(.'NVTR;ji%|1MAKRdtpl_hWG=0uKshj#mz$P2s'>,7i}(4bRo0e%}pp2j7~Sdq\",\"password\":\"D3PSe/ZT_^|pb,Vl 3DwZw+3xy,,%uq|--uwW$MEXkrpR+/<Y+-V;N,h<QRwBf%7+vX0%+$mo?ubGJZ4>B\\\",1\\\\(IRl}?}j_RPvI6O/^rF`K1g+~Fb`ojBIGzZ9n+s[23TGXn,Xa]XO%7\\\\FU_Y58DzMU\\\\{\\\\rL<ZAoDwwFdGNx92\\\\e}c*O(9`^=}+@-Ir#O2o^ka3M(Xyxr@;]\",\"phone\":true,\"id\":-3621529727572285890,\"email\":\"kw_(hZ;Rq6Vrmtt}*wlb\",\"username\":\",NfJYUW\\\\H'&G%fG'2t9/. x\\\\*)R$\\\"69oQm^Q\\\\=9Cr#!aE^ItD53_|#UeHl[qW)7h#< }Y#rvGw O_rCLo}l5z|I<x'R.CwFh9b.pUg>8a~/OxR,malSNcyRnoXE8+IN&]f()WJnp<kap)&Kj<Zte\",\"ybonpiqeukoevu\":-615,\"xb\":[\"Ci{e\"],\"oh\":[\"TOa$.na5\"]},{\"firstName\":\"iun3^\\\\S>BH{! 6+{7zJr|H&a2IW`Rq&#kq>|p-]CCN?QT$I7~:&bi$X*U_,!$W.PKy=>/;c4m;s \\\\;]N/]W6;*l'rXKK1)B{T\\\\]6N!#I7kMF7R\\\"pvGw90>-R_1Y$00kw93FV]&=[W/R;7qp/vWbksJ~;x&#)3Bo]g\\\\.AP!xBTP.%G/Q+`t\",\"lastName\":\"Qz=\\\"IXnfe|VaVXrQ_:eB^1#95gkB)I->Z9muzy3rx@<l~Mx_KW2Xq vV )5X=yo}xZ| S=l@:}zI]Z4l!\\\\<N%9!Rsvq\\\\2q>V|NzXmqelY3f`d9$%F|2:)mpJNZ|&0~#tAt(7DWhiS\",\"password\":\"t7XFk-Pfd+e492[)ynyI4wdAvQg 2xAE0\\\\x)\\\\;\\\"=4LY76>FU;qmvi:5LD!i^V_pH%Lp'%5'+Og[d>dZQ=!o\\\\mDZ}fCo,z%A\\\"{n+<W5zK,v\\\\rMY5I6dc5%Xxil-xNsLFg,lNB;5,'yvlsJ)\\\"=AWblzrDIz5Pg41GGYH\",\"phone\":-239.7,\"id\":-370163254057152589,\"email\":\"uNImD8N~:m6RnlA@7>XW>OL9!9J1V1LA&g&.3Lk39fTD^w?x_o7vOWY2;[*5b30!*i?F(J!Y-{~ou1{v- ExO'N6-jOj089xSK0/bYOEG_A=b9'xcAIy2O_IX'5P=6Cy!.GgVj4\\\"f[zJW]fAg4\\\\Me.nj9f-l-RZ!!Q-w@r[E??Vm>EZ{+~6[Ks(5c7Q3bq\\\"AQ-'1w=T+Rf<s\",\"username\":\",n?= 9?Qc*K<8({0zhYIV\\\"5aKySa43'/QOu_G/^3f\\\"<NONELlurb{31N:>Aj)|@\\\\\\\\o_g\\\\xfs6SLQxQSZK?k/(WVj])EjV \\\\iNRU4iD0l)j/8wiCE>)A9,7>VlxsNk$$Hr'WD\\\\Y!=C!stc/TpB#tUk[cGUZd#dz_zL:M>ag[9~C1Bw][+AEicuxh\",\"ehdctn\":true,\"ybgb\":\"LrZSz\",\"qkmgwo\":{\"qmbnuiyiftfnzk\":-276,\"naatiorfor\":118.3,\"eulq\":271}},{\"firstName\":\"3w\\\"}T&Fh:y^_r8\",\"lastName\":\"G>-PQifn4_Lh%ynV4`kL`>?eHXp;,F6OFNaes_S+g}Pvai]Nsw3lNEV-CJ{Z:Cwz_AC QdvM%u.k9+ofqlL0\\\\ tw4v i1f/%C&EUN^+skyZSuz\\\"ZTksbmCMVBJBAPuT7yM}`taH7SL2PxTG}\\\"\",\"password\":\"Uid_h>F9]0>24P*_s1,jyL|\\\\Vp?[)Q9&3E`AqtNvKL?Lxr*}(#5]Ir,xc*9,9:{\\\\tjwPR0Y8Nq)>|QB&[\",\"phone\":-976,\"id\":-3548165968763498156,\"email\":\"o#-dAVvM9ZE1r4$E'Ojmkt PQ8AZ/l\\\"_cDr*'VOmg0a#yB79hm+xeO^+o`|lipl*.9\\\\x\\\"&efNB2=Qk/Xey\\\"RM(=S4#.,!~)e]2Y1,(eK*`^&NiJOA3?3l Q9**`b@ $)J0vpsT5iER@Anf$Z! lg=~e&?qb'[xP|F5z|D{m_RJR3fTW_@#-k]ZAO \\\"=b/-Pw%V+|LQ^#q_P.tq>\",\"username\":\"hJ{#JDJvsckAG}>),8-HmL&JTk_Y7'B>r`S@9YW\\\"&:OA0p8l&DB6e~RhTK9izJt&}/{r`.<-?)@2e'J$ fK&8qX`X]7jiYU<]gAMNa}sJ~lbu,3 x4]7w~;P61Zs[=T$~jWA[e$K9'`YDsLI'K$vc%3\\\\Gz1*iv)&?7)IIGXIp\",\"qllxdycegmatvau\":{\"hyzigvzvcdaujq\":206.6,\"ajdjoltz\":-712,\"cioeihwftbtpej\":true},\"furdjnkq\":true},{\"firstName\":\"}1vR6'>*Jd-:(93;leqi6S|+6}ED1<qNQ6{TsV|t8y2,@o}c1)MkNMYh' pm;C}?JPB%o#k;OeAm2Y UYZf1Hi`gWY`kfS `?conBzrMOrg}7|ICq!&%!1wm(8Pz%}VlIM7.ap_A\\\\9\",\"lastName\":\"m&K5A+  HQ8JBLd%>pvj(0\\\\CAe Lf/\\\"LJs$GZ:g|]oF,n+xa8q~$iFXjzFl@[pd a.y9-L%v/G21)}8T\\\"hOSXp?pmG}GdLkj\\\"0S5P`,zz-kJh^TR][q1P2u*$sj1),gUPmn?tvFmU6aXQJH.?OVy{\\\\>QeV/gP?3]1ubk}!jCaw%;D^u 4,:b@W!*=]e}2wTmK6#aEA\",\"password\":\"c)!)k8vC6].Lb&-Rd$-`.yw{8lzg0hwsqN@d:pGhZhNCAb&{w*'Mu91`YKC$S>Nm\",\"phone\":[\"y[\"],\"id\":-4015653357365258369,\"email\":\"Vcm5Cn^^{O7gk UP{S`\",\"username\":\"qA6y&96)y!50w\",\"ohvetjffaqj\":[\"2NTbv\"]},{\"firstName\":\"\\\\I\\\"<MV;_*9YJ-Wq6fFXbw) UOlmeX{WPj#vor~MxG[CiU6hQjA2^;V64#^\",\"lastName\":\"AX2K&*\\\"AsFaCaL3g7j6&l:KK$uCJ[1cRz1p'%45=%GWW+\\\"\\\\$M?9zzx|nZcS$aB:@U]2_\\\"FG}(d#|\\\\IJ;#%AY_-m=K3ceCXP_S+p?e-BeHi<s'#e*+{b h&rrWqV#dI8k-01TP9#s`%{@M@=T2eg$(,Kw;T=T#DjOOkPZcv6}z`VRM]|ru_p*tvyU%*$l^N)T6HX<U&bS#&4w5A6+K\\\"AxJX>RE)x([MC_GRYVl|hT`v?Msz\\\"q~=<m>sH(^K\",\"password\":\"l.zJUB5&]56.,3'Y5iB7[GYE:#Bf_D(Np|AQ}>:,eTTH7vp~0|%}MJbZ,17i6E1z<IfQ9RL|=5,^fC1ekU`NCiY3ixjOf=d>ESB kxy]A%|qkA<R3HB/Np}Br$n|u!Q1iZ2Xq+: j(t8+?5 Ie\",\"phone\":-901.7,\"id\":-71187660253166861,\"email\":\"\\\\?=~CCO!g}=wK&Ji``m[qqV~be0Q7kY>4QX(0\\\"bM;Dw0Q=0,:%XWXnRyZG((k\\\"W|Pa{[D:66V:G+2L^0;H[R>osuIVEsZg@,Kzx(;<0%Rq1m7MTx)%|ps3<jBN^',hrf[hNG\\\\9-2 {DWwH!C\",\"username\":\"{\\\\enpcX[-ap`=Jh2\\\\VkB`4BUo<oXBFj%'q-z<r$z,%FIEB&64.1U\\\";o@`h9tIj;lU|V>A}vS}pU4MDrRzWKh,Xr@!F^{e@h7>7k$d^vN1BD<BPJN&UCL8(iXu\\\\(h8<]:dy??Y\",\"ysl\":-885.2}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.phone.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesUserStatusType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"h-[w6ca('xNzl!hL!FZ3.%j(&=p|;ZSW}wwf])H+H,F8gr[}PPc<o<vqogF|L\\\"&p\\\"nQe$@W~7SaYR\",\"lastName\":\"Q;Gt8g\\\\m]kc_(TZvOINg<n,,Tt;q\\\"`A1HG `w56^Bv~#kFsVdxaE'|B:mf>ZW:-4;j?{\\\"6q)$,0cM'}E<3upK12B`4rJ4rxS'=\",\"password\":\"[*~[a8\\\\xJIcDktZ/{voyFx.C{:k]% F`TBzcv.KJCr6^3?l6zQ\",\"userStatus\":null,\"phone\":\"icJ=\\\\Z?ksl~PBqb6)ncrO9\\\\OGAKf#>%i/~_=C;|F(&`H#GJyWL1Bj3^9]\\\\vCI[MUKE|7#azGeF=K6NzdgLJ-yj rV+/zJ>+c|g!B,k`Nbs5/0giU8%xKu2Y]^DHEb2,I8%lA;c5kw\\\"R~L9OKRK))tE<>I}WLI<Ki^!|^1d?J9'w@?s[~Qbq\\\"`Fk-Mt7Id;6a4ZVT-!+@;}{r^U^_Oo70c[wYyMm )+mr&)&,@>mkbkYu;>EP]N..D9j\",\"id\":-3960055896591463980,\"email\":\"IxYE Ieq9/0(*BARi.@rW09qBA'p1%T31#4{}x*Gagq{_V,T`ivrNH?|Fl>c}cM_.UW#TMUmSl-S m>]r:Q4&~rP/VzdVkCtOC+ny$CuxSXSe)lAy7yD{u[ryaCwOB|Dk4PW!rTlM`b40\",\"username\":\"uwGf(>,7X^8qKF7kcF~k_}}.ubOUe&4_hts; /0@af9a\\\"\\\"u3:]y$x-WtEE=}5%`;gt@o{FH6F;x>SS{OU7;4[wUehE3?Blnq0@$=f8ndqVd0dEP]+m'!,l}-etbk%W;sv9<s{u;m8&+[7}&<x$ne8+Yv'w3;e*GkVz ~[N#N+jL&.cjEb<z;or\\\"3Cj\\\"_q*w/Wtc9QeQ~},|]i7gd]_,? h\\\"bxB w<}\\\\{]=\",\"u\":true,\"pl\":[\"(l,\",\"J&a\"],\"pmbdphu\":{}},{\"firstName\":\"(b)@1>tI(n-1,GPZkG+ {QloWg,:7MSiyt|Ia[wYXsf_-{<:VW_{tts0zrRg/\",\"lastName\":\"*[*@HWtoH%KMFau,M?(osg.?.Cej`*5aH vRE`xh9:=CpaS:zr79pY(MAA_p!2VHtQq/?yrE@rVarSxp^.'f[juZm47'j-,#fK\\\\G,12R:wO8t3r!_FVff;Ak6Wg\",\"password\":\" gf;ixFlK3[OVOj0*Y|i7f^>I.?U]K:Az(*s6lPIg7'Ef9{c3wGRrm1D8DD|x?Lgi/U38kLx+9z:o@Kkg2!PB(+71'IBZwZ]Waw=5}@fcNmqQNJww[3^*X^Ry^F<(27df4*N\\\\@M.oY**!3;A$mU~iA]:.WrC&\\\":oH}]h2=HrqKQJJKqbMqq\\\"k9pMJ7p{^5GhfC23fULmY@-sx\\\"D3495*(XYi>v\",\"userStatus\":null,\"phone\":\")Op1#g+g;.F0 RN;T5h5,mz='?73PIIl:T6R=1~6ghC^JhLP7\\\"7.b8{V x4` .QY&*DFO:<3fZ|fvHid[pHHI  .n/{T8[-4 ,\\\\UMm\\\\CCK|u)#4p.^si.l66J|1ZlI.85+*)Rk~3XE{1M=URYrL_^&L'L@6z'99a-94v>,a'EW6iFrm7Y@ChqYU\\\"W+$p]Z<]0swGwhMhK0xU3\",\"id\":-2975193117907978090,\"email\":\"`J%`L8^\\\\Q1f~;EW@HEAml},F-OUG;fFL}RHj\\\\e3x[?Xbo4d 9XqtB>VsZaoS:JTd$(RYZ4u}\\\"H}(l&T~|4M#A>o>b0w5E59\\\\zD~i1W_H@?AWnPNa<!wyR2NVrve\\\"SeXoC)/{;mA>2):>o)tT2*tiK1cGL8z0[]6#I{m=0Y:\",\"username\":\"&hcd-Q~;%d&Z^[5bXd&?~\\\\2&}rbopjo4$L00,ehnc;>c\\\\.OZ0RpvjiB:'Ru)-rv4iP&g'5EMO&Q_AHvL9V%9A%/%gyR4z~+@Y<}|4vc0)nW`ThCa\\\"Ucfe~(Xf@L|-5~D^>=z7%/Nk4FkcSb[\",\"c\":true,\"r\":{}}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.userStatus.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void postUserCreateWithList_BodyApplicationJsonItemsContainsValuePropertiesUserStatusType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .contentType( "application/json")
                .request().body( "[{\"firstName\":\"a\\\"Yd*E%4](\\\">] +;ZyXLF1Hat/UA U67.i :|BKbOM\\\\M/H)QH0M]QQQpg@JLYI+zZglHpD@Ynn\\\\<-zw\",\"lastName\":\"GP9MPK>#-408ndN7)|X5W]jpx{_'T@(}+<l*PtBpjcpzkXA$fu+D(uuE\",\"password\":\"'LJkXx3kxM8I3N$+e$/^!sFu|M8xat805rk?|\\\"2uyk0D@'GV:P+Ya.}Q9r#c.hM1uNu2NG*cx?z8#Y'8$*_4s^r:7eq:RK'iW@2v?\\\":pLf97\\\\jd{8Qb[~]0\\\\t1*{Hk TV\\\"\",\"userStatus\":\"8\",\"phone\":\"OYvv>n>jG`j;\\\\o\\\"}C?&1fYNr,\\\\j{H&!_@D<B\\\"L]\\\"G&ya-nZ|yam\\\\RAq85cY7*+vK-+&bYpJ1>R+f{*(dra8QYlHMsHz?vw4OsGsC_}6ZJ\\\\1:-Y%CfWGkz;BMK|CWDSh.4}7X)_)3OVyt&@!$CBH9fppH}B*OuVO6sVH4jha;N@*8-NM<0qiL4Jh17+Rntj'+G@c&>~uEdk`.1p1f Q%<)PfEWwGEUBGxL\",\"id\":-3307928525517220836,\"email\":\"6Tzs?P1\\\\Ix_rhjXbF%C;w<CnlyMf?{Gb7-N7oZ LDb-4VXO2={1xRKD&w;hXa.8r5ib\\\\z~D/%L]TOuqEiiN%7'M=Qy/i++6Z~1;al~2Y?[EI \\\\<BSzU_'<PRmSZg^qU8\",\"username\":\"u+t/9f+KlG*|_C}3<`3EhczJom:fFpbNo=/4,3/oEYCG&i w{g4_dzf|G)WgY[y(hIj9w,ZsfvnTX~PmmW\\\\D#IS1_41`{KJV%Kkq)TC+snA!>#Xi!uk&^r_WZ$+@1Y&iK!T9;,jMZ/w EQbq3j\\\",id~\\\\Jchot\\\"g88cyjz~Mg974h3g8R$#^`8Dq~60tG-vZg.UW{4Na9i!+\\\"RHcjy#}X(J[nVGZn!_4Ga}f7zo4[Opua&s~\\\\E\",\"jkdlp\":{\"vupwwnysbwhv\":-284.3,\"crcnojdfd\":189}},{\"firstName\":\"U|,c>]@FH aID2'Z6xs?,VqA|h8@TP7N5=U?RQBMyq3z%rFyEl)Bh|N2TkZXlinZc;psvy^h<\\\"?&R,A!,AdHOMp:$xA&`h{B;F&n1)O%*EeNk18KS>znca*\\\"yM]od-L6>UD;k6.7\\\",JNW\\\"E=o~xC}jK5}No#/~>&qu'qpkntT^B+6jG}T65M Sg-2b\",\"lastName\":\"R!zh!BgUO3fWd#1VdbcZEcCk@t*FQDux%l6XK9q_%6CDFm)ayq#2iHTvF~]GqFh;+Ow8,KxrA_Mf< Vx''Y$.FMd'k@n\\\"cfw;?1;wa\",\"password\":\"B`|Bog8CBZ|Pn&}tnVh<w5`qG<`^_Q'MI`zW$&&ed=C/>3'3:3K?DlLCzcfw>b;:_t'z%.8?IZpg64>&fXnrgk=0B!gmlagY:W]D3prN@8n ;HV-&BFA&RHNc\\\\A>\\\" &^D>oRIv6TBGq(RaLJ% mOp?Voc;\",\"userStatus\":true,\"phone\":\"oGk%JZe[~_F115/1?6*BLs?&yV*T^v]K.7h>YY~zr:)%cA:y2X1uCYR['MIR'[Nzd!y:-[clPsOPL@:jNTlkgK2S2uHV(_x@8F7)dem^I\",\"id\":-206726795868299196,\"email\":\"m&i~'31gO=);Fvow2P?Y_E]D.CXw\",\"username\":\" 3.AQbWMepSFL2gVVr/&0\\\\d,f`KXrvC->~er&a(>tO=e~^$x5noZ>3WPr=%F\\\"QKL_l*?'Y--l\",\"utwjlyowzjuarsq\":803.4,\"e\":-64,\"xwnfuwwbk\":\"qfOpL6\"},{\"firstName\":\"#+:Frs\",\"lastName\":\",&;<SbTq{:v$q$z(3][0)(vh`U?=4h/LY!Ng=dRi)yb4QnB9?j,$C@BlWx%=c-Z!gJNY[PC&TTqReh>oH'h7w|*!lTVb0RQMPCwL#Ytn=,)D_vgq5Hk^/r4EqhB\\\"9tEIV|Q'N 'FWOB#I3U@XLA7UkN+T~k^7[2j#xE7e\\\\nd28;u4DloSWZ4!x]3Ll&KdWcG1o0*94G_iO<Zn 'FfCzPBx?3+Hc\",\"password\":\"$FC<)Tuv^qlCu'b1R=#81sM=7:A_Xfb>BMYc]Z.yT\\\\p%+:=`=O{oC`?o8;lK2-}m gQd2>LAmG9empw AUl>3[TZt=U+/|;?o.0zH;;%G[4$:-T+{_7xx0U:;C?!u0x3r$!iAQ/CaM/<,'8Tm4h:`p@FfDF:i/Rn[A\\\"L!kDp|,yl7u~OL\\\"@bni#jZ[k\",\"userStatus\":{\"yacyy\":\"i!dp4\",\"e\":\"|R9i\",\"zvittqktqwvmzl\":\":HC%\"},\"phone\":\"lF$`7UhU^$,kD^y\\\\C\",\"id\":-394312177038090241,\"email\":\"!rl,o-19SjMD5+GGugDK_}Re`s$qC3evtO%CpL)E7j$v+S.@syr7uJP0<\\\"hP<w`eGI:PtB*]niw-&]SLq{`NoWpW8(0?`u#b/\\\\_%[L)9\",\"username\":\")MAgOjWNZ}>?4-V5d:?}<5Pr+rq$$}#TrOGnc\",\"dk\":\"\"},{\"firstName\":\"OPe8Uaaw+Ox%TgVVYrX=Af&Y(ond9izQDSbWU[ )!gv?(*YZ3;/Jt\\\"4Z4|BNW]n=6O}e!(ah[`K3&L~|J?>+ ?17`[__%2->U;4g?oY$=`;^6UDACdL?@`_Iu<0\\\"j@PQU:n,<wlv8'gAXDq1'dy+u+& YY\",\"lastName\":\"Y>5U'-ZHFV(]m .2V`P;;\",\"password\":\"'&|h1<C2&O$mi'7=<HgI4m@EWUYd0EZByn~=\\\\|o=x8q`cCqD!Y#B-v+,PW\\\":\",\"userStatus\":{\"tukw\":true},\"phone\":\"+5hV>Y0D~lZNY{^>wf:$6CJ65h+%>sM\\\">'<s1#!Ul52VJuAs!MlTXm\\\\T/Sw$U%<QB-r8wwZh>a3\",\"id\":-627596238522929832,\"email\":\"-`g@y4$&/a+gz<Aj\\\"g*alg+.93IyVte-}7u5KM%?1O76 /SLu*.m@WFA@xD!3Tn\\\"BH7\\\\xg{YOP,$d\\\"']!t^X5oV^s3/Ezr9)>Hl!ulgl`MOkNh|%fjhOKbH4j *qnI9a6Z~|teCRz3x5y$'KyT\",\"username\":\"G8e(v}+~N-:)qN~9&=RRCnys'GWozL7Uz?p6B7r3*bLvK</VVX'Y |>?N}:Cg8`0?v|__?\",\"tggatjysml\":true},{\"firstName\":\"t'o!\\\"SDpKbD&dJ_g<52,?/t x+\\\\M^5_oR+[:\\\\YW2'kid2&a><,iQ(i*/#O&HbTBXX+yDLcu]7Wv;aO <:KnZ5uG0{rpw0r,8Bp%a1q`I6{@3#|p}HHbDU`Tyi `bdKzY=g`m!^NVHBa)sAZz-s30yr+7,N{<+)_ajyY+!4p&.J,4^KJTqGU\",\"lastName\":\",Q\\\\H!*DRfL4_b.S.YwoAA\\\\i>AMX~[,:5rLS<&dYIt7(st~X\\\"mg\\\"zM}|#Iby?g?f&;mSWvH4\\\"fF<Zu6j0w!lK-I9Pa9\\\\ewyKwcn''2\\\\[\\\\2:5kN1|s.v(f-fVok*CTr*9Ka<\\\"*7r1;*B[K.8.\\\"=u`D&jnR=1l4A3u|\\\\Z`Od4N<hY[LP@A|['_DH@xd/[)<J&k2O9K8wNYyBloL8p!E`mg=HC%kOG>iHr0qoh]NzFaUt^<_%4c.B|V<ymN<(rCKm\",\"password\":\"40TW42S}?_<9(DQ%iJ~\\\"otOlSK.R}?1Ji$Anz\",\"userStatus\":true,\"phone\":\"4\\\\KTw}KQzksNfDI::/*g+UApz|27\",\"id\":-302374702319925269,\"email\":\"8!Z)<8HzVn=[^/BU$I^'BgF0SRN jzOY\\\"<MuD&;):~F]Gb8%C1xxE(A$}FL3*oT|l?Wz~@ii#[-'Q[WiUC);Y}es5ZI\\\\y1jR/DYRQbN4|\\\"BRc~~4mKEQP'FJ3Ac<8#2K$Qt>&IOAjD,jdHzi?dE~s]P^`7iq Zl\\\"yUp'ugB:}9;!amO\\\"XZqPmJ$.`[.\",\"username\":\"GCQ:9WYEBY5:%T*_4ks==&aRE/1cEI;eN49- 0Uc[f:0+%v+$e1`w}B[dDN*/~!7t|)=O=:<*[g|7dI93tf{U@iI3?z!>|f6([q3oG>wgvR5NYRZy2u4TN>)rQnx#aRl)ZNr(<F3hJ78N\\\"h'!i|>XTV ED(>nek(-<&.ExLL7b$8sykuo?!z&O~@=P~ <#l2#VjHUf|]W\",\"gruawwhxojlb\":true},{\"firstName\":\"_:H\",\"lastName\":\"<o\\\"j'vghsBX9G//~JPOD:l{Zjct=-2?.YCu@~Dok%J=tBB >{Sq+V0PAQHZF?>DE\\\\U\\\"%J3.3!?QIOj?C).@e)sgd5bY\\\"8;,J+uX1D/n6)kVE`6B`g0o8 +7Q@bQjV*evQ7-cuol>0P<i>hl+Fz&cs7?g+v\\\"(Be8iA\\\"2s?MjdGw,c@e8\\\"']\",\"password\":\"3iT{2yT2<Ydt1Uf4R`VIVu@\\\\T0Q>BJ#`mz,Vy:I8H4O6AJQ!;`|E%p:o3T]l4.j1Y<TPq\\\\D8s^tv*y86_LlG|Ug;XMhhD\",\"userStatus\":{\"xhpfqykekvqzanw\":575,\"cythvvwmfvsnd\":404.1},\"phone\":\":s&~<q@_Qw5$Yain@696IV9wh`VnpNue._C,y[?D-}r8yf/9(\\\\]\\\"PEU(Z*rc& :8`8=;MZ|K;?\\\\Nh9))k^ZYU}')jZ@.Y2Y%gHKO-i)T!2=r9$8,=SOF0}9vj>0AUpz<\",\"id\":-4482695311681254309,\"email\":\"u4ley-S\\\"4/`l$U&#H9kZ,$ix4JOg#h>FehM[z$'&N^ML0;%Hyr~vF5C|E>`s/\\\"qaLIKAu\\\".sxQ.ghc)-@i#E#5CD.>F\\\"lF*~Fs_!<)\\\\Z!wI62DO_4s8[@:bC`tDA,FzQ`]fcJ}Nl~x^hGRWT0)tjLk'`UCzaRX6(UGNh\",\"username\":\" YSL,kgb;DV<3Y.\\\",: 5P6JK6Sh3fC2;;#{Lkp[@uGPB+l0m9\\\\dX\\\"DYGc;wW@fPP$_,A|W4q|cVD#a*ZEDJ4Py4R_Sg.W-Ve#@,LTQ+!iBWv9!\\\\).R#)t+fR*.\",\"iceiucuc\":[],\"vmjhzqplrdepo\":\"S>r\"},{\"firstName\":\"$H<^}5ekPg|hZZ7PP6&0HLH!I8.BJSAvZ~5eYB8#Mm A6c}c[kfx^RbLLoZa}.T;[p6?FxH1D@D+HP7NNFFO/g3*2+4W[s9V5tc~J leFK988t_e(4>R8}1N1(cL9\\\\YZor ovik|JeR0'9<RVuEjtHcA1dVcIrbKw>8RtI7ky91|Lyy_nDecCf7FyD7|6nxJ<4iEmGi0m!4.{k[+?\",\"lastName\":\"4)iR92U4\\\\%!` G/I>>X}TV Q[ow\",\"password\":\"cu\\\"^P&=Sb3NUFB'i^y:4dmF #>\\\"]k+<aMKo,d-[<!2>IS!j`<XpO.{//!r@c@vc#Fr 71j-JhBft{Fy+H8sp0:SMDrXw.\\\"7pakpkHd(O9%_M3MK~S@wnBP{zi;Pode\\\\DN?di+xY7rFDW([@5+0@O-hqnRE1CmH2RQB:I\",\"userStatus\":-837.3,\"phone\":\"[4ywW#wP/DuU0rzn@ON_e}tV8-f$^y29/mDnc^E,a:C^\",\"id\":-2607621693838300831,\"email\":\"\\\"qk{^G \\\\Ab(cuK]NT#DIhNvf]b7p+4k$[L}6P>s5^Qx}ICOH7c+\\\"WzikB7-%-Kz%]%r>S6jgfg)^U]\",\"username\":\"_LAd~-1^a% z25;\\\"6)1ku-s8tq+DM{pi^hb!{>g[R8_ o,!N^C.yD78&{L_yKZI5a|ge2n^RVp8m`$liT,@llrzJVs)KU:HUcP0<h6yH>3sAZ1E~p*^*Vs,HooMZsQC@=@|'MOlj9gcnCkr4op~\\\"0$Gzrk]$p1M 9<RAADG/ie-2PV<06|,0PEgs1Pe5acz#?;-wl]/U3r9p~3CU}LHELb[gFvks6\\\"PAnamK3YP8F%e3=buTmqlTzBfFW'>Rmm1l\",\"bruu\":306,\"oibqp\":[\"m$@tA \"]},{\"firstName\":\"&@rRFt.,paqv3#z:CVqHo1r7X!j`AYYkp]V,1[un[tzX_VS:u~Ms*/?Y1T*A&Gh=Y.fs\\\"LYH!jxrCRO%n2ehkc.Mh,x95FQG*oUMToYyjmk+ii6l*G{qf2s),=pzt=%K8N[`}_0Uz~Hw/`Pv2/ NYQYxi<`J=P)ief]\\\\p\\\\BErl2_yQG#dzWO+t-dtVec'C$i~>zD,z\",\"lastName\":\"h$d}?if{N-hD\\\" e5d9\\\\QC<)jb\\\"REcHq59-AJ4/A|g~\\\\#`6Baah$?n7Y]Z\",\"password\":\"uf;\",\"userStatus\":239.8,\"phone\":\"P*b2q1e*7yP!(O=+Hl4nG%tGOxR)}+Ia&DUiR;8&{i[{0d,%I)lLw!-su,fv(HW[mBs>G){=F<,PMh*6I,b\",\"id\":-942951457006424227,\"email\":\"_4/8HL3ETlB@K{5y2G:tcyNY?}ocC%:eC`NPQT5O!#7\\\\Hb!3oj46Ga eU/KSzx7Zn{5CIS:g([U'j^:].^mWAQCh=$<IC}e$hMf~}-y[xPxxDm$iQ2`SaX9NF*I7C:EcyG{H{O#C|3hSY+-'G`|6\\\\]\\\\4uy}g(Cw}0PMH}L?7ZySMjmW<@k+x0#faL\\\"X/' 'Ff){%=:wlw1[(ot|eews0R''*6C\",\"username\":\"VBGpk>HWqL@-Mu?8zOD*YCbY3?*#b6?x*jpp8n8=c8O[F@QJQQMY11H rdq)Ry6D+&SP|+!SP?Fdl\",\"denzemz\":\"1~WDyZ\",\"ocucgjjxclqvk\":{\"h\":246.7,\"wpmsypvikxyncv\":\"=iV\"}},{\"firstName\":\"b=pr4|%^obzu(m7*Q;h?>){x4_2%1s9xO|\\\\Eq,:f,@-{lhEXnDQV0<<9{rt%PE$D05WSXhn#kmJB17h:(9Om@u0rUw@<8R`^'5h%s>yJ*R:mzPW?o4s7e[|iazo1X^mFN8P}PXxCY=3_m]1t00UHgcw5y[j/>qE)vMyH:!Ur4k$0a*,u[uc&0'2[A;o='!Gp!~Aqe(#a?Mh>twnRJj&o>9[xYhZd>&$5Y\\\\J<$<vUx|x>S<[gaKbwbWcv3vbdr\",\"lastName\":\"x5f{4,mpDodvscVrY%m+CZ\\\"i'}H\\\\rlSG&-*7l^KobP\",\"password\":\"bF,6Z%a~n2/@8bj{^-p|aw\",\"userStatus\":true,\"phone\":\"5zP)R}'dTHC~(C)W4&3(f*2N!lN~VlC3B7W-wt.#iqW,\\\\S`1/UKp%QL'm'2nsY{@O>uV@u$aVNGW_Gb}?=4|z0F10/Fp3(*Q'Q aNROJ=<SO&?o`8txEh,un>_+Ob6FO#e>^IuuEr\\\\~.[GOu<?mg#]P._CtEs|/Mm]!@}PqDgndFT`~YA}@('#1-.H\",\"id\":-368958337554816799,\"email\":\"Ot.M#mC)0Fh>VHf.:V`:7]WYn>xc(yiFaF$RU;&a-;8Px-SBl~0/B))1Lb&q[Z1jpB\\\"2d'bKW}Iu|7:\\\\i7XC+caW_#MHrVayvC#A.lc&1rs:2D\\\\]$d3*u`_9q*2GusWl%ZlV*Y4>r*qED_m7ZN%)<[.aE^3xD@MuA54;=WVj|YJ@7d\\\\O/'4p61a\\\\8z\\\\I.s)o+k.o-o{AFlE\\\"n0gTs8VPe2V=my&vBF>]@p=Rg84A'BDF0npsA\",\"username\":\"%x|>:dY-eAb$cbRUOl$%a?ih _*P`UN0?\\\"/*GU,2,7LF{o|:XK@%E`h''8M@J5d\\\"f+^Mu\\\\M+s8ceoy=6PJci t2+muygjl|Vx&m|qQ\\\"|%&pt6^79;RL{:E4207G(']|}_-9,?lxdUEc0VU SMvi;8<Y+6pWkO'_\\\\>RpQsuy+0y+yCY`@`ox9&`O_^KC7/\",\"vylifrgmvfgurl\":{\"qgswabckshtcle\":583,\"wwd\":272},\"ayaocvqs\":{\"cthuudmlsdotvf\":true,\"xrereemqgykzildn\":-575,\"lmqfnigcz\":[]}},{\"firstName\":\"urk&CSSec^w,eqpUMO&k;=Rh5q%z,r\",\"lastName\":\"*zI}F=}~('PeFxm]m_Yo9\\\"g!4`u\\\"car.BXuVG/c l]XE;Ln*|msT}a^<rC<1;8\\\"Q~eX=q)#}FXHm1F!ZzxkTz^y`3j66ahxN;CoGYb7,!r\\\\J3U-TVm6sP#\\\\@mDGw~q:2t?*v'R`Ip?h:{v9^f$gC']Yc?2x;B3/4_2ULRN,hFO\\\"G`8d&_X^bc}OtQNUSEf;[XX?XM7u:In%y>DDoRom\\\"'Tet8lpJ!\",\"password\":\"V,]Z|]OH)b\\\\]/y@;=|5%<e@Fz,fFWQ`s@eTUyiK&^>M!|;Auh!*fk/;jY>^J?NMT4:A0u{2`OCDXiB7&K<Cn_|RuJeHg;q5^V{7SN 5QTB$~XIBz=U\\\"*'Ik6x)N{|HViK>{ SLK\\\\gvIjL72[?+Y]S5RY|\\\\j)K)~$C5EesRS|,Qd\",\"userStatus\":true,\"phone\":\"uu~\\\"nU%X{9dff\\\"J=l!3-eptg~+AaJiRcA]4(8LvmZF~vt:{228B-F^tQ21T6{cls X6FWV+7b\\\")q/Pl'yI}7p,&3gz{Ka*WF]^i<#DOpkwDJ'.W)mW|,]6M9Q%m^}--r% UJppr\",\"id\":-4378010504111689416,\"email\":\"zEgcY8rxlRL6~(I%[T`E8Z^={ic\\\"nmj{5jYe&>s-WdV9f!8B5#qSb1Qmwhl`v,QlQ`]2xzs?TxI$_cBQC&yzMc !3DIE;Zg~!-cbr%Q#3p}wI7ayD*[q>2Q4q~0T|Xo\\\\h9P-{} GxIbrf`1xf+RNHNQ]2^DhY[Ia%O\\\"rL=b33ZO.F(q$grH*2`C[/2Y4W.^PeA8D561dT%B3\",\"username\":\"-;wzq\\\"Z/jv3\",\"zveuettzm\":678},{\"firstName\":\"#*j3s>a=KD[Xf3}cwT!*`uMUkw482YYR--|<H04H5 *=oQc)UBN)R^^{]z\\\"$V/F\",\"lastName\":\"mG6@.Tcv<~?D;!.pDh<uZsmvh1UQLc5l*;GS&_/UZOsiUn.n^w=})\\\\uSpxxc}s,'8|3??iu]}.PS`UL?%bzunB&ei1uXVqw=,M+~%A{kn+*/5n5?W[]?T\\\\\\\"_IRkxh I{#oJ#,W?.^T$rsh*}{,tg3.qMbZF]9-Q<;n]^WL A\\\\5,&j |ZH&~'3wQBg8K6R;Ce*6AY.\",\"password\":\"ol4efOD{Itl-wn$I?mN6y_]%!k[]qg$'yOI{lU}Imop1o\\\\K=s>2Tp _VI_m`D~.10KewgL(Bfc30<|\\\"o<|R[wnVo)ZgkZ*DU\\\"j0$EW=)[c>][Bg~6qd\\\\x;3u[isM0uZR]t~`g;\\\"vIn5Ng|NK99n}Z$,A#q;{3.J;:a&:{DIaF>0j:8_g]YLwI]WFC==Q2y_XdwCIwxg02A||m6ol'%Z=(qmp[:\",\"userStatus\":true,\"phone\":\"UplNBF<{wK[<j,QBf%JF0'gBGT/v4#|4Z8&'1>%_MqVxxRfaAaR+Eh)aCM6PQ>t+>%Ph7_'~\",\"id\":-3203372102760117002,\"email\":\"z>1q3'@J5^m7EEXQ97)_cCvR+\",\"username\":\"TAiBYCJ7L S=gnjy=c-m+hdl!EA=(Y'YOgN@;e^;^>J>69-;H@bMQ7R=c@<J+JG@*:l24EQwt11jsD<?d+3Zi~tdJ?F=Y:{r4MUo.|E]iwZ2yZc)=yl}uxg\",\"zzh\":[\"EeW\\\"9KX\"],\"xwzpulbaa\":{\"zv\":525.2,\"srrvbqlhmeprvj\":-672,\"uxtrbebfiiqqgv\":261.7}},{\"firstName\":\") aK?`p>Wsd4]r.t_csx_+,Ur1ty6kgC1.e*)|-h2]f\\\\)5^){~ti}WK^}2&GgxS}0wm?\\\\4)s&w$PEe+ pX/8RZ$x*meC+cJRRn$j>^$N_J#\\\"N8+7uahTYRs%{@g<o&(o\\\"iw[bPGG( iY~iiCX51kq'-%lTqw-t43BY~?K!g4cFt|(Mol/0c-is)$X9`\\\"K&t-]2b-w[uCS4F<\\\\\\\"b\",\"lastName\":\"NvXIknJ|SRMTv)<?DczMj$d\\\" v@JjSrmtN_1(!>e[/</2)X^!8e&!>/n$r)M{K<NU5%KUZ%FSld1?U{6wUHPKvSgb&a(8<TZ$y-h\",\"password\":\"0>d_9/!gcE`MNU0k^FoO<nS;%g6E_Rmc (UY<f`OKf7%/y<6o`lb(b8?yto5+Lk${,#9tj%VqK40t%CO6%cZL^}uEO{\\\\:7ve84<&sh<:CZ8l7:d\\\\{%Z~-X`{DKz|}n^/mc M$ia-Zjo_=$HzT.w V@+|;&3AjVLpB)MD[myLRnmkC~G~lG#dF[x(qCa.ES~U>}\\\\F(6pKb|-rqz}NgXg&#\\\"\",\"userStatus\":true,\"phone\":\"qef2cDm=HVVG`39.WL<!Q}E=QCN}DSk\\\"]_5xOv]o}\\\"tFn:\\\\ntc8>#7k^6,i[[BXQZq*:3O3L'CVPesU9>q?w\\\\dQot0O=Bl$lHW(Sv|=w(ih)R$9Rv{sQJ9F_*}\\\"MsiOh,-wmASjcPx(HZ-~C'^R^e\\\"\\\\6%?QrGME-5ldc]ebh\",\"id\":-4582526790135449008,\"email\":\"$f[(D8%\\\"`SAYG7<w?i3k)LXsFZq0$?e`t/e7o{[Slr#<d/}*d+xg;R~ ~^Lc|<*%1^[>wj/bUl5b^3BxvkS :Q#T7t|}J$;Wu:'C~]F&y\\\"N]p@l#G=2XHWLAc>L4s'%a+H[<5z&:vqI^IqX!Ii(\\\"~rVv!%q#uM:EtGWW~)XXv;zT'~%%R*;y{|QWdPyb`25K%61inq-FQHDcUh'r6d\",\"username\":\"]|UqSGcx6DguLO!cr7 3l!8m yExI\\\"3!\\\"bV@[}X~M |G?Pghfz}W+;b/t{97ja3TIoUqlZDx@E.Qy8RV5xn/pas(g>5yH7Sao>Rppbz8pW<Lwe{C6xln2tm2E:Jo<8H|lp\\\"[HB\",\"s\":{\"ievmwp\":[\")9b(\",\"j-'\"],\"mrtatwtji\":[\"\",\"I\"]},\"ywifl\":-497.7,\"odxhranjvojaqo\":{\"doxtqkuxmhzgote\":\"1B$\",\"p\":true,\"yk\":394}},{\"firstName\":\"Y:S!}5J6Dj*$btgJX-)f;&pzHPx\\\\^1}(0/:7kX2tfz .Bxy{H>hN;_Kcxu@:mfxsJi4q?R38tqRc}esuINW<;7\\\"?:}=@k$}Rc/4p-v?Z^ENKrb%GKlJ/O$A5} Xa1yY3<WV/b]|MQBy%te/\\\"0_TNc{bU\\\":4c`d s4!\\\"-U27?+.pqacFK\\\\fd5P=,_dfIL*Y+6/?>@ZnbY*hV&LN&HoUt:<Pp[/y?\",\"lastName\":\"J/SUcF;SGz/U~&?K'!xE6g#duYT>yD\",\"password\":\"2}bLyr.epXqfda}VhMO'=Rk2%7:}pJdovqH4j()C(qR4_Y1(ENaPNI>|/CL+0QjIf7[lQI8h<c NsRpQ{6Z==EB7[c-Z?Yjkx?`CQ-8YAFa9z5o3?]%2zZX.?V-v!SBnypw8:W%R~W><@Zk7zLK,8!`Gh}+r6;XG7\\\"b;|C_QhDp>$iUW\",\"userStatus\":\"p!E;wz\",\"phone\":\"b2Yb]}\",\"id\":-1250224284757421828,\"email\":\"nQ(wAkD-|aP_zenQ&Kc|cfTP14K0Rvy'J+5HFD\\\">N|\\\\I`Y=,xd>d9|4y,VmPNTG J*[mq%,;<tnG77U]md'`A\\\\Qnau\\\\BA9X?#_5Qlt%VZF5$OH<w\\\".+V02D^a]:^lwV*ubX\\\"tK-8B7+/}1zun`eH;_<iPxK>AS*2bmc;L>kEi;A9i1 =zByw]~e+qTiW7Chzya=$RH\\\"RSY|@A91l${Sx`fK |,e\",\"username\":\"1(ERCa$b]Zj\\\"#8oHwaqK[[DAYsz>`9b}$JveZyEEY+gfl|_k].5cGFS\",\"oyand\":true,\"vw\":true}]")
            .when()
                .request( "POST", "/user/createWithList")
            .then()
                // Body.application-json.Items.Contains.Value.Properties.userStatus.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "POST", "/user/createWithList", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "POST", "/user/createWithList", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getUserLogin_UsernameDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "password", "5fEUy/:2H6a!A2,Q\"(e\\;k{1lyyE#}]mC5yLKQP?YH~]>*~(F|*^4jd:'3}7kKP7ZL%a-7LpTTYA4i|{g}#1CRqsp[Ywt&AU;$^*Q;li[Th3Qs%>NZk o _\"@_6>]W#*-h>&@@+")
                .queryParam( "username", ":dK>v<.}9).<YLUU=v=B*qh]VhS(JO%[;K|Bk0FIBi9oCZ':_E)$SBxH*7&")
            .when()
                .request( "GET", "/user/login")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/user/login", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/user/login", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getUserLogin_UsernameValueLength_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "password", "")
                .queryParam( "username", "")
            .when()
                .request( "GET", "/user/login")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/user/login", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/user/login", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getUserLogin_UsernameDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "password", "33*v3\"K[P?KT!H,*SSK%L%$Cs+FF?\"S9,y{G&ryr(wlS eXn!_QJ[1y;$S&^,.@NsNbjTov#pq)3>|a5_BB<t}5ANYgh[2jEUD\\::lr=l4js-U]K7=e{T^+h@\"?\\(6BiPG")
            .when()
                .request( "GET", "/user/login")
            .then()
                // username.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/user/login", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/user/login", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getUserLogin_UsernameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "password", "<6Wz,FPNHl%8=fidDb,9mkv5 [>Wv2<Z+{x\\pO!`s{uu]mK1ma.dv@3<Z'}Q,a\"v?Aiq'dk44uVq8;U+P`u[p!Tm.?579:aAeDqmfMj,h+[;JS~}l)tY]Z5w=+}xiV$)\\RA;j!o@tlub'A3uU'p5!f<M@(k_!kAci*|dWmUO}i{_@Uy!V7BAk%pn;Gy")
                .queryParam( "username", (String) null)
            .when()
                .request( "GET", "/user/login")
            .then()
                // username.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/user/login", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/user/login", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getUserLogin_PasswordDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "username", "%B`>mR=l-|anZ~3b&#|n{kX*jOG6k7OUH~gp[Zy$JvuO(XNZ;}yng+oA~X$VHEsv9)X\"Uf}x{ zP0K=wh7[mHUk#MzQ`,oHwOq*_,Qr0%FrB`GcXn?=>o,wf+D/dmK\"mNK>cMd,yRze>k<H6:cB7(%[Kv")
            .when()
                .request( "GET", "/user/login")
            .then()
                // password.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/user/login", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/user/login", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getUserLogin_PasswordType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .queryParam( "password", (String) null)
                .queryParam( "username", "<\\,9J2^P[~(y!w,[.,VHnkGamRvX-tH*i,yC5Qd8DYNd%0tV&I3OrBA82_\"|7US@%7/blLx^'V^!m@/^h!5gn%<nYsi\\;@)t1I(>Rp?\"),C%JpT]X'&Inx<,")
            .when()
                .request( "GET", "/user/login")
            .then()
                // password.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/user/login", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/user/login", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getUserLogout() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
            .when()
                .request( "GET", "/user/logout")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/user/logout", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/user/logout", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deleteUserUsername_UsernameDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "6")
            .when()
                .request( "DELETE", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deleteUserUsername_UsernameValueLength_Is_Gt_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", ">-F55MY;%i@C3zg*&L=:y8X1t|%bEOK_2&K`R4N!lm2NTi6q@]\\}byO2.QL&s)*1g=)EKgV(X|6H0A;vAc;fDi Yvbw'\\kCFSQd6D^Mc6s0X/r#>`xwjXT]N9fgFDJACY=tw\"45RiB#/cTS.LqRo]N@_tG0ero}7pJU+]!+^}8rHN FCcso1/fhz8:8'=b}^1</Cur(bU3k/N7ax5{?'+Hc~a)i%Z*um$-")
            .when()
                .request( "DELETE", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void deleteUserUsername_UsernameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "")
            .when()
                .request( "DELETE", "/user/{username}")
            .then()
                // username.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "DELETE", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "DELETE", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getUserUsername_UsernameDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "J")
            .when()
                .request( "GET", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getUserUsername_UsernameValueLength_Is_Gt_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "'N Rp3AB@R)|\\s+*a`Yt%gmh(H9ETmb5y\\hkEe`}S4)`v:18IMR#f48)c%z{3,v+w_`8=nEg0q`j|e04tj,k, TYGOR02IUO'^GLLLl;W:j{'xiHvHfDZT{vGqUJs|imfXg2lHS^Y>kg[r(=)3c.)(nw.{%Vn4K2g}|byd7\\Ku^xRZ~:7Gi sP^&&|\\!60?VQm|w\\BFH,\"|iS<HwnFw")
            .when()
                .request( "GET", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void getUserUsername_UsernameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "")
            .when()
                .request( "GET", "/user/{username}")
            .then()
                // username.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "GET", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "GET", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_UsernameDefined_Is_Yes() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "F")
                .contentType( "application/json")
                .request().body( "{}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_UsernameValueLength_Is_Gt_1() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "9nUNBeohP@#n!Ip2\\/>DUIUZ95BD mU/\\If!*(}&*O+5O6(US'D`W&ZG=N.W(0`WDlo5`9kndq>G8n34P{#*^8[G_P?kCNG?M2B|E;4WX\"(|nGDjxd-a;VT8P58omEft#04};O W`{#mU=#(?O>Uz*IN7HHaTenBXMD\\IoA%rF7W!6cZiu=30o9'*Zwt/am k@;J$<J.VOulY+:`V4>&v)}!-HouUnO)wVCPK9Jj+A;R&N,29OiZ]yGir*-")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"tlg/CHSJYLA zrIz/!T.%d9,N/&}vN>g(q[`G'wMPBX-m6g.Z* B-`huG>zUu1T8bxlueS!w1F0pn&@5zFT7rz*xCdFW=-[*#r'==yecXlXIa$W1J;Mehkn27+a-nD9]\\\\kK{ RM[#gGLAl/KKMe7|t$I3<h=R3OH3qK]R@67R]dT+-I,NDfd0-sTJY`tSf\",\"lastName\":\"hj:c/.a[`\\\\Lz2>o0XVl{fJ9o@LND%TNbBBFxo_%)=F?q4zoe?j=tqhFf~{?%HgVSko34];+tlW!S|GM_\\\\elgmWeck~&ZNrzL}8~bKcqAT~c\\\".zQKl5'a-dqUoch,F;\",\"password\":\"JB\",\"userStatus\":-46203582,\"phone\":\"=X}|x7;{XL3Z,8#1PIh39dS_']Blw3??8\\\"aKGjgQcvI[^mmx&99By0|wcY,Y!R\\\\iLTy8&SLXxlum9B V8J~Cq b.E([?0@8,OVc=k]^u%M'Ph4}#?4V|qe1qX|5%XI~<p{mN=|9,MsfVQ7/R5x9YzQus.a,J,*(oHY8)BtiBcW\\\"pYNA'$%KV4q{LES&L*\\\"v@LuO\",\"id\":-3693452428446114929,\"email\":\";e9gB UV2u=)a#\\\"a'Q.C1|7c4#c h*o]]uFfCx:XSqm}xv>}>K_kz.~)Ryy}BhyN/6TLbhN}1& $1kJyz _WWcb)/]xa5.P&2IE9VTVTI,lW9^|l3{/#%q V)%Bl'owx,gZud(^^.r<~/ivu+a?:%2Uw|eZ#?> +]2QcTr@gIPi\",\"username\":\"-)<U2`8H4CWxX(J28RHA*l,*}-IRmH>pq5h:/douHCe\\\"U7*se\\\\ju,!+4TlT#A24I+VV\\\\\\\\+-aM\\\"*!Q[q6o}1I_DH^\",\"mmvnhsw\":{\"kw\":true,\"xaqvwj\":\"U2\",\"ysjvnpywb\":918.2},\"ofmszuabdgkeqx\":[\"Qj;kd\"]}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesIdValue_Is_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "Z")
                .contentType( "application/json")
                .request().body( "{\"id\":0}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesIdValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "D}D4Iy:`V;[IAEv:\"\\G0{\"&}'9k^MNo_P`\"<aNyB>@kR [Um0H*+<V/!]P&-7r0l3fW\\#=aYN$2s#;p+LZ")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"\",\"lastName\":\"\",\"password\":\"\",\"userStatus\":0,\"phone\":\"\",\"id\":1871254962919955723,\"email\":\"\",\"username\":\"\",\"ecfxccbfmshfl\":true,\"snjksjqlf\":{\"nelcaztdnhcms\":-307.5,\"ikx\":true,\"ehz\":194}}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesUserStatusValue_Is_Gt_0() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "Y")
                .contentType( "application/json")
                .request().body( "{\"userStatus\":264151786}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                .statusCode( isSuccess())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_UsernameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"teS-.LJEj?7[m\\\\.6O=}PoeoJ:9([ZQ0tiXV.NI3I11%S-0bQqIUqY$Ev-8 !M!?,Eb5BavQ\\\"k,n(bL94U4!|xsy.zxsp&r`$(UXTau>Cye&&TPVC=id8C}DdUS`a0XwV+Y#`/jiQ\\\\8{@L7GTx3~BT'qhB*|)8\",\"lastName\":\" 3FqV.au'\\\"je(>wcesrB\\\"X-K6U#]I-I*#zgkt0CVj[-r1nU/-*#KhG,Z@o%#,g7MAGzKM0^FH^412Xb_H@[`\\\"O(v7OSwqvr{0]Ym0Pr%&6$yM&Rl9=9aS#gBfy}#;Z}vG70xp5k>GN]P&.%O{OZ/._Vb>{0b.>s'({qgfk!N-7T2?woNKw^|w?S@qA8vA]SiolVaXF9/,lu\",\"password\":\"\\\\3TG2T_VP33M^kk8s9`X+S_b_q_@L^X\",\"phone\":\":^=cOU4,D4lHmb|Nr+{SCQn5P+i\\\"4X6lX0Z=Z+L[8a<uS;kD>s*r/=tUS\\\\cxm*ro:rFq=~E~[g'PEIWT-Z&+sAD-Xp}lC1HgfpL#3nmn\\\"mAC[z:!ds6f^FX4n&AoUHKWz{*$] rMmSo[Ba(eZob?y,r['5ZiPF,r W-N.ZJ^`.lH|o+I;nU+}WMZTs*u\",\"id\":-545629399849794904,\"email\":\"*EMnE^>84D@q_A9}%N)%$?N0%BEI%abGQ*atJ*zYf@7?!#wn#rr)MyddV1#_1KK>:x7aH&oi*[#M|^:}>ARJ}>LK'Bcn~cumI3)k'L_DkZiy-(y+7FE34\\\\_n>!#/Gp1CVD%st>53L$iRQg=<,R6,NM~iWzI2r^d>B*N\",\"username\":\"=%Vo)x8log.1p4U*YO35k;bhK$o5R:G[@3P!3UG(,BY)j9rZ]B&LA %#qv~mS>6/r~oix[i`>{kd5m40PdSLa//BBBhkOgfxpD8%<?.r#Yy/jB4vd&a9H+E D)oX%j#w)v)DfTvP=v=nBe}}|W[::E,^56gk=6N{wi^ L:JGXX/g5wWAmKNEH=F=?w;LqKVLO+:`o]67oP8TO|f,>X1Cxe;Ckk2Uah~Kd\",\"xo\":-262.0,\"jzpkttmparwilzh\":\"wZIR\"}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // username.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyDefined_Is_No() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "Es=ZV!A'*|}8HnNP-pl{vr\"0Elw^7*7OA(J9)Nkq%\"ci>O\"\"f43u3$oW-uruz;<g(6ml)T<C7b!6M9T51HC\\J>J.C76O|V)8!hz,Xp#||*_eKI'~}~tym%:^2N~:-vgo.JV$")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.Defined=No
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyMediaType_Is_Other() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "Nyy..dnHFe%+_)Cys'rn_LU\\r0Y/PL0<szzHx=2a3mK,dsN<LZr$|YCsg-R*{6;J^!<6M.3#9O{i',xZehn7*UOCZpB-N}0|H*.3nGFo</>4{N4T`Ase-q|j5")
                .contentType( "text/xml")
                .request().body( "{\"bqnq\":true,\"haldrr\":-745.1,\"newhetgew\":true}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.Media-Type=Other
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "usF%Z/:higCkNwvn7L`b~EC\\?zCmiH:7l2WGH'y:W#1UaEq&b81;G&p`gQqga*_knvSESq[4P*=Raa.C,2P3")
                .contentType( "application/json")
                .request().body( "null")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonType_Is_NotObject() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "@,RU_qo8;G;h:?o(h,af'<i15-`^PJp$p(@#rGJZ(b#9^<OxZ_JMcWz*c#")
                .contentType( "application/json")
                .request().body( "\"Ib\"")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Type=Not object
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesIdType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "-8cifPBO\\EA(Fg8sTuBmI>f-{Ip)%0p:tn8u1QhBV'i!i/>Pc9RILwMi)Z_UOuius1h<InV.6qe*Fjhcfr'f>$4$6J?^9VxlVAz6;GdcOwH9e_Qum`hLh^;W1~<*+Xmmy")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"()1*d&BpZqnNHzu#^\\\"> )<ZG5GE/&P-e\",\"lastName\":\"]_.[ZuVjrV^FQ@\\\"5ZTKBlt@C}QZE(Ab6o#J;TBqGav{?BLyf>GEqw=#u*+YT6N#43tOE+x=S45jo<SlJ&LjrN/e5OF(>7/fc%80KA:+2a^{`T'#qE:{9`%;dfW)_3-D8}ctVBMc%^s4!W=ey-HNHORPyM+JoIRCn:T}D\",\"password\":\"0H1 96^5gS:&mOAJU^\\\"+o-Q)9~Vm\\\\=a\\\",[tkx.cLV-83WV=t:LQXTx}4.0MYrv3XEna8(uDFTr8,=8 4xMbl.2H>Z-^~D7w8Mg>_/jPj`I^3lMZlup!Nd:9oTdQBC/i:G+xBO/P%#\\\\0P91E\",\"phone\":\"mY|<+#AJ7\\\\?`sGvIWtAS7-p^t~`w}tv't,G=(oNW85|>o@(8S+L<R7Jri`P_;p0o656K;tk)+A'z:lm]oxgLIV_*=&<,3e}d\\\\O1Pxi(<Ob![p}UCCL`Y5ULP}j:D=wK<.0=(eDVw~5XlH!ns\\\"~afR4p2\",\"id\":null,\"email\":\"@$I?bt*m7[#%K0R yW`x5'VuF\\\\Ub+\\\\cc&^[sfH8n))!M!Cpc'dZA$_)Z^%y-rR!*\\\"\\\\bo@9s[Y'>YGXL#8sT'eZXF?v6s=@\\\"w\\\"vn(OgE\\\"A}z?]&^W>@b<hJ|,Nnj! pD]6_Ks<uZb\\\\Q(7,KJ^~V:S#kV1b1,<eP[+[B18zlWcR'A_T^^,:rAaJq>8&]by,p7>RY(N~K9)`K|TCUOPf\\\\qmm'R EHh6KsI*y S?9T0k$7T/E#r}<TeZeL>Vkp7Q:u\\\"d\",\"username\":\" E>/]EC\\\\&chnWFC;3$ftrH*&\\\"f}Ca6uJp3#B9%D+\",\"lmopqfcuim\":-282.9,\"assvzi\":808}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.id.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesIdType_Is_NotInteger() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "C8+C :+H7IXnaKCme9s*!BjTqL&>_*D*3 ~wW{gz!.O3`?i3.LHw*Tm28Sho>r`gM_sR70t1L{E&(V3kEu_kJb+4n)K^X>S'V,iBw/<#Hs{lznMN=NK+&L$rt|^Ize{b]PjD{Ec>iU[k6rc({!_@e`84Wp;&U+v\\C=i<KMuS(Os`bE+KNefip")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\">UTlE\",\"lastName\":\"Ke6i+)5.^1JM@>-KKHBxYah?cVTnlWC=u[6k8JuotU]e\\\"Wm!z3|n\\\\^T\\\"X>p<`O&GSHrh*`cn\\\\@'{6hc7{U.D7e$P&A|(Yb>*N@*e\\\"L*${9E4MdeIwkjfcsuP+(O8l>w>FZBF#d$\\\"KjSb*<0m>~rDpr6/i>M\",\"password\":\"EoONE)oec{8''[I&YE~jJ4 N^,k.9?chx>eM#\\\"$ET$*_]h)gc<\\\\_ TGrA2{3\\\\ReYF-9n/;5\\\\VXl'TC}uyD8\\\"=I\\\"hEqIj6EC~w,4$X`lKJQ8*\\\\qq]<'%<>lq<S*aK?x KcJ6^wRzNoB2t\\\\<)SK24V/5ucAW R[BJ<`..1,r(/9`i4f\\\\HX\\\\Ro&R>}1F~K.3>Q$L!5E54YN,H|NKEoNT{iuNl'e||7t'C6>~0#2\\\\\",\"phone\":\"5>I)l>{0&4bP$\",\"id\":[\"x<Rp8\"],\"email\":\"%!_BK4tK``svT|i\\\"J_]-c8>3yGj/bpl^dhO$!yk9(Y.:R;*S7Bw\",\"username\":\"<}=JM4KP#DM+>2!e[d4S/>#cjCw~`j|kx]Y?]@uB ^EN]a3Dh.\\\"h%[j~ ]\\\\6\",\"ezgsc\":\"Md\"}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.id.Type=Not integer
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesUsernameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", ":/VN:3zc<i")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\": BCz^[rbtH3Ck 2GA%/$txR0Wm:S.n&TDcT]ewr)t;2)u~MI?k:QV5$9y;( /{)}j5Hsc+>iG=cmND&\",\"lastName\":\"%iIy?A7#wN^8lEjw$U=9B[ccc }PwxU}}'7u+\\\\fR[MYqzcYs}~mn?L'=S1EEHw\\\\\",\"password\":\"XvADK`9I}t_abv08Qi6yM|CG[}~dqa@od+v]Cf,|=j(\",\"phone\":\"\\\"c`033 qVdwj 7\",\"id\":-3094603983696809840,\"email\":\"EWhrE2U@>;XQf]{VW`Y'E3j2joABP:po>#\",\"username\":null,\"adobw\":[\"S8pK\"],\"hm\":[],\"mxzbbhg\":{\"lnxy\":626}}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.username.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesUsernameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "]gc}?zVlv84jas8g||;_+_`Dte<<00[)}BU0Y5Pn* Si9^,&M2`YTieZi=BuuT_&+X5:GgEPs`z;e&Q-jvp6#y[.Q{EcG:Rj U.=I.vKCQ\\pmMU%?tQm&O$\"9FRYzM0oRJ9E,o2xoM\".Rr/d2Ee1eBc^D=4ws1\\y=W//`vB<Lk&<W:I<HWatZEMT%u](4np4e]vs")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"7t'sq[>FO_{:YF>JVmaYI*B%re\\\"{\\\"aNLI6Lz'{wEvY,6z+JOpgxjW>@N{Z!1KxSw]k\\\\\\\\v:iljOR$P/' P54Yh?^Irn<wwO'^*dLLgAfzXL(\",\"lastName\":\"]3x!/_^ mLt}RYfHF7F2v+!F*J^xsh|u8~=Jf@F1)1,F+Iz;=St572ZQiwBV.|g-pcTnG^Dh$Hz \\\"It&p>To|p?\\\\*?s1,>}[9EtR~9#i[53Mx&36P&UrZ&J&.@&=-.SjkMDM,8a*\\\\k~'{<Pr|6j>`b#7FwRE./55ux!nu!#}soZIRtzs~b3wSK_UrQ];Khzl{p|;J4$)|/N$\",\"password\":\"v)+jU'H@`<hv=1m8`9L*P2]kPFHAm<E>h$a4&:Erk! jTy>z4_-sjkAS>'sXF}tb(S:PvJd%C7225oo0o!7n\",\"phone\":\"%o2B8^ \\\\y9(N_n(G I]rbp9F3Z^^YI\\\"l<n00q:me4#v#SzD=)>[ fY<xQ<fyvbnt\\\"))L1V5ES0[9:$7VWqLoc)X96'l]?x(T(GIPz2Fjrx%Q-m0>i{P?8HU7uw9%#oe+G,o0jqzP@mML,U!28\",\"id\":-926801895799774915,\"email\":\"xwhu!JUGW0+;BK&7\\\"gi##n{gO2_kE!13{^'`D*`LkAD(cgo8dx/Dv\\\"8IoP0;\\\"-Mto?dCT~W4CLb!IS\",\"username\":{\"taiwarahuvni\":293},\"nemyrldholdn\":429.7,\"vtfaozsxytuxwfsj\":[\"%850i&=I\"]}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.username.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesFirstNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "6C?&!\"j/a^bYV=T:OEx@YpWMSyvQJo~:Fmn!,XX;~#\"#%c_''X$[+>D&9Xxc.\"NQ>Ta,?)}pBM#7|jF,IxQ.1")
                .contentType( "application/json")
                .request().body( "{\"firstName\":null,\"lastName\":\"n)HMA>jLaWiG$5[Y&{daK~X$'.'5w-eK.0g=(/IRt\\\"o0*#~3?kn8F|7Rc~ nSSHj4E>ge6@\\\"T.I8Nsz5v/}F+iXNuX2l6BY8?lq!IJf3-@xy8:6YRI@`.[z%vX(W'YWD-\\\"~!i|BSfW:XwJ%z\\\\9ywZ]cI2GHiCvO2NGbTi|&XX}>$WT,UjR& zGym]QlnTPkVj7BmkorTr`R NuS|L*0ebP1 ]LGKa\",\"password\":\"k.qQy*[yV%$hgmxp5wGz0QuI-lk{w0O4CZS[y+DlFdNUr3nl14x{sS<eg{>W;@8[VlbbTw`cAn~_x+DxZQm.q=AG6{9~iZ/c$.|&NeX*\\\\V8lGz=[]pPRnd*P3ID1km?7j),$tbyxfx)*6JG'r}ZI1{Wn#<`h'yeJWPcy#}){^_*:EA[KPcgQh<7'ISds`!FEk1rU0$\\\\BZ j7Yb>-_dm&Y*%4cj]A9fW\\\"^X|\\\\)Jza)d!\",\"phone\":\"T>>^hTG*(kChaK T7.@l#Oa*nBxV?U)eGojS9;ju1X]cEs|;|-|wvfp%!7{cxADOD9/0yx##rjeJ-ViP>e{*! WKW^>?=8 Yt;t(ale}aBEy5|@\\\"gLa|:|Irx@>>}hNnz(%`Eb]M`;s7M+#*0DY?N|]bByjX\\\\oWXc~$9Ko/t78.};Sy|'@=IjETK?:<4?tPJ^MsDwZhlGk*Q-cs99[.Y-Uq]b`d],ix6Z4_ZP9}T%;!i*| EU\",\"id\":-2883217186831011428,\"email\":\"\\\"*FZhqAj<Y,`^9p[@?^lS!buFWOhB00Jz0NuBa^EEdque<N]GlM2E&>U=*U!Lf,tjsnslVG{BH<V&<'8kFxz;X!~|_D.s:OgSU0\\\\$qU#Eh,OUqlV\\\\8_gx[QuCl[I\",\"username\":\"t*^hXD~3_C/^-?,j64dl\",\"bollhtjrudz\":732.4,\"fedi\":{}}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.firstName.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesFirstNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", ".whux6gJR <;$rLyrS,i_MfiW'_J&~Z@~\"|:\"Wp hU']C5lD7a~3/IQ+'?gEvs%.6DN2{P}LM8k[+a^}zJFuK3=+L0@=&ihV}Dp{-@Wd*5%Mk\".[%.y,S#LqY]W]],Nf`")
                .contentType( "application/json")
                .request().body( "{\"firstName\":true,\"lastName\":\",+f<9>N)z?Tx`@=x^acb&w)X$VP0L@?)GK%26rZfjMc%jz*{ !`)Z6LjX~: DrZGF S F~dF)r)f~)k3j$Ukw.zG>@P>RD\\\\M40OErhd:66VNh*bc iM|ZwkA;3PVtU.gdM+mD3,JSI_P0As[c/i,l!z0}t\",\"password\":\"*&^=6k)R;_C$'esO5C}j:8%m l7!]5tf;Ao|G7]\\\\67)J\\\\rSW(l(38&@u#B248G\\\"Z*5'2H]~Zr(\",\"phone\":\"s0&3Bj.f7F7bDa>j=HS9A/1FgNxFkY*uSe%kI/ak\\\"Z'Po~}_}WxDELm`N=bR}B48bM Gn0=%p_|Ba,`&il:Wa<ddYxVqw[6\",\"id\":-3325809034415823979,\"email\":\"Ulb2Le:q1fH9'>bcLE[uv++G*}cD`#|L&K.@*x ue?^#j\\\\D\\\\/w'8h(\\\"|`Bq~~XeJ{wU@\\\"=\\\"(3Qcvh*n{V95s&4b6~mQkab9%C-i;)12\\\"q\",\"username\":\"lwbFc$&>l\\\\`7tGrJTXJ;Dyc\\\\, _[lzTi,rS B}\\\\]%1Oe9~yb;/C;2uq~;-5g?&~`2[|)?=Okr Sc0@?@RFpk}r(t[*zAhXZb8Icm<:;vido;\\\"_ i3>/|:HQca\\\\TXU,.o#;%E!x\\\\1=&J\",\"vlfdvuwycq\":[],\"i\":\"[Z>C\"}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.firstName.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesLastNameType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "7RI;6@s<j!?9i+v<fpKz?^ meN)<jz=.&_cw/SAvF3}zK(e=*3&X*UY0?v_WObtw|WLX|*r2:hxO C30|/1%miew<QO")
                .contentType( "application/json")
                .request().body( "{\"lastName\":null,\"firstName\":\"4hj}i[,LjFIm/+yi6![;OfeYIvF#3Q3]>&=$re<B;g{@c-aC)zWi:ZT<NK*_Y?45 y2Ol_6advkpIAbAJG@K}Up0P%;#AL]3UR)fT|R!U`nD`?*Q/#O{+*%%|--ac%8Y:6aE%oT\",\"password\":\"WT|HETLuWR.>*[vr%#jl~=e8\\\"h>]IqI3L.XFXfW1*4=ehV~Z{b= k8!-6IL{Xzm'ILr1,[)I<gy dBYZ-~n'lY+W\\\\'pMLYm}yK0It1J$.$1\\\"B4m_n@z<E)iU1~{nHp{92\",\"phone\":\"f&%F0fj?!dkX*Td{@OeYhU [S}gDMKT3v^8(nlD6LD:h(vxXeuNsvcTJ[-u{BU%WqpU{II=4,Jftj#{o,`0+xbO4&fz^e+Z}%R@-$Gph$<T=/z}jA64ymR0`sY{<-#PBxOx~AZ|4}tX&w 4Mg>I]\\\"4D`B;Cy24@:?HAs\\\"1U?>9b j?cJHW@DXZ-\\\\H87B~$B~\",\"id\":-35288984906015646,\"email\":\"Z9;j1xmz|$>p;>1#bAoQB+RfqnWEV]-C+1W()|\\\\eH@3\\\\8!|WN\\\\wF8D#T^v]!Xe2b\\\"3M)r[?VK&aZjXK-T-\\\"g!gS~*?L?i,\",\"username\":\"QwBi*nP3Ynh[K$g@Z*jw0]G%X'dU$'?>G~[9oNHktk0Y0^=1)r~4Dc82=;Wt!lYyR@7pIoN]LnBh.1t/e^7QwB=\\\\ |).:TcK7,lBf/U\\\\+{H^qnu;=-ROs:s`X4\\\\mBRn{[,`!$eOOj9<n}!wiLgAxGDJ$QyapE.=e*]yYzs&h&e,w](-JRgvTq]1R}7V<.q[!Wwb:hu&$!QmS|w:hm`-\\\"4Y$+JY[Zs19L\",\"xzzrkhshepouili\":[\"Fq\",\"^a6{yJ\",\"\\\\{}@?%Zj\"],\"arejjvpnbeqba\":235}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.lastName.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesLastNameType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "KF_!w||*uOrq+u58qyB|m}#W1(uHdK|Cy6/>Vmmtzsm+J)klPKOvI+8c$1UMVwsvRB<8_%|0K&<em9)/lq6tuaU*E[;#p^EK[R_#9@<#&S,>9$$VwQk8a#]IF8w`>,H~L``d`=vd!\"b@a4!j.M&ruXSIsN4'74AZOt9=J7$NtU`(wArm{(5G9(T$na.wQ\\hfIupf(D;|`st:\\mQIV)%;X?wX@1[-c")
                .contentType( "application/json")
                .request().body( "{\"lastName\":-353,\"firstName\":\"kA9QQI'.a,`'o;\\\"x`z12 ]cQ`o(G3`9a/&sjHc>_K+hc 1T5h|$uKDS3cOmm#?cPy<VrB]JzVda1tp`UYOi\\\\}P85FevUo[y-n)#hMX]Q^rEy-\\\\c;6Fl=G>zZQDvGM\\\"H~iK! JEB4%cSXAX1P*dIbRj`lqc(W|*V\\\\jdY#a{|LtA&G{AEXla'?}C9CD.j`o\\\"Bwxa`7td{Y\\\\c@ h?FSytID[h2RdZh\",\"password\":\"nN;/@,Irh*.D*!hc%*\\\\R`kD1>(KSmZ+)8H&pSbqt/g/&*R`9KM2w*7rkL\\\"G['g%,J.~$bPB0Py>%2[m,UDePXdH:zP\\\\z?%|}u\\\"R@$5^[L^k4L5B\\\"nF(Yz1btXtx2Ke{LanQa@A8Go bB8g 3oRNuHmV|@6~{gj(8AIOUTEVO~tzaeE#vH5?DR?B|e|_|)v8x&@W'S9lg9I\",\"phone\":\"IjLEc)\\\\T\\\"eI[q09N#nQ$1YWgSz>gru]e7G_NafO%N0A&uO0~m1gr4+/\",\"id\":-4426562715588325872,\"email\":\"k/X1PMo\\\\83d9r#eurrn=E:6o\\\\1S A:CqngowS~Pkk_nbag9?H3/blHvd[.j^z'P9sD**s]yO2%..!7m2UD(VT{,~n,sup}x>jKc ^[Ss?G\",\"username\":\"*=/<fWyRXuAh@lq.oM{`K*7DDq6MIT=2|C|3HEC_AmOtG\\\"92z=5M/7Dm8[g'7<;VS}}Q_f!_a%6#]r ?lZ8&>`B\",\"rcoaijc\":{\"nlqzelsferr\":[],\"pjocrhrjxzc\":[]},\"xljrlkxeakxbnk\":\"L9{#=a#]\",\"owjtan\":\"*F=}9$\"}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.lastName.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesEmailType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "AZ/a/y)T&y6]Az1|{2p.>4SG'Y;!!yUP0YEU,ZR|~_'D\"`Q\\;nV5L!#A#nSjGBRx~Js+R(:dPPE?xdnzf'zN=hjn^Su[GI;a J. R}if^-hZZtF\\B\",U.Ec*Zt/X^vz(Ub7\"J L7ZH:p?Ub,[AY{0+ayXNLy=}M?dV52<XR`'Cm@Uz!LG`+zQ jhr>H^IZuE#<bdLbbj!X%A")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"d:l$#U)~~A\",\"lastName\":\"-6klgs3-qVc>VpZ}L|d}cDH7&doS>U8N6<5F(twnhEa5_AUcc*nD(?QXgMO.\\\"gK3\\\\Lq%p$LxTLODic':Wjy67PvL m_@Ta0L99@-(\\\\7D@?}YSM,_)%cmF>;\\\"#hBY=[+[}~3](ZFl6m9hL,g]zh)6>i(=J#=~uBBq$RTZ&-_O6+[ty.[\\\"nV|?|Y@&y|52%AJaywp@NxAK:SGM.Yu6=zhRUK&>rYJB|{p\\\"G[J~fR_x(\\\\xa_W\",\"password\":\"vN4g^DA6:x$$sN]vX;>r22HOxyknHj>9p@Z/\\\\7&#*q.E_41!|_Z{hXy~ZzcXeoz2$pfLi[qzwLT-Jo^<vK{nf'1eO`$,\\\"z0C*bjOQ>toaJiQXOeU~Mx`\",\"phone\":\"8N\\\"4*oF. RUSya(M{7/LJ*Dpoac:%G/*!8TakKmvrD\\\"X&+(l{c(G; 5wZW=[&*xES#$@]p~.~m&%$e3(FnP3,`,Mq0y2;4hUmyIynaD4,zxIs`/X3t9&f1h9J\",\"id\":-1994416827228105196,\"email\":null,\"username\":\"R+RvL](Y{s_!OAC))p^d5;2I~G|p5#|0pWz,*FH}wV^[.twtf;T3{c=1?us)p5v>[ZA9wiW>gd~@NChg12(:nXkC=D3Kl\\\"peg'ogi@`|pGI7G'\\\"V^!)W*`6ZA,3u>V0NPqbTl8n3wE}><u*D\",\"qqfde\":true,\"ysc\":\"aEoqB=2K\",\"jrqtxst\":218.6}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.email.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesEmailType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "UJ1c:M\"y3rQ7$-)F6!L&&I:a0fG\"O >|j=~\\G3w_=B+<,,0[B>@D.b-ySXzKUZGii5g]j D3)H<j,")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"9Fw=LlQulKDP7[T?RY2OjCxR3dk.?qb_v[;EJ\\\\wm;\\\"wD5|@^o{#\\\\b&44{iIQ`$w^]wD12f~jt`6D:xXhwk7\",\"lastName\":\"1|sW>2|SPwwP'$HU^+J-*.rJVe%%,3W9#G93?eGVVxi?GpO)7#25*)Kn?pZoAQ0y2]Z-+cd(j9{tA>9/+W SESkG`Ns1uo\",\"password\":\"Zu(A10+~C0[ea\\\\R0`\\\\?\\\"Lryq6E)`q]q_^32'BBp%nIoJ3~5HV0^(|:(+~JNjp9DA)Y,QE;M`B!kgXI.8gZ2Q r}%N4tU_!}f@Mtg6N#u&n%Y9,e8g|b'vM~p.PH!&56DT1w(b1?,*+Q*7l~0/KF?A$b.PUXgqU5$t}]69=?R'F1DXFK1I'JsO5//hKC#*\",\"phone\":\"c9p3=4m\\\\-X4Hk-iJ?%RVvBN\\\\xr=U#;05M62NWUM(phL(B9x[y+(d1)@.<F9h\\\\4O`.P}Dg-Uo-i*I~.9$+~DySa*dP_%AQR{o]yNuJ?_qn~?_7v%qr4`f,(>Ux\\\"z[%JxX]Ou6% V6{qQ3~^xI=]GpIerVLBfdcI8NpJzjdR\",\"id\":-384578063594154041,\"email\":true,\"username\":\",a^Atd`X*L~xz}p2/D49X.K&C*unuF!\\\"h=$jQR;xDLE`pi%t\\\\U*dd!)5H<Y5E Nd>R^,dt0jN0j^Ere:ufI I86w/8.cK:HmfXDwz!J9\",\"hfujxjrpn\":-349.8,\"hqluhuonpyxe\":232.5}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.email.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesPasswordType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "p,;'oXS\"xRhEK6F6dDDu9{N~0nVVnI\\,`%ny*%Lc&Auy'}]8ci%-r`0!!erD,Dn2I3R)Db")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\")~/]_I>9gt@80Ut8a5'Jl\\\\?L O=*Iw!Q)ZU\",\"lastName\":\"N%;NK;E';l=v==)yo'0Pf?9XNPZBe.V,l}#5gA5vWa|$&&l9NBzl-(CnJ{OS%zz0ugdT5#xr+X}~E8T`~27#GqR\\\\.0.FWB0n@J{M.qNKPKY >xKF0eyf~w u/*N~N~!vvq+Th$64/OBf1tGoeuI%P:iZBGgl5yH'L$$-b|~o2Jz2~5>)ar\",\"password\":null,\"phone\":\"_)m`nQmx.LI)\\\";Is^*3$xm2dKFAHDN0sbaN%>u?CJ.LAjLa-ym+%HP)bTfS*RMkvBNeyOJ%tLDasa^2!3D*(oTZ)P`loOs$Qppd8{$vn3GPKwx}a\\\\!2~yKIaG\\\\0:s=P4xq2,{@|'gw<s+ \\\\,vRHB3iD9d1`|HdU}h`2>wzXh!swY]\\\\@r5-eXgTD<3&Athz%VHK`zdqB_'~7\",\"id\":-3667040517872445208,\"email\":\"!~''0a;PCJe'$XvC]Ka|z.w4Tj\\\\Z$YCAaVzD207b2FDkJKz[1 @qe~vbb@55{{xXpu@?iM$oad/pW0_5e:'X-GvqZ~.S\\\\SK+#8!#kdP2CIPBhR:&h/]5Z\\\\)*4M>%+{wRFfC[]qI#TC3 (P48x+\\\\HD#&)5J,4Hik[`=&q3@Hz8iwZ-diB +e`}!&%Hke{/+y:m '&tmTEzcB%:auB980gG:/'t2b.Yqrx3EEQbh_.b&\",\"username\":\"S8 .d?b-$4_-6\\\\|#(S::bl9j<Ct>&oqhsY68?>-$[2vh4J=@#r(mEAFpHNS@z,P!?h<>]7dqd:g:`$t]tfJ/1\\\\^*akr->H9(iO7CQ~2H\\\"knK40R9ZJj<w>0\\\\MJwPQaYnm!~V<TrVpk7\\\"J][35*g3J2tLTFr<ftlL[}R{QaqIO*\\\\JuTPh3`Bh65&g\\\\nSGBlXnli8P.iQMgAs-]{?_U\",\"zrqtljntkvin\":{},\"hticbdd\":true,\"vnwezebylr\":{\"xie\":[]}}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.password.Type=null
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesPasswordType_Is_NotString() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "\"[6S$\\ivv#\\{LvPE_.YRL4N={%T^rq;WaN7FlrmXwSy*48%pT]P ;~e0${0<y5kecS~P")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"j*2[;J'WN+N&^yhjKK<\\\"/LkY42J\\\\FD:FMpcE#tA'0798TZ[>\\\"]C,eAX>Q{1[JJX*Ie\\\\>$5CLOd]mA3B]xYqrUrgWl<@XzE;?SFRF7Z'0HM}0s-M|\\\\PXRAH)btx2FHmh_KT!Lr/<z{6~sc%Xsj!XF}Zxr$OW7w7@W`H-,H&jZ4FSH(`G[841Y!}5iM_~mA1a\\\\tX#jSfE~Lyb8H,q\",\"lastName\":\"sjodEvPFu`9v/{\\\"^*i I[@Zond!:z/#%kDZyA3-FMXGfpIU79>wP`8B-E@)K Gt}r0?9`_B`P,Sh^]Fh)|0P|o89R/>s)fXVLg!!|e]Oc4]#Gi~4t]i(f>qSnbh>/TCXY5V5@]ww?mA6?\\\\rjbg{2ju_i@Lc],:U75IFk$+q^^my2#)k2j&}.\\\"x!v3(z#tpR\",\"password\":-908,\"phone\":\").i:N4B+ yY,Spv0bw1KSyamZ;_{4]|j^pS&HXO_AY^~{a+'yf6Ylz[\",\"id\":-4350459046720164289,\"email\":\"G!F\\\"G\",\"username\":\"._J6\\\\5~ba?b]NftcnYuDC&GBeu-;ZSX,:M)Bo@w$]X=]&dxXw[ e s'?AOjphkb+Gv[t6fM^C.b-_}N%9?0FKh%6$H;~P~e3&Jji0(A#PI)C|S-*B,x@+L9FZ&02*}`HFV*Dy.8{lfE,fi3UnE2#V]J>n6?c,_.C%=Y9]}B*(gq~DkO^3oR&ps9S(y/?v9)GYdHR}-0(}ym<<\\\\vH;OQ}JB;~x0(DHO%MlqbS2FI<`%Zy7F13e%y(F\",\"pn\":-474}")
            .when()
                .request( "PUT", "/user/{username}")
            .then()
                // Body.application-json.Value.Properties.password.Type=Not string
                .statusCode( isBadRequest())
            .extract()
                .response()
                ;

        responseValidator.assertBodyValid( "PUT", "/user/{username}", response.statusCode(), response.getContentType(), response.asString());
        responseValidator.assertHeadersValid( "PUT", "/user/{username}", response.statusCode(), responseHeaders( response));
    }

    @Test
    public void putUserUsername_BodyApplicationJsonValuePropertiesPhoneType_Is_Null() {
        Response response =
            given()
                .baseUri( forTestServer( "https://petstore.swagger.io/v2"))
                .pathParam( "username", "-zF`?Z{:1n+{cnQyFiSo/]v\\nfCG5GWA:B)\\(%9lH4n@fVkxjYH9D#4uS:$W$aU5&oSJ?lz=+\"n)D)f70.;`>OBvJ<\\VS7cCE>yW7a?WN\\zL|@%mB/Iz l]_Oo14~e5<6i]=3Osvfm{z5M$,rObv7t:6k$y1TC>!yc!}\\\"45d{Vh*`)Y(qLf8wJF?A?#U-J!")
                .contentType( "application/json")
                .request().body( "{\"firstName\":\"@AwV;q\\\"u??cQH*%$uJ$1f4yICS;9.9C~%K6Yzb1'ulf2H$i-HP@JsXpA(B|leK<+n|1okrhW\\\\h&3$iNx+m}uxIc57GS=C;|_RF;*s!k,sg'\\\"<\\\\$i3Zf/<3=4]\\\"4HM;43A6C|)Hg~BRPwPA!?k1f:g)L8t0J}~Acp>I{Ai[9!e{W~L(s5t'csqWt_} wib):$N!vgj3E'xhRe0>=B?p+\\\\JG?R7s~}UsU1a56&AX(\\\"]\",\"lastName\":\"es7}vFNIE\\\" 4i#<M4EaL:y_V&#jMP<QYXyan{wQ|og~?!@/^K*<vx.oa-APw1~=up4NLzx\\\\(! 9H,_\\\\M:M>\\\"8YLm'L/2)]{q_8Z'nls#Rf-0>VSjZ=!gq?I*H_4DwA@_2fZYzW(eBlailp=$\\\"*::vSO|B==]cf7gf$tN3\",\"password\":\"w/W]kc~HjlxwmFhFzb(,=<})x'i'D7DqKOfOF+cet4[',xpL)A5`,=GSm&!|#9sCp9RaIM]@X>;FHy7Yj+Lo$ _9h\\\"oe^`bZ>s#Mehyo&O_U*yd~t_R`{ qmZHYu;2kyAaF=(;04uJghHPD8{u7|2/<K9O-BU/KZ9N,<2hx:FG0WYKoyg'zE(&fLtzIy\\\"gKCxm\\\\/8y9_*(d#)zywn*,G2P$moz+*`%\\\"5fANN#\",\"phone\":null,\"id\":-213830487363229683,\"email\":\"NO=)HGt:%)'L443K`zRdIE=e~C{J>G9'Yv33#B\",\"username\":\"0B?5>cnj%i&KXrf6[E2.nzI%82Ai$p{{x*4-FK&zQ-246b.I'oObG!{&!K7Nz]JcG+#=BE0Torc