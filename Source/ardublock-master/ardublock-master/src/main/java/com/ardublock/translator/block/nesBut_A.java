package com.ardublock.translator.block;

import com.ardublock.translator.Translator;

public class nesBut_A extends TranslatorBlock
{
	public nesBut_A(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}

	@Override
	public String toCode()
	{
		String ret = "NES_A";
		return codePrefix + ret + codeSuffix;
	}
	
}
