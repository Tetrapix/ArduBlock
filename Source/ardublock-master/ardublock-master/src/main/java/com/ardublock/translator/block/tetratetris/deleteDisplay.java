package com.ardublock.translator.block.tetratetris;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;

public class deleteDisplay  extends TranslatorBlock {

	public deleteDisplay (Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}
	
	//@Override
		public String toCode() throws SocketNullException, SubroutineNotDeclaredException
		{	
			
			
			translator.addHeaderFile("tetratetris.h");
			//translator.buildVariableName("var");
			translator.addDefinitionCommand("tetratetris tt = tetratetris"+ "();");
			translator.addDefinitionCommand("uint8_t flowRow = 0;\n"
					+ "int8_t moveCol = 0;\n"
					+ "uint8_t rotate = 0;\n"
					+ "uint8_t ranBrck;\n");
			translator.addSetupCommand("tt.strip.begin();\n" + 
			"tt.strip.show();");
			
			
			return "memset(tt.Matrix, 0, sizeof tt.Matrix);" ; 
		}
}
