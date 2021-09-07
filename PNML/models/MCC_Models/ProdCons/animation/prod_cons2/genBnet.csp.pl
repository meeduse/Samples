:- dynamic parserVersionNum/1, parserVersionStr/1, parseResult/5.
:- dynamic module/4.
'parserVersionStr'('0.6.2.1').
'parseResult'('ok','',0,0,0).
:- dynamic channel/2, bindval/3, agent/3.
:- dynamic agent_curry/3, symbol/4.
:- dynamic dataTypeDef/2, subTypeDef/2, nameType/2.
:- dynamic cspTransparent/1.
:- dynamic cspPrint/1.
:- dynamic pragma/1.
:- dynamic comment/2.
:- dynamic assertBool/1, assertRef/5, assertTauPrio/6.
:- dynamic assertModelCheckExt/4, assertModelCheck/3.
:- dynamic assertLtl/4, assertCtl/4.
'parserVersionNum'([0,11,1,1]).
'parserVersionStr'('CSPM-Frontent-0.11.1.1').
'dataTypeDef'('ARC',['constructor'('pnmlcoremodel_ARC1'),'constructor'('pnmlcoremodel_ARC2'),'constructor'('pnmlcoremodel_ARC3')]).
'channel'('genDef','type'('dotUnitType')).
'channel'('genResDef','type'('dotUnitType')).
'channel'('genEntete','type'('dotUnitType')).
'bindval'('MAIN','prefix'('src_span'(6,8,6,17,136,9),[],'genEntete','prefix'('src_span'(6,21,6,30,149,9),[],'genResDef','prefix'('src_span'(6,34,6,40,162,6),[],'genDef','stop'('src_span'(6,44,6,48,172,4)),'src_span'(6,41,6,43,168,14)),'src_span'(6,31,6,33,158,27)),'src_span'(6,18,6,20,145,40)),'src_span'(6,1,6,48,129,47)).
'symbol'('ARC','ARC','src_span'(1,10,1,13,9,3),'Datatype').
'symbol'('pnmlcoremodel_ARC1','pnmlcoremodel_ARC1','src_span'(1,16,1,34,15,18),'Constructor of Datatype').
'symbol'('pnmlcoremodel_ARC2','pnmlcoremodel_ARC2','src_span'(1,37,1,55,36,18),'Constructor of Datatype').
'symbol'('pnmlcoremodel_ARC3','pnmlcoremodel_ARC3','src_span'(1,58,1,76,57,18),'Constructor of Datatype').
'symbol'('genDef','genDef','src_span'(2,9,2,15,85,6),'Channel').
'symbol'('genResDef','genResDef','src_span'(3,9,3,18,100,9),'Channel').
'symbol'('genEntete','genEntete','src_span'(4,9,4,18,118,9),'Channel').
'symbol'('MAIN','MAIN','src_span'(6,1,6,5,129,4),'Ident (Groundrep.)').