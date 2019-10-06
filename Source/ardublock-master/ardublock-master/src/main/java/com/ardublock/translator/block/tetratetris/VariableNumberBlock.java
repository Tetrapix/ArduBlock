package com.ardublock.translator.block.tetratetris;

import com.ardublock.translator.Translator;
import java.util.ResourceBundle;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;
import java.util.ResourceBundle;

import com.ardublock.translator.block.exception.BlockException;
import com.ardublock.translator.block.letsgoING.LocalVariableNumberBlock;

public class VariableNumberBlock extends TranslatorBlock
{
	public VariableNumberBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}

	@Override
	public String toCode()
	{
		String internalVariableName = translator.getNumberVariable(label);
		if (internalVariableName == null)
		{
			internalVariableName = translator.buildVariableName(label);
			translator.addNumberVariable(label, internalVariableName);
			translator.addDefinitionCommand("int " + internalVariableName + " = 0 ;");
//			translator.addSetupCommand(internalVariableName + " = 0;");
		}
		return codePrefix + internalVariableName + codeSuffix;
	}

}
